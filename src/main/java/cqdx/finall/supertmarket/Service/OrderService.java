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
import java.util.*;

@Service
public class OrderService {
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    private GoodsDetailMapper goodsDetailMapper;

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
        for(int i=0;i<dids.size();i++)
        {
            GoodsDetail gd = goodsDetailMapper.selectByPrimaryKey(dids.get(i));
            if(orderMapper.insert(new Order(dids.get(i),uid,gd.getGoodsPrice(),orderKey,destination))!=1) return 0;
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

}
