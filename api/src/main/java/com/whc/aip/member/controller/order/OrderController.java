package com.whc.aip.member.controller.order;

import com.wanhuchina.common.code.CommonCode;
import com.wanhuchina.common.code.TxResultResponse;
import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.member.controller.member.MemberController;
import com.whc.aip.member.model.order.Order;
import com.whc.aip.member.model.order.OrderByStorage;
import com.whc.aip.member.model.order.OrderInfo;
import com.whc.aip.member.model.order.OrderRenew;
import com.whc.aip.member.service.order.OrderService;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by shenshanghua
 * Email shenshanghua@wanhuchina.com
 * Date：2017/6/12
 * Time：13:00
 */
@RequestMapping("/orderManage")
@RestController
public class OrderController {

    public static final org.slf4j.Logger log = LoggerFactory.getLogger(MemberController.class);
    @Resource
    private OrderService orderService;

    /**
     * 扫码关注
     * @param openId
     * @param warehouseId
     * @return
     */
    @RequestMapping(value = "/selBySub" , method = RequestMethod.POST)
    public TxResultResponse selBySub(@RequestParam String openId,@RequestParam String warehouseId){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");

        try {
            HashMap<String, String> data = orderService.selBySub(openId, warehouseId);
            resultResponse.setData(data);
            return resultResponse;
        } catch (CommonException e) {
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e){
            return new TxResultResponse(CommonCode.PARAM_ERROR.getCode(),CommonCode.PARAM_ERROR.getMsg());

        }
    }

    /**
     * 通过memberId查询order
     * @param orderId
     * @return
     */
    @RequestMapping(value = "/getOrderById" ,  method = RequestMethod.POST)
    public TxResultResponse getOrderById(@RequestParam String orderId){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");
        Map<String,Object> data = new HashMap<String,Object>();

        try {
            Order order = orderService.selByOrderId(orderId);
            if(order == null){
                return new TxResultResponse(CommonCode.PARAM_ERROR.getCode(),"参数为空");
            }
            data.put("Order",order);
            resultResponse.setData(data);
            return resultResponse;
        } catch (CommonException e) {
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e){
            return new TxResultResponse(CommonCode.SUCCESS.getCode(),CommonCode.SUCCESS.getMsg());
        }

    }

    /**
     * 添加order并返回OrderId给前端使用
     * @param order
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/insOrder" , method = RequestMethod.POST)
    public TxResultResponse insOrder(@RequestBody Order order){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");
        try{
            Order resultOrder = orderService.insOrderById(order);
            if(resultOrder != null ){
                resultResponse.setData(resultOrder);
                return resultResponse;
            }else{
                return new TxResultResponse(CommonCode.PARAM_ERROR.getCode(),"添加order失败");
            }
        } catch (CommonException e) {
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e) {
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }
    }

    /**
     * 修改order
     * @param order
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updOrder" , method = RequestMethod.POST)
    public TxResultResponse updOrder(@RequestBody Order order){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");
        try{
            int index = orderService.updOrderById(order);
            if(index >= 0 ){

                return resultResponse;
            }else{

                return new TxResultResponse(CommonCode.PARAM_ERROR.getCode(),"修改order失败");
            }
        } catch (CommonException e) {
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e) {
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }
    }

    /**
     * 订单详情 pay2.jsp使用
     * @param orderId
     * @return
     */
    @RequestMapping(value = "/getOrderInfo" , method = RequestMethod.POST)
    public  TxResultResponse getOrderInfo(@RequestParam String orderId){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");
        try {
            OrderInfo orderInfo = orderService.getOrderInfo(orderId);
            resultResponse.setData(orderInfo);
            return resultResponse;
        } catch (CommonException e) {
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e) {
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }
    }


    /**
     * 订单缴费记录添加
     * @param orderRenew
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/insOrderRenew" , method = RequestMethod.POST)
    public  TxResultResponse insOrderRenew(@RequestBody OrderRenew orderRenew){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");
        try{
            int index = orderService.insOrderRenew(orderRenew);
            if(index == 1 ){
                return resultResponse;
            }else{
                return new TxResultResponse(CommonCode.PARAM_ERROR.getCode(),"订单缴费记录添加库失败");
            }
        } catch (CommonException e) {
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e) {
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }
    }

    /**
     * 查看有无订单缴费记录 返回10000是有  100001是无
     * @param accountNumber
     * @return
     */
    @RequestMapping(value = "/selOrdRenewByAccNum" , method = RequestMethod.POST)
    public TxResultResponse selOrderRenewByAccNum(@RequestParam String accountNumber){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");
        try {
            boolean result = orderService.selRenewByAccNum(accountNumber);
            if(result == true){
                return resultResponse;
            }else if(result == false){
                return new TxResultResponse(CommonCode.ERROR.getCode(),"未有订单");
            }else{
                return new TxResultResponse(CommonCode.DATA_NOT_FOUND,"数据为空");
            }
        } catch (CommonException e) {
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e) {
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }

    }


    @RequestMapping(value = "/selOrderRunningWater" , method = RequestMethod.POST)
    public TxResultResponse selOrderWareList(@RequestParam String orderId){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");
        try {
            List<OrderRenew> orderRunningWater = orderService.getOrderRunningWater(orderId);
            resultResponse.setData(orderRunningWater);
            return resultResponse;

        } catch (CommonException e) {
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e) {
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }

    }

    /**
     * 仓的业务，获取仓的状态
     * @param status
     * @return
     */
    @RequestMapping(value = "/getOrderStorageByStatus" , method = RequestMethod.POST)
    public TxResultResponse selOrderStorageByStatus(@RequestParam String status){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");
        try {
            List<OrderByStorage> data = orderService.getOrderStorageByStatus(status);
            if(data != null && data.size()>0){
                //data列表不为空
                resultResponse.setData(data);
                return resultResponse;
            }else if(data!= null && data.size()==0){
                return new TxResultResponse(10001,"列表值为空,判断");
            }else{
                return new TxResultResponse(CommonCode.DATA_NOT_FOUND.getCode(),CommonCode.DATA_NOT_FOUND.getMsg());
            }

        } catch (CommonException e) {
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e) {
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }

    }


}
