package com.whc.aip.member.controller.member;

import com.google.common.base.Strings;
import com.wanhuchina.common.code.CommonCode;
import com.wanhuchina.common.code.TxResultResponse;
import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.member.model.member.Member;
import com.whc.aip.member.model.voucher.Voucher;
import com.whc.aip.member.model.voucher.VoucherCenter;
import com.whc.aip.member.service.member.MemCenterService;
import com.whc.aip.member.service.member.MemberService;
import com.whc.aip.member.service.order.OrderService;
import com.whc.aip.member.service.voucher.VoucherService;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created by shenshanghua
 * Email shenshanghua@wanhuchina.com
 * Date：2017/6/14
 * Time：0:37
 */
@RestController
@RequestMapping("/memberCenter")
public class MemCenterController {
    public static final org.slf4j.Logger log = LoggerFactory.getLogger(MemberController.class);
    @Resource
    private MemCenterService memCenterService;
    @Resource
    private VoucherService voucherService;
    @Resource
    private MemberService memberService;
    @Resource
    private OrderService orderService;

    /**
     * 会员中心订单列表
     * @param memberId
     * @param status
     * @return
     */
    @RequestMapping(value = "/getMemCenterList",method = RequestMethod.GET)
    public TxResultResponse getMemCenterList(@RequestParam String openId ,
                                             @RequestParam String memberId,
                                             @RequestParam String status){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"获取订单列表成功");
        try{
            if(!Strings.isNullOrEmpty(openId)) {//如果opId为空的话 就去查询memberId
                Member member = memberService.selByOpenId(openId);
                memberId =member.getId();
            }
            if(!Strings.isNullOrEmpty(memberId)){
                if (status.equals("1")){
                    status = "0,1";
                }
                if (status.equals("2")){
                    status = "2";
                }
                HashMap<String,Object> data = memCenterService.getMemCenterList(memberId, status);
                resultResponse.setData(data);
            }else {
                return new TxResultResponse(CommonCode.PARAM_ERROR.getCode(),CommonCode.PARAM_ERROR.getMsg());
            }
            return resultResponse;
        } catch (CommonException e) {
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e) {
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }
    }

    /**
     * 获取订单详情
     * @param orderId
     * @return
     */
    @RequestMapping(value = "/getOrderDetail",method = RequestMethod.POST)
    public  TxResultResponse getOrderDetail(@RequestParam String orderId){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"获取订单详情成功");
        try {
            HashMap<String, Object> data = memCenterService.getOrderDetail(orderId);
            resultResponse.setData(data);
            return resultResponse;
        } catch (CommonException e) {
            return new TxResultResponse(e.getCode(),e.getMsg());
        }

    }

    /**
     * 订单中心 优惠券列表
     * @param memberId
     * @param units
     * @param warehouseId
     * @return
     */
    @RequestMapping(value = "/getMemVoucherList" , method = RequestMethod.POST)
    public  TxResultResponse getMemVoucher(@RequestParam String memberId,
                                           @RequestParam String units,
                                           @RequestParam String warehouseId){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"获取优惠券列表成功");

        try {
            HashMap<String, List<VoucherCenter>> data = voucherService.getVoucherList(memberId, units, warehouseId);

            resultResponse.setData(data);
            return resultResponse;
        } catch (CommonException e) {
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e){
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }
    }

    /**
     * 绑定优惠券
     * @param voucherCode
     * @param memberId
     * @param openId
     * @return
     */
    @RequestMapping(value = "/bindVoucher" , method = RequestMethod.POST)
    public  TxResultResponse bindVoucher(@RequestParam String voucherCode,
                                         @RequestParam String memberId,
                                         @RequestParam String openId) throws ParseException {
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"绑定成功");


        try {
            List<Voucher> voucherList = voucherService.checkVoucherByCode(voucherCode);
            Member member = memberService.selByMemberId(memberId);
            if(member==null && openId != null){
                member = memberService.selByOpenId(openId);
            }
            if(voucherList.size()==0){
                return new TxResultResponse(CommonCode.PARAM_ERROR.getCode(),"优惠券码不存在");
            }else if( member==null){
                return new TxResultResponse(CommonCode.PARAM_ERROR.getCode(),"会员不存在");
            }else{
                Voucher voucher = voucherList.get(0);
                //判断超期
                boolean overtime = false;
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
                if ( voucher.getValidTo()!=null && voucher.getValidTo()!="") {
                    Date dateTo = null;
                    if (voucher.getValidTo().length() > 10)

                            dateTo = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(voucher.getValidTo());

                    else

                            dateTo = new SimpleDateFormat("yyyy-MM-dd").parse(voucher.getValidTo());

                    Date nowDate = new Date();// new Date()为获取当前系统时间
                    overtime = dateTo.getTime() < nowDate.getTime();
                }
                    if(overtime){
                        return new TxResultResponse(CommonCode.PARAM_ERROR.getCode(),"优惠券码已过期");
                    }else if(voucher.getMemberId()==null){
                        voucher.setMemberId(member.getId());
                        voucher.setMemberMobile(member.getTel());
                        voucher.setMemberName(member.getName());
                        voucher.setActiveTime(df.format(new Date()));
                        voucher.setStatus("3");
                        int index = voucherService.bindVoucher(voucher);
                        if(index==1){
                            return resultResponse;
                        }else {
                            return new TxResultResponse(CommonCode.PARAM_ERROR.getCode(),"优惠券绑定失败");
                        }

                    }else{
                        return new TxResultResponse(CommonCode.PARAM_ERROR.getCode(),"优惠券已被使用");
                    }
            }
        } catch (CommonException e) {
            return new TxResultResponse(e.getCode(),e.getMsg());
        }  catch (Exception e){
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }


    }



    /**
     * 删除历史订单
     * @param orderId
     * @return
     */
    @RequestMapping(value = "/DelHistoryOrder" , method = RequestMethod.POST)
    public  TxResultResponse DelHistoryOrder(@RequestParam String orderId){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"删除历史订单成功");

        try {
            int index = orderService.DelHistoryOrder(orderId);
            if(index==1){
                return resultResponse;
            }else if(index == 0){
                return new TxResultResponse(CommonCode.PARAM_ERROR.getCode(),"订单SQL删除失败");
            }else{
                return new TxResultResponse(CommonCode.PARAM_ERROR.getCode(),"订单删除失败");
            }
        } catch (CommonException e) {
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e){
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }
    }


}


