package com.whc.aip.member.model.question;

import java.util.ArrayList;
import java.util.List;

public class UserQuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserQuestionExample() {
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

        public Criteria andQuestIdIsNull() {
            addCriterion("QUEST_ID is null");
            return (Criteria) this;
        }

        public Criteria andQuestIdIsNotNull() {
            addCriterion("QUEST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andQuestIdEqualTo(String value) {
            addCriterion("QUEST_ID =", value, "questId");
            return (Criteria) this;
        }

        public Criteria andQuestIdNotEqualTo(String value) {
            addCriterion("QUEST_ID <>", value, "questId");
            return (Criteria) this;
        }

        public Criteria andQuestIdGreaterThan(String value) {
            addCriterion("QUEST_ID >", value, "questId");
            return (Criteria) this;
        }

        public Criteria andQuestIdGreaterThanOrEqualTo(String value) {
            addCriterion("QUEST_ID >=", value, "questId");
            return (Criteria) this;
        }

        public Criteria andQuestIdLessThan(String value) {
            addCriterion("QUEST_ID <", value, "questId");
            return (Criteria) this;
        }

        public Criteria andQuestIdLessThanOrEqualTo(String value) {
            addCriterion("QUEST_ID <=", value, "questId");
            return (Criteria) this;
        }

        public Criteria andQuestIdLike(String value) {
            addCriterion("QUEST_ID like", value, "questId");
            return (Criteria) this;
        }

        public Criteria andQuestIdNotLike(String value) {
            addCriterion("QUEST_ID not like", value, "questId");
            return (Criteria) this;
        }

        public Criteria andQuestIdIn(List<String> values) {
            addCriterion("QUEST_ID in", values, "questId");
            return (Criteria) this;
        }

        public Criteria andQuestIdNotIn(List<String> values) {
            addCriterion("QUEST_ID not in", values, "questId");
            return (Criteria) this;
        }

        public Criteria andQuestIdBetween(String value1, String value2) {
            addCriterion("QUEST_ID between", value1, value2, "questId");
            return (Criteria) this;
        }

        public Criteria andQuestIdNotBetween(String value1, String value2) {
            addCriterion("QUEST_ID not between", value1, value2, "questId");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("QUEST_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("QUEST_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("QUEST_TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("QUEST_TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("QUEST_TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("QUEST_TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("QUEST_TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("QUEST_TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("QUEST_TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("QUEST_TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("QUEST_TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("QUEST_TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("QUEST_TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("QUEST_TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("QUEST_COMMENT is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("QUEST_COMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("QUEST_COMMENT =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("QUEST_COMMENT <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("QUEST_COMMENT >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("QUEST_COMMENT >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("QUEST_COMMENT <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("QUEST_COMMENT <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("QUEST_COMMENT like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("QUEST_COMMENT not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("QUEST_COMMENT in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("QUEST_COMMENT not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("QUEST_COMMENT between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("QUEST_COMMENT not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("QUEST_ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("QUEST_ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("QUEST_ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("QUEST_ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("QUEST_ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("QUEST_ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("QUEST_ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("QUEST_ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("QUEST_ORDER_ID like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("QUEST_ORDER_ID not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("QUEST_ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("QUEST_ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("QUEST_ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("QUEST_ORDER_ID not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("QUEST_TEL is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("QUEST_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("QUEST_TEL =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("QUEST_TEL <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("QUEST_TEL >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("QUEST_TEL >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("QUEST_TEL <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("QUEST_TEL <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("QUEST_TEL like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("QUEST_TEL not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("QUEST_TEL in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("QUEST_TEL not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("QUEST_TEL between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("QUEST_TEL not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andSourceUrlIsNull() {
            addCriterion("QUEST_SOURCE_URL is null");
            return (Criteria) this;
        }

        public Criteria andSourceUrlIsNotNull() {
            addCriterion("QUEST_SOURCE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andSourceUrlEqualTo(String value) {
            addCriterion("QUEST_SOURCE_URL =", value, "sourceUrl");
            return (Criteria) this;
        }

        public Criteria andSourceUrlNotEqualTo(String value) {
            addCriterion("QUEST_SOURCE_URL <>", value, "sourceUrl");
            return (Criteria) this;
        }

        public Criteria andSourceUrlGreaterThan(String value) {
            addCriterion("QUEST_SOURCE_URL >", value, "sourceUrl");
            return (Criteria) this;
        }

        public Criteria andSourceUrlGreaterThanOrEqualTo(String value) {
            addCriterion("QUEST_SOURCE_URL >=", value, "sourceUrl");
            return (Criteria) this;
        }

        public Criteria andSourceUrlLessThan(String value) {
            addCriterion("QUEST_SOURCE_URL <", value, "sourceUrl");
            return (Criteria) this;
        }

        public Criteria andSourceUrlLessThanOrEqualTo(String value) {
            addCriterion("QUEST_SOURCE_URL <=", value, "sourceUrl");
            return (Criteria) this;
        }

        public Criteria andSourceUrlLike(String value) {
            addCriterion("QUEST_SOURCE_URL like", value, "sourceUrl");
            return (Criteria) this;
        }

        public Criteria andSourceUrlNotLike(String value) {
            addCriterion("QUEST_SOURCE_URL not like", value, "sourceUrl");
            return (Criteria) this;
        }

        public Criteria andSourceUrlIn(List<String> values) {
            addCriterion("QUEST_SOURCE_URL in", values, "sourceUrl");
            return (Criteria) this;
        }

        public Criteria andSourceUrlNotIn(List<String> values) {
            addCriterion("QUEST_SOURCE_URL not in", values, "sourceUrl");
            return (Criteria) this;
        }

        public Criteria andSourceUrlBetween(String value1, String value2) {
            addCriterion("QUEST_SOURCE_URL between", value1, value2, "sourceUrl");
            return (Criteria) this;
        }

        public Criteria andSourceUrlNotBetween(String value1, String value2) {
            addCriterion("QUEST_SOURCE_URL not between", value1, value2, "sourceUrl");
            return (Criteria) this;
        }

        public Criteria andBrowseIsNull() {
            addCriterion("QUEST_BROWSE is null");
            return (Criteria) this;
        }

        public Criteria andBrowseIsNotNull() {
            addCriterion("QUEST_BROWSE is not null");
            return (Criteria) this;
        }

        public Criteria andBrowseEqualTo(String value) {
            addCriterion("QUEST_BROWSE =", value, "browse");
            return (Criteria) this;
        }

        public Criteria andBrowseNotEqualTo(String value) {
            addCriterion("QUEST_BROWSE <>", value, "browse");
            return (Criteria) this;
        }

        public Criteria andBrowseGreaterThan(String value) {
            addCriterion("QUEST_BROWSE >", value, "browse");
            return (Criteria) this;
        }

        public Criteria andBrowseGreaterThanOrEqualTo(String value) {
            addCriterion("QUEST_BROWSE >=", value, "browse");
            return (Criteria) this;
        }

        public Criteria andBrowseLessThan(String value) {
            addCriterion("QUEST_BROWSE <", value, "browse");
            return (Criteria) this;
        }

        public Criteria andBrowseLessThanOrEqualTo(String value) {
            addCriterion("QUEST_BROWSE <=", value, "browse");
            return (Criteria) this;
        }

        public Criteria andBrowseLike(String value) {
            addCriterion("QUEST_BROWSE like", value, "browse");
            return (Criteria) this;
        }

        public Criteria andBrowseNotLike(String value) {
            addCriterion("QUEST_BROWSE not like", value, "browse");
            return (Criteria) this;
        }

        public Criteria andBrowseIn(List<String> values) {
            addCriterion("QUEST_BROWSE in", values, "browse");
            return (Criteria) this;
        }

        public Criteria andBrowseNotIn(List<String> values) {
            addCriterion("QUEST_BROWSE not in", values, "browse");
            return (Criteria) this;
        }

        public Criteria andBrowseBetween(String value1, String value2) {
            addCriterion("QUEST_BROWSE between", value1, value2, "browse");
            return (Criteria) this;
        }

        public Criteria andBrowseNotBetween(String value1, String value2) {
            addCriterion("QUEST_BROWSE not between", value1, value2, "browse");
            return (Criteria) this;
        }

        public Criteria andBrowseMarkerIsNull() {
            addCriterion("QUEST_BROWSE_MARKER is null");
            return (Criteria) this;
        }

        public Criteria andBrowseMarkerIsNotNull() {
            addCriterion("QUEST_BROWSE_MARKER is not null");
            return (Criteria) this;
        }

        public Criteria andBrowseMarkerEqualTo(String value) {
            addCriterion("QUEST_BROWSE_MARKER =", value, "browseMarker");
            return (Criteria) this;
        }

        public Criteria andBrowseMarkerNotEqualTo(String value) {
            addCriterion("QUEST_BROWSE_MARKER <>", value, "browseMarker");
            return (Criteria) this;
        }

        public Criteria andBrowseMarkerGreaterThan(String value) {
            addCriterion("QUEST_BROWSE_MARKER >", value, "browseMarker");
            return (Criteria) this;
        }

        public Criteria andBrowseMarkerGreaterThanOrEqualTo(String value) {
            addCriterion("QUEST_BROWSE_MARKER >=", value, "browseMarker");
            return (Criteria) this;
        }

        public Criteria andBrowseMarkerLessThan(String value) {
            addCriterion("QUEST_BROWSE_MARKER <", value, "browseMarker");
            return (Criteria) this;
        }

        public Criteria andBrowseMarkerLessThanOrEqualTo(String value) {
            addCriterion("QUEST_BROWSE_MARKER <=", value, "browseMarker");
            return (Criteria) this;
        }

        public Criteria andBrowseMarkerLike(String value) {
            addCriterion("QUEST_BROWSE_MARKER like", value, "browseMarker");
            return (Criteria) this;
        }

        public Criteria andBrowseMarkerNotLike(String value) {
            addCriterion("QUEST_BROWSE_MARKER not like", value, "browseMarker");
            return (Criteria) this;
        }

        public Criteria andBrowseMarkerIn(List<String> values) {
            addCriterion("QUEST_BROWSE_MARKER in", values, "browseMarker");
            return (Criteria) this;
        }

        public Criteria andBrowseMarkerNotIn(List<String> values) {
            addCriterion("QUEST_BROWSE_MARKER not in", values, "browseMarker");
            return (Criteria) this;
        }

        public Criteria andBrowseMarkerBetween(String value1, String value2) {
            addCriterion("QUEST_BROWSE_MARKER between", value1, value2, "browseMarker");
            return (Criteria) this;
        }

        public Criteria andBrowseMarkerNotBetween(String value1, String value2) {
            addCriterion("QUEST_BROWSE_MARKER not between", value1, value2, "browseMarker");
            return (Criteria) this;
        }

        public Criteria andAccessIpIsNull() {
            addCriterion("QUEST_ACCESS_IP is null");
            return (Criteria) this;
        }

        public Criteria andAccessIpIsNotNull() {
            addCriterion("QUEST_ACCESS_IP is not null");
            return (Criteria) this;
        }

        public Criteria andAccessIpEqualTo(String value) {
            addCriterion("QUEST_ACCESS_IP =", value, "accessIp");
            return (Criteria) this;
        }

        public Criteria andAccessIpNotEqualTo(String value) {
            addCriterion("QUEST_ACCESS_IP <>", value, "accessIp");
            return (Criteria) this;
        }

        public Criteria andAccessIpGreaterThan(String value) {
            addCriterion("QUEST_ACCESS_IP >", value, "accessIp");
            return (Criteria) this;
        }

        public Criteria andAccessIpGreaterThanOrEqualTo(String value) {
            addCriterion("QUEST_ACCESS_IP >=", value, "accessIp");
            return (Criteria) this;
        }

        public Criteria andAccessIpLessThan(String value) {
            addCriterion("QUEST_ACCESS_IP <", value, "accessIp");
            return (Criteria) this;
        }

        public Criteria andAccessIpLessThanOrEqualTo(String value) {
            addCriterion("QUEST_ACCESS_IP <=", value, "accessIp");
            return (Criteria) this;
        }

        public Criteria andAccessIpLike(String value) {
            addCriterion("QUEST_ACCESS_IP like", value, "accessIp");
            return (Criteria) this;
        }

        public Criteria andAccessIpNotLike(String value) {
            addCriterion("QUEST_ACCESS_IP not like", value, "accessIp");
            return (Criteria) this;
        }

        public Criteria andAccessIpIn(List<String> values) {
            addCriterion("QUEST_ACCESS_IP in", values, "accessIp");
            return (Criteria) this;
        }

        public Criteria andAccessIpNotIn(List<String> values) {
            addCriterion("QUEST_ACCESS_IP not in", values, "accessIp");
            return (Criteria) this;
        }

        public Criteria andAccessIpBetween(String value1, String value2) {
            addCriterion("QUEST_ACCESS_IP between", value1, value2, "accessIp");
            return (Criteria) this;
        }

        public Criteria andAccessIpNotBetween(String value1, String value2) {
            addCriterion("QUEST_ACCESS_IP not between", value1, value2, "accessIp");
            return (Criteria) this;
        }

        public Criteria andAccessAddrIsNull() {
            addCriterion("QUEST_ACCESS_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andAccessAddrIsNotNull() {
            addCriterion("QUEST_ACCESS_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andAccessAddrEqualTo(String value) {
            addCriterion("QUEST_ACCESS_ADDR =", value, "accessAddr");
            return (Criteria) this;
        }

        public Criteria andAccessAddrNotEqualTo(String value) {
            addCriterion("QUEST_ACCESS_ADDR <>", value, "accessAddr");
            return (Criteria) this;
        }

        public Criteria andAccessAddrGreaterThan(String value) {
            addCriterion("QUEST_ACCESS_ADDR >", value, "accessAddr");
            return (Criteria) this;
        }

        public Criteria andAccessAddrGreaterThanOrEqualTo(String value) {
            addCriterion("QUEST_ACCESS_ADDR >=", value, "accessAddr");
            return (Criteria) this;
        }

        public Criteria andAccessAddrLessThan(String value) {
            addCriterion("QUEST_ACCESS_ADDR <", value, "accessAddr");
            return (Criteria) this;
        }

        public Criteria andAccessAddrLessThanOrEqualTo(String value) {
            addCriterion("QUEST_ACCESS_ADDR <=", value, "accessAddr");
            return (Criteria) this;
        }

        public Criteria andAccessAddrLike(String value) {
            addCriterion("QUEST_ACCESS_ADDR like", value, "accessAddr");
            return (Criteria) this;
        }

        public Criteria andAccessAddrNotLike(String value) {
            addCriterion("QUEST_ACCESS_ADDR not like", value, "accessAddr");
            return (Criteria) this;
        }

        public Criteria andAccessAddrIn(List<String> values) {
            addCriterion("QUEST_ACCESS_ADDR in", values, "accessAddr");
            return (Criteria) this;
        }

        public Criteria andAccessAddrNotIn(List<String> values) {
            addCriterion("QUEST_ACCESS_ADDR not in", values, "accessAddr");
            return (Criteria) this;
        }

        public Criteria andAccessAddrBetween(String value1, String value2) {
            addCriterion("QUEST_ACCESS_ADDR between", value1, value2, "accessAddr");
            return (Criteria) this;
        }

        public Criteria andAccessAddrNotBetween(String value1, String value2) {
            addCriterion("QUEST_ACCESS_ADDR not between", value1, value2, "accessAddr");
            return (Criteria) this;
        }

        public Criteria andAccessOsIsNull() {
            addCriterion("QUEST_ACCESS_OS is null");
            return (Criteria) this;
        }

        public Criteria andAccessOsIsNotNull() {
            addCriterion("QUEST_ACCESS_OS is not null");
            return (Criteria) this;
        }

        public Criteria andAccessOsEqualTo(String value) {
            addCriterion("QUEST_ACCESS_OS =", value, "accessOs");
            return (Criteria) this;
        }

        public Criteria andAccessOsNotEqualTo(String value) {
            addCriterion("QUEST_ACCESS_OS <>", value, "accessOs");
            return (Criteria) this;
        }

        public Criteria andAccessOsGreaterThan(String value) {
            addCriterion("QUEST_ACCESS_OS >", value, "accessOs");
            return (Criteria) this;
        }

        public Criteria andAccessOsGreaterThanOrEqualTo(String value) {
            addCriterion("QUEST_ACCESS_OS >=", value, "accessOs");
            return (Criteria) this;
        }

        public Criteria andAccessOsLessThan(String value) {
            addCriterion("QUEST_ACCESS_OS <", value, "accessOs");
            return (Criteria) this;
        }

        public Criteria andAccessOsLessThanOrEqualTo(String value) {
            addCriterion("QUEST_ACCESS_OS <=", value, "accessOs");
            return (Criteria) this;
        }

        public Criteria andAccessOsLike(String value) {
            addCriterion("QUEST_ACCESS_OS like", value, "accessOs");
            return (Criteria) this;
        }

        public Criteria andAccessOsNotLike(String value) {
            addCriterion("QUEST_ACCESS_OS not like", value, "accessOs");
            return (Criteria) this;
        }

        public Criteria andAccessOsIn(List<String> values) {
            addCriterion("QUEST_ACCESS_OS in", values, "accessOs");
            return (Criteria) this;
        }

        public Criteria andAccessOsNotIn(List<String> values) {
            addCriterion("QUEST_ACCESS_OS not in", values, "accessOs");
            return (Criteria) this;
        }

        public Criteria andAccessOsBetween(String value1, String value2) {
            addCriterion("QUEST_ACCESS_OS between", value1, value2, "accessOs");
            return (Criteria) this;
        }

        public Criteria andAccessOsNotBetween(String value1, String value2) {
            addCriterion("QUEST_ACCESS_OS not between", value1, value2, "accessOs");
            return (Criteria) this;
        }

        public Criteria andNetTypeIsNull() {
            addCriterion("QUEST_NET_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andNetTypeIsNotNull() {
            addCriterion("QUEST_NET_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNetTypeEqualTo(String value) {
            addCriterion("QUEST_NET_TYPE =", value, "netType");
            return (Criteria) this;
        }

        public Criteria andNetTypeNotEqualTo(String value) {
            addCriterion("QUEST_NET_TYPE <>", value, "netType");
            return (Criteria) this;
        }

        public Criteria andNetTypeGreaterThan(String value) {
            addCriterion("QUEST_NET_TYPE >", value, "netType");
            return (Criteria) this;
        }

        public Criteria andNetTypeGreaterThanOrEqualTo(String value) {
            addCriterion("QUEST_NET_TYPE >=", value, "netType");
            return (Criteria) this;
        }

        public Criteria andNetTypeLessThan(String value) {
            addCriterion("QUEST_NET_TYPE <", value, "netType");
            return (Criteria) this;
        }

        public Criteria andNetTypeLessThanOrEqualTo(String value) {
            addCriterion("QUEST_NET_TYPE <=", value, "netType");
            return (Criteria) this;
        }

        public Criteria andNetTypeLike(String value) {
            addCriterion("QUEST_NET_TYPE like", value, "netType");
            return (Criteria) this;
        }

        public Criteria andNetTypeNotLike(String value) {
            addCriterion("QUEST_NET_TYPE not like", value, "netType");
            return (Criteria) this;
        }

        public Criteria andNetTypeIn(List<String> values) {
            addCriterion("QUEST_NET_TYPE in", values, "netType");
            return (Criteria) this;
        }

        public Criteria andNetTypeNotIn(List<String> values) {
            addCriterion("QUEST_NET_TYPE not in", values, "netType");
            return (Criteria) this;
        }

        public Criteria andNetTypeBetween(String value1, String value2) {
            addCriterion("QUEST_NET_TYPE between", value1, value2, "netType");
            return (Criteria) this;
        }

        public Criteria andNetTypeNotBetween(String value1, String value2) {
            addCriterion("QUEST_NET_TYPE not between", value1, value2, "netType");
            return (Criteria) this;
        }

        public Criteria andCauseIsNull() {
            addCriterion("QUEST_CAUSE is null");
            return (Criteria) this;
        }

        public Criteria andCauseIsNotNull() {
            addCriterion("QUEST_CAUSE is not null");
            return (Criteria) this;
        }

        public Criteria andCauseEqualTo(String value) {
            addCriterion("QUEST_CAUSE =", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotEqualTo(String value) {
            addCriterion("QUEST_CAUSE <>", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseGreaterThan(String value) {
            addCriterion("QUEST_CAUSE >", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseGreaterThanOrEqualTo(String value) {
            addCriterion("QUEST_CAUSE >=", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLessThan(String value) {
            addCriterion("QUEST_CAUSE <", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLessThanOrEqualTo(String value) {
            addCriterion("QUEST_CAUSE <=", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLike(String value) {
            addCriterion("QUEST_CAUSE like", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotLike(String value) {
            addCriterion("QUEST_CAUSE not like", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseIn(List<String> values) {
            addCriterion("QUEST_CAUSE in", values, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotIn(List<String> values) {
            addCriterion("QUEST_CAUSE not in", values, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseBetween(String value1, String value2) {
            addCriterion("QUEST_CAUSE between", value1, value2, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotBetween(String value1, String value2) {
            addCriterion("QUEST_CAUSE not between", value1, value2, "cause");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("QUEST_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("QUEST_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("QUEST_STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("QUEST_STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("QUEST_STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("QUEST_STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("QUEST_STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("QUEST_STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("QUEST_STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("QUEST_STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("QUEST_STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("QUEST_STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("QUEST_STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("QUEST_STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("QUEST_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("QUEST_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(String value) {
            addCriterion("QUEST_RESULT =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("QUEST_RESULT <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("QUEST_RESULT >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("QUEST_RESULT >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("QUEST_RESULT <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("QUEST_RESULT <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("QUEST_RESULT like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("QUEST_RESULT not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("QUEST_RESULT in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("QUEST_RESULT not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("QUEST_RESULT between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("QUEST_RESULT not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andClassifyIsNull() {
            addCriterion("QUEST_CLASSIFY is null");
            return (Criteria) this;
        }

        public Criteria andClassifyIsNotNull() {
            addCriterion("QUEST_CLASSIFY is not null");
            return (Criteria) this;
        }

        public Criteria andClassifyEqualTo(String value) {
            addCriterion("QUEST_CLASSIFY =", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyNotEqualTo(String value) {
            addCriterion("QUEST_CLASSIFY <>", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyGreaterThan(String value) {
            addCriterion("QUEST_CLASSIFY >", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyGreaterThanOrEqualTo(String value) {
            addCriterion("QUEST_CLASSIFY >=", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyLessThan(String value) {
            addCriterion("QUEST_CLASSIFY <", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyLessThanOrEqualTo(String value) {
            addCriterion("QUEST_CLASSIFY <=", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyLike(String value) {
            addCriterion("QUEST_CLASSIFY like", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyNotLike(String value) {
            addCriterion("QUEST_CLASSIFY not like", value, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyIn(List<String> values) {
            addCriterion("QUEST_CLASSIFY in", values, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyNotIn(List<String> values) {
            addCriterion("QUEST_CLASSIFY not in", values, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyBetween(String value1, String value2) {
            addCriterion("QUEST_CLASSIFY between", value1, value2, "classify");
            return (Criteria) this;
        }

        public Criteria andClassifyNotBetween(String value1, String value2) {
            addCriterion("QUEST_CLASSIFY not between", value1, value2, "classify");
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("CREATE_TIME like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("CREATE_TIME not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(String value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(String value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(String value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(String value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLike(String value) {
            addCriterion("UPDATE_TIME like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotLike(String value) {
            addCriterion("UPDATE_TIME not like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<String> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<String> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(String value1, String value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("QUEST_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("QUEST_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("QUEST_MEMO =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("QUEST_MEMO <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("QUEST_MEMO >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("QUEST_MEMO >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("QUEST_MEMO <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("QUEST_MEMO <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("QUEST_MEMO like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("QUEST_MEMO not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("QUEST_MEMO in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("QUEST_MEMO not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("QUEST_MEMO between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("QUEST_MEMO not between", value1, value2, "memo");
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