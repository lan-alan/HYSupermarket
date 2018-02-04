package com.alan.hysupermarket.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andNAMEIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNAMEIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNAMEEqualTo(String value) {
            addCriterion("NAME =", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotEqualTo(String value) {
            addCriterion("NAME <>", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEGreaterThan(String value) {
            addCriterion("NAME >", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMELessThan(String value) {
            addCriterion("NAME <", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMELessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMELike(String value) {
            addCriterion("NAME like", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotLike(String value) {
            addCriterion("NAME not like", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEIn(List<String> values) {
            addCriterion("NAME in", values, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotIn(List<String> values) {
            addCriterion("NAME not in", values, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "NAME");
            return (Criteria) this;
        }

        public Criteria andSUBTITLEIsNull() {
            addCriterion("SUBTITLE is null");
            return (Criteria) this;
        }

        public Criteria andSUBTITLEIsNotNull() {
            addCriterion("SUBTITLE is not null");
            return (Criteria) this;
        }

        public Criteria andSUBTITLEEqualTo(String value) {
            addCriterion("SUBTITLE =", value, "SUBTITLE");
            return (Criteria) this;
        }

        public Criteria andSUBTITLENotEqualTo(String value) {
            addCriterion("SUBTITLE <>", value, "SUBTITLE");
            return (Criteria) this;
        }

        public Criteria andSUBTITLEGreaterThan(String value) {
            addCriterion("SUBTITLE >", value, "SUBTITLE");
            return (Criteria) this;
        }

        public Criteria andSUBTITLEGreaterThanOrEqualTo(String value) {
            addCriterion("SUBTITLE >=", value, "SUBTITLE");
            return (Criteria) this;
        }

        public Criteria andSUBTITLELessThan(String value) {
            addCriterion("SUBTITLE <", value, "SUBTITLE");
            return (Criteria) this;
        }

        public Criteria andSUBTITLELessThanOrEqualTo(String value) {
            addCriterion("SUBTITLE <=", value, "SUBTITLE");
            return (Criteria) this;
        }

        public Criteria andSUBTITLELike(String value) {
            addCriterion("SUBTITLE like", value, "SUBTITLE");
            return (Criteria) this;
        }

        public Criteria andSUBTITLENotLike(String value) {
            addCriterion("SUBTITLE not like", value, "SUBTITLE");
            return (Criteria) this;
        }

        public Criteria andSUBTITLEIn(List<String> values) {
            addCriterion("SUBTITLE in", values, "SUBTITLE");
            return (Criteria) this;
        }

        public Criteria andSUBTITLENotIn(List<String> values) {
            addCriterion("SUBTITLE not in", values, "SUBTITLE");
            return (Criteria) this;
        }

        public Criteria andSUBTITLEBetween(String value1, String value2) {
            addCriterion("SUBTITLE between", value1, value2, "SUBTITLE");
            return (Criteria) this;
        }

        public Criteria andSUBTITLENotBetween(String value1, String value2) {
            addCriterion("SUBTITLE not between", value1, value2, "SUBTITLE");
            return (Criteria) this;
        }

        public Criteria andORIGNALPRICEIsNull() {
            addCriterion("ORIGNALPRICE is null");
            return (Criteria) this;
        }

        public Criteria andORIGNALPRICEIsNotNull() {
            addCriterion("ORIGNALPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andORIGNALPRICEEqualTo(Double value) {
            addCriterion("ORIGNALPRICE =", value, "ORIGNALPRICE");
            return (Criteria) this;
        }

        public Criteria andORIGNALPRICENotEqualTo(Double value) {
            addCriterion("ORIGNALPRICE <>", value, "ORIGNALPRICE");
            return (Criteria) this;
        }

        public Criteria andORIGNALPRICEGreaterThan(Double value) {
            addCriterion("ORIGNALPRICE >", value, "ORIGNALPRICE");
            return (Criteria) this;
        }

        public Criteria andORIGNALPRICEGreaterThanOrEqualTo(Double value) {
            addCriterion("ORIGNALPRICE >=", value, "ORIGNALPRICE");
            return (Criteria) this;
        }

        public Criteria andORIGNALPRICELessThan(Double value) {
            addCriterion("ORIGNALPRICE <", value, "ORIGNALPRICE");
            return (Criteria) this;
        }

        public Criteria andORIGNALPRICELessThanOrEqualTo(Double value) {
            addCriterion("ORIGNALPRICE <=", value, "ORIGNALPRICE");
            return (Criteria) this;
        }

        public Criteria andORIGNALPRICEIn(List<Double> values) {
            addCriterion("ORIGNALPRICE in", values, "ORIGNALPRICE");
            return (Criteria) this;
        }

        public Criteria andORIGNALPRICENotIn(List<Double> values) {
            addCriterion("ORIGNALPRICE not in", values, "ORIGNALPRICE");
            return (Criteria) this;
        }

        public Criteria andORIGNALPRICEBetween(Double value1, Double value2) {
            addCriterion("ORIGNALPRICE between", value1, value2, "ORIGNALPRICE");
            return (Criteria) this;
        }

        public Criteria andORIGNALPRICENotBetween(Double value1, Double value2) {
            addCriterion("ORIGNALPRICE not between", value1, value2, "ORIGNALPRICE");
            return (Criteria) this;
        }

        public Criteria andPROMOTEPRICEIsNull() {
            addCriterion("PROMOTEPRICE is null");
            return (Criteria) this;
        }

        public Criteria andPROMOTEPRICEIsNotNull() {
            addCriterion("PROMOTEPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPROMOTEPRICEEqualTo(Double value) {
            addCriterion("PROMOTEPRICE =", value, "PROMOTEPRICE");
            return (Criteria) this;
        }

        public Criteria andPROMOTEPRICENotEqualTo(Double value) {
            addCriterion("PROMOTEPRICE <>", value, "PROMOTEPRICE");
            return (Criteria) this;
        }

        public Criteria andPROMOTEPRICEGreaterThan(Double value) {
            addCriterion("PROMOTEPRICE >", value, "PROMOTEPRICE");
            return (Criteria) this;
        }

        public Criteria andPROMOTEPRICEGreaterThanOrEqualTo(Double value) {
            addCriterion("PROMOTEPRICE >=", value, "PROMOTEPRICE");
            return (Criteria) this;
        }

        public Criteria andPROMOTEPRICELessThan(Double value) {
            addCriterion("PROMOTEPRICE <", value, "PROMOTEPRICE");
            return (Criteria) this;
        }

        public Criteria andPROMOTEPRICELessThanOrEqualTo(Double value) {
            addCriterion("PROMOTEPRICE <=", value, "PROMOTEPRICE");
            return (Criteria) this;
        }

        public Criteria andPROMOTEPRICEIn(List<Double> values) {
            addCriterion("PROMOTEPRICE in", values, "PROMOTEPRICE");
            return (Criteria) this;
        }

        public Criteria andPROMOTEPRICENotIn(List<Double> values) {
            addCriterion("PROMOTEPRICE not in", values, "PROMOTEPRICE");
            return (Criteria) this;
        }

        public Criteria andPROMOTEPRICEBetween(Double value1, Double value2) {
            addCriterion("PROMOTEPRICE between", value1, value2, "PROMOTEPRICE");
            return (Criteria) this;
        }

        public Criteria andPROMOTEPRICENotBetween(Double value1, Double value2) {
            addCriterion("PROMOTEPRICE not between", value1, value2, "PROMOTEPRICE");
            return (Criteria) this;
        }

        public Criteria andSTOCKIsNull() {
            addCriterion("STOCK is null");
            return (Criteria) this;
        }

        public Criteria andSTOCKIsNotNull() {
            addCriterion("STOCK is not null");
            return (Criteria) this;
        }

        public Criteria andSTOCKEqualTo(Long value) {
            addCriterion("STOCK =", value, "STOCK");
            return (Criteria) this;
        }

        public Criteria andSTOCKNotEqualTo(Long value) {
            addCriterion("STOCK <>", value, "STOCK");
            return (Criteria) this;
        }

        public Criteria andSTOCKGreaterThan(Long value) {
            addCriterion("STOCK >", value, "STOCK");
            return (Criteria) this;
        }

        public Criteria andSTOCKGreaterThanOrEqualTo(Long value) {
            addCriterion("STOCK >=", value, "STOCK");
            return (Criteria) this;
        }

        public Criteria andSTOCKLessThan(Long value) {
            addCriterion("STOCK <", value, "STOCK");
            return (Criteria) this;
        }

        public Criteria andSTOCKLessThanOrEqualTo(Long value) {
            addCriterion("STOCK <=", value, "STOCK");
            return (Criteria) this;
        }

        public Criteria andSTOCKIn(List<Long> values) {
            addCriterion("STOCK in", values, "STOCK");
            return (Criteria) this;
        }

        public Criteria andSTOCKNotIn(List<Long> values) {
            addCriterion("STOCK not in", values, "STOCK");
            return (Criteria) this;
        }

        public Criteria andSTOCKBetween(Long value1, Long value2) {
            addCriterion("STOCK between", value1, value2, "STOCK");
            return (Criteria) this;
        }

        public Criteria andSTOCKNotBetween(Long value1, Long value2) {
            addCriterion("STOCK not between", value1, value2, "STOCK");
            return (Criteria) this;
        }

        public Criteria andCIDIsNull() {
            addCriterion("CID is null");
            return (Criteria) this;
        }

        public Criteria andCIDIsNotNull() {
            addCriterion("CID is not null");
            return (Criteria) this;
        }

        public Criteria andCIDEqualTo(Long value) {
            addCriterion("CID =", value, "CID");
            return (Criteria) this;
        }

        public Criteria andCIDNotEqualTo(Long value) {
            addCriterion("CID <>", value, "CID");
            return (Criteria) this;
        }

        public Criteria andCIDGreaterThan(Long value) {
            addCriterion("CID >", value, "CID");
            return (Criteria) this;
        }

        public Criteria andCIDGreaterThanOrEqualTo(Long value) {
            addCriterion("CID >=", value, "CID");
            return (Criteria) this;
        }

        public Criteria andCIDLessThan(Long value) {
            addCriterion("CID <", value, "CID");
            return (Criteria) this;
        }

        public Criteria andCIDLessThanOrEqualTo(Long value) {
            addCriterion("CID <=", value, "CID");
            return (Criteria) this;
        }

        public Criteria andCIDIn(List<Long> values) {
            addCriterion("CID in", values, "CID");
            return (Criteria) this;
        }

        public Criteria andCIDNotIn(List<Long> values) {
            addCriterion("CID not in", values, "CID");
            return (Criteria) this;
        }

        public Criteria andCIDBetween(Long value1, Long value2) {
            addCriterion("CID between", value1, value2, "CID");
            return (Criteria) this;
        }

        public Criteria andCIDNotBetween(Long value1, Long value2) {
            addCriterion("CID not between", value1, value2, "CID");
            return (Criteria) this;
        }

        public Criteria andCREATEDATEIsNull() {
            addCriterion("CREATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andCREATEDATEIsNotNull() {
            addCriterion("CREATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCREATEDATEEqualTo(String value) {
            addCriterion("CREATEDATE =", value, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andCREATEDATENotEqualTo(String value) {
            addCriterion("CREATEDATE <>", value, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andCREATEDATEGreaterThan(String value) {
            addCriterion("CREATEDATE >", value, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andCREATEDATEGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEDATE >=", value, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andCREATEDATELessThan(String value) {
            addCriterion("CREATEDATE <", value, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andCREATEDATELessThanOrEqualTo(String value) {
            addCriterion("CREATEDATE <=", value, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andCREATEDATELike(String value) {
            addCriterion("CREATEDATE like", value, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andCREATEDATENotLike(String value) {
            addCriterion("CREATEDATE not like", value, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andCREATEDATEIn(List<String> values) {
            addCriterion("CREATEDATE in", values, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andCREATEDATENotIn(List<String> values) {
            addCriterion("CREATEDATE not in", values, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andCREATEDATEBetween(String value1, String value2) {
            addCriterion("CREATEDATE between", value1, value2, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andCREATEDATENotBetween(String value1, String value2) {
            addCriterion("CREATEDATE not between", value1, value2, "CREATEDATE");
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