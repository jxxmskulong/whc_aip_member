package com.whc.aip.member.service.impl.voucher;

import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.member.model.voucher.Voucher;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by shenshanghua
 * Email shenshanghua@wanhuchina.com
 * Date：2017/6/15
 * Time：12:19
 */
@Service("voucherMongoImpl")
public class VoucherMongoImpl{

    @Resource
    private MongoTemplate mongoTemplate;

    public void insertVoucherList(Voucher voucher) throws CommonException {
       mongoTemplate.insert(voucher,"voucher");
    }
}
