package cqdx.finall.supertmarket.mapper;

import cqdx.finall.supertmarket.entity.GoodsRough;
import cqdx.finall.supertmarket.entity.GoodsRoughExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsRoughMapper {
    int countByExample(GoodsRoughExample example);

    int deleteByExample(GoodsRoughExample example);

    int deleteByPrimaryKey(Integer goodsRid);

    int insert(GoodsRough record);

    int insertSelective(GoodsRough record);

    List<GoodsRough> selectByExample(GoodsRoughExample example);

    GoodsRough selectByPrimaryKey(Integer goodsRid);

    int updateByExampleSelective(@Param("record") GoodsRough record, @Param("example") GoodsRoughExample example);

    int updateByExample(@Param("record") GoodsRough record, @Param("example") GoodsRoughExample example);

    int updateByPrimaryKeySelective(GoodsRough record);

    int updateByPrimaryKey(GoodsRough record);
}