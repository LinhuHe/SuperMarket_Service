package cqdx.finall.supertmarket.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private Integer orderId = 0;

    private Integer orderDid;

    private String orderUid;

    private Date orderDate;

    private BigDecimal orderPrice;

    private String orderKey;

    private Integer orderAmount;

    private Integer orderStatus;

    private String orderDestination;

    public Order(){}

    public Order(Integer orderDid, String orderUid, BigDecimal orderPrice, String orderKey,String orderDestination) {
        this.orderDid = orderDid;
        this.orderUid = orderUid;
        this.orderPrice = orderPrice;
        this.orderKey = orderKey;
        this.orderDestination = orderDestination;

        this.orderId = 0;
        this.orderAmount = 1;
        this.orderStatus = 0;
        this.orderDate = new Date();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderDid() {
        return orderDid;
    }

    public void setOrderDid(Integer orderDid) {
        this.orderDid = orderDid;
    }

    public String getOrderUid() {
        return orderUid;
    }

    public void setOrderUid(String orderUid) {
        this.orderUid = orderUid;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderKey() {
        return orderKey;
    }

    public void setOrderKey(String orderKey) {
        this.orderKey = orderKey;
    }

    public Integer getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Integer orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderDestination() {
        return orderDestination;
    }

    public void setOrderDestination(String orderDestination) {
        this.orderDestination = orderDestination;
    }
}