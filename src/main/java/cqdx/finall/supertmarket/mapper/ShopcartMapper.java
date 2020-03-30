package cqdx.finall.supertmarket.mapper;

import cqdx.finall.supertmarket.entity.ShopcartExample;
import cqdx.finall.supertmarket.entity.ShopcartKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopcartMapper {
    int countByExample(ShopcartExample example);

    int deleteByExample(ShopcartExample example);

    int deleteByPrimaryKey(ShopcartKey key);

    int insert(ShopcartKey record);

    int insertSelective(ShopcartKey record);

    List<ShopcartKey> selectByExample(ShopcartExample example);

    int updateByExampleSelective(@Param("record") ShopcartKey record, @Param("example") ShopcartExample example);

    int updateByExample(@Param("record") ShopcartKey record, @Param("example") ShopcartExample example);
}