package cqdx.finall.supertmarket.entity;

import java.util.Date;

public class GoodsShowInfo {

    private Integer goodsRid;

    private String goodsType;

    private String goodsName;

    private String goodsShoper;

    private String goodsProtrait;

    private Date goodsDate;

    private Integer goodsCollection;

    private Integer goodsSales;

    private String goodsMoreimg;

    private Integer isOnSale;

    private Double priceL;
    private Double priceH;

    public GoodsShowInfo(Integer goodsRid, String goodsName, String goodsShoper, String goodsProtrait, Double priceL, Double priceH) {
        this.goodsRid = goodsRid;
        this.goodsName = goodsName;
        this.goodsShoper = goodsShoper;
        this.goodsProtrait = goodsProtrait;
        this.priceL = priceL;
        this.priceH = priceH;
    }

    public GoodsShowInfo(GoodsRough gr, Double priceL, Double priceH) {
        this.goodsRid = gr.getGoodsRid();
        this.goodsType = gr.getGoodsType();
        this.goodsShoper = gr.getGoodsShoper();
        this.goodsProtrait = gr.getGoodsProtrait();
        this.goodsCollection = gr.getGoodsCollection();
        this.goodsSales = gr.getGoodsSales();
        this.goodsMoreimg = gr.getGoodsMoreimg();
        this.goodsName = gr.getGoodsName();

        this.priceL = priceL;
        this.priceH = priceH;
    }

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

    public Double getPriceL() {
        return priceL;
    }

    public void setPriceL(Double priceL) {
        this.priceL = priceL;
    }

    public Double getPriceH() {
        return priceH;
    }

    public void setPriceH(Double priceH) {
        this.priceH = priceH;
    }
}

