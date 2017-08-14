package com.whc.aip.member.service.order;

import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.member.model.order.Order;
import com.whc.aip.member.model.order.OrderByStorage;
import com.whc.aip.member.model.order.OrderInfo;
import com.whc.aip.member.model.order.OrderRenew;

import java.util.HashMap;
import java.util.List;

/**
 * Created by SSH on 2017/6/11.
 */
public interface OrderService {

    HashMap<String,String> selBySub(String openID, String warehouseId) throws CommonException;

    int DelHistoryOrder(String orderId) throws  CommonException;

    Order selByOrderId(String orderId) throws  CommonException;

    Order insOrderById(Order order) throws CommonException;

    int updOrderById(Order order) throws CommonException;

    OrderInfo getOrderInfo(String orderId) throws CommonException;

    /**
     * 订单缴费记录
     */
    int insOrderRenew(OrderRenew orderRenew) throws CommonException;


    boolean selRenewByAccNum(String accountNumber) throws  CommonException;

    List<OrderRenew> getOrderRunningWater(String orderId) throws CommonException;

    /**
     * 仓的业务
     */

    List<OrderByStorage> getOrderStorageByStatus(String status) throws CommonException;
}
