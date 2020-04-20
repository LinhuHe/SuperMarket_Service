package cqdx.finall.supertmarket.Controller;

import cqdx.finall.supertmarket.Service.ShopCartService;
import cqdx.finall.supertmarket.entity.ShopCartGoodsInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ShopCartController {

    @Autowired
    private ShopCartService shopCartService;

    @RequestMapping("/ShopCartController/getShopCartGoodsInfo/{uid}")
    public ArrayList<ArrayList<ShopCartGoodsInfo>> getShopCartGoodsInfo(@PathVariable("uid") String uid)
    {
        System.out.println("ShopCartController/getShopCartGoodsInfo/{uid} : " + uid);
        return shopCartService.getShopCartGoodsInfo(uid);
    }
}
