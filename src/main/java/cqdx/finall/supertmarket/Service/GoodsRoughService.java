package cqdx.finall.supertmarket.Service;


import cqdx.finall.supertmarket.FileUpload;
import cqdx.finall.supertmarket.entity.*;
import cqdx.finall.supertmarket.mapper.GoodsDetailMapper;
import cqdx.finall.supertmarket.mapper.GoodsRoughMapper;

import org.json.JSONObject;
import org.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.util.*;

@Service
public class GoodsRoughService {

    @Autowired
    GoodsRoughMapper goodsRoughMapper;
    @Autowired
    GoodsDetailMapper goodsDetailMapper;

    public List<GoodsShowInfo> findGoodsRoughByTimeDesc()
    {
        List<GoodsRough> gr_list =  goodsRoughMapper.selectByGoodsDate();
        List<GoodsShowInfo> res = new ArrayList<>();
        for(GoodsRough gr:gr_list)
        {
            List<Double> price_list = getPriceRangeByRid(gr.getGoodsRid());
            if(price_list!=null && price_list.size()>0)
            res.add(new GoodsShowInfo(gr.getGoodsRid(),gr.getGoodsName(),gr.getGoodsShoper(),gr.getGoodsProtrait(),price_list.get(0),price_list.get(1)));
        }
        return res;
    }

    public GoodsShowInfo findGoodShowInfoByRid(int rid) //通过rid返回一个该商品的goodsShowInfo
    {
        GoodsRough gr = goodsRoughMapper.selectByPrimaryKey(rid);
        List<Double> price_list = getPriceRangeByRid(rid);
        return  new GoodsShowInfo(gr,price_list.get(0),price_list.get(1));
    }


    public List<Double> getPriceRangeByRid(int rid)
    {
        List<BigDecimal> al = goodsDetailMapper.getPriceRangeByRid(rid);
        if(al.size()<=0) return null;

        Collections.sort(al);
        List<Double> priceRange = new ArrayList<>();
        if(al.size()==1)
        {
            priceRange.add(al.get(0).doubleValue());
            priceRange.add(al.get(0).doubleValue());
        }
        else {
            priceRange.add(al.get(0).doubleValue());
            priceRange.add(al.get(al.size() - 1).doubleValue());
        }
        return priceRange;
    }

    public List<ShoperGoodsManage> getShoperGoodsManageInfo(String uid) //得到我的所有上架商品 用于商品管理
    {
        List<ShoperGoodsManage> res = new ArrayList<>();


        GoodsRoughExample gre = new GoodsRoughExample();
        GoodsRoughExample.Criteria criteria = gre.createCriteria();
        criteria.andGoodsShoperEqualTo(uid);
        List<GoodsRough> grs = goodsRoughMapper.selectByExample(gre);  //我所有商品 rough

        if(grs==null || grs.size()==0) return res;

        for(int i=0;i<grs.size();i++)
        {
            ShoperGoodsManage single = new ShoperGoodsManage();
            single.setRough(grs.get(i)); //设置rough信息

            List<GoodsDetail> gds = getGdByRid(grs.get(i).getGoodsRid());  //我单个商品的所有类型 detail
            //System.out.println(gds);
            single.setDetail(gds); //设置detail信息

            res.add(single);
        }

        return res;
    }

    public List<GoodsDetail> getGdByRid(int rid)
    {
        GoodsDetailExample gde = new GoodsDetailExample();
        GoodsDetailExample.Criteria criteria = gde.createCriteria();
        criteria.andGoodsRidEqualTo(rid);
        return  goodsDetailMapper.selectByExample(gde);  //我单个商品的所有类型 detail
    }

    public int updateGoodsRoughProtrait(int rid, MultipartFile portrait,String uid)
    {
        String newPortrait  = FileUpload.writeUploadFile(portrait,uid);

        GoodsRoughExample gre = new GoodsRoughExample();
        GoodsRoughExample.Criteria criteria = gre.createCriteria();
        criteria.andGoodsRidEqualTo(rid);

        GoodsRough newData = new GoodsRough();
        newData.setGoodsProtrait(newPortrait);

        return goodsRoughMapper.updateByExampleSelective(newData,gre);
    }

    public int updateGoodsRoughInfo(int rid,String Info,String type)
    {
        GoodsRoughExample gre = new GoodsRoughExample();
        GoodsRoughExample.Criteria criteria = gre.createCriteria();
        criteria.andGoodsRidEqualTo(rid);
        switch (type)
        {
            case "name":
            {
                GoodsRough newData = new GoodsRough();
                newData.setGoodsName(Info);

                return goodsRoughMapper.updateByExampleSelective(newData,gre);
            }
            case "OnSale":
            {
                GoodsRough newData = new GoodsRough();
                newData.setIsOnSale(1);

                return goodsRoughMapper.updateByExampleSelective(newData,gre);
            }
            case "notOnSale":
            {
                GoodsRough newData = new GoodsRough();
                newData.setIsOnSale(0);

                return goodsRoughMapper.updateByExampleSelective(newData,gre);
            }
        }
        return  0;
    }

    public int addNewGoods(MultipartFile portrait, String goodsInfo) //添加goodsrough 和detail信息 返回rid
    {
        //解析 储存rough
        int rid = 0;
        JSONObject JSONInfo = new JSONObject(goodsInfo);
        String portraitURL = new String();

        if(portrait!=null) {
            portraitURL=FileUpload.writeUploadFile(portrait, JSONInfo.getString("shoper")); //写入图片 返货图名
        }

        try {
            GoodsRough goodsRough = new GoodsRough();

            goodsRough.setIsOnSale(1);
            goodsRough.setGoodsName(JSONInfo.getString("name"));
            goodsRough.setGoodsShoper(JSONInfo.getString("shoper"));
            goodsRough.setGoodsType(JSONInfo.getString("type"));
            goodsRough.setGoodsProtrait(portraitURL);
            goodsRough.setGoodsDate(new Date());
            goodsRough.setGoodsMoreimg(portraitURL);

            GoodsRoughExample gre = new GoodsRoughExample();
            GoodsRoughExample.Criteria criteria_gr = gre.createCriteria();
            criteria_gr.andGoodsShoperEqualTo(JSONInfo.getString("shoper"));
            criteria_gr.andGoodsNameEqualTo(JSONInfo.getString("name"));

            if(goodsRoughMapper.countByExample(gre)>0) return -1; //存在同名
            else goodsRoughMapper.insertAndReturnRid(goodsRough);  //存入rough 同一商家商品名字不能相同

            rid = goodsRough.getGoodsRid();
            System.out.println("新产品的rid：" + rid);

            //解析 储存details
            JSONArray jsonDetails = JSONInfo.getJSONArray("uploadDetails");
            for (int i = 0; i < jsonDetails.length(); i++) {
                GoodsDetail temp = new GoodsDetail();
                JSONObject singleJsonDetail = jsonDetails.getJSONObject(i);

                temp.setGoodsStock((singleJsonDetail.getInt("goodsStock")));
                temp.setGoodsPrice(BigDecimal.valueOf(singleJsonDetail.getDouble("goodsPrice")));
                temp.setGoodsColor(singleJsonDetail.getString("goodsColor"));
                temp.setGoodsStyle(singleJsonDetail.getString("goodsStyle"));
                temp.setGoodsSize(singleJsonDetail.getString("goodsSize"));
                temp.setGoodsRid(rid);

                if(goodsDetailMapper.getDidByRidCSS(rid,temp.getGoodsColor(),temp.getGoodsStyle(),temp.getGoodsSize())==null) //不存在
                    goodsDetailMapper.insert(temp);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
            return 0;
        }

        return rid;
    }

    public int upLoadImage(MultipartFile moreimg, String uid, int rid)
    {
        if(moreimg!=null)
        {
            String newPic =  FileUpload.writeUploadFile(moreimg, uid);
            System.out.println("MoreImgs的新图片："+newPic);
            return goodsRoughMapper.setMoreImgs(newPic,rid);
        }
        else
            return 0;
    }
}
