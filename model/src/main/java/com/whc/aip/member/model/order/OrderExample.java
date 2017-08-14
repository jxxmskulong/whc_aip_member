package com.whc.aip.member.model.order;

import java.util.ArrayList;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ORDER_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ORDER_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ORDER_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ORDER_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ORDER_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ORDER_ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ORDER_ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ORDER_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ORDER_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ORDER_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ORDER_ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("MEMBER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("MEMBER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("MEMBER_ID =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("MEMBER_ID <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("MEMBER_ID >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_ID >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("MEMBER_ID <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_ID <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("MEMBER_ID like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("MEMBER_ID not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("MEMBER_ID in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("MEMBER_ID not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("MEMBER_ID between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("MEMBER_ID not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andWahoceIdIsNull() {
            addCriterion("WAHOCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andWahoceIdIsNotNull() {
            addCriterion("WAHOCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWahoceIdEqualTo(String value) {
            addCriterion("WAHOCE_ID =", value, "wahoceId");
            return (Criteria) this;
        }

        public Criteria andWahoceIdNotEqualTo(String value) {
            addCriterion("WAHOCE_ID <>", value, "wahoceId");
            return (Criteria) this;
        }

        public Criteria andWahoceIdGreaterThan(String value) {
            addCriterion("WAHOCE_ID >", value, "wahoceId");
            return (Criteria) this;
        }

        public Criteria andWahoceIdGreaterThanOrEqualTo(String value) {
            addCriterion("WAHOCE_ID >=", value, "wahoceId");
            return (Criteria) this;
        }

        public Criteria andWahoceIdLessThan(String value) {
            addCriterion("WAHOCE_ID <", value, "wahoceId");
            return (Criteria) this;
        }

        public Criteria andWahoceIdLessThanOrEqualTo(String value) {
            addCriterion("WAHOCE_ID <=", value, "wahoceId");
            return (Criteria) this;
        }

        public Criteria andWahoceIdLike(String value) {
            addCriterion("WAHOCE_ID like", value, "wahoceId");
            return (Criteria) this;
        }

        public Criteria andWahoceIdNotLike(String value) {
            addCriterion("WAHOCE_ID not like", value, "wahoceId");
            return (Criteria) this;
        }

        public Criteria andWahoceIdIn(List<String> values) {
            addCriterion("WAHOCE_ID in", values, "wahoceId");
            return (Criteria) this;
        }

        public Criteria andWahoceIdNotIn(List<String> values) {
            addCriterion("WAHOCE_ID not in", values, "wahoceId");
            return (Criteria) this;
        }

        public Criteria andWahoceIdBetween(String value1, String value2) {
            addCriterion("WAHOCE_ID between", value1, value2, "wahoceId");
            return (Criteria) this;
        }

        public Criteria andWahoceIdNotBetween(String value1, String value2) {
            addCriterion("WAHOCE_ID not between", value1, value2, "wahoceId");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("ORDER_START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("ORDER_START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(String value) {
            addCriterion("ORDER_START_DATE =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(String value) {
            addCriterion("ORDER_START_DATE <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(String value) {
            addCriterion("ORDER_START_DATE >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_START_DATE >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(String value) {
            addCriterion("ORDER_START_DATE <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(String value) {
            addCriterion("ORDER_START_DATE <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLike(String value) {
            addCriterion("ORDER_START_DATE like", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotLike(String value) {
            addCriterion("ORDER_START_DATE not like", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<String> values) {
            addCriterion("ORDER_START_DATE in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<String> values) {
            addCriterion("ORDER_START_DATE not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(String value1, String value2) {
            addCriterion("ORDER_START_DATE between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(String value1, String value2) {
            addCriterion("ORDER_START_DATE not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("ORDER_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("ORDER_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(String value) {
            addCriterion("ORDER_END_DATE =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(String value) {
            addCriterion("ORDER_END_DATE <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(String value) {
            addCriterion("ORDER_END_DATE >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_END_DATE >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(String value) {
            addCriterion("ORDER_END_DATE <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(String value) {
            addCriterion("ORDER_END_DATE <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLike(String value) {
            addCriterion("ORDER_END_DATE like", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotLike(String value) {
            addCriterion("ORDER_END_DATE not like", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<String> values) {
            addCriterion("ORDER_END_DATE in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<String> values) {
            addCriterion("ORDER_END_DATE not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(String value1, String value2) {
            addCriterion("ORDER_END_DATE between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(String value1, String value2) {
            addCriterion("ORDER_END_DATE not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andCuseMemoIsNull() {
            addCriterion("ORDER_CUSE_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andCuseMemoIsNotNull() {
            addCriterion("ORDER_CUSE_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andCuseMemoEqualTo(String value) {
            addCriterion("ORDER_CUSE_MEMO =", value, "cuseMemo");
            return (Criteria) this;
        }

        public Criteria andCuseMemoNotEqualTo(String value) {
            addCriterion("ORDER_CUSE_MEMO <>", value, "cuseMemo");
            return (Criteria) this;
        }

        public Criteria andCuseMemoGreaterThan(String value) {
            addCriterion("ORDER_CUSE_MEMO >", value, "cuseMemo");
            return (Criteria) this;
        }

        public Criteria andCuseMemoGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_CUSE_MEMO >=", value, "cuseMemo");
            return (Criteria) this;
        }

        public Criteria andCuseMemoLessThan(String value) {
            addCriterion("ORDER_CUSE_MEMO <", value, "cuseMemo");
            return (Criteria) this;
        }

        public Criteria andCuseMemoLessThanOrEqualTo(String value) {
            addCriterion("ORDER_CUSE_MEMO <=", value, "cuseMemo");
            return (Criteria) this;
        }

        public Criteria andCuseMemoLike(String value) {
            addCriterion("ORDER_CUSE_MEMO like", value, "cuseMemo");
            return (Criteria) this;
        }

        public Criteria andCuseMemoNotLike(String value) {
            addCriterion("ORDER_CUSE_MEMO not like", value, "cuseMemo");
            return (Criteria) this;
        }

        public Criteria andCuseMemoIn(List<String> values) {
            addCriterion("ORDER_CUSE_MEMO in", values, "cuseMemo");
            return (Criteria) this;
        }

        public Criteria andCuseMemoNotIn(List<String> values) {
            addCriterion("ORDER_CUSE_MEMO not in", values, "cuseMemo");
            return (Criteria) this;
        }

        public Criteria andCuseMemoBetween(String value1, String value2) {
            addCriterion("ORDER_CUSE_MEMO between", value1, value2, "cuseMemo");
            return (Criteria) this;
        }

        public Criteria andCuseMemoNotBetween(String value1, String value2) {
            addCriterion("ORDER_CUSE_MEMO not between", value1, value2, "cuseMemo");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("ORDER_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("ORDER_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(String value) {
            addCriterion("ORDER_AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(String value) {
            addCriterion("ORDER_AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(String value) {
            addCriterion("ORDER_AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(String value) {
            addCriterion("ORDER_AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(String value) {
            addCriterion("ORDER_AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLike(String value) {
            addCriterion("ORDER_AMOUNT like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotLike(String value) {
            addCriterion("ORDER_AMOUNT not like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<String> values) {
            addCriterion("ORDER_AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<String> values) {
            addCriterion("ORDER_AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(String value1, String value2) {
            addCriterion("ORDER_AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(String value1, String value2) {
            addCriterion("ORDER_AMOUNT not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andPersIdIsNull() {
            addCriterion("PERS_ID is null");
            return (Criteria) this;
        }

        public Criteria andPersIdIsNotNull() {
            addCriterion("PERS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPersIdEqualTo(String value) {
            addCriterion("PERS_ID =", value, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdNotEqualTo(String value) {
            addCriterion("PERS_ID <>", value, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdGreaterThan(String value) {
            addCriterion("PERS_ID >", value, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdGreaterThanOrEqualTo(String value) {
            addCriterion("PERS_ID >=", value, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdLessThan(String value) {
            addCriterion("PERS_ID <", value, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdLessThanOrEqualTo(String value) {
            addCriterion("PERS_ID <=", value, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdLike(String value) {
            addCriterion("PERS_ID like", value, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdNotLike(String value) {
            addCriterion("PERS_ID not like", value, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdIn(List<String> values) {
            addCriterion("PERS_ID in", values, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdNotIn(List<String> values) {
            addCriterion("PERS_ID not in", values, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdBetween(String value1, String value2) {
            addCriterion("PERS_ID between", value1, value2, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdNotBetween(String value1, String value2) {
            addCriterion("PERS_ID not between", value1, value2, "persId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("ORDER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("ORDER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("ORDER_STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("ORDER_STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("ORDER_STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("ORDER_STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("ORDER_STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("ORDER_STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("ORDER_STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("ORDER_STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("ORDER_STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("ORDER_STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("ORDER_STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("ORDER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("ORDER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("ORDER_TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("ORDER_TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("ORDER_TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("ORDER_TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("ORDER_TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("ORDER_TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("ORDER_TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("ORDER_TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("ORDER_TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("ORDER_TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("ORDER_TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("ORDER_CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("ORDER_CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(String value) {
            addCriterion("ORDER_CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(String value) {
            addCriterion("ORDER_CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(String value) {
            addCriterion("ORDER_CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(String value) {
            addCriterion("ORDER_CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(String value) {
            addCriterion("ORDER_CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLike(String value) {
            addCriterion("ORDER_CREATE_DATE like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotLike(String value) {
            addCriterion("ORDER_CREATE_DATE not like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<String> values) {
            addCriterion("ORDER_CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<String> values) {
            addCriterion("ORDER_CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(String value1, String value2) {
            addCriterion("ORDER_CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(String value1, String value2) {
            addCriterion("ORDER_CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("ORDER_PAY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("ORDER_PAY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(String value) {
            addCriterion("ORDER_PAY_TYPE =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(String value) {
            addCriterion("ORDER_PAY_TYPE <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(String value) {
            addCriterion("ORDER_PAY_TYPE >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_PAY_TYPE >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(String value) {
            addCriterion("ORDER_PAY_TYPE <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(String value) {
            addCriterion("ORDER_PAY_TYPE <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLike(String value) {
            addCriterion("ORDER_PAY_TYPE like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotLike(String value) {
            addCriterion("ORDER_PAY_TYPE not like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<String> values) {
            addCriterion("ORDER_PAY_TYPE in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<String> values) {
            addCriterion("ORDER_PAY_TYPE not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(String value1, String value2) {
            addCriterion("ORDER_PAY_TYPE between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(String value1, String value2) {
            addCriterion("ORDER_PAY_TYPE not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andCustMemoIsNull() {
            addCriterion("ORDER_CUST_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andCustMemoIsNotNull() {
            addCriterion("ORDER_CUST_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andCustMemoEqualTo(String value) {
            addCriterion("ORDER_CUST_MEMO =", value, "custMemo");
            return (Criteria) this;
        }

        public Criteria andCustMemoNotEqualTo(String value) {
            addCriterion("ORDER_CUST_MEMO <>", value, "custMemo");
            return (Criteria) this;
        }

        public Criteria andCustMemoGreaterThan(String value) {
            addCriterion("ORDER_CUST_MEMO >", value, "custMemo");
            return (Criteria) this;
        }

        public Criteria andCustMemoGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_CUST_MEMO >=", value, "custMemo");
            return (Criteria) this;
        }

        public Criteria andCustMemoLessThan(String value) {
            addCriterion("ORDER_CUST_MEMO <", value, "custMemo");
            return (Criteria) this;
        }

        public Criteria andCustMemoLessThanOrEqualTo(String value) {
            addCriterion("ORDER_CUST_MEMO <=", value, "custMemo");
            return (Criteria) this;
        }

        public Criteria andCustMemoLike(String value) {
            addCriterion("ORDER_CUST_MEMO like", value, "custMemo");
            return (Criteria) this;
        }

        public Criteria andCustMemoNotLike(String value) {
            addCriterion("ORDER_CUST_MEMO not like", value, "custMemo");
            return (Criteria) this;
        }

        public Criteria andCustMemoIn(List<String> values) {
            addCriterion("ORDER_CUST_MEMO in", values, "custMemo");
            return (Criteria) this;
        }

        public Criteria andCustMemoNotIn(List<String> values) {
            addCriterion("ORDER_CUST_MEMO not in", values, "custMemo");
            return (Criteria) this;
        }

        public Criteria andCustMemoBetween(String value1, String value2) {
            addCriterion("ORDER_CUST_MEMO between", value1, value2, "custMemo");
            return (Criteria) this;
        }

        public Criteria andCustMemoNotBetween(String value1, String value2) {
            addCriterion("ORDER_CUST_MEMO not between", value1, value2, "custMemo");
            return (Criteria) this;
        }

        public Criteria andSaleMemoIsNull() {
            addCriterion("ORDER_SALE_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andSaleMemoIsNotNull() {
            addCriterion("ORDER_SALE_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andSaleMemoEqualTo(String value) {
            addCriterion("ORDER_SALE_MEMO =", value, "saleMemo");
            return (Criteria) this;
        }

        public Criteria andSaleMemoNotEqualTo(String value) {
            addCriterion("ORDER_SALE_MEMO <>", value, "saleMemo");
            return (Criteria) this;
        }

        public Criteria andSaleMemoGreaterThan(String value) {
            addCriterion("ORDER_SALE_MEMO >", value, "saleMemo");
            return (Criteria) this;
        }

        public Criteria andSaleMemoGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_SALE_MEMO >=", value, "saleMemo");
            return (Criteria) this;
        }

        public Criteria andSaleMemoLessThan(String value) {
            addCriterion("ORDER_SALE_MEMO <", value, "saleMemo");
            return (Criteria) this;
        }

        public Criteria andSaleMemoLessThanOrEqualTo(String value) {
            addCriterion("ORDER_SALE_MEMO <=", value, "saleMemo");
            return (Criteria) this;
        }

        public Criteria andSaleMemoLike(String value) {
            addCriterion("ORDER_SALE_MEMO like", value, "saleMemo");
            return (Criteria) this;
        }

        public Criteria andSaleMemoNotLike(String value) {
            addCriterion("ORDER_SALE_MEMO not like", value, "saleMemo");
            return (Criteria) this;
        }

        public Criteria andSaleMemoIn(List<String> values) {
            addCriterion("ORDER_SALE_MEMO in", values, "saleMemo");
            return (Criteria) this;
        }

        public Criteria andSaleMemoNotIn(List<String> values) {
            addCriterion("ORDER_SALE_MEMO not in", values, "saleMemo");
            return (Criteria) this;
        }

        public Criteria andSaleMemoBetween(String value1, String value2) {
            addCriterion("ORDER_SALE_MEMO between", value1, value2, "saleMemo");
            return (Criteria) this;
        }

        public Criteria andSaleMemoNotBetween(String value1, String value2) {
            addCriterion("ORDER_SALE_MEMO not between", value1, value2, "saleMemo");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNull() {
            addCriterion("ORDER_CUST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNotNull() {
            addCriterion("ORDER_CUST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustNameEqualTo(String value) {
            addCriterion("ORDER_CUST_NAME =", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotEqualTo(String value) {
            addCriterion("ORDER_CUST_NAME <>", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThan(String value) {
            addCriterion("ORDER_CUST_NAME >", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_CUST_NAME >=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThan(String value) {
            addCriterion("ORDER_CUST_NAME <", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThanOrEqualTo(String value) {
            addCriterion("ORDER_CUST_NAME <=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLike(String value) {
            addCriterion("ORDER_CUST_NAME like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotLike(String value) {
            addCriterion("ORDER_CUST_NAME not like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameIn(List<String> values) {
            addCriterion("ORDER_CUST_NAME in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotIn(List<String> values) {
            addCriterion("ORDER_CUST_NAME not in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameBetween(String value1, String value2) {
            addCriterion("ORDER_CUST_NAME between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotBetween(String value1, String value2) {
            addCriterion("ORDER_CUST_NAME not between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustTelIsNull() {
            addCriterion("ORDER_CUST_TEL is null");
            return (Criteria) this;
        }

        public Criteria andCustTelIsNotNull() {
            addCriterion("ORDER_CUST_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andCustTelEqualTo(String value) {
            addCriterion("ORDER_CUST_TEL =", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelNotEqualTo(String value) {
            addCriterion("ORDER_CUST_TEL <>", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelGreaterThan(String value) {
            addCriterion("ORDER_CUST_TEL >", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_CUST_TEL >=", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelLessThan(String value) {
            addCriterion("ORDER_CUST_TEL <", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelLessThanOrEqualTo(String value) {
            addCriterion("ORDER_CUST_TEL <=", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelLike(String value) {
            addCriterion("ORDER_CUST_TEL like", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelNotLike(String value) {
            addCriterion("ORDER_CUST_TEL not like", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelIn(List<String> values) {
            addCriterion("ORDER_CUST_TEL in", values, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelNotIn(List<String> values) {
            addCriterion("ORDER_CUST_TEL not in", values, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelBetween(String value1, String value2) {
            addCriterion("ORDER_CUST_TEL between", value1, value2, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelNotBetween(String value1, String value2) {
            addCriterion("ORDER_CUST_TEL not between", value1, value2, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustAddrIsNull() {
            addCriterion("ORDER_CUST_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andCustAddrIsNotNull() {
            addCriterion("ORDER_CUST_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andCustAddrEqualTo(String value) {
            addCriterion("ORDER_CUST_ADDR =", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrNotEqualTo(String value) {
            addCriterion("ORDER_CUST_ADDR <>", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrGreaterThan(String value) {
            addCriterion("ORDER_CUST_ADDR >", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_CUST_ADDR >=", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrLessThan(String value) {
            addCriterion("ORDER_CUST_ADDR <", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrLessThanOrEqualTo(String value) {
            addCriterion("ORDER_CUST_ADDR <=", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrLike(String value) {
            addCriterion("ORDER_CUST_ADDR like", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrNotLike(String value) {
            addCriterion("ORDER_CUST_ADDR not like", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrIn(List<String> values) {
            addCriterion("ORDER_CUST_ADDR in", values, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrNotIn(List<String> values) {
            addCriterion("ORDER_CUST_ADDR not in", values, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrBetween(String value1, String value2) {
            addCriterion("ORDER_CUST_ADDR between", value1, value2, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrNotBetween(String value1, String value2) {
            addCriterion("ORDER_CUST_ADDR not between", value1, value2, "custAddr");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("ORDER_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("ORDER_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("ORDER_SOURCE =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("ORDER_SOURCE <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("ORDER_SOURCE >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_SOURCE >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("ORDER_SOURCE <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("ORDER_SOURCE <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("ORDER_SOURCE like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("ORDER_SOURCE not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("ORDER_SOURCE in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("ORDER_SOURCE not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("ORDER_SOURCE between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("ORDER_SOURCE not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNull() {
            addCriterion("ORDER_ID_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNotNull() {
            addCriterion("ORDER_ID_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andIdNumberEqualTo(String value) {
            addCriterion("ORDER_ID_NUMBER =", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotEqualTo(String value) {
            addCriterion("ORDER_ID_NUMBER <>", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThan(String value) {
            addCriterion("ORDER_ID_NUMBER >", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_ID_NUMBER >=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThan(String value) {
            addCriterion("ORDER_ID_NUMBER <", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThanOrEqualTo(String value) {
            addCriterion("ORDER_ID_NUMBER <=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLike(String value) {
            addCriterion("ORDER_ID_NUMBER like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotLike(String value) {
            addCriterion("ORDER_ID_NUMBER not like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberIn(List<String> values) {
            addCriterion("ORDER_ID_NUMBER in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotIn(List<String> values) {
            addCriterion("ORDER_ID_NUMBER not in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberBetween(String value1, String value2) {
            addCriterion("ORDER_ID_NUMBER between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotBetween(String value1, String value2) {
            addCriterion("ORDER_ID_NUMBER not between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andDeposit1IsNull() {
            addCriterion("ORDER_DEPOSIT1 is null");
            return (Criteria) this;
        }

        public Criteria andDeposit1IsNotNull() {
            addCriterion("ORDER_DEPOSIT1 is not null");
            return (Criteria) this;
        }

        public Criteria andDeposit1EqualTo(String value) {
            addCriterion("ORDER_DEPOSIT1 =", value, "deposit1");
            return (Criteria) this;
        }

        public Criteria andDeposit1NotEqualTo(String value) {
            addCriterion("ORDER_DEPOSIT1 <>", value, "deposit1");
            return (Criteria) this;
        }

        public Criteria andDeposit1GreaterThan(String value) {
            addCriterion("ORDER_DEPOSIT1 >", value, "deposit1");
            return (Criteria) this;
        }

        public Criteria andDeposit1GreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_DEPOSIT1 >=", value, "deposit1");
            return (Criteria) this;
        }

        public Criteria andDeposit1LessThan(String value) {
            addCriterion("ORDER_DEPOSIT1 <", value, "deposit1");
            return (Criteria) this;
        }

        public Criteria andDeposit1LessThanOrEqualTo(String value) {
            addCriterion("ORDER_DEPOSIT1 <=", value, "deposit1");
            return (Criteria) this;
        }

        public Criteria andDeposit1Like(String value) {
            addCriterion("ORDER_DEPOSIT1 like", value, "deposit1");
            return (Criteria) this;
        }

        public Criteria andDeposit1NotLike(String value) {
            addCriterion("ORDER_DEPOSIT1 not like", value, "deposit1");
            return (Criteria) this;
        }

        public Criteria andDeposit1In(List<String> values) {
            addCriterion("ORDER_DEPOSIT1 in", values, "deposit1");
            return (Criteria) this;
        }

        public Criteria andDeposit1NotIn(List<String> values) {
            addCriterion("ORDER_DEPOSIT1 not in", values, "deposit1");
            return (Criteria) this;
        }

        public Criteria andDeposit1Between(String value1, String value2) {
            addCriterion("ORDER_DEPOSIT1 between", value1, value2, "deposit1");
            return (Criteria) this;
        }

        public Criteria andDeposit1NotBetween(String value1, String value2) {
            addCriterion("ORDER_DEPOSIT1 not between", value1, value2, "deposit1");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("ORDER_TOTAL_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("ORDER_TOTAL_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(String value) {
            addCriterion("ORDER_TOTAL_AMOUNT =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(String value) {
            addCriterion("ORDER_TOTAL_AMOUNT <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(String value) {
            addCriterion("ORDER_TOTAL_AMOUNT >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_TOTAL_AMOUNT >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(String value) {
            addCriterion("ORDER_TOTAL_AMOUNT <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(String value) {
            addCriterion("ORDER_TOTAL_AMOUNT <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLike(String value) {
            addCriterion("ORDER_TOTAL_AMOUNT like", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotLike(String value) {
            addCriterion("ORDER_TOTAL_AMOUNT not like", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<String> values) {
            addCriterion("ORDER_TOTAL_AMOUNT in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<String> values) {
            addCriterion("ORDER_TOTAL_AMOUNT not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(String value1, String value2) {
            addCriterion("ORDER_TOTAL_AMOUNT between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(String value1, String value2) {
            addCriterion("ORDER_TOTAL_AMOUNT not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andAmountTypeIsNull() {
            addCriterion("ORDER_AMOUNT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAmountTypeIsNotNull() {
            addCriterion("ORDER_AMOUNT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAmountTypeEqualTo(String value) {
            addCriterion("ORDER_AMOUNT_TYPE =", value, "amountType");
            return (Criteria) this;
        }

        public Criteria andAmountTypeNotEqualTo(String value) {
            addCriterion("ORDER_AMOUNT_TYPE <>", value, "amountType");
            return (Criteria) this;
        }

        public Criteria andAmountTypeGreaterThan(String value) {
            addCriterion("ORDER_AMOUNT_TYPE >", value, "amountType");
            return (Criteria) this;
        }

        public Criteria andAmountTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_AMOUNT_TYPE >=", value, "amountType");
            return (Criteria) this;
        }

        public Criteria andAmountTypeLessThan(String value) {
            addCriterion("ORDER_AMOUNT_TYPE <", value, "amountType");
            return (Criteria) this;
        }

        public Criteria andAmountTypeLessThanOrEqualTo(String value) {
            addCriterion("ORDER_AMOUNT_TYPE <=", value, "amountType");
            return (Criteria) this;
        }

        public Criteria andAmountTypeLike(String value) {
            addCriterion("ORDER_AMOUNT_TYPE like", value, "amountType");
            return (Criteria) this;
        }

        public Criteria andAmountTypeNotLike(String value) {
            addCriterion("ORDER_AMOUNT_TYPE not like", value, "amountType");
            return (Criteria) this;
        }

        public Criteria andAmountTypeIn(List<String> values) {
            addCriterion("ORDER_AMOUNT_TYPE in", values, "amountType");
            return (Criteria) this;
        }

        public Criteria andAmountTypeNotIn(List<String> values) {
            addCriterion("ORDER_AMOUNT_TYPE not in", values, "amountType");
            return (Criteria) this;
        }

        public Criteria andAmountTypeBetween(String value1, String value2) {
            addCriterion("ORDER_AMOUNT_TYPE between", value1, value2, "amountType");
            return (Criteria) this;
        }

        public Criteria andAmountTypeNotBetween(String value1, String value2) {
            addCriterion("ORDER_AMOUNT_TYPE not between", value1, value2, "amountType");
            return (Criteria) this;
        }

        public Criteria andTypeMoenyIsNull() {
            addCriterion("ORDER_TYPE_MOENY is null");
            return (Criteria) this;
        }

        public Criteria andTypeMoenyIsNotNull() {
            addCriterion("ORDER_TYPE_MOENY is not null");
            return (Criteria) this;
        }

        public Criteria andTypeMoenyEqualTo(String value) {
            addCriterion("ORDER_TYPE_MOENY =", value, "typeMoeny");
            return (Criteria) this;
        }

        public Criteria andTypeMoenyNotEqualTo(String value) {
            addCriterion("ORDER_TYPE_MOENY <>", value, "typeMoeny");
            return (Criteria) this;
        }

        public Criteria andTypeMoenyGreaterThan(String value) {
            addCriterion("ORDER_TYPE_MOENY >", value, "typeMoeny");
            return (Criteria) this;
        }

        public Criteria andTypeMoenyGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_TYPE_MOENY >=", value, "typeMoeny");
            return (Criteria) this;
        }

        public Criteria andTypeMoenyLessThan(String value) {
            addCriterion("ORDER_TYPE_MOENY <", value, "typeMoeny");
            return (Criteria) this;
        }

        public Criteria andTypeMoenyLessThanOrEqualTo(String value) {
            addCriterion("ORDER_TYPE_MOENY <=", value, "typeMoeny");
            return (Criteria) this;
        }

        public Criteria andTypeMoenyLike(String value) {
            addCriterion("ORDER_TYPE_MOENY like", value, "typeMoeny");
            return (Criteria) this;
        }

        public Criteria andTypeMoenyNotLike(String value) {
            addCriterion("ORDER_TYPE_MOENY not like", value, "typeMoeny");
            return (Criteria) this;
        }

        public Criteria andTypeMoenyIn(List<String> values) {
            addCriterion("ORDER_TYPE_MOENY in", values, "typeMoeny");
            return (Criteria) this;
        }

        public Criteria andTypeMoenyNotIn(List<String> values) {
            addCriterion("ORDER_TYPE_MOENY not in", values, "typeMoeny");
            return (Criteria) this;
        }

        public Criteria andTypeMoenyBetween(String value1, String value2) {
            addCriterion("ORDER_TYPE_MOENY between", value1, value2, "typeMoeny");
            return (Criteria) this;
        }

        public Criteria andTypeMoenyNotBetween(String value1, String value2) {
            addCriterion("ORDER_TYPE_MOENY not between", value1, value2, "typeMoeny");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNull() {
            addCriterion("CUST_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("CUST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(String value) {
            addCriterion("CUST_ID =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(String value) {
            addCriterion("CUST_ID <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(String value) {
            addCriterion("CUST_ID >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_ID >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(String value) {
            addCriterion("CUST_ID <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(String value) {
            addCriterion("CUST_ID <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLike(String value) {
            addCriterion("CUST_ID like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotLike(String value) {
            addCriterion("CUST_ID not like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<String> values) {
            addCriterion("CUST_ID in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<String> values) {
            addCriterion("CUST_ID not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(String value1, String value2) {
            addCriterion("CUST_ID between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(String value1, String value2) {
            addCriterion("CUST_ID not between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCertTypeIsNull() {
            addCriterion("ORDER_CERT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCertTypeIsNotNull() {
            addCriterion("ORDER_CERT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCertTypeEqualTo(String value) {
            addCriterion("ORDER_CERT_TYPE =", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotEqualTo(String value) {
            addCriterion("ORDER_CERT_TYPE <>", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeGreaterThan(String value) {
            addCriterion("ORDER_CERT_TYPE >", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_CERT_TYPE >=", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLessThan(String value) {
            addCriterion("ORDER_CERT_TYPE <", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLessThanOrEqualTo(String value) {
            addCriterion("ORDER_CERT_TYPE <=", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLike(String value) {
            addCriterion("ORDER_CERT_TYPE like", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotLike(String value) {
            addCriterion("ORDER_CERT_TYPE not like", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeIn(List<String> values) {
            addCriterion("ORDER_CERT_TYPE in", values, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotIn(List<String> values) {
            addCriterion("ORDER_CERT_TYPE not in", values, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeBetween(String value1, String value2) {
            addCriterion("ORDER_CERT_TYPE between", value1, value2, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotBetween(String value1, String value2) {
            addCriterion("ORDER_CERT_TYPE not between", value1, value2, "certType");
            return (Criteria) this;
        }

        public Criteria andContractCodeIsNull() {
            addCriterion("CONTRACT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andContractCodeIsNotNull() {
            addCriterion("CONTRACT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andContractCodeEqualTo(String value) {
            addCriterion("CONTRACT_CODE =", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeNotEqualTo(String value) {
            addCriterion("CONTRACT_CODE <>", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeGreaterThan(String value) {
            addCriterion("CONTRACT_CODE >", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_CODE >=", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeLessThan(String value) {
            addCriterion("CONTRACT_CODE <", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_CODE <=", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeLike(String value) {
            addCriterion("CONTRACT_CODE like", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeNotLike(String value) {
            addCriterion("CONTRACT_CODE not like", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeIn(List<String> values) {
            addCriterion("CONTRACT_CODE in", values, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeNotIn(List<String> values) {
            addCriterion("CONTRACT_CODE not in", values, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeBetween(String value1, String value2) {
            addCriterion("CONTRACT_CODE between", value1, value2, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_CODE not between", value1, value2, "contractCode");
            return (Criteria) this;
        }

        public Criteria andDepositMemoIsNull() {
            addCriterion("ORDER_DEPOSIT_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andDepositMemoIsNotNull() {
            addCriterion("ORDER_DEPOSIT_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andDepositMemoEqualTo(String value) {
            addCriterion("ORDER_DEPOSIT_MEMO =", value, "depositMemo");
            return (Criteria) this;
        }

        public Criteria andDepositMemoNotEqualTo(String value) {
            addCriterion("ORDER_DEPOSIT_MEMO <>", value, "depositMemo");
            return (Criteria) this;
        }

        public Criteria andDepositMemoGreaterThan(String value) {
            addCriterion("ORDER_DEPOSIT_MEMO >", value, "depositMemo");
            return (Criteria) this;
        }

        public Criteria andDepositMemoGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_DEPOSIT_MEMO >=", value, "depositMemo");
            return (Criteria) this;
        }

        public Criteria andDepositMemoLessThan(String value) {
            addCriterion("ORDER_DEPOSIT_MEMO <", value, "depositMemo");
            return (Criteria) this;
        }

        public Criteria andDepositMemoLessThanOrEqualTo(String value) {
            addCriterion("ORDER_DEPOSIT_MEMO <=", value, "depositMemo");
            return (Criteria) this;
        }

        public Criteria andDepositMemoLike(String value) {
            addCriterion("ORDER_DEPOSIT_MEMO like", value, "depositMemo");
            return (Criteria) this;
        }

        public Criteria andDepositMemoNotLike(String value) {
            addCriterion("ORDER_DEPOSIT_MEMO not like", value, "depositMemo");
            return (Criteria) this;
        }

        public Criteria andDepositMemoIn(List<String> values) {
            addCriterion("ORDER_DEPOSIT_MEMO in", values, "depositMemo");
            return (Criteria) this;
        }

        public Criteria andDepositMemoNotIn(List<String> values) {
            addCriterion("ORDER_DEPOSIT_MEMO not in", values, "depositMemo");
            return (Criteria) this;
        }

        public Criteria andDepositMemoBetween(String value1, String value2) {
            addCriterion("ORDER_DEPOSIT_MEMO between", value1, value2, "depositMemo");
            return (Criteria) this;
        }

        public Criteria andDepositMemoNotBetween(String value1, String value2) {
            addCriterion("ORDER_DEPOSIT_MEMO not between", value1, value2, "depositMemo");
            return (Criteria) this;
        }

        public Criteria andDepositStatusIsNull() {
            addCriterion("ORDER_DEPOSIT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andDepositStatusIsNotNull() {
            addCriterion("ORDER_DEPOSIT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andDepositStatusEqualTo(String value) {
            addCriterion("ORDER_DEPOSIT_STATUS =", value, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusNotEqualTo(String value) {
            addCriterion("ORDER_DEPOSIT_STATUS <>", value, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusGreaterThan(String value) {
            addCriterion("ORDER_DEPOSIT_STATUS >", value, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_DEPOSIT_STATUS >=", value, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusLessThan(String value) {
            addCriterion("ORDER_DEPOSIT_STATUS <", value, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusLessThanOrEqualTo(String value) {
            addCriterion("ORDER_DEPOSIT_STATUS <=", value, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusLike(String value) {
            addCriterion("ORDER_DEPOSIT_STATUS like", value, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusNotLike(String value) {
            addCriterion("ORDER_DEPOSIT_STATUS not like", value, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusIn(List<String> values) {
            addCriterion("ORDER_DEPOSIT_STATUS in", values, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusNotIn(List<String> values) {
            addCriterion("ORDER_DEPOSIT_STATUS not in", values, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusBetween(String value1, String value2) {
            addCriterion("ORDER_DEPOSIT_STATUS between", value1, value2, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusNotBetween(String value1, String value2) {
            addCriterion("ORDER_DEPOSIT_STATUS not between", value1, value2, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositpayAccountIsNull() {
            addCriterion("ORDER_DEPOSITPAY_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDepositpayAccountIsNotNull() {
            addCriterion("ORDER_DEPOSITPAY_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDepositpayAccountEqualTo(String value) {
            addCriterion("ORDER_DEPOSITPAY_ACCOUNT =", value, "depositpayAccount");
            return (Criteria) this;
        }

        public Criteria andDepositpayAccountNotEqualTo(String value) {
            addCriterion("ORDER_DEPOSITPAY_ACCOUNT <>", value, "depositpayAccount");
            return (Criteria) this;
        }

        public Criteria andDepositpayAccountGreaterThan(String value) {
            addCriterion("ORDER_DEPOSITPAY_ACCOUNT >", value, "depositpayAccount");
            return (Criteria) this;
        }

        public Criteria andDepositpayAccountGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_DEPOSITPAY_ACCOUNT >=", value, "depositpayAccount");
            return (Criteria) this;
        }

        public Criteria andDepositpayAccountLessThan(String value) {
            addCriterion("ORDER_DEPOSITPAY_ACCOUNT <", value, "depositpayAccount");
            return (Criteria) this;
        }

        public Criteria andDepositpayAccountLessThanOrEqualTo(String value) {
            addCriterion("ORDER_DEPOSITPAY_ACCOUNT <=", value, "depositpayAccount");
            return (Criteria) this;
        }

        public Criteria andDepositpayAccountLike(String value) {
            addCriterion("ORDER_DEPOSITPAY_ACCOUNT like", value, "depositpayAccount");
            return (Criteria) this;
        }

        public Criteria andDepositpayAccountNotLike(String value) {
            addCriterion("ORDER_DEPOSITPAY_ACCOUNT not like", value, "depositpayAccount");
            return (Criteria) this;
        }

        public Criteria andDepositpayAccountIn(List<String> values) {
            addCriterion("ORDER_DEPOSITPAY_ACCOUNT in", values, "depositpayAccount");
            return (Criteria) this;
        }

        public Criteria andDepositpayAccountNotIn(List<String> values) {
            addCriterion("ORDER_DEPOSITPAY_ACCOUNT not in", values, "depositpayAccount");
            return (Criteria) this;
        }

        public Criteria andDepositpayAccountBetween(String value1, String value2) {
            addCriterion("ORDER_DEPOSITPAY_ACCOUNT between", value1, value2, "depositpayAccount");
            return (Criteria) this;
        }

        public Criteria andDepositpayAccountNotBetween(String value1, String value2) {
            addCriterion("ORDER_DEPOSITPAY_ACCOUNT not between", value1, value2, "depositpayAccount");
            return (Criteria) this;
        }

        public Criteria andRefundAccountIsNull() {
            addCriterion("ORDER_REFUND_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRefundAccountIsNotNull() {
            addCriterion("ORDER_REFUND_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRefundAccountEqualTo(String value) {
            addCriterion("ORDER_REFUND_ACCOUNT =", value, "refundAccount");
            return (Criteria) this;
        }

        public Criteria andRefundAccountNotEqualTo(String value) {
            addCriterion("ORDER_REFUND_ACCOUNT <>", value, "refundAccount");
            return (Criteria) this;
        }

        public Criteria andRefundAccountGreaterThan(String value) {
            addCriterion("ORDER_REFUND_ACCOUNT >", value, "refundAccount");
            return (Criteria) this;
        }

        public Criteria andRefundAccountGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_REFUND_ACCOUNT >=", value, "refundAccount");
            return (Criteria) this;
        }

        public Criteria andRefundAccountLessThan(String value) {
            addCriterion("ORDER_REFUND_ACCOUNT <", value, "refundAccount");
            return (Criteria) this;
        }

        public Criteria andRefundAccountLessThanOrEqualTo(String value) {
            addCriterion("ORDER_REFUND_ACCOUNT <=", value, "refundAccount");
            return (Criteria) this;
        }

        public Criteria andRefundAccountLike(String value) {
            addCriterion("ORDER_REFUND_ACCOUNT like", value, "refundAccount");
            return (Criteria) this;
        }

        public Criteria andRefundAccountNotLike(String value) {
            addCriterion("ORDER_REFUND_ACCOUNT not like", value, "refundAccount");
            return (Criteria) this;
        }

        public Criteria andRefundAccountIn(List<String> values) {
            addCriterion("ORDER_REFUND_ACCOUNT in", values, "refundAccount");
            return (Criteria) this;
        }

        public Criteria andRefundAccountNotIn(List<String> values) {
            addCriterion("ORDER_REFUND_ACCOUNT not in", values, "refundAccount");
            return (Criteria) this;
        }

        public Criteria andRefundAccountBetween(String value1, String value2) {
            addCriterion("ORDER_REFUND_ACCOUNT between", value1, value2, "refundAccount");
            return (Criteria) this;
        }

        public Criteria andRefundAccountNotBetween(String value1, String value2) {
            addCriterion("ORDER_REFUND_ACCOUNT not between", value1, value2, "refundAccount");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("ORDER_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("ORDER_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("ORDER_PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("ORDER_PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("ORDER_PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("ORDER_PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("ORDER_PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("ORDER_PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("ORDER_PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("ORDER_PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("ORDER_PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("ORDER_PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("ORDER_PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andExeAccountIsNull() {
            addCriterion("ORDER_EXE_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andExeAccountIsNotNull() {
            addCriterion("ORDER_EXE_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andExeAccountEqualTo(String value) {
            addCriterion("ORDER_EXE_ACCOUNT =", value, "exeAccount");
            return (Criteria) this;
        }

        public Criteria andExeAccountNotEqualTo(String value) {
            addCriterion("ORDER_EXE_ACCOUNT <>", value, "exeAccount");
            return (Criteria) this;
        }

        public Criteria andExeAccountGreaterThan(String value) {
            addCriterion("ORDER_EXE_ACCOUNT >", value, "exeAccount");
            return (Criteria) this;
        }

        public Criteria andExeAccountGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_EXE_ACCOUNT >=", value, "exeAccount");
            return (Criteria) this;
        }

        public Criteria andExeAccountLessThan(String value) {
            addCriterion("ORDER_EXE_ACCOUNT <", value, "exeAccount");
            return (Criteria) this;
        }

        public Criteria andExeAccountLessThanOrEqualTo(String value) {
            addCriterion("ORDER_EXE_ACCOUNT <=", value, "exeAccount");
            return (Criteria) this;
        }

        public Criteria andExeAccountLike(String value) {
            addCriterion("ORDER_EXE_ACCOUNT like", value, "exeAccount");
            return (Criteria) this;
        }

        public Criteria andExeAccountNotLike(String value) {
            addCriterion("ORDER_EXE_ACCOUNT not like", value, "exeAccount");
            return (Criteria) this;
        }

        public Criteria andExeAccountIn(List<String> values) {
            addCriterion("ORDER_EXE_ACCOUNT in", values, "exeAccount");
            return (Criteria) this;
        }

        public Criteria andExeAccountNotIn(List<String> values) {
            addCriterion("ORDER_EXE_ACCOUNT not in", values, "exeAccount");
            return (Criteria) this;
        }

        public Criteria andExeAccountBetween(String value1, String value2) {
            addCriterion("ORDER_EXE_ACCOUNT between", value1, value2, "exeAccount");
            return (Criteria) this;
        }

        public Criteria andExeAccountNotBetween(String value1, String value2) {
            addCriterion("ORDER_EXE_ACCOUNT not between", value1, value2, "exeAccount");
            return (Criteria) this;
        }

        public Criteria andDepositRememoIsNull() {
            addCriterion("ORDER_DEPOSIT_REMEMO is null");
            return (Criteria) this;
        }

        public Criteria andDepositRememoIsNotNull() {
            addCriterion("ORDER_DEPOSIT_REMEMO is not null");
            return (Criteria) this;
        }

        public Criteria andDepositRememoEqualTo(String value) {
            addCriterion("ORDER_DEPOSIT_REMEMO =", value, "depositRememo");
            return (Criteria) this;
        }

        public Criteria andDepositRememoNotEqualTo(String value) {
            addCriterion("ORDER_DEPOSIT_REMEMO <>", value, "depositRememo");
            return (Criteria) this;
        }

        public Criteria andDepositRememoGreaterThan(String value) {
            addCriterion("ORDER_DEPOSIT_REMEMO >", value, "depositRememo");
            return (Criteria) this;
        }

        public Criteria andDepositRememoGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_DEPOSIT_REMEMO >=", value, "depositRememo");
            return (Criteria) this;
        }

        public Criteria andDepositRememoLessThan(String value) {
            addCriterion("ORDER_DEPOSIT_REMEMO <", value, "depositRememo");
            return (Criteria) this;
        }

        public Criteria andDepositRememoLessThanOrEqualTo(String value) {
            addCriterion("ORDER_DEPOSIT_REMEMO <=", value, "depositRememo");
            return (Criteria) this;
        }

        public Criteria andDepositRememoLike(String value) {
            addCriterion("ORDER_DEPOSIT_REMEMO like", value, "depositRememo");
            return (Criteria) this;
        }

        public Criteria andDepositRememoNotLike(String value) {
            addCriterion("ORDER_DEPOSIT_REMEMO not like", value, "depositRememo");
            return (Criteria) this;
        }

        public Criteria andDepositRememoIn(List<String> values) {
            addCriterion("ORDER_DEPOSIT_REMEMO in", values, "depositRememo");
            return (Criteria) this;
        }

        public Criteria andDepositRememoNotIn(List<String> values) {
            addCriterion("ORDER_DEPOSIT_REMEMO not in", values, "depositRememo");
            return (Criteria) this;
        }

        public Criteria andDepositRememoBetween(String value1, String value2) {
            addCriterion("ORDER_DEPOSIT_REMEMO between", value1, value2, "depositRememo");
            return (Criteria) this;
        }

        public Criteria andDepositRememoNotBetween(String value1, String value2) {
            addCriterion("ORDER_DEPOSIT_REMEMO not between", value1, value2, "depositRememo");
            return (Criteria) this;
        }

        public Criteria andDepositReturnIsNull() {
            addCriterion("ORDER_DEPOSIT_RETURN is null");
            return (Criteria) this;
        }

        public Criteria andDepositReturnIsNotNull() {
            addCriterion("ORDER_DEPOSIT_RETURN is not null");
            return (Criteria) this;
        }

        public Criteria andDepositReturnEqualTo(String value) {
            addCriterion("ORDER_DEPOSIT_RETURN =", value, "depositReturn");
            return (Criteria) this;
        }

        public Criteria andDepositReturnNotEqualTo(String value) {
            addCriterion("ORDER_DEPOSIT_RETURN <>", value, "depositReturn");
            return (Criteria) this;
        }

        public Criteria andDepositReturnGreaterThan(String value) {
            addCriterion("ORDER_DEPOSIT_RETURN >", value, "depositReturn");
            return (Criteria) this;
        }

        public Criteria andDepositReturnGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_DEPOSIT_RETURN >=", value, "depositReturn");
            return (Criteria) this;
        }

        public Criteria andDepositReturnLessThan(String value) {
            addCriterion("ORDER_DEPOSIT_RETURN <", value, "depositReturn");
            return (Criteria) this;
        }

        public Criteria andDepositReturnLessThanOrEqualTo(String value) {
            addCriterion("ORDER_DEPOSIT_RETURN <=", value, "depositReturn");
            return (Criteria) this;
        }

        public Criteria andDepositReturnLike(String value) {
            addCriterion("ORDER_DEPOSIT_RETURN like", value, "depositReturn");
            return (Criteria) this;
        }

        public Criteria andDepositReturnNotLike(String value) {
            addCriterion("ORDER_DEPOSIT_RETURN not like", value, "depositReturn");
            return (Criteria) this;
        }

        public Criteria andDepositReturnIn(List<String> values) {
            addCriterion("ORDER_DEPOSIT_RETURN in", values, "depositReturn");
            return (Criteria) this;
        }

        public Criteria andDepositReturnNotIn(List<String> values) {
            addCriterion("ORDER_DEPOSIT_RETURN not in", values, "depositReturn");
            return (Criteria) this;
        }

        public Criteria andDepositReturnBetween(String value1, String value2) {
            addCriterion("ORDER_DEPOSIT_RETURN between", value1, value2, "depositReturn");
            return (Criteria) this;
        }

        public Criteria andDepositReturnNotBetween(String value1, String value2) {
            addCriterion("ORDER_DEPOSIT_RETURN not between", value1, value2, "depositReturn");
            return (Criteria) this;
        }

        public Criteria andAmountReturnIsNull() {
            addCriterion("ORDER_AMOUNT_RETURN is null");
            return (Criteria) this;
        }

        public Criteria andAmountReturnIsNotNull() {
            addCriterion("ORDER_AMOUNT_RETURN is not null");
            return (Criteria) this;
        }

        public Criteria andAmountReturnEqualTo(String value) {
            addCriterion("ORDER_AMOUNT_RETURN =", value, "amountReturn");
            return (Criteria) this;
        }

        public Criteria andAmountReturnNotEqualTo(String value) {
            addCriterion("ORDER_AMOUNT_RETURN <>", value, "amountReturn");
            return (Criteria) this;
        }

        public Criteria andAmountReturnGreaterThan(String value) {
            addCriterion("ORDER_AMOUNT_RETURN >", value, "amountReturn");
            return (Criteria) this;
        }

        public Criteria andAmountReturnGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_AMOUNT_RETURN >=", value, "amountReturn");
            return (Criteria) this;
        }

        public Criteria andAmountReturnLessThan(String value) {
            addCriterion("ORDER_AMOUNT_RETURN <", value, "amountReturn");
            return (Criteria) this;
        }

        public Criteria andAmountReturnLessThanOrEqualTo(String value) {
            addCriterion("ORDER_AMOUNT_RETURN <=", value, "amountReturn");
            return (Criteria) this;
        }

        public Criteria andAmountReturnLike(String value) {
            addCriterion("ORDER_AMOUNT_RETURN like", value, "amountReturn");
            return (Criteria) this;
        }

        public Criteria andAmountReturnNotLike(String value) {
            addCriterion("ORDER_AMOUNT_RETURN not like", value, "amountReturn");
            return (Criteria) this;
        }

        public Criteria andAmountReturnIn(List<String> values) {
            addCriterion("ORDER_AMOUNT_RETURN in", values, "amountReturn");
            return (Criteria) this;
        }

        public Criteria andAmountReturnNotIn(List<String> values) {
            addCriterion("ORDER_AMOUNT_RETURN not in", values, "amountReturn");
            return (Criteria) this;
        }

        public Criteria andAmountReturnBetween(String value1, String value2) {
            addCriterion("ORDER_AMOUNT_RETURN between", value1, value2, "amountReturn");
            return (Criteria) this;
        }

        public Criteria andAmountReturnNotBetween(String value1, String value2) {
            addCriterion("ORDER_AMOUNT_RETURN not between", value1, value2, "amountReturn");
            return (Criteria) this;
        }

        public Criteria andOverDateIsNull() {
            addCriterion("ORDER_OVER_DATE is null");
            return (Criteria) this;
        }

        public Criteria andOverDateIsNotNull() {
            addCriterion("ORDER_OVER_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andOverDateEqualTo(String value) {
            addCriterion("ORDER_OVER_DATE =", value, "overDate");
            return (Criteria) this;
        }

        public Criteria andOverDateNotEqualTo(String value) {
            addCriterion("ORDER_OVER_DATE <>", value, "overDate");
            return (Criteria) this;
        }

        public Criteria andOverDateGreaterThan(String value) {
            addCriterion("ORDER_OVER_DATE >", value, "overDate");
            return (Criteria) this;
        }

        public Criteria andOverDateGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_OVER_DATE >=", value, "overDate");
            return (Criteria) this;
        }

        public Criteria andOverDateLessThan(String value) {
            addCriterion("ORDER_OVER_DATE <", value, "overDate");
            return (Criteria) this;
        }

        public Criteria andOverDateLessThanOrEqualTo(String value) {
            addCriterion("ORDER_OVER_DATE <=", value, "overDate");
            return (Criteria) this;
        }

        public Criteria andOverDateLike(String value) {
            addCriterion("ORDER_OVER_DATE like", value, "overDate");
            return (Criteria) this;
        }

        public Criteria andOverDateNotLike(String value) {
            addCriterion("ORDER_OVER_DATE not like", value, "overDate");
            return (Criteria) this;
        }

        public Criteria andOverDateIn(List<String> values) {
            addCriterion("ORDER_OVER_DATE in", values, "overDate");
            return (Criteria) this;
        }

        public Criteria andOverDateNotIn(List<String> values) {
            addCriterion("ORDER_OVER_DATE not in", values, "overDate");
            return (Criteria) this;
        }

        public Criteria andOverDateBetween(String value1, String value2) {
            addCriterion("ORDER_OVER_DATE between", value1, value2, "overDate");
            return (Criteria) this;
        }

        public Criteria andOverDateNotBetween(String value1, String value2) {
            addCriterion("ORDER_OVER_DATE not between", value1, value2, "overDate");
            return (Criteria) this;
        }

        public Criteria andCertImageIsNull() {
            addCriterion("ORDER_CERT_IMAGE is null");
            return (Criteria) this;
        }

        public Criteria andCertImageIsNotNull() {
            addCriterion("ORDER_CERT_IMAGE is not null");
            return (Criteria) this;
        }

        public Criteria andCertImageEqualTo(String value) {
            addCriterion("ORDER_CERT_IMAGE =", value, "certImage");
            return (Criteria) this;
        }

        public Criteria andCertImageNotEqualTo(String value) {
            addCriterion("ORDER_CERT_IMAGE <>", value, "certImage");
            return (Criteria) this;
        }

        public Criteria andCertImageGreaterThan(String value) {
            addCriterion("ORDER_CERT_IMAGE >", value, "certImage");
            return (Criteria) this;
        }

        public Criteria andCertImageGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_CERT_IMAGE >=", value, "certImage");
            return (Criteria) this;
        }

        public Criteria andCertImageLessThan(String value) {
            addCriterion("ORDER_CERT_IMAGE <", value, "certImage");
            return (Criteria) this;
        }

        public Criteria andCertImageLessThanOrEqualTo(String value) {
            addCriterion("ORDER_CERT_IMAGE <=", value, "certImage");
            return (Criteria) this;
        }

        public Criteria andCertImageLike(String value) {
            addCriterion("ORDER_CERT_IMAGE like", value, "certImage");
            return (Criteria) this;
        }

        public Criteria andCertImageNotLike(String value) {
            addCriterion("ORDER_CERT_IMAGE not like", value, "certImage");
            return (Criteria) this;
        }

        public Criteria andCertImageIn(List<String> values) {
            addCriterion("ORDER_CERT_IMAGE in", values, "certImage");
            return (Criteria) this;
        }

        public Criteria andCertImageNotIn(List<String> values) {
            addCriterion("ORDER_CERT_IMAGE not in", values, "certImage");
            return (Criteria) this;
        }

        public Criteria andCertImageBetween(String value1, String value2) {
            addCriterion("ORDER_CERT_IMAGE between", value1, value2, "certImage");
            return (Criteria) this;
        }

        public Criteria andCertImageNotBetween(String value1, String value2) {
            addCriterion("ORDER_CERT_IMAGE not between", value1, value2, "certImage");
            return (Criteria) this;
        }

        public Criteria andCertImage1IsNull() {
            addCriterion("ORDER_CERT_IMAGE1 is null");
            return (Criteria) this;
        }

        public Criteria andCertImage1IsNotNull() {
            addCriterion("ORDER_CERT_IMAGE1 is not null");
            return (Criteria) this;
        }

        public Criteria andCertImage1EqualTo(String value) {
            addCriterion("ORDER_CERT_IMAGE1 =", value, "certImage1");
            return (Criteria) this;
        }

        public Criteria andCertImage1NotEqualTo(String value) {
            addCriterion("ORDER_CERT_IMAGE1 <>", value, "certImage1");
            return (Criteria) this;
        }

        public Criteria andCertImage1GreaterThan(String value) {
            addCriterion("ORDER_CERT_IMAGE1 >", value, "certImage1");
            return (Criteria) this;
        }

        public Criteria andCertImage1GreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_CERT_IMAGE1 >=", value, "certImage1");
            return (Criteria) this;
        }

        public Criteria andCertImage1LessThan(String value) {
            addCriterion("ORDER_CERT_IMAGE1 <", value, "certImage1");
            return (Criteria) this;
        }

        public Criteria andCertImage1LessThanOrEqualTo(String value) {
            addCriterion("ORDER_CERT_IMAGE1 <=", value, "certImage1");
            return (Criteria) this;
        }

        public Criteria andCertImage1Like(String value) {
            addCriterion("ORDER_CERT_IMAGE1 like", value, "certImage1");
            return (Criteria) this;
        }

        public Criteria andCertImage1NotLike(String value) {
            addCriterion("ORDER_CERT_IMAGE1 not like", value, "certImage1");
            return (Criteria) this;
        }

        public Criteria andCertImage1In(List<String> values) {
            addCriterion("ORDER_CERT_IMAGE1 in", values, "certImage1");
            return (Criteria) this;
        }

        public Criteria andCertImage1NotIn(List<String> values) {
            addCriterion("ORDER_CERT_IMAGE1 not in", values, "certImage1");
            return (Criteria) this;
        }

        public Criteria andCertImage1Between(String value1, String value2) {
            addCriterion("ORDER_CERT_IMAGE1 between", value1, value2, "certImage1");
            return (Criteria) this;
        }

        public Criteria andCertImage1NotBetween(String value1, String value2) {
            addCriterion("ORDER_CERT_IMAGE1 not between", value1, value2, "certImage1");
            return (Criteria) this;
        }

        public Criteria andNextOrderIsNull() {
            addCriterion("ORDER_NEXT_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andNextOrderIsNotNull() {
            addCriterion("ORDER_NEXT_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andNextOrderEqualTo(String value) {
            addCriterion("ORDER_NEXT_ORDER =", value, "nextOrder");
            return (Criteria) this;
        }

        public Criteria andNextOrderNotEqualTo(String value) {
            addCriterion("ORDER_NEXT_ORDER <>", value, "nextOrder");
            return (Criteria) this;
        }

        public Criteria andNextOrderGreaterThan(String value) {
            addCriterion("ORDER_NEXT_ORDER >", value, "nextOrder");
            return (Criteria) this;
        }

        public Criteria andNextOrderGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_NEXT_ORDER >=", value, "nextOrder");
            return (Criteria) this;
        }

        public Criteria andNextOrderLessThan(String value) {
            addCriterion("ORDER_NEXT_ORDER <", value, "nextOrder");
            return (Criteria) this;
        }

        public Criteria andNextOrderLessThanOrEqualTo(String value) {
            addCriterion("ORDER_NEXT_ORDER <=", value, "nextOrder");
            return (Criteria) this;
        }

        public Criteria andNextOrderLike(String value) {
            addCriterion("ORDER_NEXT_ORDER like", value, "nextOrder");
            return (Criteria) this;
        }

        public Criteria andNextOrderNotLike(String value) {
            addCriterion("ORDER_NEXT_ORDER not like", value, "nextOrder");
            return (Criteria) this;
        }

        public Criteria andNextOrderIn(List<String> values) {
            addCriterion("ORDER_NEXT_ORDER in", values, "nextOrder");
            return (Criteria) this;
        }

        public Criteria andNextOrderNotIn(List<String> values) {
            addCriterion("ORDER_NEXT_ORDER not in", values, "nextOrder");
            return (Criteria) this;
        }

        public Criteria andNextOrderBetween(String value1, String value2) {
            addCriterion("ORDER_NEXT_ORDER between", value1, value2, "nextOrder");
            return (Criteria) this;
        }

        public Criteria andNextOrderNotBetween(String value1, String value2) {
            addCriterion("ORDER_NEXT_ORDER not between", value1, value2, "nextOrder");
            return (Criteria) this;
        }

        public Criteria andNextEndDateIsNull() {
            addCriterion("ORDER_NEXT_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andNextEndDateIsNotNull() {
            addCriterion("ORDER_NEXT_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andNextEndDateEqualTo(String value) {
            addCriterion("ORDER_NEXT_END_DATE =", value, "nextEndDate");
            return (Criteria) this;
        }

        public Criteria andNextEndDateNotEqualTo(String value) {
            addCriterion("ORDER_NEXT_END_DATE <>", value, "nextEndDate");
            return (Criteria) this;
        }

        public Criteria andNextEndDateGreaterThan(String value) {
            addCriterion("ORDER_NEXT_END_DATE >", value, "nextEndDate");
            return (Criteria) this;
        }

        public Criteria andNextEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_NEXT_END_DATE >=", value, "nextEndDate");
            return (Criteria) this;
        }

        public Criteria andNextEndDateLessThan(String value) {
            addCriterion("ORDER_NEXT_END_DATE <", value, "nextEndDate");
            return (Criteria) this;
        }

        public Criteria andNextEndDateLessThanOrEqualTo(String value) {
            addCriterion("ORDER_NEXT_END_DATE <=", value, "nextEndDate");
            return (Criteria) this;
        }

        public Criteria andNextEndDateLike(String value) {
            addCriterion("ORDER_NEXT_END_DATE like", value, "nextEndDate");
            return (Criteria) this;
        }

        public Criteria andNextEndDateNotLike(String value) {
            addCriterion("ORDER_NEXT_END_DATE not like", value, "nextEndDate");
            return (Criteria) this;
        }

        public Criteria andNextEndDateIn(List<String> values) {
            addCriterion("ORDER_NEXT_END_DATE in", values, "nextEndDate");
            return (Criteria) this;
        }

        public Criteria andNextEndDateNotIn(List<String> values) {
            addCriterion("ORDER_NEXT_END_DATE not in", values, "nextEndDate");
            return (Criteria) this;
        }

        public Criteria andNextEndDateBetween(String value1, String value2) {
            addCriterion("ORDER_NEXT_END_DATE between", value1, value2, "nextEndDate");
            return (Criteria) this;
        }

        public Criteria andNextEndDateNotBetween(String value1, String value2) {
            addCriterion("ORDER_NEXT_END_DATE not between", value1, value2, "nextEndDate");
            return (Criteria) this;
        }

        public Criteria andNextAmountIsNull() {
            addCriterion("ORDER_NEXT_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andNextAmountIsNotNull() {
            addCriterion("ORDER_NEXT_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andNextAmountEqualTo(String value) {
            addCriterion("ORDER_NEXT_AMOUNT =", value, "nextAmount");
            return (Criteria) this;
        }

        public Criteria andNextAmountNotEqualTo(String value) {
            addCriterion("ORDER_NEXT_AMOUNT <>", value, "nextAmount");
            return (Criteria) this;
        }

        public Criteria andNextAmountGreaterThan(String value) {
            addCriterion("ORDER_NEXT_AMOUNT >", value, "nextAmount");
            return (Criteria) this;
        }

        public Criteria andNextAmountGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_NEXT_AMOUNT >=", value, "nextAmount");
            return (Criteria) this;
        }

        public Criteria andNextAmountLessThan(String value) {
            addCriterion("ORDER_NEXT_AMOUNT <", value, "nextAmount");
            return (Criteria) this;
        }

        public Criteria andNextAmountLessThanOrEqualTo(String value) {
            addCriterion("ORDER_NEXT_AMOUNT <=", value, "nextAmount");
            return (Criteria) this;
        }

        public Criteria andNextAmountLike(String value) {
            addCriterion("ORDER_NEXT_AMOUNT like", value, "nextAmount");
            return (Criteria) this;
        }

        public Criteria andNextAmountNotLike(String value) {
            addCriterion("ORDER_NEXT_AMOUNT not like", value, "nextAmount");
            return (Criteria) this;
        }

        public Criteria andNextAmountIn(List<String> values) {
            addCriterion("ORDER_NEXT_AMOUNT in", values, "nextAmount");
            return (Criteria) this;
        }

        public Criteria andNextAmountNotIn(List<String> values) {
            addCriterion("ORDER_NEXT_AMOUNT not in", values, "nextAmount");
            return (Criteria) this;
        }

        public Criteria andNextAmountBetween(String value1, String value2) {
            addCriterion("ORDER_NEXT_AMOUNT between", value1, value2, "nextAmount");
            return (Criteria) this;
        }

        public Criteria andNextAmountNotBetween(String value1, String value2) {
            addCriterion("ORDER_NEXT_AMOUNT not between", value1, value2, "nextAmount");
            return (Criteria) this;
        }

        public Criteria andReturnCellTimeIsNull() {
            addCriterion("ORDER_RETURN_CELL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andReturnCellTimeIsNotNull() {
            addCriterion("ORDER_RETURN_CELL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andReturnCellTimeEqualTo(String value) {
            addCriterion("ORDER_RETURN_CELL_TIME =", value, "returnCellTime");
            return (Criteria) this;
        }

        public Criteria andReturnCellTimeNotEqualTo(String value) {
            addCriterion("ORDER_RETURN_CELL_TIME <>", value, "returnCellTime");
            return (Criteria) this;
        }

        public Criteria andReturnCellTimeGreaterThan(String value) {
            addCriterion("ORDER_RETURN_CELL_TIME >", value, "returnCellTime");
            return (Criteria) this;
        }

        public Criteria andReturnCellTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_RETURN_CELL_TIME >=", value, "returnCellTime");
            return (Criteria) this;
        }

        public Criteria andReturnCellTimeLessThan(String value) {
            addCriterion("ORDER_RETURN_CELL_TIME <", value, "returnCellTime");
            return (Criteria) this;
        }

        public Criteria andReturnCellTimeLessThanOrEqualTo(String value) {
            addCriterion("ORDER_RETURN_CELL_TIME <=", value, "returnCellTime");
            return (Criteria) this;
        }

        public Criteria andReturnCellTimeLike(String value) {
            addCriterion("ORDER_RETURN_CELL_TIME like", value, "returnCellTime");
            return (Criteria) this;
        }

        public Criteria andReturnCellTimeNotLike(String value) {
            addCriterion("ORDER_RETURN_CELL_TIME not like", value, "returnCellTime");
            return (Criteria) this;
        }

        public Criteria andReturnCellTimeIn(List<String> values) {
            addCriterion("ORDER_RETURN_CELL_TIME in", values, "returnCellTime");
            return (Criteria) this;
        }

        public Criteria andReturnCellTimeNotIn(List<String> values) {
            addCriterion("ORDER_RETURN_CELL_TIME not in", values, "returnCellTime");
            return (Criteria) this;
        }

        public Criteria andReturnCellTimeBetween(String value1, String value2) {
            addCriterion("ORDER_RETURN_CELL_TIME between", value1, value2, "returnCellTime");
            return (Criteria) this;
        }

        public Criteria andReturnCellTimeNotBetween(String value1, String value2) {
            addCriterion("ORDER_RETURN_CELL_TIME not between", value1, value2, "returnCellTime");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("ORDER_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("ORDER_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("ORDER_UNIT =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("ORDER_UNIT <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("ORDER_UNIT >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_UNIT >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("ORDER_UNIT <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("ORDER_UNIT <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("ORDER_UNIT like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("ORDER_UNIT not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("ORDER_UNIT in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("ORDER_UNIT not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("ORDER_UNIT between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("ORDER_UNIT not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("ORDER_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("ORDER_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("ORDER_NUMBER =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("ORDER_NUMBER <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("ORDER_NUMBER >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_NUMBER >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("ORDER_NUMBER <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("ORDER_NUMBER <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("ORDER_NUMBER like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("ORDER_NUMBER not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("ORDER_NUMBER in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("ORDER_NUMBER not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("ORDER_NUMBER between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("ORDER_NUMBER not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andIsDisplayIsNull() {
            addCriterion("ORDER_IS_DISPLAY is null");
            return (Criteria) this;
        }

        public Criteria andIsDisplayIsNotNull() {
            addCriterion("ORDER_IS_DISPLAY is not null");
            return (Criteria) this;
        }

        public Criteria andIsDisplayEqualTo(String value) {
            addCriterion("ORDER_IS_DISPLAY =", value, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayNotEqualTo(String value) {
            addCriterion("ORDER_IS_DISPLAY <>", value, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayGreaterThan(String value) {
            addCriterion("ORDER_IS_DISPLAY >", value, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_IS_DISPLAY >=", value, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayLessThan(String value) {
            addCriterion("ORDER_IS_DISPLAY <", value, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayLessThanOrEqualTo(String value) {
            addCriterion("ORDER_IS_DISPLAY <=", value, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayLike(String value) {
            addCriterion("ORDER_IS_DISPLAY like", value, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayNotLike(String value) {
            addCriterion("ORDER_IS_DISPLAY not like", value, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayIn(List<String> values) {
            addCriterion("ORDER_IS_DISPLAY in", values, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayNotIn(List<String> values) {
            addCriterion("ORDER_IS_DISPLAY not in", values, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayBetween(String value1, String value2) {
            addCriterion("ORDER_IS_DISPLAY between", value1, value2, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayNotBetween(String value1, String value2) {
            addCriterion("ORDER_IS_DISPLAY not between", value1, value2, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andORDER_PASSWORDIsNull() {
            addCriterion("ORDER_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andORDER_PASSWORDIsNotNull() {
            addCriterion("ORDER_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andORDER_PASSWORDEqualTo(String value) {
            addCriterion("ORDER_PASSWORD =", value, "ORDER_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andORDER_PASSWORDNotEqualTo(String value) {
            addCriterion("ORDER_PASSWORD <>", value, "ORDER_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andORDER_PASSWORDGreaterThan(String value) {
            addCriterion("ORDER_PASSWORD >", value, "ORDER_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andORDER_PASSWORDGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_PASSWORD >=", value, "ORDER_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andORDER_PASSWORDLessThan(String value) {
            addCriterion("ORDER_PASSWORD <", value, "ORDER_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andORDER_PASSWORDLessThanOrEqualTo(String value) {
            addCriterion("ORDER_PASSWORD <=", value, "ORDER_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andORDER_PASSWORDLike(String value) {
            addCriterion("ORDER_PASSWORD like", value, "ORDER_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andORDER_PASSWORDNotLike(String value) {
            addCriterion("ORDER_PASSWORD not like", value, "ORDER_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andORDER_PASSWORDIn(List<String> values) {
            addCriterion("ORDER_PASSWORD in", values, "ORDER_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andORDER_PASSWORDNotIn(List<String> values) {
            addCriterion("ORDER_PASSWORD not in", values, "ORDER_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andORDER_PASSWORDBetween(String value1, String value2) {
            addCriterion("ORDER_PASSWORD between", value1, value2, "ORDER_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andORDER_PASSWORDNotBetween(String value1, String value2) {
            addCriterion("ORDER_PASSWORD not between", value1, value2, "ORDER_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andTotalTimesIsNull() {
            addCriterion("ORDER_TOTAL_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andTotalTimesIsNotNull() {
            addCriterion("ORDER_TOTAL_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andTotalTimesEqualTo(String value) {
            addCriterion("ORDER_TOTAL_TIMES =", value, "totalTimes");
            return (Criteria) this;
        }

        public Criteria andTotalTimesNotEqualTo(String value) {
            addCriterion("ORDER_TOTAL_TIMES <>", value, "totalTimes");
            return (Criteria) this;
        }

        public Criteria andTotalTimesGreaterThan(String value) {
            addCriterion("ORDER_TOTAL_TIMES >", value, "totalTimes");
            return (Criteria) this;
        }

        public Criteria andTotalTimesGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_TOTAL_TIMES >=", value, "totalTimes");
            return (Criteria) this;
        }

        public Criteria andTotalTimesLessThan(String value) {
            addCriterion("ORDER_TOTAL_TIMES <", value, "totalTimes");
            return (Criteria) this;
        }

        public Criteria andTotalTimesLessThanOrEqualTo(String value) {
            addCriterion("ORDER_TOTAL_TIMES <=", value, "totalTimes");
            return (Criteria) this;
        }

        public Criteria andTotalTimesLike(String value) {
            addCriterion("ORDER_TOTAL_TIMES like", value, "totalTimes");
            return (Criteria) this;
        }

        public Criteria andTotalTimesNotLike(String value) {
            addCriterion("ORDER_TOTAL_TIMES not like", value, "totalTimes");
            return (Criteria) this;
        }

        public Criteria andTotalTimesIn(List<String> values) {
            addCriterion("ORDER_TOTAL_TIMES in", values, "totalTimes");
            return (Criteria) this;
        }

        public Criteria andTotalTimesNotIn(List<String> values) {
            addCriterion("ORDER_TOTAL_TIMES not in", values, "totalTimes");
            return (Criteria) this;
        }

        public Criteria andTotalTimesBetween(String value1, String value2) {
            addCriterion("ORDER_TOTAL_TIMES between", value1, value2, "totalTimes");
            return (Criteria) this;
        }

        public Criteria andTotalTimesNotBetween(String value1, String value2) {
            addCriterion("ORDER_TOTAL_TIMES not between", value1, value2, "totalTimes");
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