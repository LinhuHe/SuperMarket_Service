package cqdx.finall.supertmarket.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShoperGoodsManage {
    private boolean unfold = false; //是否展开

    //rought信息
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

    public void setRough(GoodsRough gr) {
        this.goodsRid = gr.getGoodsRid();
        this.goodsType = gr.getGoodsType();
        this.goodsName = gr.getGoodsName();
        this.goodsShoper = gr.getGoodsShoper();
        this.goodsProtrait = gr.getGoodsProtrait();
        this.goodsDate = gr.getGoodsDate();
        this.goodsCollection = gr.getGoodsCollection();
        this.goodsSales = gr.getGoodsSales();
        this.goodsMoreimg = gr.getGoodsMoreimg();
        this.isOnSale = gr.getIsOnSale();
    }

    //detail 信息
    private ArrayList<GoodsDetail> detail = new ArrayList<>();

    public boolean isUnfold() {
        return unfold;
    }

    public void setUnfold(boolean unfold) {
        this.unfold = unfold;
    }

    public ArrayList<GoodsDetail> getDetail() {
        return detail;
    }

    public void setDetail(List<GoodsDetail> detail) {
        //System.out.println("de dao de:"+detail);
        this.detail.addAll(new ArrayList<GoodsDetail>(detail));
    }

    public void addDetail(GoodsDetail gd)
    {
        this.detail.add(gd);
    }
}
