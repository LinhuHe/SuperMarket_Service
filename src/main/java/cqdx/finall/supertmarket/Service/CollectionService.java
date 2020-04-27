package cqdx.finall.supertmarket.Service;

import cqdx.finall.supertmarket.entity.*;
import cqdx.finall.supertmarket.entity.CollectionKey;
import cqdx.finall.supertmarket.entity.GoodsShowInfo;
import cqdx.finall.supertmarket.mapper.CollectionMapper;
import cqdx.finall.supertmarket.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@Service
public class CollectionService {

    @Autowired
    public CollectionMapper collectionMapper;
    @Autowired
    public GoodsDetailMapper goodsDetailMapper;
    @Autowired
    private GoodsRoughService goodsRoughService;
    @Autowired
    private GoodsRoughMapper goodsRoughMapper;


    public List<GoodsShowInfo> getCollectedGoodsShowInfo(String uid)
    {
        CollectionExample ce = new CollectionExample();
        CollectionExample.Criteria cc = ce.createCriteria();
        cc.andColUidEqualTo(uid);

        List<CollectionKey> list_col = collectionMapper.selectByExample(ce);
        List<GoodsShowInfo> resInfo = new ArrayList<>();
        if(list_col.size()>0)
        {
            for(CollectionKey colkey:list_col)
            {
                List<Double> list_price = goodsRoughService.getPriceRangeByRid(colkey.getColRid());
                GoodsRough gr = goodsRoughMapper.selectByPrimaryKey(colkey.getColRid());
                resInfo.add(new GoodsShowInfo(gr,list_price.get(0),list_price.get(1)));
            }
            return resInfo;
        }
        else return null;
    }

    public int addCollectionByKey(String uid,int rid)
    {
        goodsRoughMapper.addCollectionNums(rid);  //收藏加一
        return collectionMapper.insert(new CollectionKey(uid,rid));
    }

    public int deleteCollectionByKey(String uid,int rid)
    {
        goodsRoughMapper.desCollectionNums(rid);  //收藏数减一
        return collectionMapper.deleteByPrimaryKey(new CollectionKey(uid,rid));
    }

    public int isContain(String uid,int rid)
    {
        return collectionMapper.isContain(new CollectionKey(uid,rid));
    }

    public int coutMyCollectionNums(String uid)
    {
        return collectionMapper.countByUid(uid);
    }
}
