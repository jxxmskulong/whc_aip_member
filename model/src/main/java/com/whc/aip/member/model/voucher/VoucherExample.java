package com.whc.aip.member.model.voucher;

import java.util.ArrayList;
import java.util.List;

public class VoucherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VoucherExample() {
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
            addCriterion("VOUCHER_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("VOUCHER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("VOUCHER_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("VOUCHER_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("VOUCHER_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("VOUCHER_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("VOUCHER_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("VOUCHER_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("VOUCHER_ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("VOUCHER_ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("VOUCHER_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("VOUCHER_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("VOUCHER_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("VOUCHER_ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("VOUCHER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("VOUCHER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("VOUCHER_NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("VOUCHER_NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("VOUCHER_NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("VOUCHER_NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("VOUCHER_NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("VOUCHER_NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("VOUCHER_NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("VOUCHER_NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("VOUCHER_NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("VOUCHER_NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("VOUCHER_NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("VOUCHER_NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCateIsNull() {
            addCriterion("VOUCHER_CATE is null");
            return (Criteria) this;
        }

        public Criteria andCateIsNotNull() {
            addCriterion("VOUCHER_CATE is not null");
            return (Criteria) this;
        }

        public Criteria andCateEqualTo(String value) {
            addCriterion("VOUCHER_CATE =", value, "cate");
            return (Criteria) this;
        }

        public Criteria andCateNotEqualTo(String value) {
            addCriterion("VOUCHER_CATE <>", value, "cate");
            return (Criteria) this;
        }

        public Criteria andCateGreaterThan(String value) {
            addCriterion("VOUCHER_CATE >", value, "cate");
            return (Criteria) this;
        }

        public Criteria andCateGreaterThanOrEqualTo(String value) {
            addCriterion("VOUCHER_CATE >=", value, "cate");
            return (Criteria) this;
        }

        public Criteria andCateLessThan(String value) {
            addCriterion("VOUCHER_CATE <", value, "cate");
            return (Criteria) this;
        }

        public Criteria andCateLessThanOrEqualTo(String value) {
            addCriterion("VOUCHER_CATE <=", value, "cate");
            return (Criteria) this;
        }

        public Criteria andCateLike(String value) {
            addCriterion("VOUCHER_CATE like", value, "cate");
            return (Criteria) this;
        }

        public Criteria andCateNotLike(String value) {
            addCriterion("VOUCHER_CATE not like", value, "cate");
            return (Criteria) this;
        }

        public Criteria andCateIn(List<String> values) {
            addCriterion("VOUCHER_CATE in", values, "cate");
            return (Criteria) this;
        }

        public Criteria andCateNotIn(List<String> values) {
            addCriterion("VOUCHER_CATE not in", values, "cate");
            return (Criteria) this;
        }

        public Criteria andCateBetween(String value1, String value2) {
            addCriterion("VOUCHER_CATE between", value1, value2, "cate");
            return (Criteria) this;
        }

        public Criteria andCateNotBetween(String value1, String value2) {
            addCriterion("VOUCHER_CATE not between", value1, value2, "cate");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("VOUCHER_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("VOUCHER_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(String value) {
            addCriterion("VOUCHER_AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(String value) {
            addCriterion("VOUCHER_AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(String value) {
            addCriterion("VOUCHER_AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(String value) {
            addCriterion("VOUCHER_AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(String value) {
            addCriterion("VOUCHER_AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(String value) {
            addCriterion("VOUCHER_AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLike(String value) {
            addCriterion("VOUCHER_AMOUNT like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotLike(String value) {
            addCriterion("VOUCHER_AMOUNT not like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<String> values) {
            addCriterion("VOUCHER_AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<String> values) {
            addCriterion("VOUCHER_AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(String value1, String value2) {
            addCriterion("VOUCHER_AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(String value1, String value2) {
            addCriterion("VOUCHER_AMOUNT not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeIsNull() {
            addCriterion("VOUCHER_VERIFYCODE is null");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeIsNotNull() {
            addCriterion("VOUCHER_VERIFYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeEqualTo(String value) {
            addCriterion("VOUCHER_VERIFYCODE =", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeNotEqualTo(String value) {
            addCriterion("VOUCHER_VERIFYCODE <>", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGreaterThan(String value) {
            addCriterion("VOUCHER_VERIFYCODE >", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("VOUCHER_VERIFYCODE >=", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeLessThan(String value) {
            addCriterion("VOUCHER_VERIFYCODE <", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeLessThanOrEqualTo(String value) {
            addCriterion("VOUCHER_VERIFYCODE <=", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeLike(String value) {
            addCriterion("VOUCHER_VERIFYCODE like", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeNotLike(String value) {
            addCriterion("VOUCHER_VERIFYCODE not like", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeIn(List<String> values) {
            addCriterion("VOUCHER_VERIFYCODE in", values, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeNotIn(List<String> values) {
            addCriterion("VOUCHER_VERIFYCODE not in", values, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeBetween(String value1, String value2) {
            addCriterion("VOUCHER_VERIFYCODE between", value1, value2, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeNotBetween(String value1, String value2) {
            addCriterion("VOUCHER_VERIFYCODE not between", value1, value2, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("VOUCHER_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("VOUCHER_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("VOUCHER_UNIT =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("VOUCHER_UNIT <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("VOUCHER_UNIT >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("VOUCHER_UNIT >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("VOUCHER_UNIT <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("VOUCHER_UNIT <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("VOUCHER_UNIT like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("VOUCHER_UNIT not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("VOUCHER_UNIT in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("VOUCHER_UNIT not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("VOUCHER_UNIT between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("VOUCHER_UNIT not between", value1, value2, "unit");
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

        public Criteria andMemberNameIsNull() {
            addCriterion("MEMBER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNotNull() {
            addCriterion("MEMBER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNameEqualTo(String value) {
            addCriterion("MEMBER_NAME =", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotEqualTo(String value) {
            addCriterion("MEMBER_NAME <>", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThan(String value) {
            addCriterion("MEMBER_NAME >", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_NAME >=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThan(String value) {
            addCriterion("MEMBER_NAME <", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_NAME <=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLike(String value) {
            addCriterion("MEMBER_NAME like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotLike(String value) {
            addCriterion("MEMBER_NAME not like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameIn(List<String> values) {
            addCriterion("MEMBER_NAME in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotIn(List<String> values) {
            addCriterion("MEMBER_NAME not in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameBetween(String value1, String value2) {
            addCriterion("MEMBER_NAME between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotBetween(String value1, String value2) {
            addCriterion("MEMBER_NAME not between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberMobileIsNull() {
            addCriterion("MEMBER_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMemberMobileIsNotNull() {
            addCriterion("MEMBER_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMemberMobileEqualTo(String value) {
            addCriterion("MEMBER_MOBILE =", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileNotEqualTo(String value) {
            addCriterion("MEMBER_MOBILE <>", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileGreaterThan(String value) {
            addCriterion("MEMBER_MOBILE >", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_MOBILE >=", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileLessThan(String value) {
            addCriterion("MEMBER_MOBILE <", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_MOBILE <=", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileLike(String value) {
            addCriterion("MEMBER_MOBILE like", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileNotLike(String value) {
            addCriterion("MEMBER_MOBILE not like", value, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileIn(List<String> values) {
            addCriterion("MEMBER_MOBILE in", values, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileNotIn(List<String> values) {
            addCriterion("MEMBER_MOBILE not in", values, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileBetween(String value1, String value2) {
            addCriterion("MEMBER_MOBILE between", value1, value2, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andMemberMobileNotBetween(String value1, String value2) {
            addCriterion("MEMBER_MOBILE not between", value1, value2, "memberMobile");
            return (Criteria) this;
        }

        public Criteria andWahoIdIsNull() {
            addCriterion("WAHO_ID is null");
            return (Criteria) this;
        }

        public Criteria andWahoIdIsNotNull() {
            addCriterion("WAHO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWahoIdEqualTo(String value) {
            addCriterion("WAHO_ID =", value, "wahoId");
            return (Criteria) this;
        }

        public Criteria andWahoIdNotEqualTo(String value) {
            addCriterion("WAHO_ID <>", value, "wahoId");
            return (Criteria) this;
        }

        public Criteria andWahoIdGreaterThan(String value) {
            addCriterion("WAHO_ID >", value, "wahoId");
            return (Criteria) this;
        }

        public Criteria andWahoIdGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_ID >=", value, "wahoId");
            return (Criteria) this;
        }

        public Criteria andWahoIdLessThan(String value) {
            addCriterion("WAHO_ID <", value, "wahoId");
            return (Criteria) this;
        }

        public Criteria andWahoIdLessThanOrEqualTo(String value) {
            addCriterion("WAHO_ID <=", value, "wahoId");
            return (Criteria) this;
        }

        public Criteria andWahoIdLike(String value) {
            addCriterion("WAHO_ID like", value, "wahoId");
            return (Criteria) this;
        }

        public Criteria andWahoIdNotLike(String value) {
            addCriterion("WAHO_ID not like", value, "wahoId");
            return (Criteria) this;
        }

        public Criteria andWahoIdIn(List<String> values) {
            addCriterion("WAHO_ID in", values, "wahoId");
            return (Criteria) this;
        }

        public Criteria andWahoIdNotIn(List<String> values) {
            addCriterion("WAHO_ID not in", values, "wahoId");
            return (Criteria) this;
        }

        public Criteria andWahoIdBetween(String value1, String value2) {
            addCriterion("WAHO_ID between", value1, value2, "wahoId");
            return (Criteria) this;
        }

        public Criteria andWahoIdNotBetween(String value1, String value2) {
            addCriterion("WAHO_ID not between", value1, value2, "wahoId");
            return (Criteria) this;
        }

        public Criteria andWahoceNoIsNull() {
            addCriterion("WAHOCE_NO is null");
            return (Criteria) this;
        }

        public Criteria andWahoceNoIsNotNull() {
            addCriterion("WAHOCE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andWahoceNoEqualTo(String value) {
            addCriterion("WAHOCE_NO =", value, "wahoceNo");
            return (Criteria) this;
        }

        public Criteria andWahoceNoNotEqualTo(String value) {
            addCriterion("WAHOCE_NO <>", value, "wahoceNo");
            return (Criteria) this;
        }

        public Criteria andWahoceNoGreaterThan(String value) {
            addCriterion("WAHOCE_NO >", value, "wahoceNo");
            return (Criteria) this;
        }

        public Criteria andWahoceNoGreaterThanOrEqualTo(String value) {
            addCriterion("WAHOCE_NO >=", value, "wahoceNo");
            return (Criteria) this;
        }

        public Criteria andWahoceNoLessThan(String value) {
            addCriterion("WAHOCE_NO <", value, "wahoceNo");
            return (Criteria) this;
        }

        public Criteria andWahoceNoLessThanOrEqualTo(String value) {
            addCriterion("WAHOCE_NO <=", value, "wahoceNo");
            return (Criteria) this;
        }

        public Criteria andWahoceNoLike(String value) {
            addCriterion("WAHOCE_NO like", value, "wahoceNo");
            return (Criteria) this;
        }

        public Criteria andWahoceNoNotLike(String value) {
            addCriterion("WAHOCE_NO not like", value, "wahoceNo");
            return (Criteria) this;
        }

        public Criteria andWahoceNoIn(List<String> values) {
            addCriterion("WAHOCE_NO in", values, "wahoceNo");
            return (Criteria) this;
        }

        public Criteria andWahoceNoNotIn(List<String> values) {
            addCriterion("WAHOCE_NO not in", values, "wahoceNo");
            return (Criteria) this;
        }

        public Criteria andWahoceNoBetween(String value1, String value2) {
            addCriterion("WAHOCE_NO between", value1, value2, "wahoceNo");
            return (Criteria) this;
        }

        public Criteria andWahoceNoNotBetween(String value1, String value2) {
            addCriterion("WAHOCE_NO not between", value1, value2, "wahoceNo");
            return (Criteria) this;
        }

        public Criteria andValidFromIsNull() {
            addCriterion("VOUCHER_VALIDFROM is null");
            return (Criteria) this;
        }

        public Criteria andValidFromIsNotNull() {
            addCriterion("VOUCHER_VALIDFROM is not null");
            return (Criteria) this;
        }

        public Criteria andValidFromEqualTo(String value) {
            addCriterion("VOUCHER_VALIDFROM =", value, "validFrom");
            return (Criteria) this;
        }

        public Criteria andValidFromNotEqualTo(String value) {
            addCriterion("VOUCHER_VALIDFROM <>", value, "validFrom");
            return (Criteria) this;
        }

        public Criteria andValidFromGreaterThan(String value) {
            addCriterion("VOUCHER_VALIDFROM >", value, "validFrom");
            return (Criteria) this;
        }

        public Criteria andValidFromGreaterThanOrEqualTo(String value) {
            addCriterion("VOUCHER_VALIDFROM >=", value, "validFrom");
            return (Criteria) this;
        }

        public Criteria andValidFromLessThan(String value) {
            addCriterion("VOUCHER_VALIDFROM <", value, "validFrom");
            return (Criteria) this;
        }

        public Criteria andValidFromLessThanOrEqualTo(String value) {
            addCriterion("VOUCHER_VALIDFROM <=", value, "validFrom");
            return (Criteria) this;
        }

        public Criteria andValidFromLike(String value) {
            addCriterion("VOUCHER_VALIDFROM like", value, "validFrom");
            return (Criteria) this;
        }

        public Criteria andValidFromNotLike(String value) {
            addCriterion("VOUCHER_VALIDFROM not like", value, "validFrom");
            return (Criteria) this;
        }

        public Criteria andValidFromIn(List<String> values) {
            addCriterion("VOUCHER_VALIDFROM in", values, "validFrom");
            return (Criteria) this;
        }

        public Criteria andValidFromNotIn(List<String> values) {
            addCriterion("VOUCHER_VALIDFROM not in", values, "validFrom");
            return (Criteria) this;
        }

        public Criteria andValidFromBetween(String value1, String value2) {
            addCriterion("VOUCHER_VALIDFROM between", value1, value2, "validFrom");
            return (Criteria) this;
        }

        public Criteria andValidFromNotBetween(String value1, String value2) {
            addCriterion("VOUCHER_VALIDFROM not between", value1, value2, "validFrom");
            return (Criteria) this;
        }

        public Criteria andValidToIsNull() {
            addCriterion("VOUCHER_VALIDTO is null");
            return (Criteria) this;
        }

        public Criteria andValidToIsNotNull() {
            addCriterion("VOUCHER_VALIDTO is not null");
            return (Criteria) this;
        }

        public Criteria andValidToEqualTo(String value) {
            addCriterion("VOUCHER_VALIDTO =", value, "validTo");
            return (Criteria) this;
        }

        public Criteria andValidToNotEqualTo(String value) {
            addCriterion("VOUCHER_VALIDTO <>", value, "validTo");
            return (Criteria) this;
        }

        public Criteria andValidToGreaterThan(String value) {
            addCriterion("VOUCHER_VALIDTO >", value, "validTo");
            return (Criteria) this;
        }

        public Criteria andValidToGreaterThanOrEqualTo(String value) {
            addCriterion("VOUCHER_VALIDTO >=", value, "validTo");
            return (Criteria) this;
        }

        public Criteria andValidToLessThan(String value) {
            addCriterion("VOUCHER_VALIDTO <", value, "validTo");
            return (Criteria) this;
        }

        public Criteria andValidToLessThanOrEqualTo(String value) {
            addCriterion("VOUCHER_VALIDTO <=", value, "validTo");
            return (Criteria) this;
        }

        public Criteria andValidToLike(String value) {
            addCriterion("VOUCHER_VALIDTO like", value, "validTo");
            return (Criteria) this;
        }

        public Criteria andValidToNotLike(String value) {
            addCriterion("VOUCHER_VALIDTO not like", value, "validTo");
            return (Criteria) this;
        }

        public Criteria andValidToIn(List<String> values) {
            addCriterion("VOUCHER_VALIDTO in", values, "validTo");
            return (Criteria) this;
        }

        public Criteria andValidToNotIn(List<String> values) {
            addCriterion("VOUCHER_VALIDTO not in", values, "validTo");
            return (Criteria) this;
        }

        public Criteria andValidToBetween(String value1, String value2) {
            addCriterion("VOUCHER_VALIDTO between", value1, value2, "validTo");
            return (Criteria) this;
        }

        public Criteria andValidToNotBetween(String value1, String value2) {
            addCriterion("VOUCHER_VALIDTO not between", value1, value2, "validTo");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("VOUCHER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("VOUCHER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("VOUCHER_STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("VOUCHER_STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("VOUCHER_STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("VOUCHER_STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("VOUCHER_STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("VOUCHER_STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("VOUCHER_STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("VOUCHER_STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("VOUCHER_STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("VOUCHER_STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("VOUCHER_STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("VOUCHER_STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("VOUCHER_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("VOUCHER_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("VOUCHER_CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("VOUCHER_CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("VOUCHER_CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("VOUCHER_CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("VOUCHER_CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("VOUCHER_CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("VOUCHER_CREATE_TIME like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("VOUCHER_CREATE_TIME not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("VOUCHER_CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("VOUCHER_CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("VOUCHER_CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("VOUCHER_CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeIsNull() {
            addCriterion("VOUCHER_ACTIVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andActiveTimeIsNotNull() {
            addCriterion("VOUCHER_ACTIVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andActiveTimeEqualTo(String value) {
            addCriterion("VOUCHER_ACTIVE_TIME =", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeNotEqualTo(String value) {
            addCriterion("VOUCHER_ACTIVE_TIME <>", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeGreaterThan(String value) {
            addCriterion("VOUCHER_ACTIVE_TIME >", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeGreaterThanOrEqualTo(String value) {
            addCriterion("VOUCHER_ACTIVE_TIME >=", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeLessThan(String value) {
            addCriterion("VOUCHER_ACTIVE_TIME <", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeLessThanOrEqualTo(String value) {
            addCriterion("VOUCHER_ACTIVE_TIME <=", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeLike(String value) {
            addCriterion("VOUCHER_ACTIVE_TIME like", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeNotLike(String value) {
            addCriterion("VOUCHER_ACTIVE_TIME not like", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeIn(List<String> values) {
            addCriterion("VOUCHER_ACTIVE_TIME in", values, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeNotIn(List<String> values) {
            addCriterion("VOUCHER_ACTIVE_TIME not in", values, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeBetween(String value1, String value2) {
            addCriterion("VOUCHER_ACTIVE_TIME between", value1, value2, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeNotBetween(String value1, String value2) {
            addCriterion("VOUCHER_ACTIVE_TIME not between", value1, value2, "activeTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeIsNull() {
            addCriterion("VOUCHER_USED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUsedTimeIsNotNull() {
            addCriterion("VOUCHER_USED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUsedTimeEqualTo(String value) {
            addCriterion("VOUCHER_USED_TIME =", value, "usedTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeNotEqualTo(String value) {
            addCriterion("VOUCHER_USED_TIME <>", value, "usedTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeGreaterThan(String value) {
            addCriterion("VOUCHER_USED_TIME >", value, "usedTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeGreaterThanOrEqualTo(String value) {
            addCriterion("VOUCHER_USED_TIME >=", value, "usedTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeLessThan(String value) {
            addCriterion("VOUCHER_USED_TIME <", value, "usedTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeLessThanOrEqualTo(String value) {
            addCriterion("VOUCHER_USED_TIME <=", value, "usedTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeLike(String value) {
            addCriterion("VOUCHER_USED_TIME like", value, "usedTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeNotLike(String value) {
            addCriterion("VOUCHER_USED_TIME not like", value, "usedTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeIn(List<String> values) {
            addCriterion("VOUCHER_USED_TIME in", values, "usedTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeNotIn(List<String> values) {
            addCriterion("VOUCHER_USED_TIME not in", values, "usedTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeBetween(String value1, String value2) {
            addCriterion("VOUCHER_USED_TIME between", value1, value2, "usedTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeNotBetween(String value1, String value2) {
            addCriterion("VOUCHER_USED_TIME not between", value1, value2, "usedTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNull() {
            addCriterion("VOUCHER_CANCEL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNotNull() {
            addCriterion("VOUCHER_CANCEL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeEqualTo(String value) {
            addCriterion("VOUCHER_CANCEL_TIME =", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotEqualTo(String value) {
            addCriterion("VOUCHER_CANCEL_TIME <>", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThan(String value) {
            addCriterion("VOUCHER_CANCEL_TIME >", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThanOrEqualTo(String value) {
            addCriterion("VOUCHER_CANCEL_TIME >=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThan(String value) {
            addCriterion("VOUCHER_CANCEL_TIME <", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThanOrEqualTo(String value) {
            addCriterion("VOUCHER_CANCEL_TIME <=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLike(String value) {
            addCriterion("VOUCHER_CANCEL_TIME like", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotLike(String value) {
            addCriterion("VOUCHER_CANCEL_TIME not like", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIn(List<String> values) {
            addCriterion("VOUCHER_CANCEL_TIME in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotIn(List<String> values) {
            addCriterion("VOUCHER_CANCEL_TIME not in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeBetween(String value1, String value2) {
            addCriterion("VOUCHER_CANCEL_TIME between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotBetween(String value1, String value2) {
            addCriterion("VOUCHER_CANCEL_TIME not between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("VOUCHER_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("VOUCHER_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("VOUCHER_MEMO =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("VOUCHER_MEMO <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("VOUCHER_MEMO >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("VOUCHER_MEMO >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("VOUCHER_MEMO <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("VOUCHER_MEMO <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("VOUCHER_MEMO like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("VOUCHER_MEMO not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("VOUCHER_MEMO in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("VOUCHER_MEMO not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("VOUCHER_MEMO between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("VOUCHER_MEMO not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andOorderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOorderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOorderIdEqualTo(String value) {
            addCriterion("ORDER_ID =", value, "oorderId");
            return (Criteria) this;
        }

        public Criteria andOorderIdNotEqualTo(String value) {
            addCriterion("ORDER_ID <>", value, "oorderId");
            return (Criteria) this;
        }

        public Criteria andOorderIdGreaterThan(String value) {
            addCriterion("ORDER_ID >", value, "oorderId");
            return (Criteria) this;
        }

        public Criteria andOorderIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_ID >=", value, "oorderId");
            return (Criteria) this;
        }

        public Criteria andOorderIdLessThan(String value) {
            addCriterion("ORDER_ID <", value, "oorderId");
            return (Criteria) this;
        }

        public Criteria andOorderIdLessThanOrEqualTo(String value) {
            addCriterion("ORDER_ID <=", value, "oorderId");
            return (Criteria) this;
        }

        public Criteria andOorderIdLike(String value) {
            addCriterion("ORDER_ID like", value, "oorderId");
            return (Criteria) this;
        }

        public Criteria andOorderIdNotLike(String value) {
            addCriterion("ORDER_ID not like", value, "oorderId");
            return (Criteria) this;
        }

        public Criteria andOorderIdIn(List<String> values) {
            addCriterion("ORDER_ID in", values, "oorderId");
            return (Criteria) this;
        }

        public Criteria andOorderIdNotIn(List<String> values) {
            addCriterion("ORDER_ID not in", values, "oorderId");
            return (Criteria) this;
        }

        public Criteria andOorderIdBetween(String value1, String value2) {
            addCriterion("ORDER_ID between", value1, value2, "oorderId");
            return (Criteria) this;
        }

        public Criteria andOorderIdNotBetween(String value1, String value2) {
            addCriterion("ORDER_ID not between", value1, value2, "oorderId");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("VOUCHER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("VOUCHER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("VOUCHER_CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("VOUCHER_CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("VOUCHER_CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("VOUCHER_CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("VOUCHER_CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("VOUCHER_CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("VOUCHER_CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("VOUCHER_CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("VOUCHER_CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("VOUCHER_CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("VOUCHER_CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("VOUCHER_CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("VOUCHER_ORDERID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("VOUCHER_ORDERID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("VOUCHER_ORDERID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("VOUCHER_ORDERID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("VOUCHER_ORDERID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("VOUCHER_ORDERID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("VOUCHER_ORDERID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("VOUCHER_ORDERID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("VOUCHER_ORDERID like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("VOUCHER_ORDERID not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("VOUCHER_ORDERID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("VOUCHER_ORDERID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("VOUCHER_ORDERID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("VOUCHER_ORDERID not between", value1, value2, "orderId");
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