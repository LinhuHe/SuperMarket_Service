package cqdx.finall.supertmarket.entity;

import java.util.Date;

public class GoodsRough {
    private Integer goodsRid;

    private String goodsType;

    private String goodsName;

    private String goodsShoper;

    private String goodsProtrait;

    private Date goodsDate;

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
}