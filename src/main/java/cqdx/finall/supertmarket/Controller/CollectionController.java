package cqdx.finall.supertmarket.Controller;

import cqdx.finall.supertmarket.Service.CollectionService;
import cqdx.finall.supertmarket.entity.GoodsShowInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.StreamSupport;

@RestController
public class CollectionController {
    @Autowired
    public CollectionService collectionService;

    @RequestMapping("/CollectionController/getCollectedGoodsShowInfo/{uid}")
    public List<GoodsShowInfo> getCollectedGoodsShowInfo(@PathVariable("uid") String uid)
    {
        System.out.println("CollectionController/getCollectedGoodsShowInfo get param: "+uid);
        if(uid.equals(null)) return null;
        else return collectionService.getCollectedGoodsShowInfo(uid);
    }

    @RequestMapping("/CollectionController/addCollectionByKey")
    public int addCollectionByKey(@RequestParam("uid")String uid,@RequestParam("rid") int rid)
    {
        System.out.println("CollectionController/addCollectionByKey get param: "+uid+"  "+rid);
        if(uid.equals(null) || rid<=0) return 0;
        return collectionService.addCollectionByKey(uid,rid);
    }

    @RequestMapping("/CollectionController/deleteCollectionByKey")
    public int deleteCollectionByKey(@RequestParam("uid") String uid,@RequestParam("rid") int rid)
    {
        System.out.println("CollectionController/deleteCollectionByKey get param: "+uid+"  "+rid);
        if(uid.equals(null) || rid<=0) return 0;
        return collectionService.deleteCollectionByKey(uid,rid);
    }

    @RequestMapping("/CollectionController/isContain")
    public int isContain(@RequestParam("uid") String uid,@RequestParam("rid") int rid)  //用于判断用户是否收藏
    {
        System.out.println("CollectionController/isContain get param: "+uid+"  "+rid);
        if(uid.equals(null) || rid<=0) return 0;
        return collectionService.isContain(uid,rid);
    }

    @RequestMapping("/CollectionController/countMyCollectionNums/{uid}")
    public int countMyCollectionNums(@PathVariable("uid") String uid)
    {
        System.out.println("CollectionController/countMyCollectionNums uid: "+uid);
        return collectionService.coutMyCollectionNums(uid);
    }
}
