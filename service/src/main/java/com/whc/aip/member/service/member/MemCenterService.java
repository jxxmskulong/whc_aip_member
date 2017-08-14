package com.whc.aip.member.service.member;

import com.wanhuchina.common.exception.CommonException;

import java.util.HashMap;

/**
 * Created by shenshanghua
 * Email shenshanghua@wanhuchina.com
 * Date：2017/6/14
 * Time：0:39
 */
public interface MemCenterService {

    HashMap<String,Object> getMemCenterList(String memberId, String status) throws CommonException;


    HashMap<String,Object> getOrderDetail(String orderId ) throws CommonException;
}
