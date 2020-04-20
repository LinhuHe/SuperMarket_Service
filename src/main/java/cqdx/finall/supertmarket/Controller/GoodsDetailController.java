package cqdx.finall.supertmarket.Controller;

import cqdx.finall.supertmarket.Service.GoodsDetailService;
import cqdx.finall.supertmarket.entity.GoodsDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
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
    public List<String> getStyleByColor(@RequestParam("rid") int rid,@RequestParam("color") String color)
    {
        System.out.println("GoodsDetailController/getStyleByColor/: rid = " + rid + "  color = " + color);
        return goodsDetailService.getStyleByColor(rid,color);
    }

    @RequestMapping("/GoodsDetailController/getSizeByColorStyle")
    public List<String> getSizeByColorStyle(@RequestParam("rid") int rid,@RequestParam("color") String color, @RequestParam("style") String style)
    {
        System.out.println("GoodsDetailController/getSizeByColorStyle: rid = " + rid +" color = " + color + "   sytle = "+style);
        return goodsDetailService.getSizeByColorStyle(rid,color,style);
    }

}
