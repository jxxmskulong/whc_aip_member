package com.whc.aip.member.model.order;

import com.whc.aip.member.model.base.BaseDO;

/**
 * Created by shenshanghua
 * Email shenshanghua@wanhuchina.com
 * Date：2017/8/7
 * Time：12:14
 */
public class OrderByStorage extends BaseDO{

    private String id;
    private String memberId;
    private String orderId;
    private String payType;
    private String amount;
    private String type;
    private String status;
    private String createDate;
    private String startDate;
    private String endDate;
    private String customerMemo;
    private String customerServiceMemo;
    private String saleMemo;
    private String personId;
    private String circle;
    private String remian;
    private String memo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getCustomerMemo() {
        return customerMemo;
    }

    public void setCustomerMemo(String customerMemo) {
        this.customerMemo = customerMemo;
    }

    public String getCustomerServiceMemo() {
        return customerServiceMemo;
    }

    public void setCustomerServiceMemo(String customerServiceMemo) {
        this.customerServiceMemo = customerServiceMemo;
    }

    public String getSaleMemo() {
        return saleMemo;
    }

    public void setSaleMemo(String saleMemo) {
        this.saleMemo = saleMemo;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getCircle() {
        return circle;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }

    public String getRemian() {
        return remian;
    }

    public void setRemian(String remian) {
        this.remian = remian;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
