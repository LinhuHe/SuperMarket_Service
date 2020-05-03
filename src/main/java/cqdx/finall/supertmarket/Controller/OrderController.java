package cqdx.finall.supertmarket.Controller;

import cqdx.finall.supertmarket.Service.OrderService;
import cqdx.finall.supertmarket.entity.Order;
import cqdx.finall.supertmarket.entity.OrderGoodsInfo;
import cqdx.finall.supertmarket.entity.OrderShowInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @RequestMapping("/OrderController/getOrderGoodsInfoByDids")
    public ArrayList<ArrayList<OrderGoodsInfo>> getOrderGoodsInfoByDids(@RequestParam("dids") ArrayList<Integer> dids)
    {
        System.out.println("OrderController/getOrderGoodsInfoByDids/{dids} = "+dids);
        return orderService.getOrderGoodsInfoByDids(dids);
    }

    @RequestMapping("/OrderController/createOrder")
    public int createOrder(@RequestParam("dids") ArrayList<Integer> dids,@RequestParam("uid") String uid,@RequestParam("destination") String destination) //dids 可传递多个货物，destination包含所有用户信息
    {
        System.out.println("OrderController/createOrder/dids = "+dids+"  uid = "+uid+"   detination = "+destination);
        return orderService.createOrder(dids,uid,destination);
    }

    @RequestMapping("/OrderController/getAllMyOrder/{uid}")
    public ArrayList<ArrayList<OrderShowInfo>> getAllMyOrder(@PathVariable("uid") String uid)
    {
        System.out.println("OrderController/getAllMyOrder/uid = "+uid);
        return orderService.getAllMyOrder(uid);
    }

    @RequestMapping("/OrderController/getSingleStatusOrder/{uid}/{status}")
    public ArrayList<OrderShowInfo> getSingleStatusOrder(@PathVariable("uid") String uid,@PathVariable("status") int status)  //待发
    {
        System.out.println("OrderController/getSingleStatusOrder/uid = "+uid);
        return orderService.getSingleStatusOrder(uid,status);
    }

    @RequestMapping("/OrderController/getMyFinishedOrder/{nickname}")
    public ArrayList<OrderShowInfo> getMyFinishedOrder(@PathVariable("nickname")  String nickname)
    {
        System.out.println("OrderController/getSingleStatusOrder/nickname = "+nickname);
        return orderService.getMyFinishedOrder(nickname);
    }

}
