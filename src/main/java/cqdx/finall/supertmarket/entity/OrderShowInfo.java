package cqdx.finall.supertmarket.entity;

import java.math.BigDecimal;
import java.util.Date;

//购买后查看
public class OrderShowInfo {

    private Integer orderId ;

    private Integer orderDid;

    private Integer orderRid;

    private String orderUid;

    private Date orderDate;

    private BigDecimal orderPrice;

    private String orderKey;

    private Integer orderAmount;

    private Integer orderStatus;

    private String orderDestination;

    private String goodsName;

    private String goodsShoper;

    private String goodsProtrait;

    private String[] desInfo = new String[3];

    private String date_str;

    private String color;

    private String size;

    private String style;


    public OrderShowInfo(){}

    public OrderShowInfo(Integer orderId, Integer orderDid, String orderUid, Date orderDate, BigDecimal orderPrice, String orderKey,
                         Integer orderAmount, Integer orderStatus, String orderDestination, String goodsName, String goodsShoper,
                         String goodsProtrait)
    {
        this.orderId = orderId;
        this.orderDid = orderDid;
        this.orderUid = orderUid;
        this.orderDate = orderDate;
        this.orderPrice = orderPrice;
        this.orderKey = orderKey;
        this.orderAmount = orderAmount;
        this.orderStatus = orderStatus;
        this.orderDestination = orderDestination;
        this.goodsName = goodsName;
        this.goodsShoper = goodsShoper;
        this.goodsProtrait = goodsProtrait;
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

    public Integer getOrderRid() {
        return orderRid;
    }

    public void setOrderRid(Integer orderRid) {
        this.orderRid = orderRid;
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

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsShoper() {
        return goodsShoper;
    }

    public void setGoodsShoper(String goodsShoper) {
        this.goodsShoper = goodsShoper;
    }

    public String getGoodsProtrait() {
        return goodsProtrait;
    }

    public void setGoodsProtrait(String goodsProtrait) {
        this.goodsProtrait = goodsProtrait;
    }

    public String[] getDesInfo() {
        return desInfo;
    }

    public void setDesInfo(String[] desInfo) {
        this.desInfo = desInfo;
    }

    public String getDate_str() {
        return date_str;
    }

    public void setDate_str(String date_str) {
        this.date_str = date_str;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

}
