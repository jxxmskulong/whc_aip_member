package com.whc.aip.member.service.voucher;

import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.member.model.voucher.Voucher;
import com.whc.aip.member.model.voucher.VoucherCenter;

import java.util.HashMap;
import java.util.List;

/**
 * Created by shenshanghua
 * Email shenshanghua@wanhuchina.com
 * Date：2017/6/15
 * Time：12:13
 */
public interface VoucherService {

    HashMap<String,List<VoucherCenter>> getVoucherList(String memberId,String units,String warehouseId) throws CommonException;


    List<Voucher> checkVoucherByCode(String voucherCode) throws CommonException;


    int bindVoucher(Voucher voucher) throws  CommonException;

    Voucher selVoucherById(String voucherId) throws CommonException;

    int updVoucherById(Voucher voucher) throws CommonException;
}
