package com.whc.aip.member.service.impl.voucher;

import com.google.common.base.Strings;
import com.wanhuchina.common.code.CommonCode;
import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.member.dao.voucher.VoucherMapper;
import com.whc.aip.member.model.voucher.Voucher;
import com.whc.aip.member.model.voucher.VoucherCenter;
import com.whc.aip.member.model.voucher.VoucherExample;
import com.whc.aip.member.service.voucher.VoucherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * Created by shenshanghua
 * Email shenshanghua@wanhuchina.com
 * Date：2017/6/15
 * Time：12:19
 */
@Service("voucherService")
public class VoucherServiceImpl implements VoucherService {

    @Resource
    private VoucherMapper voucherMapper;

    @Override
    public HashMap<String, List<VoucherCenter>> getVoucherList(String memberId, String units, String warehouseId) throws CommonException {
        HashMap<String, List<VoucherCenter>> data = new HashMap<String, List<VoucherCenter>>();

        try {
            List<VoucherCenter> voucherList = voucherMapper.getVoucherList(memberId, units, warehouseId);
            data.put("voucherList",voucherList);
            return data;
        } catch (CommonException e) {
            throw new CommonException(CommonCode.SQL_SELECT_ERROR.getCode(),CommonCode.SQL_SELECT_ERROR.getMsg());
        }


    }

    /**
     * 查看优惠券有效
     * @param voucherCode
     * @return
     */
    @Override
    public List<Voucher> checkVoucherByCode(String voucherCode) throws CommonException {

        try {
            VoucherExample example = new VoucherExample();
            VoucherExample.Criteria criteria = example.createCriteria();
            criteria.andCodeEqualTo(voucherCode);
            List<Voucher> vouchers = voucherMapper.selectByExample(example);
            return vouchers;
        } catch (CommonException e) {
            throw new CommonException(CommonCode.SQL_SELECT_ERROR.getCode(),CommonCode.SQL_SELECT_ERROR.getMsg());
        }

    }

    /**
     * 绑定优惠券
     * @param voucher
     * @return
     */
    @Override
    public int bindVoucher(Voucher voucher) throws CommonException{

        try {
            int index = voucherMapper.updateByPrimaryKeySelective(voucher);
            return index;
        } catch (CommonException e) {
            throw new CommonException(CommonCode.SQL_UPD_ERROR.getCode(),CommonCode.SQL_UPD_ERROR.getMsg());
        }


    }

    /**
     *  根据主键查询优惠券
     * @param voucherId
     * @return
     * @throws CommonException
     */
    @Override
    public Voucher selVoucherById(String voucherId) throws CommonException {
        try {
            if(!Strings.isNullOrEmpty(voucherId)){

                Voucher voucher = voucherMapper.selectByPrimaryKey(voucherId);
                return voucher;
            }else{
                throw new CommonException(CommonCode.PARAM_ERROR.getCode(),CommonCode.PARAM_ERROR.getMsg());
            }
        } catch (CommonException e) {
            throw new CommonException(CommonCode.SQL_SELECT_ERROR.getCode(),CommonCode.SQL_SELECT_ERROR.getMsg());
        }
    }

    /**
     * 根据主键修改优惠券
     * @param voucher
     * @return
     * @throws CommonException
     */
    @Override
    public int updVoucherById(Voucher voucher) throws CommonException {
        try {
            if(voucher != null){

                int index = voucherMapper.updateByPrimaryKeySelective(voucher);
                return index;
            }else {
                throw new CommonException(CommonCode.PARAM_ERROR.getCode(), CommonCode.PARAM_ERROR.getMsg());

            }
        } catch (CommonException e) {
            throw new CommonException(CommonCode.SQL_SELECT_ERROR.getCode(),CommonCode.SQL_SELECT_ERROR.getMsg());
        }


    }
}
