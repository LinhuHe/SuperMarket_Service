package cqdx.finall.supertmarket.Controller;

import cqdx.finall.supertmarket.Service.ShopCartService;
import cqdx.finall.supertmarket.entity.ShopCartGoodsInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ShopCartController {

    @Autowired
    private ShopCartService shopCartService;

    @RequestMapping("/ShopCartController/getShopCartGoodsInfo/{uid}") //根据用户购物车信息 形成二维数组，每行为一个商家，行中为该商家不同的货物
    public ArrayList<ArrayList<ShopCartGoodsInfo>> getShopCartGoodsInfo(@PathVariable("uid") String uid)
    {
        System.out.println("ShopCartController/getShopCartGoodsInfo/{uid} : " + uid);
        return shopCartService.getShopCartGoodsInfo(uid);
    }

    @RequestMapping("/ShopCartController/getShopCartGoodsInfo")
    public int removeFromShopcart(@RequestParam("uid") String uid, @RequestParam("did") int did)
    {
        System.out.println("ShopCartController/removeFromShopcart/uid = "+uid+"  did="+did);
        return shopCartService.removeFromShopcart(uid,did);
    }

    @RequestMapping("/ShopCartController/addIntoShopcart")
    public int addIntoShopcart(@RequestParam("uid") String uid,@RequestParam("did") int did)
    {
        System.out.println("ShopCartController/addIntoShopcart/uid = "+uid+"  did="+did);
        return shopCartService.addIntoShopcart(uid,did);
    }
}
