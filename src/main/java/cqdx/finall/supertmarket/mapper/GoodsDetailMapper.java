package cqdx.finall.supertmarket.mapper;

import cqdx.finall.supertmarket.entity.GoodsDetail;
import cqdx.finall.supertmarket.entity.GoodsDetailExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

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
}