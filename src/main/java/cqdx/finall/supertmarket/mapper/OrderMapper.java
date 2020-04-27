package cqdx.finall.supertmarket.mapper;

import cqdx.finall.supertmarket.entity.Order;
import cqdx.finall.supertmarket.entity.OrderExample;

import java.util.ArrayList;
import java.util.List;

import cqdx.finall.supertmarket.entity.OrderGoodsInfo;
import cqdx.finall.supertmarket.entity.OrderShowInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface OrderMapper {
    int countByExample(OrderExample example);

    int deleteByExample(OrderExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(Order record);

    int insertSelective(Order record);

    List<Order> selectByExample(OrderExample example);

    Order selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    OrderGoodsInfo getOrderGoodsInfoByDid(int did);
    int checkGoodStatus(int did);
    ArrayList<OrderShowInfo> getOrderByUid(String uid);

    ArrayList<OrderShowInfo> getWaitOrder(String uid);
    ArrayList<OrderShowInfo> getSendOrder(String uid);
    ArrayList<OrderShowInfo> getReceivedOrder(String uid);
    ArrayList<OrderShowInfo> getBackOrder(String uid);

}