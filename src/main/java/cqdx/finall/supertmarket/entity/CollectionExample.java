package cqdx.finall.supertmarket.entity;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollectionExample() {
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

        public Criteria andColUidIsNull() {
            addCriterion("col_uid is null");
            return (Criteria) this;
        }

        public Criteria andColUidIsNotNull() {
            addCriterion("col_uid is not null");
            return (Criteria) this;
        }

        public Criteria andColUidEqualTo(String value) {
            addCriterion("col_uid =", value, "colUid");
            return (Criteria) this;
        }

        public Criteria andColUidNotEqualTo(String value) {
            addCriterion("col_uid <>", value, "colUid");
            return (Criteria) this;
        }

        public Criteria andColUidGreaterThan(String value) {
            addCriterion("col_uid >", value, "colUid");
            return (Criteria) this;
        }

        public Criteria andColUidGreaterThanOrEqualTo(String value) {
            addCriterion("col_uid >=", value, "colUid");
            return (Criteria) this;
        }

        public Criteria andColUidLessThan(String value) {
            addCriterion("col_uid <", value, "colUid");
            return (Criteria) this;
        }

        public Criteria andColUidLessThanOrEqualTo(String value) {
            addCriterion("col_uid <=", value, "colUid");
            return (Criteria) this;
        }

        public Criteria andColUidLike(String value) {
            addCriterion("col_uid like", value, "colUid");
            return (Criteria) this;
        }

        public Criteria andColUidNotLike(String value) {
            addCriterion("col_uid not like", value, "colUid");
            return (Criteria) this;
        }

        public Criteria andColUidIn(List<String> values) {
            addCriterion("col_uid in", values, "colUid");
            return (Criteria) this;
        }

        public Criteria andColUidNotIn(List<String> values) {
            addCriterion("col_uid not in", values, "colUid");
            return (Criteria) this;
        }

        public Criteria andColUidBetween(String value1, String value2) {
            addCriterion("col_uid between", value1, value2, "colUid");
            return (Criteria) this;
        }

        public Criteria andColUidNotBetween(String value1, String value2) {
            addCriterion("col_uid not between", value1, value2, "colUid");
            return (Criteria) this;
        }

        public Criteria andColRidIsNull() {
            addCriterion("col_rid is null");
            return (Criteria) this;
        }

        public Criteria andColRidIsNotNull() {
            addCriterion("col_rid is not null");
            return (Criteria) this;
        }

        public Criteria andColRidEqualTo(Integer value) {
            addCriterion("col_rid =", value, "colRid");
            return (Criteria) this;
        }

        public Criteria andColRidNotEqualTo(Integer value) {
            addCriterion("col_rid <>", value, "colRid");
            return (Criteria) this;
        }

        public Criteria andColRidGreaterThan(Integer value) {
            addCriterion("col_rid >", value, "colRid");
            return (Criteria) this;
        }

        public Criteria andColRidGreaterThanOrEqualTo(Integer value) {
            addCriterion("col_rid >=", value, "colRid");
            return (Criteria) this;
        }

        public Criteria andColRidLessThan(Integer value) {
            addCriterion("col_rid <", value, "colRid");
            return (Criteria) this;
        }

        public Criteria andColRidLessThanOrEqualTo(Integer value) {
            addCriterion("col_rid <=", value, "colRid");
            return (Criteria) this;
        }

        public Criteria andColRidIn(List<Integer> values) {
            addCriterion("col_rid in", values, "colRid");
            return (Criteria) this;
        }

        public Criteria andColRidNotIn(List<Integer> values) {
            addCriterion("col_rid not in", values, "colRid");
            return (Criteria) this;
        }

        public Criteria andColRidBetween(Integer value1, Integer value2) {
            addCriterion("col_rid between", value1, value2, "colRid");
            return (Criteria) this;
        }

        public Criteria andColRidNotBetween(Integer value1, Integer value2) {
            addCriterion("col_rid not between", value1, value2, "colRid");
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