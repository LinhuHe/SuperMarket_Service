package cqdx.finall.supertmarket.Controller;


import cqdx.finall.supertmarket.Service.GoodsRoughService;
import cqdx.finall.supertmarket.entity.GoodsRough;
import cqdx.finall.supertmarket.entity.GoodsShowInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GoodsRoughController {

    @Autowired
    GoodsRoughService goodsRoughService;

    @RequestMapping("/GoodsRough/findGoodsRoughByTimeDesc")
    public List<GoodsShowInfo> findGoodsRoughByTimeDesc()  //GoodsShowInfo为goods_rough加上了priceL/H
    {
        return goodsRoughService.findGoodsRoughByTimeDesc();
    }

    @RequestMapping("/GoodsRough/findGoodShowInfoByRid/{rid}")
    public GoodsShowInfo findGoodShowInfoByRid(@PathVariable("rid") int rid)
    {
        return goodsRoughService.findGoodShowInfoByRid(rid);
    }


    /*@RequestMapping("/getPriceRangeByRid/{rid}")
    public List<Double> getPriceRangeByRid(@PathVariable("rid") int rid)
    {
        return goodsRoughService.getPriceRangeByRid(rid);
    }*/

}
