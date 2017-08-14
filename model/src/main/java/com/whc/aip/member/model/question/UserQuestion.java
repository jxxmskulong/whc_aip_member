package com.whc.aip.member.model.question;

import com.whc.aip.member.model.base.BaseDO;

public class UserQuestion extends BaseDO{
    private String questId;

    private String type;

    private String comment;

    private String orderId;

    private String tel;

    private String sourceUrl;

    private String browse;

    private String browseMarker;

    private String accessIp;

    private String accessAddr;

    private String accessOs;

    private String netType;

    private String cause;

    private String status;

    private String result;

    private String classify;

    private String persId;

    private String createTime;

    private String updateTime;

    private String memo;

    ///
    private String quest_browse_message;

    public String getQuestId() {
        return questId;
    }

    public void setQuestId(String questId) {
        this.questId = questId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getBrowse() {
        return browse;
    }

    public void setBrowse(String browse) {
        this.browse = browse;
    }

    public String getBrowseMarker() {
        return browseMarker;
    }

    public void setBrowseMarker(String browseMarker) {
        this.browseMarker = browseMarker;
    }

    public String getAccessIp() {
        return accessIp;
    }

    public void setAccessIp(String accessIp) {
        this.accessIp = accessIp;
    }

    public String getAccessAddr() {
        return accessAddr;
    }

    public void setAccessAddr(String accessAddr) {
        this.accessAddr = accessAddr;
    }

    public String getAccessOs() {
        return accessOs;
    }

    public void setAccessOs(String accessOs) {
        this.accessOs = accessOs;
    }

    public String getNetType() {
        return netType;
    }

    public void setNetType(String netType) {
        this.netType = netType;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public String getPersId() {
        return persId;
    }

    public void setPersId(String persId) {
        this.persId = persId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getQuest_browse_message() {
        return quest_browse_message;
    }

    public void setQuest_browse_message(String quest_browse_message) {
        this.quest_browse_message = quest_browse_message;
    }
}