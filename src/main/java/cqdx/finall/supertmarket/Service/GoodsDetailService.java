package cqdx.finall.supertmarket.Service;

import cqdx.finall.supertmarket.entity.GoodsDetail;
import cqdx.finall.supertmarket.mapper.GoodsDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoodsDetailService {

    @Autowired
    private GoodsDetailMapper goodsDetailMapper;

    public List<String> getAllColors(Integer rid)
    {
        if(rid<=0 || rid==null) return null;
        ArrayList<String> allColor = new ArrayList<>();
        allColor.add("请选择颜色"); //1防止没有颜色 2防止只有一种颜色 ，前端需要至少两个来滚动

        List<String> getColors = goodsDetailMapper.getAllColorsByRid(rid.intValue());

        if(getColors==null || getColors.size()<=0) allColor.add("无");
        else allColor.addAll(getColors);

        return allColor;
    }


    public List<String> getStyleByColor(int rid,String color)
    {
        if(color.equals(null)) return null;

        ArrayList<String> styles = new ArrayList<>();
        styles.add("请选择样式");

        List<String> getStyles = goodsDetailMapper.getStyleByColor(rid,color);
        //System.out.println(getStyles);

        ArrayList<String> stander = new ArrayList<String>();
        stander.add(null);
        getStyles.removeAll(stander);

        if(getStyles==null||getStyles.size()<=0) styles.add("无");
        else styles.addAll(getStyles);

        return styles;
    }

    public List<String> getSizeByColorStyle(int rid,String color,String style)
    {
        String tempStyle = style;
        if(color.equals(null) || style.equals(null)) return null;
        if(style.equals("无")) tempStyle = null;

        ArrayList<String> sizes = new ArrayList<>();
        sizes.add("请选择尺寸");

        List<String> getsizes = goodsDetailMapper.getSizeByColorStyle(rid,color,tempStyle);
        sizes.addAll(getsizes);
        System.out.println(getsizes);
        return sizes;
    }
}