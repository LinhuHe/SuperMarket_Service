package cqdx.finall.supertmarket.Controller;

import cqdx.finall.supertmarket.Service.GoodsDetailService;
import cqdx.finall.supertmarket.entity.GoodsDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
public class GoodsDetailController {

    @Autowired
    private GoodsDetailService goodsDetailService;

    @RequestMapping("/GoodsDetailController/getAllColors/{rid}")
    public List<String> getAllColors(@PathVariable("rid") int rid)  //用于选择型号，先获取这个rid的所有颜色，在后续根据颜色加载style/size
    {
        System.out.println("GoodsDetailController/getAllColors/{rid} = " + rid);
        return goodsDetailService.getAllColors(rid);
    }

    @RequestMapping("/GoodsDetailController/getStyleByColor/")
    public List<String> getStyleByColor(@RequestParam("rid") int rid,@RequestParam("color") String color) //根据color返回style
    {
        System.out.println("GoodsDetailController/getStyleByColor/: rid = " + rid + "  color = " + color);
        return goodsDetailService.getStyleByColor(rid,color);
    }

    @RequestMapping("/GoodsDetailController/getSizeByColorStyle")
    public List<String> getSizeByColorStyle(@RequestParam("rid") int rid,@RequestParam("color") String color, @RequestParam("style") String style) //根据solor/style返回size
    {
        System.out.println("GoodsDetailController/getSizeByColorStyle: rid = " + rid +" color = " + color + "   sytle = "+style);
        return goodsDetailService.getSizeByColorStyle(rid,color,style);
    }

    //根据rid color style size 唯一确定 did
    @RequestMapping("/GoodsDetailController/getDidByRidCSS")
    public Integer getDidByRidCSS(@RequestParam("rid") int rid, @RequestParam("color") String color,@RequestParam("style") String style, @RequestParam("size") String size)
    {
        System.out.println("GoodsDetailController/getDidByRidCSS: rid = " + rid +" color = " + color + "   sytle = "+style + "   size = "+size);
        return goodsDetailService.getDidByRidCSS(rid,color,style,size);
    }

    @RequestMapping("/GoodsDetailController/uploadGoodsDetailInfo")
    public int uploadGoodsDetailInfo(@RequestParam("did") int did,@RequestParam("Info") String Info,@RequestParam("type") String type)
    {
        System.out.println("GoodsDetailController/uploadGoodsDetailInfo: did = " + did +" Info = " + Info + "   type = "+type);
        return goodsDetailService.uploadGoodsDetailInfo(did,Info,type);
    }

    @RequestMapping("/classTest")
    public int classTest(String gds)
    {
        System.out.println("yes"+"\n"+gds);
        /*for(GoodsDetail gd:gds) {
            System.out.println(gd);
        }*/
        return 0;
    }
}
