package com.alan.hysupermarket.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andORDERSCODEIsNull() {
            addCriterion("ORDERSCODE is null");
            return (Criteria) this;
        }

        public Criteria andORDERSCODEIsNotNull() {
            addCriterion("ORDERSCODE is not null");
            return (Criteria) this;
        }

        public Criteria andORDERSCODEEqualTo(String value) {
            addCriterion("ORDERSCODE =", value, "ORDERSCODE");
            return (Criteria) this;
        }

        public Criteria andORDERSCODENotEqualTo(String value) {
            addCriterion("ORDERSCODE <>", value, "ORDERSCODE");
            return (Criteria) this;
        }

        public Criteria andORDERSCODEGreaterThan(String value) {
            addCriterion("ORDERSCODE >", value, "ORDERSCODE");
            return (Criteria) this;
        }

        public Criteria andORDERSCODEGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERSCODE >=", value, "ORDERSCODE");
            return (Criteria) this;
        }

        public Criteria andORDERSCODELessThan(String value) {
            addCriterion("ORDERSCODE <", value, "ORDERSCODE");
            return (Criteria) this;
        }

        public Criteria andORDERSCODELessThanOrEqualTo(String value) {
            addCriterion("ORDERSCODE <=", value, "ORDERSCODE");
            return (Criteria) this;
        }

        public Criteria andORDERSCODELike(String value) {
            addCriterion("ORDERSCODE like", value, "ORDERSCODE");
            return (Criteria) this;
        }

        public Criteria andORDERSCODENotLike(String value) {
            addCriterion("ORDERSCODE not like", value, "ORDERSCODE");
            return (Criteria) this;
        }

        public Criteria andORDERSCODEIn(List<String> values) {
            addCriterion("ORDERSCODE in", values, "ORDERSCODE");
            return (Criteria) this;
        }

        public Criteria andORDERSCODENotIn(List<String> values) {
            addCriterion("ORDERSCODE not in", values, "ORDERSCODE");
            return (Criteria) this;
        }

        public Criteria andORDERSCODEBetween(String value1, String value2) {
            addCriterion("ORDERSCODE between", value1, value2, "ORDERSCODE");
            return (Criteria) this;
        }

        public Criteria andORDERSCODENotBetween(String value1, String value2) {
            addCriterion("ORDERSCODE not between", value1, value2, "ORDERSCODE");
            return (Criteria) this;
        }

        public Criteria andADDRESSIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andADDRESSIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andADDRESSEqualTo(String value) {
            addCriterion("ADDRESS =", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSLessThan(String value) {
            addCriterion("ADDRESS <", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSLike(String value) {
            addCriterion("ADDRESS like", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSNotLike(String value) {
            addCriterion("ADDRESS not like", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSIn(List<String> values) {
            addCriterion("ADDRESS in", values, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andPOSTIsNull() {
            addCriterion("POST is null");
            return (Criteria) this;
        }

        public Criteria andPOSTIsNotNull() {
            addCriterion("POST is not null");
            return (Criteria) this;
        }

        public Criteria andPOSTEqualTo(String value) {
            addCriterion("POST =", value, "POST");
            return (Criteria) this;
        }

        public Criteria andPOSTNotEqualTo(String value) {
            addCriterion("POST <>", value, "POST");
            return (Criteria) this;
        }

        public Criteria andPOSTGreaterThan(String value) {
            addCriterion("POST >", value, "POST");
            return (Criteria) this;
        }

        public Criteria andPOSTGreaterThanOrEqualTo(String value) {
            addCriterion("POST >=", value, "POST");
            return (Criteria) this;
        }

        public Criteria andPOSTLessThan(String value) {
            addCriterion("POST <", value, "POST");
            return (Criteria) this;
        }

        public Criteria andPOSTLessThanOrEqualTo(String value) {
            addCriterion("POST <=", value, "POST");
            return (Criteria) this;
        }

        public Criteria andPOSTLike(String value) {
            addCriterion("POST like", value, "POST");
            return (Criteria) this;
        }

        public Criteria andPOSTNotLike(String value) {
            addCriterion("POST not like", value, "POST");
            return (Criteria) this;
        }

        public Criteria andPOSTIn(List<String> values) {
            addCriterion("POST in", values, "POST");
            return (Criteria) this;
        }

        public Criteria andPOSTNotIn(List<String> values) {
            addCriterion("POST not in", values, "POST");
            return (Criteria) this;
        }

        public Criteria andPOSTBetween(String value1, String value2) {
            addCriterion("POST between", value1, value2, "POST");
            return (Criteria) this;
        }

        public Criteria andPOSTNotBetween(String value1, String value2) {
            addCriterion("POST not between", value1, value2, "POST");
            return (Criteria) this;
        }

        public Criteria andRECEIVERIsNull() {
            addCriterion("RECEIVER is null");
            return (Criteria) this;
        }

        public Criteria andRECEIVERIsNotNull() {
            addCriterion("RECEIVER is not null");
            return (Criteria) this;
        }

        public Criteria andRECEIVEREqualTo(String value) {
            addCriterion("RECEIVER =", value, "RECEIVER");
            return (Criteria) this;
        }

        public Criteria andRECEIVERNotEqualTo(String value) {
            addCriterion("RECEIVER <>", value, "RECEIVER");
            return (Criteria) this;
        }

        public Criteria andRECEIVERGreaterThan(String value) {
            addCriterion("RECEIVER >", value, "RECEIVER");
            return (Criteria) this;
        }

        public Criteria andRECEIVERGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVER >=", value, "RECEIVER");
            return (Criteria) this;
        }

        public Criteria andRECEIVERLessThan(String value) {
            addCriterion("RECEIVER <", value, "RECEIVER");
            return (Criteria) this;
        }

        public Criteria andRECEIVERLessThanOrEqualTo(String value) {
            addCriterion("RECEIVER <=", value, "RECEIVER");
            return (Criteria) this;
        }

        public Criteria andRECEIVERLike(String value) {
            addCriterion("RECEIVER like", value, "RECEIVER");
            return (Criteria) this;
        }

        public Criteria andRECEIVERNotLike(String value) {
            addCriterion("RECEIVER not like", value, "RECEIVER");
            return (Criteria) this;
        }

        public Criteria andRECEIVERIn(List<String> values) {
            addCriterion("RECEIVER in", values, "RECEIVER");
            return (Criteria) this;
        }

        public Criteria andRECEIVERNotIn(List<String> values) {
            addCriterion("RECEIVER not in", values, "RECEIVER");
            return (Criteria) this;
        }

        public Criteria andRECEIVERBetween(String value1, String value2) {
            addCriterion("RECEIVER between", value1, value2, "RECEIVER");
            return (Criteria) this;
        }

        public Criteria andRECEIVERNotBetween(String value1, String value2) {
            addCriterion("RECEIVER not between", value1, value2, "RECEIVER");
            return (Criteria) this;
        }

        public Criteria andMOBILEIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMOBILEIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMOBILEEqualTo(String value) {
            addCriterion("MOBILE =", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILENotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILEGreaterThan(String value) {
            addCriterion("MOBILE >", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILEGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILELessThan(String value) {
            addCriterion("MOBILE <", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILELessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILELike(String value) {
            addCriterion("MOBILE like", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILENotLike(String value) {
            addCriterion("MOBILE not like", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILEIn(List<String> values) {
            addCriterion("MOBILE in", values, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILENotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILEBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILENotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andUSERMESSAGEIsNull() {
            addCriterion("USERMESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andUSERMESSAGEIsNotNull() {
            addCriterion("USERMESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andUSERMESSAGEEqualTo(String value) {
            addCriterion("USERMESSAGE =", value, "USERMESSAGE");
            return (Criteria) this;
        }

        public Criteria andUSERMESSAGENotEqualTo(String value) {
            addCriterion("USERMESSAGE <>", value, "USERMESSAGE");
            return (Criteria) this;
        }

        public Criteria andUSERMESSAGEGreaterThan(String value) {
            addCriterion("USERMESSAGE >", value, "USERMESSAGE");
            return (Criteria) this;
        }

        public Criteria andUSERMESSAGEGreaterThanOrEqualTo(String value) {
            addCriterion("USERMESSAGE >=", value, "USERMESSAGE");
            return (Criteria) this;
        }

        public Criteria andUSERMESSAGELessThan(String value) {
            addCriterion("USERMESSAGE <", value, "USERMESSAGE");
            return (Criteria) this;
        }

        public Criteria andUSERMESSAGELessThanOrEqualTo(String value) {
            addCriterion("USERMESSAGE <=", value, "USERMESSAGE");
            return (Criteria) this;
        }

        public Criteria andUSERMESSAGELike(String value) {
            addCriterion("USERMESSAGE like", value, "USERMESSAGE");
            return (Criteria) this;
        }

        public Criteria andUSERMESSAGENotLike(String value) {
            addCriterion("USERMESSAGE not like", value, "USERMESSAGE");
            return (Criteria) this;
        }

        public Criteria andUSERMESSAGEIn(List<String> values) {
            addCriterion("USERMESSAGE in", values, "USERMESSAGE");
            return (Criteria) this;
        }

        public Criteria andUSERMESSAGENotIn(List<String> values) {
            addCriterion("USERMESSAGE not in", values, "USERMESSAGE");
            return (Criteria) this;
        }

        public Criteria andUSERMESSAGEBetween(String value1, String value2) {
            addCriterion("USERMESSAGE between", value1, value2, "USERMESSAGE");
            return (Criteria) this;
        }

        public Criteria andUSERMESSAGENotBetween(String value1, String value2) {
            addCriterion("USERMESSAGE not between", value1, value2, "USERMESSAGE");
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

        public Criteria andCREATEDATEEqualTo(Date value) {
            addCriterion("CREATEDATE =", value, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andCREATEDATENotEqualTo(Date value) {
            addCriterion("CREATEDATE <>", value, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andCREATEDATEGreaterThan(Date value) {
            addCriterion("CREATEDATE >", value, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andCREATEDATEGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATEDATE >=", value, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andCREATEDATELessThan(Date value) {
            addCriterion("CREATEDATE <", value, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andCREATEDATELessThanOrEqualTo(Date value) {
            addCriterion("CREATEDATE <=", value, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andCREATEDATEIn(List<Date> values) {
            addCriterion("CREATEDATE in", values, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andCREATEDATENotIn(List<Date> values) {
            addCriterion("CREATEDATE not in", values, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andCREATEDATEBetween(Date value1, Date value2) {
            addCriterion("CREATEDATE between", value1, value2, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andCREATEDATENotBetween(Date value1, Date value2) {
            addCriterion("CREATEDATE not between", value1, value2, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andPAYDATEIsNull() {
            addCriterion("PAYDATE is null");
            return (Criteria) this;
        }

        public Criteria andPAYDATEIsNotNull() {
            addCriterion("PAYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPAYDATEEqualTo(Date value) {
            addCriterion("PAYDATE =", value, "PAYDATE");
            return (Criteria) this;
        }

        public Criteria andPAYDATENotEqualTo(Date value) {
            addCriterion("PAYDATE <>", value, "PAYDATE");
            return (Criteria) this;
        }

        public Criteria andPAYDATEGreaterThan(Date value) {
            addCriterion("PAYDATE >", value, "PAYDATE");
            return (Criteria) this;
        }

        public Criteria andPAYDATEGreaterThanOrEqualTo(Date value) {
            addCriterion("PAYDATE >=", value, "PAYDATE");
            return (Criteria) this;
        }

        public Criteria andPAYDATELessThan(Date value) {
            addCriterion("PAYDATE <", value, "PAYDATE");
            return (Criteria) this;
        }

        public Criteria andPAYDATELessThanOrEqualTo(Date value) {
            addCriterion("PAYDATE <=", value, "PAYDATE");
            return (Criteria) this;
        }

        public Criteria andPAYDATEIn(List<Date> values) {
            addCriterion("PAYDATE in", values, "PAYDATE");
            return (Criteria) this;
        }

        public Criteria andPAYDATENotIn(List<Date> values) {
            addCriterion("PAYDATE not in", values, "PAYDATE");
            return (Criteria) this;
        }

        public Criteria andPAYDATEBetween(Date value1, Date value2) {
            addCriterion("PAYDATE between", value1, value2, "PAYDATE");
            return (Criteria) this;
        }

        public Criteria andPAYDATENotBetween(Date value1, Date value2) {
            addCriterion("PAYDATE not between", value1, value2, "PAYDATE");
            return (Criteria) this;
        }

        public Criteria andDELIVERYDATEIsNull() {
            addCriterion("DELIVERYDATE is null");
            return (Criteria) this;
        }

        public Criteria andDELIVERYDATEIsNotNull() {
            addCriterion("DELIVERYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andDELIVERYDATEEqualTo(Date value) {
            addCriterion("DELIVERYDATE =", value, "DELIVERYDATE");
            return (Criteria) this;
        }

        public Criteria andDELIVERYDATENotEqualTo(Date value) {
            addCriterion("DELIVERYDATE <>", value, "DELIVERYDATE");
            return (Criteria) this;
        }

        public Criteria andDELIVERYDATEGreaterThan(Date value) {
            addCriterion("DELIVERYDATE >", value, "DELIVERYDATE");
            return (Criteria) this;
        }

        public Criteria andDELIVERYDATEGreaterThanOrEqualTo(Date value) {
            addCriterion("DELIVERYDATE >=", value, "DELIVERYDATE");
            return (Criteria) this;
        }

        public Criteria andDELIVERYDATELessThan(Date value) {
            addCriterion("DELIVERYDATE <", value, "DELIVERYDATE");
            return (Criteria) this;
        }

        public Criteria andDELIVERYDATELessThanOrEqualTo(Date value) {
            addCriterion("DELIVERYDATE <=", value, "DELIVERYDATE");
            return (Criteria) this;
        }

        public Criteria andDELIVERYDATEIn(List<Date> values) {
            addCriterion("DELIVERYDATE in", values, "DELIVERYDATE");
            return (Criteria) this;
        }

        public Criteria andDELIVERYDATENotIn(List<Date> values) {
            addCriterion("DELIVERYDATE not in", values, "DELIVERYDATE");
            return (Criteria) this;
        }

        public Criteria andDELIVERYDATEBetween(Date value1, Date value2) {
            addCriterion("DELIVERYDATE between", value1, value2, "DELIVERYDATE");
            return (Criteria) this;
        }

        public Criteria andDELIVERYDATENotBetween(Date value1, Date value2) {
            addCriterion("DELIVERYDATE not between", value1, value2, "DELIVERYDATE");
            return (Criteria) this;
        }

        public Criteria andCONFIRMDATEIsNull() {
            addCriterion("CONFIRMDATE is null");
            return (Criteria) this;
        }

        public Criteria andCONFIRMDATEIsNotNull() {
            addCriterion("CONFIRMDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCONFIRMDATEEqualTo(Date value) {
            addCriterion("CONFIRMDATE =", value, "CONFIRMDATE");
            return (Criteria) this;
        }

        public Criteria andCONFIRMDATENotEqualTo(Date value) {
            addCriterion("CONFIRMDATE <>", value, "CONFIRMDATE");
            return (Criteria) this;
        }

        public Criteria andCONFIRMDATEGreaterThan(Date value) {
            addCriterion("CONFIRMDATE >", value, "CONFIRMDATE");
            return (Criteria) this;
        }

        public Criteria andCONFIRMDATEGreaterThanOrEqualTo(Date value) {
            addCriterion("CONFIRMDATE >=", value, "CONFIRMDATE");
            return (Criteria) this;
        }

        public Criteria andCONFIRMDATELessThan(Date value) {
            addCriterion("CONFIRMDATE <", value, "CONFIRMDATE");
            return (Criteria) this;
        }

        public Criteria andCONFIRMDATELessThanOrEqualTo(Date value) {
            addCriterion("CONFIRMDATE <=", value, "CONFIRMDATE");
            return (Criteria) this;
        }

        public Criteria andCONFIRMDATEIn(List<Date> values) {
            addCriterion("CONFIRMDATE in", values, "CONFIRMDATE");
            return (Criteria) this;
        }

        public Criteria andCONFIRMDATENotIn(List<Date> values) {
            addCriterion("CONFIRMDATE not in", values, "CONFIRMDATE");
            return (Criteria) this;
        }

        public Criteria andCONFIRMDATEBetween(Date value1, Date value2) {
            addCriterion("CONFIRMDATE between", value1, value2, "CONFIRMDATE");
            return (Criteria) this;
        }

        public Criteria andCONFIRMDATENotBetween(Date value1, Date value2) {
            addCriterion("CONFIRMDATE not between", value1, value2, "CONFIRMDATE");
            return (Criteria) this;
        }

        public Criteria andUUIDIsNull() {
            addCriterion("UUID is null");
            return (Criteria) this;
        }

        public Criteria andUUIDIsNotNull() {
            addCriterion("UUID is not null");
            return (Criteria) this;
        }

        public Criteria andUUIDEqualTo(Long value) {
            addCriterion("UUID =", value, "UUID");
            return (Criteria) this;
        }

        public Criteria andUUIDNotEqualTo(Long value) {
            addCriterion("UUID <>", value, "UUID");
            return (Criteria) this;
        }

        public Criteria andUUIDGreaterThan(Long value) {
            addCriterion("UUID >", value, "UUID");
            return (Criteria) this;
        }

        public Criteria andUUIDGreaterThanOrEqualTo(Long value) {
            addCriterion("UUID >=", value, "UUID");
            return (Criteria) this;
        }

        public Criteria andUUIDLessThan(Long value) {
            addCriterion("UUID <", value, "UUID");
            return (Criteria) this;
        }

        public Criteria andUUIDLessThanOrEqualTo(Long value) {
            addCriterion("UUID <=", value, "UUID");
            return (Criteria) this;
        }

        public Criteria andUUIDIn(List<Long> values) {
            addCriterion("UUID in", values, "UUID");
            return (Criteria) this;
        }

        public Criteria andUUIDNotIn(List<Long> values) {
            addCriterion("UUID not in", values, "UUID");
            return (Criteria) this;
        }

        public Criteria andUUIDBetween(Long value1, Long value2) {
            addCriterion("UUID between", value1, value2, "UUID");
            return (Criteria) this;
        }

        public Criteria andUUIDNotBetween(Long value1, Long value2) {
            addCriterion("UUID not between", value1, value2, "UUID");
            return (Criteria) this;
        }

        public Criteria andSTATUSIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andSTATUSIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSTATUSEqualTo(String value) {
            addCriterion("STATUS =", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSGreaterThan(String value) {
            addCriterion("STATUS >", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSLessThan(String value) {
            addCriterion("STATUS <", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSLike(String value) {
            addCriterion("STATUS like", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSNotLike(String value) {
            addCriterion("STATUS not like", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSIn(List<String> values) {
            addCriterion("STATUS in", values, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "STATUS");
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