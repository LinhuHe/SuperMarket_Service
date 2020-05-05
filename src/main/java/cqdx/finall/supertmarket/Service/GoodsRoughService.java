package cqdx.finall.supertmarket.Service;


import cqdx.finall.supertmarket.FileUpload;
import cqdx.finall.supertmarket.entity.*;
import cqdx.finall.supertmarket.mapper.GoodsDetailMapper;
import cqdx.finall.supertmarket.mapper.GoodsRoughMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

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

}
