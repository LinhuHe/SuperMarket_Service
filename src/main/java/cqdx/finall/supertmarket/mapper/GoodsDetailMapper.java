package cqdx.finall.supertmarket.mapper;

import cqdx.finall.supertmarket.entity.GoodsDetail;
import cqdx.finall.supertmarket.entity.GoodsDetailExample;

import java.math.BigDecimal;
import java.util.List;

import cqdx.finall.supertmarket.entity.OrderGoodsInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GoodsDetailMapper {
    int countByExample(GoodsDetailExample example);

    int deleteByExample(GoodsDetailExample example);

    int deleteByPrimaryKey(Integer goodsDid);

    int insert(GoodsDetail record);

    int insertSelective(GoodsDetail record);

    List<GoodsDetail> selectByExample(GoodsDetailExample example);

    GoodsDetail selectByPrimaryKey(Integer goodsDid);

    int updateByExampleSelective(@Param("record") GoodsDetail record, @Param("example") GoodsDetailExample example);

    int updateByExample(@Param("record") GoodsDetail record, @Param("example") GoodsDetailExample example);

    int updateByPrimaryKeySelective(GoodsDetail record);

    int updateByPrimaryKey(GoodsDetail record);

    List<BigDecimal> getPriceRangeByRid(int rid);
    List<String> getAllColorsByRid(int rid);
    List<String> getStyleByColor(int rid,String color);
    List<String> getSizeByColorStyle(int rid,String color,String style);
    int getDidByRidCSS(int rid,String color ,String style,String size);

}