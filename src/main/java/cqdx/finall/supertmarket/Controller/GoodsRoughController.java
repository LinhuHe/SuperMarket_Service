package cqdx.finall.supertmarket.Controller;


import cqdx.finall.supertmarket.Service.GoodsRoughService;
import cqdx.finall.supertmarket.entity.GoodsDetail;
import cqdx.finall.supertmarket.entity.GoodsRough;
import cqdx.finall.supertmarket.entity.GoodsShowInfo;
import cqdx.finall.supertmarket.entity.ShoperGoodsManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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

    @RequestMapping("/GoodsRough/getShoperGoodsManageInfo/{uid}")
    public List<ShoperGoodsManage> getShoperGoodsManageInfo(@PathVariable("uid") String uid) //得到我的所有上架商品 用于商品管理
    {
        System.out.println("/GoodsRough/getShoperGoodsManageInfo/{uid}="+uid);
        return goodsRoughService.getShoperGoodsManageInfo(uid);
    }

    @RequestMapping("/GoodsRough/updateGoodsRoughProtrait")
    public int updateGoodsRoughProtrait(@RequestParam("rid") int rid,@RequestParam("portrait") MultipartFile portrait,@RequestParam("uid") String uid)
    {
        System.out.println("/GoodsRough/getShoperGoodsManageInfo/rid= "+rid+"uid :"+uid);
        return goodsRoughService.updateGoodsRoughProtrait(rid,portrait,uid);
    }


    @RequestMapping("/GoodsRough/updateGoodsRoughInfo")
    public int updateGoodsRoughInfo(@RequestParam("rid") int rid,@RequestParam("Info") String Info,@RequestParam("type") String type)
    {
        System.out.println("/GoodsRough/getShoperGoodsManageInfo/rid= "+rid+" Info="+Info+"  type="+type);
        return goodsRoughService.updateGoodsRoughInfo(rid,Info,type);
    }

    @RequestMapping("/GoodsRough/addNewGoods")
    public int addNewGoods(@RequestParam("portrait") MultipartFile portrait,@RequestParam("goodsInfo") String goodsInfo) //添加goodsrough 和detail信息 返回rid
    {
        System.out.println("/GoodsRough/addNewGoods goodsInfo+ = "+goodsInfo);
        return goodsRoughService.addNewGoods(portrait,goodsInfo);
    }

    @RequestMapping("/GoodsRough/upLoadImage")
    public int upLoadImage(@RequestParam("moreimg") MultipartFile moreimg,@RequestParam("uid") String uid,@RequestParam("rid") int rid)
    {
        return goodsRoughService.upLoadImage(moreimg,uid,rid);
    }

}
