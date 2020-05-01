package cqdx.finall.supertmarket.mapper;

import cqdx.finall.supertmarket.entity.UserInfo;
import cqdx.finall.supertmarket.entity.UserInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper

public interface UserInfoMapper {
    int countByExample(UserInfoExample example);

    int deleteByExample(UserInfoExample example);

    int deleteByPrimaryKey(String userId);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    List<UserInfo> selectByExample(UserInfoExample example);

    UserInfo selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

    int isContain(String uid); //检查是否存在
    int updatePortrait(String uid,String portraitURL);
    int ablityNickname(String nickname); //检测nickname是否存在 不区分大小写
    int updateNickname(String uid, String newNickname, String portraitURL); //头像也要更新
}