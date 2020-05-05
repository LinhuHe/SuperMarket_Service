package cqdx.finall.supertmarket.mapper;

import cqdx.finall.supertmarket.entity.GoodsRough;
import cqdx.finall.supertmarket.entity.GoodsRoughExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GoodsRoughMapper {
    int countByExample(GoodsRoughExample example);

    int deleteByExample(GoodsRoughExample example);

    int deleteByPrimaryKey(Integer goodsRid);

    int insert(GoodsRough record);

    int insertSelective(GoodsRough record);

    List<GoodsRough> selectByExample(GoodsRoughExample example);

    GoodsRough selectByPrimaryKey(Integer goodsRid);

    int updateByExampleSelective(@Param("record") GoodsRough record, @Param("example") GoodsRoughExample example); //record对象则是我们需要修改的数据,example则是我们需要修改的对象

    int updateByExample(@Param("record") GoodsRough record, @Param("example") GoodsRoughExample example);

    int updateByPrimaryKeySelective(GoodsRough record);

    int updateByPrimaryKey(GoodsRough record);

    List<GoodsRough> selectByGoodsDate(); //按照上市时间且在售排序
    void addCollectionNums(int rid);
    void desCollectionNums(int rid);
    void addOrderNums(int rid);
    void desOrderNums(int rid);

}