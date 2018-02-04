package com.alan.hysupermarket.pojo;

import java.util.ArrayList;
import java.util.List;

public class PropertyValueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PropertyValueExample() {
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

        public Criteria andIDIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIDIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIDEqualTo(Long value) {
            addCriterion("ID =", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotEqualTo(Long value) {
            addCriterion("ID <>", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThan(Long value) {
            addCriterion("ID >", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThan(Long value) {
            addCriterion("ID <", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDIn(List<Long> values) {
            addCriterion("ID in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotIn(List<Long> values) {
            addCriterion("ID not in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andPIDIsNull() {
            addCriterion("PID is null");
            return (Criteria) this;
        }

        public Criteria andPIDIsNotNull() {
            addCriterion("PID is not null");
            return (Criteria) this;
        }

        public Criteria andPIDEqualTo(Long value) {
            addCriterion("PID =", value, "PID");
            return (Criteria) this;
        }

        public Criteria andPIDNotEqualTo(Long value) {
            addCriterion("PID <>", value, "PID");
            return (Criteria) this;
        }

        public Criteria andPIDGreaterThan(Long value) {
            addCriterion("PID >", value, "PID");
            return (Criteria) this;
        }

        public Criteria andPIDGreaterThanOrEqualTo(Long value) {
            addCriterion("PID >=", value, "PID");
            return (Criteria) this;
        }

        public Criteria andPIDLessThan(Long value) {
            addCriterion("PID <", value, "PID");
            return (Criteria) this;
        }

        public Criteria andPIDLessThanOrEqualTo(Long value) {
            addCriterion("PID <=", value, "PID");
            return (Criteria) this;
        }

        public Criteria andPIDIn(List<Long> values) {
            addCriterion("PID in", values, "PID");
            return (Criteria) this;
        }

        public Criteria andPIDNotIn(List<Long> values) {
            addCriterion("PID not in", values, "PID");
            return (Criteria) this;
        }

        public Criteria andPIDBetween(Long value1, Long value2) {
            addCriterion("PID between", value1, value2, "PID");
            return (Criteria) this;
        }

        public Criteria andPIDNotBetween(Long value1, Long value2) {
            addCriterion("PID not between", value1, value2, "PID");
            return (Criteria) this;
        }

        public Criteria andPTIDIsNull() {
            addCriterion("PTID is null");
            return (Criteria) this;
        }

        public Criteria andPTIDIsNotNull() {
            addCriterion("PTID is not null");
            return (Criteria) this;
        }

        public Criteria andPTIDEqualTo(Long value) {
            addCriterion("PTID =", value, "PTID");
            return (Criteria) this;
        }

        public Criteria andPTIDNotEqualTo(Long value) {
            addCriterion("PTID <>", value, "PTID");
            return (Criteria) this;
        }

        public Criteria andPTIDGreaterThan(Long value) {
            addCriterion("PTID >", value, "PTID");
            return (Criteria) this;
        }

        public Criteria andPTIDGreaterThanOrEqualTo(Long value) {
            addCriterion("PTID >=", value, "PTID");
            return (Criteria) this;
        }

        public Criteria andPTIDLessThan(Long value) {
            addCriterion("PTID <", value, "PTID");
            return (Criteria) this;
        }

        public Criteria andPTIDLessThanOrEqualTo(Long value) {
            addCriterion("PTID <=", value, "PTID");
            return (Criteria) this;
        }

        public Criteria andPTIDIn(List<Long> values) {
            addCriterion("PTID in", values, "PTID");
            return (Criteria) this;
        }

        public Criteria andPTIDNotIn(List<Long> values) {
            addCriterion("PTID not in", values, "PTID");
            return (Criteria) this;
        }

        public Criteria andPTIDBetween(Long value1, Long value2) {
            addCriterion("PTID between", value1, value2, "PTID");
            return (Criteria) this;
        }

        public Criteria andPTIDNotBetween(Long value1, Long value2) {
            addCriterion("PTID not between", value1, value2, "PTID");
            return (Criteria) this;
        }

        public Criteria andVALUEIsNull() {
            addCriterion("VALUE is null");
            return (Criteria) this;
        }

        public Criteria andVALUEIsNotNull() {
            addCriterion("VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andVALUEEqualTo(String value) {
            addCriterion("VALUE =", value, "VALUE");
            return (Criteria) this;
        }

        public Criteria andVALUENotEqualTo(String value) {
            addCriterion("VALUE <>", value, "VALUE");
            return (Criteria) this;
        }

        public Criteria andVALUEGreaterThan(String value) {
            addCriterion("VALUE >", value, "VALUE");
            return (Criteria) this;
        }

        public Criteria andVALUEGreaterThanOrEqualTo(String value) {
            addCriterion("VALUE >=", value, "VALUE");
            return (Criteria) this;
        }

        public Criteria andVALUELessThan(String value) {
            addCriterion("VALUE <", value, "VALUE");
            return (Criteria) this;
        }

        public Criteria andVALUELessThanOrEqualTo(String value) {
            addCriterion("VALUE <=", value, "VALUE");
            return (Criteria) this;
        }

        public Criteria andVALUELike(String value) {
            addCriterion("VALUE like", value, "VALUE");
            return (Criteria) this;
        }

        public Criteria andVALUENotLike(String value) {
            addCriterion("VALUE not like", value, "VALUE");
            return (Criteria) this;
        }

        public Criteria andVALUEIn(List<String> values) {
            addCriterion("VALUE in", values, "VALUE");
            return (Criteria) this;
        }

        public Criteria andVALUENotIn(List<String> values) {
            addCriterion("VALUE not in", values, "VALUE");
            return (Criteria) this;
        }

        public Criteria andVALUEBetween(String value1, String value2) {
            addCriterion("VALUE between", value1, value2, "VALUE");
            return (Criteria) this;
        }

        public Criteria andVALUENotBetween(String value1, String value2) {
            addCriterion("VALUE not between", value1, value2, "VALUE");
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