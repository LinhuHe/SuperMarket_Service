package cqdx.finall.supertmarket.entity;

import java.math.BigDecimal;

public class GoodsDetail {
    private Integer goodsDid;

    private Integer goodsStock;

    private Integer goodsRid;

    private String goodsStyle;

    private String goodsColor;

    private String goodsSize;

    private BigDecimal goodsPrice;

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
}