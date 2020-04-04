package cqdx.finall.supertmarket.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsRoughExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsRoughExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andGoodsRidIsNull() {
            addCriterion("goods_rid is null");
            return (Criteria) this;
        }

        public Criteria andGoodsRidIsNotNull() {
            addCriterion("goods_rid is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsRidEqualTo(Integer value) {
            addCriterion("goods_rid =", value, "goodsRid");
            return (Criteria) this;
        }

        public Criteria andGoodsRidNotEqualTo(Integer value) {
            addCriterion("goods_rid <>", value, "goodsRid");
            return (Criteria) this;
        }

        public Criteria andGoodsRidGreaterThan(Integer value) {
            addCriterion("goods_rid >", value, "goodsRid");
            return (Criteria) this;
        }

        public Criteria andGoodsRidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_rid >=", value, "goodsRid");
            return (Criteria) this;
        }

        public Criteria andGoodsRidLessThan(Integer value) {
            addCriterion("goods_rid <", value, "goodsRid");
            return (Criteria) this;
        }

        public Criteria andGoodsRidLessThanOrEqualTo(Integer value) {
            addCriterion("goods_rid <=", value, "goodsRid");
            return (Criteria) this;
        }

        public Criteria andGoodsRidIn(List<Integer> values) {
            addCriterion("goods_rid in", values, "goodsRid");
            return (Criteria) this;
        }

        public Criteria andGoodsRidNotIn(List<Integer> values) {
            addCriterion("goods_rid not in", values, "goodsRid");
            return (Criteria) this;
        }

        public Criteria andGoodsRidBetween(Integer value1, Integer value2) {
            addCriterion("goods_rid between", value1, value2, "goodsRid");
            return (Criteria) this;
        }

        public Criteria andGoodsRidNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_rid not between", value1, value2, "goodsRid");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNull() {
            addCriterion("goods_type is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNotNull() {
            addCriterion("goods_type is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeEqualTo(String value) {
            addCriterion("goods_type =", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotEqualTo(String value) {
            addCriterion("goods_type <>", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThan(String value) {
            addCriterion("goods_type >", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_type >=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThan(String value) {
            addCriterion("goods_type <", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThanOrEqualTo(String value) {
            addCriterion("goods_type <=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLike(String value) {
            addCriterion("goods_type like", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotLike(String value) {
            addCriterion("goods_type not like", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIn(List<String> values) {
            addCriterion("goods_type in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotIn(List<String> values) {
            addCriterion("goods_type not in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeBetween(String value1, String value2) {
            addCriterion("goods_type between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotBetween(String value1, String value2) {
            addCriterion("goods_type not between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsShoperIsNull() {
            addCriterion("goods_shoper is null");
            return (Criteria) this;
        }

        public Criteria andGoodsShoperIsNotNull() {
            addCriterion("goods_shoper is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsShoperEqualTo(String value) {
            addCriterion("goods_shoper =", value, "goodsShoper");
            return (Criteria) this;
        }

        public Criteria andGoodsShoperNotEqualTo(String value) {
            addCriterion("goods_shoper <>", value, "goodsShoper");
            return (Criteria) this;
        }

        public Criteria andGoodsShoperGreaterThan(String value) {
            addCriterion("goods_shoper >", value, "goodsShoper");
            return (Criteria) this;
        }

        public Criteria andGoodsShoperGreaterThanOrEqualTo(String value) {
            addCriterion("goods_shoper >=", value, "goodsShoper");
            return (Criteria) this;
        }

        public Criteria andGoodsShoperLessThan(String value) {
            addCriterion("goods_shoper <", value, "goodsShoper");
            return (Criteria) this;
        }

        public Criteria andGoodsShoperLessThanOrEqualTo(String value) {
            addCriterion("goods_shoper <=", value, "goodsShoper");
            return (Criteria) this;
        }

        public Criteria andGoodsShoperLike(String value) {
            addCriterion("goods_shoper like", value, "goodsShoper");
            return (Criteria) this;
        }

        public Criteria andGoodsShoperNotLike(String value) {
            addCriterion("goods_shoper not like", value, "goodsShoper");
            return (Criteria) this;
        }

        public Criteria andGoodsShoperIn(List<String> values) {
            addCriterion("goods_shoper in", values, "goodsShoper");
            return (Criteria) this;
        }

        public Criteria andGoodsShoperNotIn(List<String> values) {
            addCriterion("goods_shoper not in", values, "goodsShoper");
            return (Criteria) this;
        }

        public Criteria andGoodsShoperBetween(String value1, String value2) {
            addCriterion("goods_shoper between", value1, value2, "goodsShoper");
            return (Criteria) this;
        }

        public Criteria andGoodsShoperNotBetween(String value1, String value2) {
            addCriterion("goods_shoper not between", value1, value2, "goodsShoper");
            return (Criteria) this;
        }

        public Criteria andGoodsProtraitIsNull() {
            addCriterion("goods_protrait is null");
            return (Criteria) this;
        }

        public Criteria andGoodsProtraitIsNotNull() {
            addCriterion("goods_protrait is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsProtraitEqualTo(String value) {
            addCriterion("goods_protrait =", value, "goodsProtrait");
            return (Criteria) this;
        }

        public Criteria andGoodsProtraitNotEqualTo(String value) {
            addCriterion("goods_protrait <>", value, "goodsProtrait");
            return (Criteria) this;
        }

        public Criteria andGoodsProtraitGreaterThan(String value) {
            addCriterion("goods_protrait >", value, "goodsProtrait");
            return (Criteria) this;
        }

        public Criteria andGoodsProtraitGreaterThanOrEqualTo(String value) {
            addCriterion("goods_protrait >=", value, "goodsProtrait");
            return (Criteria) this;
        }

        public Criteria andGoodsProtraitLessThan(String value) {
            addCriterion("goods_protrait <", value, "goodsProtrait");
            return (Criteria) this;
        }

        public Criteria andGoodsProtraitLessThanOrEqualTo(String value) {
            addCriterion("goods_protrait <=", value, "goodsProtrait");
            return (Criteria) this;
        }

        public Criteria andGoodsProtraitLike(String value) {
            addCriterion("goods_protrait like", value, "goodsProtrait");
            return (Criteria) this;
        }

        public Criteria andGoodsProtraitNotLike(String value) {
            addCriterion("goods_protrait not like", value, "goodsProtrait");
            return (Criteria) this;
        }

        public Criteria andGoodsProtraitIn(List<String> values) {
            addCriterion("goods_protrait in", values, "goodsProtrait");
            return (Criteria) this;
        }

        public Criteria andGoodsProtraitNotIn(List<String> values) {
            addCriterion("goods_protrait not in", values, "goodsProtrait");
            return (Criteria) this;
        }

        public Criteria andGoodsProtraitBetween(String value1, String value2) {
            addCriterion("goods_protrait between", value1, value2, "goodsProtrait");
            return (Criteria) this;
        }

        public Criteria andGoodsProtraitNotBetween(String value1, String value2) {
            addCriterion("goods_protrait not between", value1, value2, "goodsProtrait");
            return (Criteria) this;
        }

        public Criteria andGoodsDateIsNull() {
            addCriterion("goods_date is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDateIsNotNull() {
            addCriterion("goods_date is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDateEqualTo(Date value) {
            addCriterion("goods_date =", value, "goodsDate");
            return (Criteria) this;
        }

        public Criteria andGoodsDateNotEqualTo(Date value) {
            addCriterion("goods_date <>", value, "goodsDate");
            return (Criteria) this;
        }

        public Criteria andGoodsDateGreaterThan(Date value) {
            addCriterion("goods_date >", value, "goodsDate");
            return (Criteria) this;
        }

        public Criteria andGoodsDateGreaterThanOrEqualTo(Date value) {
            addCriterion("goods_date >=", value, "goodsDate");
            return (Criteria) this;
        }

        public Criteria andGoodsDateLessThan(Date value) {
            addCriterion("goods_date <", value, "goodsDate");
            return (Criteria) this;
        }

        public Criteria andGoodsDateLessThanOrEqualTo(Date value) {
            addCriterion("goods_date <=", value, "goodsDate");
            return (Criteria) this;
        }

        public Criteria andGoodsDateIn(List<Date> values) {
            addCriterion("goods_date in", values, "goodsDate");
            return (Criteria) this;
        }

        public Criteria andGoodsDateNotIn(List<Date> values) {
            addCriterion("goods_date not in", values, "goodsDate");
            return (Criteria) this;
        }

        public Criteria andGoodsDateBetween(Date value1, Date value2) {
            addCriterion("goods_date between", value1, value2, "goodsDate");
            return (Criteria) this;
        }

        public Criteria andGoodsDateNotBetween(Date value1, Date value2) {
            addCriterion("goods_date not between", value1, value2, "goodsDate");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectionIsNull() {
            addCriterion("goods_collection is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectionIsNotNull() {
            addCriterion("goods_collection is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectionEqualTo(Integer value) {
            addCriterion("goods_collection =", value, "goodsCollection");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectionNotEqualTo(Integer value) {
            addCriterion("goods_collection <>", value, "goodsCollection");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectionGreaterThan(Integer value) {
            addCriterion("goods_collection >", value, "goodsCollection");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_collection >=", value, "goodsCollection");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectionLessThan(Integer value) {
            addCriterion("goods_collection <", value, "goodsCollection");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectionLessThanOrEqualTo(Integer value) {
            addCriterion("goods_collection <=", value, "goodsCollection");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectionIn(List<Integer> values) {
            addCriterion("goods_collection in", values, "goodsCollection");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectionNotIn(List<Integer> values) {
            addCriterion("goods_collection not in", values, "goodsCollection");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectionBetween(Integer value1, Integer value2) {
            addCriterion("goods_collection between", value1, value2, "goodsCollection");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectionNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_collection not between", value1, value2, "goodsCollection");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesIsNull() {
            addCriterion("goods_sales is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesIsNotNull() {
            addCriterion("goods_sales is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesEqualTo(Integer value) {
            addCriterion("goods_sales =", value, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesNotEqualTo(Integer value) {
            addCriterion("goods_sales <>", value, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesGreaterThan(Integer value) {
            addCriterion("goods_sales >", value, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_sales >=", value, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesLessThan(Integer value) {
            addCriterion("goods_sales <", value, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesLessThanOrEqualTo(Integer value) {
            addCriterion("goods_sales <=", value, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesIn(List<Integer> values) {
            addCriterion("goods_sales in", values, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesNotIn(List<Integer> values) {
            addCriterion("goods_sales not in", values, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesBetween(Integer value1, Integer value2) {
            addCriterion("goods_sales between", value1, value2, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_sales not between", value1, value2, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsMoreimgIsNull() {
            addCriterion("goods_moreImg is null");
            return (Criteria) this;
        }

        public Criteria andGoodsMoreimgIsNotNull() {
            addCriterion("goods_moreImg is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsMoreimgEqualTo(String value) {
            addCriterion("goods_moreImg =", value, "goodsMoreimg");
            return (Criteria) this;
        }

        public Criteria andGoodsMoreimgNotEqualTo(String value) {
            addCriterion("goods_moreImg <>", value, "goodsMoreimg");
            return (Criteria) this;
        }

        public Criteria andGoodsMoreimgGreaterThan(String value) {
            addCriterion("goods_moreImg >", value, "goodsMoreimg");
            return (Criteria) this;
        }

        public Criteria andGoodsMoreimgGreaterThanOrEqualTo(String value) {
            addCriterion("goods_moreImg >=", value, "goodsMoreimg");
            return (Criteria) this;
        }

        public Criteria andGoodsMoreimgLessThan(String value) {
            addCriterion("goods_moreImg <", value, "goodsMoreimg");
            return (Criteria) this;
        }

        public Criteria andGoodsMoreimgLessThanOrEqualTo(String value) {
            addCriterion("goods_moreImg <=", value, "goodsMoreimg");
            return (Criteria) this;
        }

        public Criteria andGoodsMoreimgLike(String value) {
            addCriterion("goods_moreImg like", value, "goodsMoreimg");
            return (Criteria) this;
        }

        public Criteria andGoodsMoreimgNotLike(String value) {
            addCriterion("goods_moreImg not like", value, "goodsMoreimg");
            return (Criteria) this;
        }

        public Criteria andGoodsMoreimgIn(List<String> values) {
            addCriterion("goods_moreImg in", values, "goodsMoreimg");
            return (Criteria) this;
        }

        public Criteria andGoodsMoreimgNotIn(List<String> values) {
            addCriterion("goods_moreImg not in", values, "goodsMoreimg");
            return (Criteria) this;
        }

        public Criteria andGoodsMoreimgBetween(String value1, String value2) {
            addCriterion("goods_moreImg between", value1, value2, "goodsMoreimg");
            return (Criteria) this;
        }

        public Criteria andGoodsMoreimgNotBetween(String value1, String value2) {
            addCriterion("goods_moreImg not between", value1, value2, "goodsMoreimg");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleIsNull() {
            addCriterion("is_on_sale is null");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleIsNotNull() {
            addCriterion("is_on_sale is not null");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleEqualTo(Integer value) {
            addCriterion("is_on_sale =", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleNotEqualTo(Integer value) {
            addCriterion("is_on_sale <>", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleGreaterThan(Integer value) {
            addCriterion("is_on_sale >", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_on_sale >=", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleLessThan(Integer value) {
            addCriterion("is_on_sale <", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleLessThanOrEqualTo(Integer value) {
            addCriterion("is_on_sale <=", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleIn(List<Integer> values) {
            addCriterion("is_on_sale in", values, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleNotIn(List<Integer> values) {
            addCriterion("is_on_sale not in", values, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleBetween(Integer value1, Integer value2) {
            addCriterion("is_on_sale between", value1, value2, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleNotBetween(Integer value1, Integer value2) {
            addCriterion("is_on_sale not between", value1, value2, "isOnSale");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}