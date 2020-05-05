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

    @RequestMapping("/OrderController/getMyFinishedOrder/{uid}")
    public ArrayList<OrderShowInfo> getMyFinishedOrder(@PathVariable("uid")  String uid)
    {
        System.out.println("OrderController/getSingleStatusOrder/nickname = "+uid);
        return orderService.getMyFinishedOrder(uid);
    }

    @RequestMapping("/OrderController/getAllMyUnoperatOrder/{uid}")
    public ArrayList<ArrayList<OrderShowInfo>> getAllMyUnoperatOrder(@PathVariable("uid") String uid)
    {
        System.out.println("OrderController/getAllMyUnoperatOrder/uid = "+uid);
        return orderService.getAllMyUnoperatOrder(uid);
    }

    @RequestMapping("/OrderController/getAllShoperOrder/{uid}")
    public ArrayList<ArrayList<OrderShowInfo>> getAllShoperOrder(@PathVariable("uid") String uid)
    {
        System.out.println("OrderController/getAllShoperOrder/uid = "+uid);
        return orderService.getAllShoperOrder(uid);
    }

    @RequestMapping("/OrderController/changeOrderStatus")
    public int changeOrderStatus(@RequestParam("oid") int oid,@RequestParam("status") int status)  //将状态码改为status
    {
        System.out.println("OrderController/changeOrderStatus/oid = "+oid +"  status = "+status);
        return orderService.changeOrderStatus(oid,status);
    }

    @RequestMapping("/OrderController/dayGainAndTotalGain/{uid}")
    public ArrayList<Integer> dayGainAndTotalGain(@PathVariable("uid") String uid) // 0日收入 1总收入
    {
        System.out.println("OrderController/dayGainAndTotalGain/uid = "+uid);
        return orderService.dayGainAndTotalGain(uid);
    }
}
