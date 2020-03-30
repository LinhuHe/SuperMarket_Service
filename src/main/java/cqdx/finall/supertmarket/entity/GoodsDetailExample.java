package cqdx.finall.supertmarket.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GoodsDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsDetailExample() {
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

        public Criteria andGoodsDidIsNull() {
            addCriterion("goods_did is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDidIsNotNull() {
            addCriterion("goods_did is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDidEqualTo(Integer value) {
            addCriterion("goods_did =", value, "goodsDid");
            return (Criteria) this;
        }

        public Criteria andGoodsDidNotEqualTo(Integer value) {
            addCriterion("goods_did <>", value, "goodsDid");
            return (Criteria) this;
        }

        public Criteria andGoodsDidGreaterThan(Integer value) {
            addCriterion("goods_did >", value, "goodsDid");
            return (Criteria) this;
        }

        public Criteria andGoodsDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_did >=", value, "goodsDid");
            return (Criteria) this;
        }

        public Criteria andGoodsDidLessThan(Integer value) {
            addCriterion("goods_did <", value, "goodsDid");
            return (Criteria) this;
        }

        public Criteria andGoodsDidLessThanOrEqualTo(Integer value) {
            addCriterion("goods_did <=", value, "goodsDid");
            return (Criteria) this;
        }

        public Criteria andGoodsDidIn(List<Integer> values) {
            addCriterion("goods_did in", values, "goodsDid");
            return (Criteria) this;
        }

        public Criteria andGoodsDidNotIn(List<Integer> values) {
            addCriterion("goods_did not in", values, "goodsDid");
            return (Criteria) this;
        }

        public Criteria andGoodsDidBetween(Integer value1, Integer value2) {
            addCriterion("goods_did between", value1, value2, "goodsDid");
            return (Criteria) this;
        }

        public Criteria andGoodsDidNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_did not between", value1, value2, "goodsDid");
            return (Criteria) this;
        }

        public Criteria andGoodsStockIsNull() {
            addCriterion("goods_stock is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStockIsNotNull() {
            addCriterion("goods_stock is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStockEqualTo(Integer value) {
            addCriterion("goods_stock =", value, "goodsStock");
            return (Criteria) this;
        }

        public Criteria andGoodsStockNotEqualTo(Integer value) {
            addCriterion("goods_stock <>", value, "goodsStock");
            return (Criteria) this;
        }

        public Criteria andGoodsStockGreaterThan(Integer value) {
            addCriterion("goods_stock >", value, "goodsStock");
            return (Criteria) this;
        }

        public Criteria andGoodsStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_stock >=", value, "goodsStock");
            return (Criteria) this;
        }

        public Criteria andGoodsStockLessThan(Integer value) {
            addCriterion("goods_stock <", value, "goodsStock");
            return (Criteria) this;
        }

        public Criteria andGoodsStockLessThanOrEqualTo(Integer value) {
            addCriterion("goods_stock <=", value, "goodsStock");
            return (Criteria) this;
        }

        public Criteria andGoodsStockIn(List<Integer> values) {
            addCriterion("goods_stock in", values, "goodsStock");
            return (Criteria) this;
        }

        public Criteria andGoodsStockNotIn(List<Integer> values) {
            addCriterion("goods_stock not in", values, "goodsStock");
            return (Criteria) this;
        }

        public Criteria andGoodsStockBetween(Integer value1, Integer value2) {
            addCriterion("goods_stock between", value1, value2, "goodsStock");
            return (Criteria) this;
        }

        public Criteria andGoodsStockNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_stock not between", value1, value2, "goodsStock");
            return (Criteria) this;
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

        public Criteria andGoodsStyleIsNull() {
            addCriterion("goods_style is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStyleIsNotNull() {
            addCriterion("goods_style is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStyleEqualTo(String value) {
            addCriterion("goods_style =", value, "goodsStyle");
            return (Criteria) this;
        }

        public Criteria andGoodsStyleNotEqualTo(String value) {
            addCriterion("goods_style <>", value, "goodsStyle");
            return (Criteria) this;
        }

        public Criteria andGoodsStyleGreaterThan(String value) {
            addCriterion("goods_style >", value, "goodsStyle");
            return (Criteria) this;
        }

        public Criteria andGoodsStyleGreaterThanOrEqualTo(String value) {
            addCriterion("goods_style >=", value, "goodsStyle");
            return (Criteria) this;
        }

        public Criteria andGoodsStyleLessThan(String value) {
            addCriterion("goods_style <", value, "goodsStyle");
            return (Criteria) this;
        }

        public Criteria andGoodsStyleLessThanOrEqualTo(String value) {
            addCriterion("goods_style <=", value, "goodsStyle");
            return (Criteria) this;
        }

        public Criteria andGoodsStyleLike(String value) {
            addCriterion("goods_style like", value, "goodsStyle");
            return (Criteria) this;
        }

        public Criteria andGoodsStyleNotLike(String value) {
            addCriterion("goods_style not like", value, "goodsStyle");
            return (Criteria) this;
        }

        public Criteria andGoodsStyleIn(List<String> values) {
            addCriterion("goods_style in", values, "goodsStyle");
            return (Criteria) this;
        }

        public Criteria andGoodsStyleNotIn(List<String> values) {
            addCriterion("goods_style not in", values, "goodsStyle");
            return (Criteria) this;
        }

        public Criteria andGoodsStyleBetween(String value1, String value2) {
            addCriterion("goods_style between", value1, value2, "goodsStyle");
            return (Criteria) this;
        }

        public Criteria andGoodsStyleNotBetween(String value1, String value2) {
            addCriterion("goods_style not between", value1, value2, "goodsStyle");
            return (Criteria) this;
        }

        public Criteria andGoodsColorIsNull() {
            addCriterion("goods_color is null");
            return (Criteria) this;
        }

        public Criteria andGoodsColorIsNotNull() {
            addCriterion("goods_color is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsColorEqualTo(String value) {
            addCriterion("goods_color =", value, "goodsColor");
            return (Criteria) this;
        }

        public Criteria andGoodsColorNotEqualTo(String value) {
            addCriterion("goods_color <>", value, "goodsColor");
            return (Criteria) this;
        }

        public Criteria andGoodsColorGreaterThan(String value) {
            addCriterion("goods_color >", value, "goodsColor");
            return (Criteria) this;
        }

        public Criteria andGoodsColorGreaterThanOrEqualTo(String value) {
            addCriterion("goods_color >=", value, "goodsColor");
            return (Criteria) this;
        }

        public Criteria andGoodsColorLessThan(String value) {
            addCriterion("goods_color <", value, "goodsColor");
            return (Criteria) this;
        }

        public Criteria andGoodsColorLessThanOrEqualTo(String value) {
            addCriterion("goods_color <=", value, "goodsColor");
            return (Criteria) this;
        }

        public Criteria andGoodsColorLike(String value) {
            addCriterion("goods_color like", value, "goodsColor");
            return (Criteria) this;
        }

        public Criteria andGoodsColorNotLike(String value) {
            addCriterion("goods_color not like", value, "goodsColor");
            return (Criteria) this;
        }

        public Criteria andGoodsColorIn(List<String> values) {
            addCriterion("goods_color in", values, "goodsColor");
            return (Criteria) this;
        }

        public Criteria andGoodsColorNotIn(List<String> values) {
            addCriterion("goods_color not in", values, "goodsColor");
            return (Criteria) this;
        }

        public Criteria andGoodsColorBetween(String value1, String value2) {
            addCriterion("goods_color between", value1, value2, "goodsColor");
            return (Criteria) this;
        }

        public Criteria andGoodsColorNotBetween(String value1, String value2) {
            addCriterion("goods_color not between", value1, value2, "goodsColor");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeIsNull() {
            addCriterion("goods_size is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeIsNotNull() {
            addCriterion("goods_size is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeEqualTo(String value) {
            addCriterion("goods_size =", value, "goodsSize");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeNotEqualTo(String value) {
            addCriterion("goods_size <>", value, "goodsSize");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeGreaterThan(String value) {
            addCriterion("goods_size >", value, "goodsSize");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_size >=", value, "goodsSize");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeLessThan(String value) {
            addCriterion("goods_size <", value, "goodsSize");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeLessThanOrEqualTo(String value) {
            addCriterion("goods_size <=", value, "goodsSize");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeLike(String value) {
            addCriterion("goods_size like", value, "goodsSize");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeNotLike(String value) {
            addCriterion("goods_size not like", value, "goodsSize");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeIn(List<String> values) {
            addCriterion("goods_size in", values, "goodsSize");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeNotIn(List<String> values) {
            addCriterion("goods_size not in", values, "goodsSize");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeBetween(String value1, String value2) {
            addCriterion("goods_size between", value1, value2, "goodsSize");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeNotBetween(String value1, String value2) {
            addCriterion("goods_size not between", value1, value2, "goodsSize");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNull() {
            addCriterion("goods_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNotNull() {
            addCriterion("goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualTo(BigDecimal value) {
            addCriterion("goods_price =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(BigDecimal value) {
            addCriterion("goods_price <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(BigDecimal value) {
            addCriterion("goods_price >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(BigDecimal value) {
            addCriterion("goods_price <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<BigDecimal> values) {
            addCriterion("goods_price in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<BigDecimal> values) {
            addCriterion("goods_price not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price not between", value1, value2, "goodsPrice");
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