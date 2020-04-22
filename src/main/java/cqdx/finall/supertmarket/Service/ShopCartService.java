package cqdx.finall.supertmarket.Service;

import cqdx.finall.supertmarket.entity.ShopCartGoodsInfo;
import cqdx.finall.supertmarket.entity.ShopcartKey;
import cqdx.finall.supertmarket.mapper.ShopcartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.origin.SystemEnvironmentOrigin;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ShopCartService {

    @Autowired
    private ShopcartMapper shopcartMapper;

    public ArrayList<ArrayList<ShopCartGoodsInfo>> getShopCartGoodsInfo(String uid)
    {
        if(uid.equals(null)) return null;
        List<ShopCartGoodsInfo> getShopcartGoods =  shopcartMapper.getShopCartGoodsInfoByUid(uid);  //这里获取到所有购物车中的商品，[{}{}{}{}] 格式
        Collections.sort(getShopcartGoods, new Comparator<ShopCartGoodsInfo>() {
            @Override
            public int compare(ShopCartGoodsInfo o1, ShopCartGoodsInfo o2) {
                return o1.getGoodsShoper().compareTo(o2.getGoodsShoper());
            }
        });
        System.out.println("ShopCartService/getShopCartGoodsInfo 数组排序后"+getShopcartGoods);
        ArrayList<ArrayList<ShopCartGoodsInfo>> res = new ArrayList<>();
        ArrayList<ShopCartGoodsInfo> temp = new ArrayList<>();
        temp.add(getShopcartGoods.get(0));

        for(int i=1;i<getShopcartGoods.size();i++)
        {
            if(getShopcartGoods.get(i).getGoodsShoper().equals(getShopcartGoods.get(i-1).getGoodsShoper())) temp.add(getShopcartGoods.get(i));
            else{
                System.out.println("temp : "+temp);
                res.add(new ArrayList<ShopCartGoodsInfo>(temp));
                temp.clear();
                temp.add(getShopcartGoods.get(i));
                continue;
            }

            if(i==getShopcartGoods.size()-1)
            {
                System.out.println("temp : "+temp);
                res.add(new ArrayList<ShopCartGoodsInfo>(temp));
                temp.clear();
            }
        }
        return res;
    }

    public int removeFromShopcart(String uid,int did)
    {
        if(uid!=null) return shopcartMapper.deleteByPrimaryKey(new ShopcartKey(uid,did));
        else return 0;
    }

    public int addIntoShopcart(String uid,int did)
    {
        if(uid!=null) return shopcartMapper.insert(new ShopcartKey(uid,did));
        else return 0;
    }
}
