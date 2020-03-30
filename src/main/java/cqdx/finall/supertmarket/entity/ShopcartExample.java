package cqdx.finall.supertmarket.entity;

import java.util.ArrayList;
import java.util.List;

public class ShopcartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopcartExample() {
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

        public Criteria andSpcUidIsNull() {
            addCriterion("spc_uid is null");
            return (Criteria) this;
        }

        public Criteria andSpcUidIsNotNull() {
            addCriterion("spc_uid is not null");
            return (Criteria) this;
        }

        public Criteria andSpcUidEqualTo(String value) {
            addCriterion("spc_uid =", value, "spcUid");
            return (Criteria) this;
        }

        public Criteria andSpcUidNotEqualTo(String value) {
            addCriterion("spc_uid <>", value, "spcUid");
            return (Criteria) this;
        }

        public Criteria andSpcUidGreaterThan(String value) {
            addCriterion("spc_uid >", value, "spcUid");
            return (Criteria) this;
        }

        public Criteria andSpcUidGreaterThanOrEqualTo(String value) {
            addCriterion("spc_uid >=", value, "spcUid");
            return (Criteria) this;
        }

        public Criteria andSpcUidLessThan(String value) {
            addCriterion("spc_uid <", value, "spcUid");
            return (Criteria) this;
        }

        public Criteria andSpcUidLessThanOrEqualTo(String value) {
            addCriterion("spc_uid <=", value, "spcUid");
            return (Criteria) this;
        }

        public Criteria andSpcUidLike(String value) {
            addCriterion("spc_uid like", value, "spcUid");
            return (Criteria) this;
        }

        public Criteria andSpcUidNotLike(String value) {
            addCriterion("spc_uid not like", value, "spcUid");
            return (Criteria) this;
        }

        public Criteria andSpcUidIn(List<String> values) {
            addCriterion("spc_uid in", values, "spcUid");
            return (Criteria) this;
        }

        public Criteria andSpcUidNotIn(List<String> values) {
            addCriterion("spc_uid not in", values, "spcUid");
            return (Criteria) this;
        }

        public Criteria andSpcUidBetween(String value1, String value2) {
            addCriterion("spc_uid between", value1, value2, "spcUid");
            return (Criteria) this;
        }

        public Criteria andSpcUidNotBetween(String value1, String value2) {
            addCriterion("spc_uid not between", value1, value2, "spcUid");
            return (Criteria) this;
        }

        public Criteria andSpcDidIsNull() {
            addCriterion("spc_did is null");
            return (Criteria) this;
        }

        public Criteria andSpcDidIsNotNull() {
            addCriterion("spc_did is not null");
            return (Criteria) this;
        }

        public Criteria andSpcDidEqualTo(Integer value) {
            addCriterion("spc_did =", value, "spcDid");
            return (Criteria) this;
        }

        public Criteria andSpcDidNotEqualTo(Integer value) {
            addCriterion("spc_did <>", value, "spcDid");
            return (Criteria) this;
        }

        public Criteria andSpcDidGreaterThan(Integer value) {
            addCriterion("spc_did >", value, "spcDid");
            return (Criteria) this;
        }

        public Criteria andSpcDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("spc_did >=", value, "spcDid");
            return (Criteria) this;
        }

        public Criteria andSpcDidLessThan(Integer value) {
            addCriterion("spc_did <", value, "spcDid");
            return (Criteria) this;
        }

        public Criteria andSpcDidLessThanOrEqualTo(Integer value) {
            addCriterion("spc_did <=", value, "spcDid");
            return (Criteria) this;
        }

        public Criteria andSpcDidIn(List<Integer> values) {
            addCriterion("spc_did in", values, "spcDid");
            return (Criteria) this;
        }

        public Criteria andSpcDidNotIn(List<Integer> values) {
            addCriterion("spc_did not in", values, "spcDid");
            return (Criteria) this;
        }

        public Criteria andSpcDidBetween(Integer value1, Integer value2) {
            addCriterion("spc_did between", value1, value2, "spcDid");
            return (Criteria) this;
        }

        public Criteria andSpcDidNotBetween(Integer value1, Integer value2) {
            addCriterion("spc_did not between", value1, value2, "spcDid");
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