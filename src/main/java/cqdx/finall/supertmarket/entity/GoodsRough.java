package cqdx.finall.supertmarket.entity;

import java.util.Date;

public class GoodsRough {
    private Integer goodsRid;

    private String goodsType;

    private String goodsName;

    private String goodsShoper;

    private String goodsProtrait;

    private Date goodsDate;

    private Integer goodsCollection=0;

    private Integer goodsSales=0;

    private String goodsMoreimg;

    private Integer isOnSale;

    public Integer getGoodsRid() {
        return goodsRid;
    }

    public void setGoodsRid(Integer goodsRid) {
        this.goodsRid = goodsRid;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
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

    public Date getGoodsDate() {
        return goodsDate;
    }

    public void setGoodsDate(Date goodsDate) {
        this.goodsDate = goodsDate;
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

    public String getGoodsMoreimg() {
        return goodsMoreimg;
    }

    public void setGoodsMoreimg(String goodsMoreimg) {
        this.goodsMoreimg = goodsMoreimg;
    }

    public Integer getIsOnSale() {
        return isOnSale;
    }

    public void setIsOnSale(Integer isOnSale) {
        this.isOnSale = isOnSale;
    }

    @Override
    public String toString() {
        return "GoodsRough{" +
                "goodsRid=" + goodsRid +
                ", goodsType='" + goodsType + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", goodsShoper='" + goodsShoper + '\'' +
                ", goodsProtrait='" + goodsProtrait + '\'' +
                ", goodsDate=" + goodsDate +
                ", goodsCollection=" + goodsCollection +
                ", goodsSales=" + goodsSales +
                ", goodsMoreimg='" + goodsMoreimg + '\'' +
                ", isOnSale=" + isOnSale +
                '}';
    }
}