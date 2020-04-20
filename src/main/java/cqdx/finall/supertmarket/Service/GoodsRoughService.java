package cqdx.finall.supertmarket.Service;


import cqdx.finall.supertmarket.entity.GoodsDetail;
import cqdx.finall.supertmarket.entity.GoodsRough;
import cqdx.finall.supertmarket.entity.GoodsShowInfo;
import cqdx.finall.supertmarket.mapper.GoodsDetailMapper;
import cqdx.finall.supertmarket.mapper.GoodsRoughMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
