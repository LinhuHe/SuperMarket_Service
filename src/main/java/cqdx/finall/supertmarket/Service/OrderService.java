package cqdx.finall.supertmarket.Service;

import cqdx.finall.supertmarket.entity.*;
import cqdx.finall.supertmarket.entity.Order;
import cqdx.finall.supertmarket.entity.OrderGoodsInfo;
import cqdx.finall.supertmarket.mapper.*;
import cqdx.finall.supertmarket.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.math.BigDecimal;

import java.text.SimpleDateFormat;
import java.util.*;

// //orderStatus: 0:未发货， 1：待收货（这里确认收货），2：已收货，3：退货中（确认退货），4：已退货

@Service
public class OrderService {
    @Autowired
    private GoodsDetailMapper goodsDetailMapper;
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private GoodsRoughMapper goodsRoughMapper;

    public ArrayList<ArrayList<OrderGoodsInfo>> getOrderGoodsInfoByDids(ArrayList<Integer> dids)
    {
        if(dids.size()<=0) return null;
        ArrayList<OrderGoodsInfo> origin = new ArrayList<>();  //未整理前的数据
        ArrayList<OrderGoodsInfo> temp = new ArrayList<>();
        ArrayList<ArrayList<OrderGoodsInfo>> res = new ArrayList<>();  // 整理后的数据
        for(int i=0;i<dids.size();i++)
        {
            origin.add(orderMapper.getOrderGoodsInfoByDid(dids.get(i)));
        }
        //System.out.println("single.size()  :"+origin.size());
        Collections.sort(origin, new Comparator<OrderGoodsInfo>() {
            @Override
            public int compare(OrderGoodsInfo o1, OrderGoodsInfo o2) {
                return o1.getGoodsShoper().compareTo(o2.getGoodsShoper());
            }
        });

        if(origin.size()==1){ //只有一个
            res.add(new ArrayList<OrderGoodsInfo>(origin));
            return res;
        }
        //两个及以上
        temp.add(origin.get(0));

        for(int i=1;i<origin.size();i++)
        {
            if(origin.get(i).getGoodsShoper().equals(origin.get(i-1).getGoodsShoper())) temp.add(origin.get(i));
            else{
                res.add(new ArrayList<OrderGoodsInfo>(temp));
                temp.clear();
                temp.add(origin.get(i));
            }

            if(i==origin.size()-1)
            {
                //System.out.println("temp : "+temp);
                res.add(new ArrayList<OrderGoodsInfo>(temp));
                temp.clear();
            }
        }
        return res;

    }

    public int createOrder(ArrayList<Integer> dids, String uid, String destination) //dids 可传递多个货物，destination包含所有用户信息
    {
        if(dids.size()<=0) return 0;
        for(int i=0;i<dids.size();i++)  //检查是否所有商品可用
        {
            if(orderMapper.checkGoodStatus(dids.get(i))> 0) continue;
            else return 0;
        }
        String orderKey  = productOrderKey();
        System.out.println("生成key:   "+orderKey);
        for(int i=0;i<dids.size();i++)  //insert
        {
            GoodsDetail gd = goodsDetailMapper.selectByPrimaryKey(dids.get(i));
            if(orderMapper.insert(new Order(dids.get(i),uid,gd.getGoodsPrice(),orderKey,destination))!=1) return 0;
            goodsRoughMapper.addOrderNums(goodsDetailMapper.getRidByDid(dids.get(i)));  //销量+1
            goodsDetailMapper.desStockNums(dids.get(i)); //库存-1
            //orderMapper.insert(new Order(dids.get(i),uid,gd.getGoodsPrice(),orderKey,destination));
        }
        return 1;
    }

    public String productOrderKey()  //ascall 33-126
    {
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<30;i++)
        {
            sb.append((char)(int)(33 + Math.random()*93));
        }
        return sb.toString();
    }

    public ArrayList<ArrayList<OrderShowInfo>> getAllMyOrder(String uid)
    {
        ArrayList<OrderShowInfo> orderlist = orderMapper.getOrderByUid(uid);
        ArrayList<ArrayList<OrderShowInfo>> res = new ArrayList<>();
        ArrayList<OrderShowInfo> temp = new ArrayList<>();
        if(orderlist==null) return res;
        //System.out.println("得到的用户orderlist" + orderlist);

        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        if(orderlist.size()>=1)
        {
            Collections.sort(orderlist, new Comparator<OrderShowInfo>() {
                @Override
                public int compare(OrderShowInfo o1, OrderShowInfo o2) {
                    if(o1.getOrderKey().equals(o2.getOrderKey()))
                    {
                        return o1.getOrderDate().compareTo(o2.getOrderDate()); //晓得排前面
                    }
                    else return o1.getOrderKey().compareTo(o2.getOrderKey());
                }
            });

            if(orderlist.size()==1){ //只有一个
                orderlist.get(0).setDesInfo(orderlist.get(0).getOrderDestination().split("/")); //destionation
                orderlist.get(0).setDate_str(sf.format(orderlist.get(0).getOrderDate())); //date
                res.add(new ArrayList<>(orderlist));
                return res;
            }


            orderlist.get(0).setDesInfo(orderlist.get(0).getOrderDestination().split("/")); //destionation
            orderlist.get(0).setDate_str(sf.format(orderlist.get(0).getOrderDate())); //date
            temp.add(orderlist.get(0));
            for(int i=1;i<orderlist.size();i++)
            {


                orderlist.get(i).setDesInfo(orderlist.get(i).getOrderDestination().split("/"));
                orderlist.get(i).setDate_str(sf.format(orderlist.get(i).getOrderDate()));
                if(orderlist.get(i).getOrderKey().equals(orderlist.get(i-1).getOrderKey()) &&
                        (orderlist.get(i).getOrderDate().getTime()-orderlist.get(i-1).getOrderDate().getTime())<10000) //10s内 key相同
                {
                    temp.add(orderlist.get(i));
                }
                else{
                    res.add(new ArrayList<>(temp));
                    temp.clear();
                    temp.add(orderlist.get(i));
                }

                if(i==orderlist.size()-1){
                    res.add(new ArrayList<>(temp));
                    temp.clear();
                }
            }
        }
        return res;
    }

    public ArrayList<OrderShowInfo> getSingleStatusOrder(String uid ,int status)
    {
        ArrayList<OrderShowInfo> slist =  new ArrayList<>();
        switch (status)
        {
            case 0: {
                slist =  getWaitOrder(uid);
                break;
            }
            case 1: {
                slist = getSendOrder(uid);
                break;
            }
            case 2: {
                slist = getReceivedOrder(uid);
                break;
            }
            case 3: {
                slist = getBackOrder(uid);
                break;
            }
        }

        if(slist!=null)
        {
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            for(int i=0;i<slist.size();i++)
            {
                slist.get(i).setDesInfo(slist.get(i).getOrderDestination().split("/"));
                slist.get(i).setDate_str(sf.format(slist.get(i).getOrderDate()));
            }
        }
        return slist;
    }

    public ArrayList<OrderShowInfo> getWaitOrder(String uid)  //用户未发
    {
        return  orderMapper.getWaitOrder(uid);
    }
    public ArrayList<OrderShowInfo> getSendOrder(String uid) //用户待收
    {
        return orderMapper.getSendOrder(uid);
    }
    public ArrayList<OrderShowInfo> getReceivedOrder(String uid) //用户已收
    {
        return orderMapper.getReceivedOrder(uid);
    }
    public ArrayList<OrderShowInfo> getBackOrder(String uid) //用户退货
    {
        return orderMapper.getBackOrder(uid);
    }

    public ArrayList<OrderShowInfo> getMyFinishedOrder(String uid) //商家已完成的订单
    {
        ArrayList<OrderShowInfo> myFinishedOrder = orderMapper.getMyFinishedOrder(uid);
        if(myFinishedOrder!=null && myFinishedOrder.size()>0)
        {
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            for(int i=0;i<myFinishedOrder.size();i++)
            {
                myFinishedOrder.get(i).setDesInfo(myFinishedOrder.get(i).getOrderDestination().split("/"));
                myFinishedOrder.get(i).setDate_str(sf.format(myFinishedOrder.get(i).getOrderDate()));
            }
        }
        return myFinishedOrder;
    }

    public ArrayList<ArrayList<OrderShowInfo>> getAllMyUnoperatOrder(String uid)
    {
        ArrayList<OrderShowInfo> orderlist = orderMapper.getAllShoperOrder(uid);

        Iterator<OrderShowInfo> iter = orderlist.iterator();
        while(iter.hasNext()) //只留下状态0,3
        {
            OrderShowInfo ods = iter.next();
            if(ods.getOrderStatus() !=0 && ods.getOrderStatus() !=3)
             iter.remove();
        }

        ArrayList<ArrayList<OrderShowInfo>> res = new ArrayList<>();
        ArrayList<OrderShowInfo> temp = new ArrayList<>();
        if(orderlist==null) return res;
        //System.out.println("得到的用户orderlist" + orderlist);

        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        if(orderlist.size()>=1)
        {
            Collections.sort(orderlist, new Comparator<OrderShowInfo>() {
                @Override
                public int compare(OrderShowInfo o1, OrderShowInfo o2) {
                    if(o1.getOrderKey().equals(o2.getOrderKey()))
                    {
                        return o1.getOrderDate().compareTo(o2.getOrderDate()); //晓得排前面
                    }
                    else return o1.getOrderKey().compareTo(o2.getOrderKey());
                }
            });

            if(orderlist.size()==1 && (orderlist.get(0).getOrderStatus()==0 ||orderlist.get(0).getOrderStatus()==3) ){ //只有一个 且需要操作
                orderlist.get(0).setDesInfo(orderlist.get(0).getOrderDestination().split("/")); //destionation
                orderlist.get(0).setDate_str(sf.format(orderlist.get(0).getOrderDate())); //date
                res.add(new ArrayList<>(orderlist));
                return res;
            }


            orderlist.get(0).setDesInfo(orderlist.get(0).getOrderDestination().split("/")); //destionation
            orderlist.get(0).setDate_str(sf.format(orderlist.get(0).getOrderDate())); //date
            temp.add(orderlist.get(0));
            for(int i=1;i<orderlist.size();i++)
            {
                orderlist.get(i).setDesInfo(orderlist.get(i).getOrderDestination().split("/"));
                orderlist.get(i).setDate_str(sf.format(orderlist.get(i).getOrderDate()));
                if(orderlist.get(i).getOrderKey().equals(orderlist.get(i-1).getOrderKey()) &&
                        (orderlist.get(i).getOrderDate().getTime()-orderlist.get(i-1).getOrderDate().getTime())<10000) //10s内 key相同
                {
                    temp.add(orderlist.get(i));
                }
                else{
                    res.add(new ArrayList<>(temp));
                    temp.clear();
                    temp.add(orderlist.get(i));
                }

                if(i==orderlist.size()-1){
                    res.add(new ArrayList<>(temp));
                    temp.clear();
                }
            }
        }
        return res;
    }

    public ArrayList<ArrayList<OrderShowInfo>> getAllShoperOrder(String uid)
    {
        ArrayList<OrderShowInfo> orderlist = orderMapper.getAllShoperOrder(uid);

        ArrayList<ArrayList<OrderShowInfo>> res = new ArrayList<>();
        ArrayList<OrderShowInfo> temp = new ArrayList<>();
        if(orderlist==null) return res;
        //System.out.println("得到的用户orderlist" + orderlist);

        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        if(orderlist.size()>=1)
        {
            Collections.sort(orderlist, new Comparator<OrderShowInfo>() {
                @Override
                public int compare(OrderShowInfo o1, OrderShowInfo o2) {
                    if(o1.getOrderKey().equals(o2.getOrderKey()))
                    {
                        return o1.getOrderDate().compareTo(o2.getOrderDate()); //晓得排前面
                    }
                    else return o1.getOrderKey().compareTo(o2.getOrderKey());
                }
            });

            if(orderlist.size()==1 && (orderlist.get(0).getOrderStatus()==0 ||orderlist.get(0).getOrderStatus()==3) ){ //只有一个 且需要操作
                orderlist.get(0).setDesInfo(orderlist.get(0).getOrderDestination().split("/")); //destionation
                orderlist.get(0).setDate_str(sf.format(orderlist.get(0).getOrderDate())); //date
                res.add(new ArrayList<>(orderlist));
                return res;
            }


            orderlist.get(0).setDesInfo(orderlist.get(0).getOrderDestination().split("/")); //destionation
            orderlist.get(0).setDate_str(sf.format(orderlist.get(0).getOrderDate())); //date
            temp.add(orderlist.get(0));
            for(int i=1;i<orderlist.size();i++)
            {
                orderlist.get(i).setDesInfo(orderlist.get(i).getOrderDestination().split("/"));
                orderlist.get(i).setDate_str(sf.format(orderlist.get(i).getOrderDate()));
                if(orderlist.get(i).getOrderKey().equals(orderlist.get(i-1).getOrderKey()) &&
                        (orderlist.get(i).getOrderDate().getTime()-orderlist.get(i-1).getOrderDate().getTime())<10000) //10s内 key相同
                {
                    temp.add(orderlist.get(i));
                }
                else{
                    res.add(new ArrayList<>(temp));
                    temp.clear();
                    temp.add(orderlist.get(i));
                }

                if(i==orderlist.size()-1){
                    res.add(new ArrayList<>(temp));
                    temp.clear();
                }
            }
        }
        return res;
    }

    public int changeOrderStatus(int oid,int status)
    {
        Order order = orderMapper.selectByPrimaryKey(oid);
        switch (status)
        {
            case 0:  //将status设置为0
            {
                System.out.println("/OrderService/changeOrderStatus/status=0 不应存在的值");
                return 0;
            }
            case 1: //将status设置为1  原来应为0
            {
                if(order.getOrderStatus()==0) //从未发货到待收货
                {
                    System.out.println("/OrderService/changeOrderStatus/status从0转至1");
                    return orderMapper.setOrderStatus(oid,status);
                }
                else{
                    System.out.println("/OrderService/changeOrderStatus/status从"+order.getOrderStatus()+"转至1被回绝");
                }
                break;
            }
            case 2: //将status设置为2  原来应为1
            {
                if(order.getOrderStatus()==1) //从待收货到已收货
                {
                    System.out.println("/OrderService/changeOrderStatus/status从1转至2");
                    return orderMapper.setOrderStatus(oid,status);
                }
                else{
                    System.out.println("/OrderService/changeOrderStatus/status从"+order.getOrderStatus()+"转至2被回绝");
                }
                break;
            }
            case 3: //将status设置为3  原来应为0/1
            {
                if(order.getOrderStatus()==0 || order.getOrderStatus()==1) //从待收货到已收货
                {
                    System.out.println("/OrderService/changeOrderStatus/status从0/1转至3");
                    return orderMapper.setOrderStatus(oid,status);
                }
                else{
                    System.out.println("/OrderService/changeOrderStatus/status从"+order.getOrderStatus()+"转至3被回绝");
                }
                break;
            }
            case 4: //将status设置为4  原来应为3
            {
                if(order.getOrderStatus()==3) //同一退货
                {
                    System.out.println("/OrderService/changeOrderStatus/status从3转至4");
                    return orderMapper.setOrderStatus(oid,status);
                }
                else{
                    System.out.println("/OrderService/changeOrderStatus/status从"+order.getOrderStatus()+"转至4被回绝");
                }
                break;
            }
            case 5: //将status设置为5 原来应为3
            {
                if(order.getOrderStatus()==3) //拒绝退货
                {
                    System.out.println("/OrderService/changeOrderStatus/status从3转至5");
                    return orderMapper.setOrderStatus(oid,status);
                }
                else{
                    System.out.println("/OrderService/changeOrderStatus/status从"+order.getOrderStatus()+"转至5被回绝");
                }
                break;
            }
        }
        return 0;
    }

    public ArrayList<Integer> dayGainAndTotalGain(String uid) // 0日收入 1总收入
    {
        ArrayList<Integer> gains = new ArrayList<>();
        gains.add(orderMapper.shoperDayGain(uid));
        gains.add(orderMapper.shoperTotalGain(uid));
        return gains;
    }

}
