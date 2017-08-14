package com.whc.aip.member.controller.voucher;

import com.wanhuchina.common.code.CommonCode;
import com.wanhuchina.common.code.TxResultResponse;
import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.member.controller.member.MemberController;
import com.whc.aip.member.model.voucher.Voucher;
import com.whc.aip.member.service.voucher.VoucherService;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by shenshanghua
 * Email shenshanghua@wanhuchina.com
 * Date：2017/7/3
 * Time：11:47
 */
@RestController
    @RequestMapping(value = "/voucherManage")
public class VoucherController {

    public static final org.slf4j.Logger log = LoggerFactory.getLogger(MemberController.class);
    @Resource
    private VoucherService voucherService;

    /**
     * 通过voucherId查询优惠券
     * @param voucherId
     * @return
     */
    @RequestMapping(value = "/selVoucherById" , method = RequestMethod.POST )
    public TxResultResponse selVoucherById(@RequestParam String voucherId){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");
        try {
            Voucher voucher = voucherService.selVoucherById(voucherId);
            resultResponse.setData(voucher);
            return resultResponse;
        } catch (CommonException e) {
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e){
            return new TxResultResponse(CommonCode.PARAM_ERROR.getCode(),CommonCode.PARAM_ERROR.getMsg());

        }
    }

    /**
     * 优惠券修改
     * @param voucher
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updByVoucher" , method = RequestMethod.POST)
    public TxResultResponse updByVoucher(@RequestBody Voucher voucher){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");
        try {
            int index = voucherService.updVoucherById(voucher);
            if(index > 0 ){
                return  resultResponse;
            }else{
                return new TxResultResponse(CommonCode.PARAM_ERROR.getCode(),"修改优惠券状态失败");
            }
        } catch (CommonException e) {
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e) {
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }

    }
}
