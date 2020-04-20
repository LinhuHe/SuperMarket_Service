package cqdx.finall.supertmarket.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ShopCartGoodsInfo {
    private Integer goodsDid;

    private Integer goodsStock;

    private Integer goodsRid;

    private String goodsStyle;

    private String goodsColor;

    private String goodsSize;

    private BigDecimal goodsPrice;

    private String goodsName;

    private String goodsShoper;

    private String goodsProtrait;

    private Integer goodsCollection;

    private Integer goodsSales;

    private Integer isOnSale;

    public ShopCartGoodsInfo(){}

    public ShopCartGoodsInfo(GoodsDetail gd,GoodsRough gr)
    {
        this.goodsDid = gd.getGoodsDid();
        this.goodsCollection = gr.getGoodsCollection();
        this.goodsColor = gd.getGoodsColor();
        this.goodsName = gr.getGoodsName();
        this.goodsPrice = gd.getGoodsPrice();
        this.goodsProtrait = gr.getGoodsProtrait();
        this.goodsRid = gd.getGoodsRid();
        this.goodsSales = gr.getGoodsSales();
        this.goodsShoper = gr.getGoodsShoper();
        this.goodsSize = gd.getGoodsSize();
        this.goodsStock = gd.getGoodsStock();
        this.goodsStyle  =gd.getGoodsStyle();
        this.isOnSale = gr.getIsOnSale();
    }

    public ShopCartGoodsInfo(Integer goodsDid, Integer goodsStock, Integer goodsRid, Integer goodsCollection, String goodsStyle, String goodsColor, String goodsSize, BigDecimal goodsPrice, String goodsName, String goodsShoper, String goodsProtrait,  Integer goodsSales, Integer isOnSale) {
        this.goodsDid = goodsDid;
        this.goodsStock = goodsStock;
        this.goodsRid = goodsRid;
        this.goodsStyle = goodsStyle;
        this.goodsColor = goodsColor;
        this.goodsSize = goodsSize;
        this.goodsPrice = goodsPrice;
        this.goodsName = goodsName;
        this.goodsShoper = goodsShoper;
        this.goodsProtrait = goodsProtrait;
        this.goodsCollection = goodsCollection;
        this.goodsSales = goodsSales;
        this.isOnSale = isOnSale;
    }

    public Integer getGoodsDid() {
        return goodsDid;
    }

    public void setGoodsDid(Integer goodsDid) {
        this.goodsDid = goodsDid;
    }

    public Integer getGoodsStock() {
        return goodsStock;
    }

    public void setGoodsStock(Integer goodsStock) {
        this.goodsStock = goodsStock;
    }

    public Integer getGoodsRid() {
        return goodsRid;
    }

    public void setGoodsRid(Integer goodsRid) {
        this.goodsRid = goodsRid;
    }

    public String getGoodsStyle() {
        return goodsStyle;
    }

    public void setGoodsStyle(String goodsStyle) {
        this.goodsStyle = goodsStyle;
    }

    public String getGoodsColor() {
        return goodsColor;
    }

    public void setGoodsColor(String goodsColor) {
        this.goodsColor = goodsColor;
    }

    public String getGoodsSize() {
        return goodsSize;
    }

    public void setGoodsSize(String goodsSize) {
        this.goodsSize = goodsSize;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
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

    public Integer getGoodsCollection() {
        return goodsCollection;
    }

    public void setGoodsCollection(Integer goodsCollection) {
        this.goodsCollection = goodsCollection;
    }

    public Integer getGoodsSales() {
        return goodsSales;
    }

    public void setGoodsSales(Integer goodsSales) {
        this.goodsSales = goodsSales;
    }

    public Integer getIsOnSale() {
        return isOnSale;
    }

    public void setIsOnSale(Integer isOnSale) {
        this.isOnSale = isOnSale;
    }

    @Override
    public String toString() {
        return "ShopCartGoodsInfo{" + "goodsShoper=" + goodsShoper +  '}';
    }
}
