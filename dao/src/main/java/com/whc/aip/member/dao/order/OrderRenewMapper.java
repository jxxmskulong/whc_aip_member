package com.whc.aip.member.dao.order;

import com.whc.aip.member.model.order.OrderRenew;
import com.whc.aip.member.model.order.OrderRenewExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRenewMapper {
    int countByExample(OrderRenewExample example);

    int deleteByExample(OrderRenewExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderRenew record);

    int insertSelective(OrderRenew record);

    List<OrderRenew> selectByExample(OrderRenewExample example);

    OrderRenew selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderRenew record, @Param("example") OrderRenewExample example);

    int updateByExample(@Param("record") OrderRenew record, @Param("example") OrderRenewExample example);

    int updateByPrimaryKeySelective(OrderRenew record);

    int updateByPrimaryKey(OrderRenew record);

    /**
     * 订单的支付流水
     */

    List<OrderRenew> getOrderRenewListForDetail(@Param("orderId") String orderId);
}