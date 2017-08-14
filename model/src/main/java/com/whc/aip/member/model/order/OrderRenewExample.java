package com.whc.aip.member.model.order;

import java.util.ArrayList;
import java.util.List;

public class OrderRenewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderRenewExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ORRE_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ORRE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ORRE_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ORRE_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ORRE_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORRE_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ORRE_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ORRE_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ORRE_ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ORRE_ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ORRE_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ORRE_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ORRE_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ORRE_ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("ORDER_ID like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("ORDER_ID not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("ORRE_START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("ORRE_START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(String value) {
            addCriterion("ORRE_START_DATE =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(String value) {
            addCriterion("ORRE_START_DATE <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(String value) {
            addCriterion("ORRE_START_DATE >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("ORRE_START_DATE >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(String value) {
            addCriterion("ORRE_START_DATE <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(String value) {
            addCriterion("ORRE_START_DATE <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLike(String value) {
            addCriterion("ORRE_START_DATE like", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotLike(String value) {
            addCriterion("ORRE_START_DATE not like", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<String> values) {
            addCriterion("ORRE_START_DATE in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<String> values) {
            addCriterion("ORRE_START_DATE not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(String value1, String value2) {
            addCriterion("ORRE_START_DATE between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(String value1, String value2) {
            addCriterion("ORRE_START_DATE not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("ORRE_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("ORRE_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(String value) {
            addCriterion("ORRE_END_DATE =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(String value) {
            addCriterion("ORRE_END_DATE <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(String value) {
            addCriterion("ORRE_END_DATE >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("ORRE_END_DATE >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(String value) {
            addCriterion("ORRE_END_DATE <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(String value) {
            addCriterion("ORRE_END_DATE <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLike(String value) {
            addCriterion("ORRE_END_DATE like", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotLike(String value) {
            addCriterion("ORRE_END_DATE not like", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<String> values) {
            addCriterion("ORRE_END_DATE in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<String> values) {
            addCriterion("ORRE_END_DATE not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(String value1, String value2) {
            addCriterion("ORRE_END_DATE between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(String value1, String value2) {
            addCriterion("ORRE_END_DATE not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("ORRE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("ORRE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("ORRE_DATE =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("ORRE_DATE <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("ORRE_DATE >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("ORRE_DATE >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("ORRE_DATE <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("ORRE_DATE <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("ORRE_DATE like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("ORRE_DATE not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("ORRE_DATE in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("ORRE_DATE not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("ORRE_DATE between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("ORRE_DATE not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("ORRE_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("ORRE_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(String value) {
            addCriterion("ORRE_MONEY =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(String value) {
            addCriterion("ORRE_MONEY <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(String value) {
            addCriterion("ORRE_MONEY >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("ORRE_MONEY >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(String value) {
            addCriterion("ORRE_MONEY <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(String value) {
            addCriterion("ORRE_MONEY <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLike(String value) {
            addCriterion("ORRE_MONEY like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotLike(String value) {
            addCriterion("ORRE_MONEY not like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<String> values) {
            addCriterion("ORRE_MONEY in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<String> values) {
            addCriterion("ORRE_MONEY not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(String value1, String value2) {
            addCriterion("ORRE_MONEY between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(String value1, String value2) {
            addCriterion("ORRE_MONEY not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("ORRE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("ORRE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("ORRE_STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("ORRE_STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("ORRE_STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ORRE_STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("ORRE_STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("ORRE_STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("ORRE_STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("ORRE_STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("ORRE_STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("ORRE_STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("ORRE_STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("ORRE_STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNull() {
            addCriterion("ORRE_PAYMENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNotNull() {
            addCriterion("ORRE_PAYMENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeEqualTo(String value) {
            addCriterion("ORRE_PAYMENT_TYPE =", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotEqualTo(String value) {
            addCriterion("ORRE_PAYMENT_TYPE <>", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThan(String value) {
            addCriterion("ORRE_PAYMENT_TYPE >", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ORRE_PAYMENT_TYPE >=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThan(String value) {
            addCriterion("ORRE_PAYMENT_TYPE <", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThanOrEqualTo(String value) {
            addCriterion("ORRE_PAYMENT_TYPE <=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLike(String value) {
            addCriterion("ORRE_PAYMENT_TYPE like", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotLike(String value) {
            addCriterion("ORRE_PAYMENT_TYPE not like", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIn(List<String> values) {
            addCriterion("ORRE_PAYMENT_TYPE in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotIn(List<String> values) {
            addCriterion("ORRE_PAYMENT_TYPE not in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeBetween(String value1, String value2) {
            addCriterion("ORRE_PAYMENT_TYPE between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotBetween(String value1, String value2) {
            addCriterion("ORRE_PAYMENT_TYPE not between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountIsNull() {
            addCriterion("ORRE_PAYMENT_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountIsNotNull() {
            addCriterion("ORRE_PAYMENT_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountEqualTo(String value) {
            addCriterion("ORRE_PAYMENT_ACCOUNT =", value, "paymentAccount");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountNotEqualTo(String value) {
            addCriterion("ORRE_PAYMENT_ACCOUNT <>", value, "paymentAccount");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountGreaterThan(String value) {
            addCriterion("ORRE_PAYMENT_ACCOUNT >", value, "paymentAccount");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountGreaterThanOrEqualTo(String value) {
            addCriterion("ORRE_PAYMENT_ACCOUNT >=", value, "paymentAccount");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountLessThan(String value) {
            addCriterion("ORRE_PAYMENT_ACCOUNT <", value, "paymentAccount");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountLessThanOrEqualTo(String value) {
            addCriterion("ORRE_PAYMENT_ACCOUNT <=", value, "paymentAccount");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountLike(String value) {
            addCriterion("ORRE_PAYMENT_ACCOUNT like", value, "paymentAccount");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountNotLike(String value) {
            addCriterion("ORRE_PAYMENT_ACCOUNT not like", value, "paymentAccount");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountIn(List<String> values) {
            addCriterion("ORRE_PAYMENT_ACCOUNT in", values, "paymentAccount");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountNotIn(List<String> values) {
            addCriterion("ORRE_PAYMENT_ACCOUNT not in", values, "paymentAccount");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountBetween(String value1, String value2) {
            addCriterion("ORRE_PAYMENT_ACCOUNT between", value1, value2, "paymentAccount");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountNotBetween(String value1, String value2) {
            addCriterion("ORRE_PAYMENT_ACCOUNT not between", value1, value2, "paymentAccount");
            return (Criteria) this;
        }

        public Criteria andOperIdIsNull() {
            addCriterion("ORRE_OPERID is null");
            return (Criteria) this;
        }

        public Criteria andOperIdIsNotNull() {
            addCriterion("ORRE_OPERID is not null");
            return (Criteria) this;
        }

        public Criteria andOperIdEqualTo(String value) {
            addCriterion("ORRE_OPERID =", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdNotEqualTo(String value) {
            addCriterion("ORRE_OPERID <>", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdGreaterThan(String value) {
            addCriterion("ORRE_OPERID >", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORRE_OPERID >=", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdLessThan(String value) {
            addCriterion("ORRE_OPERID <", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdLessThanOrEqualTo(String value) {
            addCriterion("ORRE_OPERID <=", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdLike(String value) {
            addCriterion("ORRE_OPERID like", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdNotLike(String value) {
            addCriterion("ORRE_OPERID not like", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdIn(List<String> values) {
            addCriterion("ORRE_OPERID in", values, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdNotIn(List<String> values) {
            addCriterion("ORRE_OPERID not in", values, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdBetween(String value1, String value2) {
            addCriterion("ORRE_OPERID between", value1, value2, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdNotBetween(String value1, String value2) {
            addCriterion("ORRE_OPERID not between", value1, value2, "operId");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("ORRE_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("ORRE_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("ORRE_MEMO =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("ORRE_MEMO <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("ORRE_MEMO >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("ORRE_MEMO >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("ORRE_MEMO <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("ORRE_MEMO <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("ORRE_MEMO like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("ORRE_MEMO not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("ORRE_MEMO in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("ORRE_MEMO not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("ORRE_MEMO between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("ORRE_MEMO not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andAccountNumberIsNull() {
            addCriterion("ORRE_ACCOUNT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andAccountNumberIsNotNull() {
            addCriterion("ORRE_ACCOUNT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNumberEqualTo(String value) {
            addCriterion("ORRE_ACCOUNT_NUMBER =", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberNotEqualTo(String value) {
            addCriterion("ORRE_ACCOUNT_NUMBER <>", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberGreaterThan(String value) {
            addCriterion("ORRE_ACCOUNT_NUMBER >", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ORRE_ACCOUNT_NUMBER >=", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberLessThan(String value) {
            addCriterion("ORRE_ACCOUNT_NUMBER <", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberLessThanOrEqualTo(String value) {
            addCriterion("ORRE_ACCOUNT_NUMBER <=", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberLike(String value) {
            addCriterion("ORRE_ACCOUNT_NUMBER like", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberNotLike(String value) {
            addCriterion("ORRE_ACCOUNT_NUMBER not like", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberIn(List<String> values) {
            addCriterion("ORRE_ACCOUNT_NUMBER in", values, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberNotIn(List<String> values) {
            addCriterion("ORRE_ACCOUNT_NUMBER not in", values, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberBetween(String value1, String value2) {
            addCriterion("ORRE_ACCOUNT_NUMBER between", value1, value2, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberNotBetween(String value1, String value2) {
            addCriterion("ORRE_ACCOUNT_NUMBER not between", value1, value2, "accountNumber");
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