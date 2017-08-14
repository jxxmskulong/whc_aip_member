package com.whc.aip.member.model.order;

import com.whc.aip.member.model.base.BaseDO;

/**
 * Created by shenshanghua
 * Email shenshanghua@wanhuchina.com
 * Date：2017/6/16
 * Time：12:12
 */
public class OrderRenewDetail extends BaseDO {

    private String  orreId;
    private String  orreDate;
    private String  orreMoney;
    private String  accountNummber;

    public String getOrreId() {
        return orreId;
    }

    public void setOrreId(String orreId) {
        this.orreId = orreId;
    }

    public String getOrreDate() {
        return orreDate;
    }

    public void setOrreDate(String orreDate) {
        this.orreDate = orreDate;
    }

    public String getOrreMoney() {
        return orreMoney;
    }

    public void setOrreMoney(String orreMoney) {
        this.orreMoney = orreMoney;
    }

    public String getAccountNummber() {
        return accountNummber;
    }

    public void setAccountNummber(String accountNummber) {
        this.accountNummber = accountNummber;
    }
}
