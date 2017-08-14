package com.whc.aip.member.dao.order;

import com.whc.aip.member.model.order.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderMapper {
    int countByExample(OrderExample example);

    int deleteByExample(OrderExample example);

    int deleteByPrimaryKey(String id);

    int insert(Order record);

    int insertSelective(Order record);

    List<Order> selectByExample(OrderExample example);

    Order selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    /**
     * 自定义接口 扫码进入查询有无订单
     */
    List<Order> selBySub(@Param("openID") String openID ,@Param("warehouseId") String warehouseId);


    List<OrderDetail> selDetailById(@Param("orderId") String orderId);

    /**
     * 获取订单
     */
    List<OrderRenewDetail> getOrderRenew(@Param("orderId") String orderId);

    /**
     * pay2 订单支付
     * @param orderId
     * @return
     */
    OrderInfo getOrderInfo(@Param("orderId") String orderId);

    /**
     * 仓的业务
     */
    List<OrderByStorage> getOrderStorageByStatus(@Param("status") String status);


}