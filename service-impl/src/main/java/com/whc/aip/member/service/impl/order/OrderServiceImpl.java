package com.whc.aip.member.service.impl.order;

import com.google.common.base.Strings;
import com.wanhuchina.common.code.CommonCode;
import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.member.dao.order.OrderMapper;
import com.whc.aip.member.dao.order.OrderRenewMapper;
import com.whc.aip.member.model.order.*;
import com.whc.aip.member.service.order.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/6/12.
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;
    @Resource
    private OrderRenewMapper orderRenewMapper;

    @Override
    public HashMap<String,String> selBySub(String openID, String warehouseId) throws CommonException{
        HashMap<String,String> data = new HashMap<String,String>();
        try {
            List<Order> orderList = orderMapper.selBySub(openID, warehouseId);
            int index = orderList.size();
            if(index==0){
                data.put("isOrder","false");
            }else{
                data.put("isOrder","true");
            }
            return data;
        } catch (CommonException e) {
            throw new CommonException(CommonCode.SERVER_ERROR.getCode(),CommonCode.SERVER_ERROR.getMsg());
        }

    }


    /**
     * 历史订单删除
     * @param orderId
     * @return
     */
    @Override
    public int DelHistoryOrder(String orderId) {

        try {
            Order order = new Order();
            order.setIsDisplay("1");
            order.setId(orderId);
            int index = orderMapper.updateByPrimaryKeySelective(order);
            return index;
        } catch (CommonException e) {
            throw new CommonException(CommonCode.SQL_UPD_ERROR.getCode(),CommonCode.SQL_UPD_ERROR.getMsg());
        }
    }

    /**
     * 通过PK查orderId
     * @param orderId
     * @return
     * @throws CommonException
     */
    @Override
    public Order selByOrderId(String orderId) throws CommonException {

        try {
            Order order = orderMapper.selectByPrimaryKey(orderId);
            return order;
        } catch (Exception e) {
            throw new CommonException(CommonCode.SQL_UPD_ERROR.getCode(),CommonCode.SQL_UPD_ERROR.getMsg());
        }
    }

    /**
     * 添加Order
     * @param order
     * @return
     * @throws CommonException
     */
    @Override
    public Order insOrderById(Order order) throws CommonException {
        Order resultOrder = new Order();
        resultOrder = order;
        try {
            if(order != null ){
                int index = orderMapper.insertSelective(resultOrder);
                if(index == 1){
                    return resultOrder;
                }else{
                    throw  new CommonException(CommonCode.DATA_NOT_FOUND.getCode(),"入参order为空");
                }
            }else{
                throw  new CommonException(CommonCode.DATA_NOT_FOUND.getCode(),"入参order为空");
            }
        } catch (CommonException e) {
            throw new CommonException(CommonCode.SQL_UPD_ERROR.getCode(),CommonCode.SQL_UPD_ERROR.getMsg());
        }

    }


    /**
     * 修改Order
     * @param order
     * @return
     * @throws CommonException
     */
    @Override
    public int updOrderById(Order order) throws CommonException {
        try {
            if(order != null ){
                int index = orderMapper.updateByPrimaryKeySelective(order);
                return index;
            }else{
                throw  new CommonException(CommonCode.DATA_NOT_FOUND.getCode(),"入参order为空");
            }
        } catch (CommonException e) {
            throw new CommonException(CommonCode.SQL_UPD_ERROR.getCode(),CommonCode.SQL_UPD_ERROR.getMsg());
        }
    }

    /**
     * pay2.jsp 查询价格时使用
     * @param orderId
     * @return
     * @throws CommonException
     */
    @Override
    public OrderInfo getOrderInfo(String orderId) throws CommonException {

        try {
            if(!Strings.isNullOrEmpty(orderId)){

                OrderInfo orderInfo = orderMapper.getOrderInfo(orderId);
                if(orderInfo != null){

                    return orderInfo;
                }else{
                    throw  new CommonException(CommonCode.DATA_NOT_FOUND.getCode(),"反馈参数为空");
                }
            }else{
                throw  new CommonException(CommonCode.PARAM_ERROR.getCode(),"入参为空");
            }
        } catch (CommonException e) {
            throw new CommonException(CommonCode.SQL_UPD_ERROR.getCode(),CommonCode.SQL_UPD_ERROR.getMsg());
        }


    }

    /**
     * 订单缴费记录
     * @param orderRenew
     * @return
     * @throws CommonException
     */
    @Override
    public int insOrderRenew(OrderRenew orderRenew) throws CommonException {


        try {
            if(orderRenew != null){

                int index = orderRenewMapper.insertSelective(orderRenew);
                return  index;
            }else{
                throw new CommonException(CommonCode.PARAM_ERROR.getCode(),"入参orderRenew为空");
            }

        } catch (CommonException e) {
            throw new CommonException(CommonCode.SQL_UPD_ERROR.getCode(),CommonCode.SQL_UPD_ERROR.getMsg());
        }
    }

    @Override
    public boolean selRenewByAccNum(String accountNumber) throws CommonException {
        try {
            if(!Strings.isNullOrEmpty(accountNumber)){

                OrderRenewExample example = new OrderRenewExample();
                OrderRenewExample.Criteria criteria = example.createCriteria();
                criteria.andAccountNumberEqualTo(accountNumber);
                List<OrderRenew> orderRenews = orderRenewMapper.selectByExample(example);
                if(orderRenews.size() > 0){
                    return  true;
                }else{
                    return false;
                }
            }else{
                throw new CommonException(CommonCode.PARAM_ERROR.getCode(),"入参accountNumber为空");
            }
        } catch (CommonException e) {
            throw new CommonException(CommonCode.SQL_UPD_ERROR.getCode(),CommonCode.SQL_UPD_ERROR.getMsg());
        }

    }

    /**
     * 支付订单流水
     * @param orderId
     * @return
     * @throws CommonException
     */
    @Override
    public List<OrderRenew> getOrderRunningWater(String orderId) throws CommonException {

        try {
            if(!Strings.isNullOrEmpty(orderId)){

                List<OrderRenew> WareList = orderRenewMapper.getOrderRenewListForDetail(orderId);
                return WareList;
            }else{
                throw new CommonException(CommonCode.PARAM_ERROR.getCode(),"入参orderId为空");
            }
        } catch (CommonException e) {
            throw new CommonException(CommonCode.SQL_UPD_ERROR.getCode(),CommonCode.SQL_SELECT_ERROR.getMsg());
        }
    }

    /**
     * 获取仓的订单列表
     * @param status
     * @return
     * @throws CommonException
     */
    @Override
    public List<OrderByStorage> getOrderStorageByStatus(String status) throws CommonException {
        try {
            if(!Strings.isNullOrEmpty(status)){

                List<OrderByStorage> orderStorageByStatus = orderMapper.getOrderStorageByStatus(status);
                return orderStorageByStatus;
            }else{
                throw new CommonException(CommonCode.PARAM_ERROR.getCode(),"入参status为空");
            }
        } catch (CommonException e) {
            throw new CommonException(CommonCode.SQL_UPD_ERROR.getCode(),CommonCode.SQL_SELECT_ERROR.getMsg());
        }
    }
}
