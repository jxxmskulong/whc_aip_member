package com.whc.aip.member.model.member;

import com.whc.aip.member.model.base.BaseDO;

public class WeiSupperMan extends BaseDO{
    private String sumaId;

    private String memberId;

    public String getSumaId() {
        return sumaId;
    }

    public void setSumaId(String sumaId) {
        this.sumaId = sumaId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
}