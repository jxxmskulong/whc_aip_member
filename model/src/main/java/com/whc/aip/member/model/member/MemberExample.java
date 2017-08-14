package com.whc.aip.member.model.member;

import java.util.ArrayList;
import java.util.List;

public class MemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberExample() {
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
            addCriterion("MEMBER_ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("MEMBER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("MEMBER_ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("MEMBER_ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("MEMBER_ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("MEMBER_ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("MEMBER_ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("MEMBER_ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("MEMBER_ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("MEMBER_ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("MEMBER_ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("MEMBER_ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("MEMBER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("MEMBER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("MEMBER_NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("MEMBER_NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("MEMBER_NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("MEMBER_NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("MEMBER_NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("MEMBER_NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("MEMBER_NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("MEMBER_NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("MEMBER_NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("MEMBER_NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("MEMBER_PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("MEMBER_PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(String value) {
            addCriterion("MEMBER_PHOTO =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(String value) {
            addCriterion("MEMBER_PHOTO <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(String value) {
            addCriterion("MEMBER_PHOTO >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_PHOTO >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(String value) {
            addCriterion("MEMBER_PHOTO <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_PHOTO <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLike(String value) {
            addCriterion("MEMBER_PHOTO like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotLike(String value) {
            addCriterion("MEMBER_PHOTO not like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<String> values) {
            addCriterion("MEMBER_PHOTO in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<String> values) {
            addCriterion("MEMBER_PHOTO not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(String value1, String value2) {
            addCriterion("MEMBER_PHOTO between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(String value1, String value2) {
            addCriterion("MEMBER_PHOTO not between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("MEMBER_NICKNAME is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("MEMBER_NICKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("MEMBER_NICKNAME =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("MEMBER_NICKNAME <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("MEMBER_NICKNAME >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_NICKNAME >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("MEMBER_NICKNAME <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_NICKNAME <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("MEMBER_NICKNAME like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("MEMBER_NICKNAME not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("MEMBER_NICKNAME in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("MEMBER_NICKNAME not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("MEMBER_NICKNAME between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("MEMBER_NICKNAME not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andAddrIsNull() {
            addCriterion("MEMBER_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andAddrIsNotNull() {
            addCriterion("MEMBER_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andAddrEqualTo(String value) {
            addCriterion("MEMBER_ADDR =", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotEqualTo(String value) {
            addCriterion("MEMBER_ADDR <>", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThan(String value) {
            addCriterion("MEMBER_ADDR >", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_ADDR >=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThan(String value) {
            addCriterion("MEMBER_ADDR <", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_ADDR <=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLike(String value) {
            addCriterion("MEMBER_ADDR like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotLike(String value) {
            addCriterion("MEMBER_ADDR not like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrIn(List<String> values) {
            addCriterion("MEMBER_ADDR in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotIn(List<String> values) {
            addCriterion("MEMBER_ADDR not in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrBetween(String value1, String value2) {
            addCriterion("MEMBER_ADDR between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotBetween(String value1, String value2) {
            addCriterion("MEMBER_ADDR not between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("MEMBER_TEL is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("MEMBER_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("MEMBER_TEL =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("MEMBER_TEL <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("MEMBER_TEL >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_TEL >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("MEMBER_TEL <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_TEL <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("MEMBER_TEL like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("MEMBER_TEL not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("MEMBER_TEL in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("MEMBER_TEL not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("MEMBER_TEL between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("MEMBER_TEL not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("MEMBER_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("MEMBER_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("MEMBER_EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("MEMBER_EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("MEMBER_EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("MEMBER_EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("MEMBER_EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("MEMBER_EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("MEMBER_EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("MEMBER_EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("MEMBER_EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("MEMBER_EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andRegDateIsNull() {
            addCriterion("MEMBER_REGDATE is null");
            return (Criteria) this;
        }

        public Criteria andRegDateIsNotNull() {
            addCriterion("MEMBER_REGDATE is not null");
            return (Criteria) this;
        }

        public Criteria andRegDateEqualTo(String value) {
            addCriterion("MEMBER_REGDATE =", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotEqualTo(String value) {
            addCriterion("MEMBER_REGDATE <>", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateGreaterThan(String value) {
            addCriterion("MEMBER_REGDATE >", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_REGDATE >=", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateLessThan(String value) {
            addCriterion("MEMBER_REGDATE <", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_REGDATE <=", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateLike(String value) {
            addCriterion("MEMBER_REGDATE like", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotLike(String value) {
            addCriterion("MEMBER_REGDATE not like", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateIn(List<String> values) {
            addCriterion("MEMBER_REGDATE in", values, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotIn(List<String> values) {
            addCriterion("MEMBER_REGDATE not in", values, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateBetween(String value1, String value2) {
            addCriterion("MEMBER_REGDATE between", value1, value2, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotBetween(String value1, String value2) {
            addCriterion("MEMBER_REGDATE not between", value1, value2, "regDate");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("MEMBER_ISDEL is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("MEMBER_ISDEL is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(String value) {
            addCriterion("MEMBER_ISDEL =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(String value) {
            addCriterion("MEMBER_ISDEL <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(String value) {
            addCriterion("MEMBER_ISDEL >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_ISDEL >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(String value) {
            addCriterion("MEMBER_ISDEL <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_ISDEL <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLike(String value) {
            addCriterion("MEMBER_ISDEL like", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotLike(String value) {
            addCriterion("MEMBER_ISDEL not like", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<String> values) {
            addCriterion("MEMBER_ISDEL in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<String> values) {
            addCriterion("MEMBER_ISDEL not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(String value1, String value2) {
            addCriterion("MEMBER_ISDEL between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(String value1, String value2) {
            addCriterion("MEMBER_ISDEL not between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("MEMBER_SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("MEMBER_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("MEMBER_SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("MEMBER_SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("MEMBER_SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("MEMBER_SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("MEMBER_SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("MEMBER_SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("MEMBER_SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("MEMBER_SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("MEMBER_SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("MEMBER_SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("MEMBER_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("MEMBER_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("MEMBER_MEMO =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("MEMBER_MEMO <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("MEMBER_MEMO >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_MEMO >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("MEMBER_MEMO <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_MEMO <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("MEMBER_MEMO like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("MEMBER_MEMO not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("MEMBER_MEMO in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("MEMBER_MEMO not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("MEMBER_MEMO between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("MEMBER_MEMO not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNull() {
            addCriterion("OPEN_ID is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("OPEN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("OPEN_ID =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("OPEN_ID <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("OPEN_ID >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("OPEN_ID >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("OPEN_ID <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("OPEN_ID <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("OPEN_ID like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("OPEN_ID not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("OPEN_ID in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("OPEN_ID not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("OPEN_ID between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("OPEN_ID not between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andWeigateStatusIsNull() {
            addCriterion("MEMBER_WEIGATE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andWeigateStatusIsNotNull() {
            addCriterion("MEMBER_WEIGATE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andWeigateStatusEqualTo(String value) {
            addCriterion("MEMBER_WEIGATE_STATUS =", value, "weigateStatus");
            return (Criteria) this;
        }

        public Criteria andWeigateStatusNotEqualTo(String value) {
            addCriterion("MEMBER_WEIGATE_STATUS <>", value, "weigateStatus");
            return (Criteria) this;
        }

        public Criteria andWeigateStatusGreaterThan(String value) {
            addCriterion("MEMBER_WEIGATE_STATUS >", value, "weigateStatus");
            return (Criteria) this;
        }

        public Criteria andWeigateStatusGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_WEIGATE_STATUS >=", value, "weigateStatus");
            return (Criteria) this;
        }

        public Criteria andWeigateStatusLessThan(String value) {
            addCriterion("MEMBER_WEIGATE_STATUS <", value, "weigateStatus");
            return (Criteria) this;
        }

        public Criteria andWeigateStatusLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_WEIGATE_STATUS <=", value, "weigateStatus");
            return (Criteria) this;
        }

        public Criteria andWeigateStatusLike(String value) {
            addCriterion("MEMBER_WEIGATE_STATUS like", value, "weigateStatus");
            return (Criteria) this;
        }

        public Criteria andWeigateStatusNotLike(String value) {
            addCriterion("MEMBER_WEIGATE_STATUS not like", value, "weigateStatus");
            return (Criteria) this;
        }

        public Criteria andWeigateStatusIn(List<String> values) {
            addCriterion("MEMBER_WEIGATE_STATUS in", values, "weigateStatus");
            return (Criteria) this;
        }

        public Criteria andWeigateStatusNotIn(List<String> values) {
            addCriterion("MEMBER_WEIGATE_STATUS not in", values, "weigateStatus");
            return (Criteria) this;
        }

        public Criteria andWeigateStatusBetween(String value1, String value2) {
            addCriterion("MEMBER_WEIGATE_STATUS between", value1, value2, "weigateStatus");
            return (Criteria) this;
        }

        public Criteria andWeigateStatusNotBetween(String value1, String value2) {
            addCriterion("MEMBER_WEIGATE_STATUS not between", value1, value2, "weigateStatus");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("MEMBER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("MEMBER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("MEMBER_STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("MEMBER_STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("MEMBER_STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("MEMBER_STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("MEMBER_STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("MEMBER_STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("MEMBER_STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("MEMBER_STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("MEMBER_STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("MEMBER_STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("MEMBER_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("MEMBER_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("MEMBER_SOURCE =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("MEMBER_SOURCE <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("MEMBER_SOURCE >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_SOURCE >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("MEMBER_SOURCE <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_SOURCE <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("MEMBER_SOURCE like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("MEMBER_SOURCE not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("MEMBER_SOURCE in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("MEMBER_SOURCE not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("MEMBER_SOURCE between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("MEMBER_SOURCE not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andIsSubIsNull() {
            addCriterion("MEMBER_IS_SUB is null");
            return (Criteria) this;
        }

        public Criteria andIsSubIsNotNull() {
            addCriterion("MEMBER_IS_SUB is not null");
            return (Criteria) this;
        }

        public Criteria andIsSubEqualTo(String value) {
            addCriterion("MEMBER_IS_SUB =", value, "isSub");
            return (Criteria) this;
        }

        public Criteria andIsSubNotEqualTo(String value) {
            addCriterion("MEMBER_IS_SUB <>", value, "isSub");
            return (Criteria) this;
        }

        public Criteria andIsSubGreaterThan(String value) {
            addCriterion("MEMBER_IS_SUB >", value, "isSub");
            return (Criteria) this;
        }

        public Criteria andIsSubGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_IS_SUB >=", value, "isSub");
            return (Criteria) this;
        }

        public Criteria andIsSubLessThan(String value) {
            addCriterion("MEMBER_IS_SUB <", value, "isSub");
            return (Criteria) this;
        }

        public Criteria andIsSubLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_IS_SUB <=", value, "isSub");
            return (Criteria) this;
        }

        public Criteria andIsSubLike(String value) {
            addCriterion("MEMBER_IS_SUB like", value, "isSub");
            return (Criteria) this;
        }

        public Criteria andIsSubNotLike(String value) {
            addCriterion("MEMBER_IS_SUB not like", value, "isSub");
            return (Criteria) this;
        }

        public Criteria andIsSubIn(List<String> values) {
            addCriterion("MEMBER_IS_SUB in", values, "isSub");
            return (Criteria) this;
        }

        public Criteria andIsSubNotIn(List<String> values) {
            addCriterion("MEMBER_IS_SUB not in", values, "isSub");
            return (Criteria) this;
        }

        public Criteria andIsSubBetween(String value1, String value2) {
            addCriterion("MEMBER_IS_SUB between", value1, value2, "isSub");
            return (Criteria) this;
        }

        public Criteria andIsSubNotBetween(String value1, String value2) {
            addCriterion("MEMBER_IS_SUB not between", value1, value2, "isSub");
            return (Criteria) this;
        }

        public Criteria andCertTypeIsNull() {
            addCriterion("MEMBER_CERT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCertTypeIsNotNull() {
            addCriterion("MEMBER_CERT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCertTypeEqualTo(String value) {
            addCriterion("MEMBER_CERT_TYPE =", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotEqualTo(String value) {
            addCriterion("MEMBER_CERT_TYPE <>", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeGreaterThan(String value) {
            addCriterion("MEMBER_CERT_TYPE >", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_CERT_TYPE >=", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLessThan(String value) {
            addCriterion("MEMBER_CERT_TYPE <", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_CERT_TYPE <=", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLike(String value) {
            addCriterion("MEMBER_CERT_TYPE like", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotLike(String value) {
            addCriterion("MEMBER_CERT_TYPE not like", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeIn(List<String> values) {
            addCriterion("MEMBER_CERT_TYPE in", values, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotIn(List<String> values) {
            addCriterion("MEMBER_CERT_TYPE not in", values, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeBetween(String value1, String value2) {
            addCriterion("MEMBER_CERT_TYPE between", value1, value2, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotBetween(String value1, String value2) {
            addCriterion("MEMBER_CERT_TYPE not between", value1, value2, "certType");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNull() {
            addCriterion("MEMBER_ID_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNotNull() {
            addCriterion("MEMBER_ID_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andIdNumberEqualTo(String value) {
            addCriterion("MEMBER_ID_NUMBER =", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotEqualTo(String value) {
            addCriterion("MEMBER_ID_NUMBER <>", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThan(String value) {
            addCriterion("MEMBER_ID_NUMBER >", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_ID_NUMBER >=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThan(String value) {
            addCriterion("MEMBER_ID_NUMBER <", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_ID_NUMBER <=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLike(String value) {
            addCriterion("MEMBER_ID_NUMBER like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotLike(String value) {
            addCriterion("MEMBER_ID_NUMBER not like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberIn(List<String> values) {
            addCriterion("MEMBER_ID_NUMBER in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotIn(List<String> values) {
            addCriterion("MEMBER_ID_NUMBER not in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberBetween(String value1, String value2) {
            addCriterion("MEMBER_ID_NUMBER between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotBetween(String value1, String value2) {
            addCriterion("MEMBER_ID_NUMBER not between", value1, value2, "idNumber");
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

        public Criteria andAgainTimeIsNull() {
            addCriterion("MEMBER_AGAIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAgainTimeIsNotNull() {
            addCriterion("MEMBER_AGAIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAgainTimeEqualTo(String value) {
            addCriterion("MEMBER_AGAIN_TIME =", value, "againTime");
            return (Criteria) this;
        }

        public Criteria andAgainTimeNotEqualTo(String value) {
            addCriterion("MEMBER_AGAIN_TIME <>", value, "againTime");
            return (Criteria) this;
        }

        public Criteria andAgainTimeGreaterThan(String value) {
            addCriterion("MEMBER_AGAIN_TIME >", value, "againTime");
            return (Criteria) this;
        }

        public Criteria andAgainTimeGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_AGAIN_TIME >=", value, "againTime");
            return (Criteria) this;
        }

        public Criteria andAgainTimeLessThan(String value) {
            addCriterion("MEMBER_AGAIN_TIME <", value, "againTime");
            return (Criteria) this;
        }

        public Criteria andAgainTimeLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_AGAIN_TIME <=", value, "againTime");
            return (Criteria) this;
        }

        public Criteria andAgainTimeLike(String value) {
            addCriterion("MEMBER_AGAIN_TIME like", value, "againTime");
            return (Criteria) this;
        }

        public Criteria andAgainTimeNotLike(String value) {
            addCriterion("MEMBER_AGAIN_TIME not like", value, "againTime");
            return (Criteria) this;
        }

        public Criteria andAgainTimeIn(List<String> values) {
            addCriterion("MEMBER_AGAIN_TIME in", values, "againTime");
            return (Criteria) this;
        }

        public Criteria andAgainTimeNotIn(List<String> values) {
            addCriterion("MEMBER_AGAIN_TIME not in", values, "againTime");
            return (Criteria) this;
        }

        public Criteria andAgainTimeBetween(String value1, String value2) {
            addCriterion("MEMBER_AGAIN_TIME between", value1, value2, "againTime");
            return (Criteria) this;
        }

        public Criteria andAgainTimeNotBetween(String value1, String value2) {
            addCriterion("MEMBER_AGAIN_TIME not between", value1, value2, "againTime");
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