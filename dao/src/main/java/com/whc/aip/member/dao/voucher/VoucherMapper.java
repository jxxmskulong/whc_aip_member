package com.whc.aip.member.dao.voucher;

import com.whc.aip.member.model.voucher.Voucher;
import com.whc.aip.member.model.voucher.VoucherCenter;
import com.whc.aip.member.model.voucher.VoucherExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoucherMapper {
    int countByExample(VoucherExample example);

    int deleteByExample(VoucherExample example);

    int deleteByPrimaryKey(String id);

    int insert(Voucher record);

    int insertSelective(Voucher record);

    List<Voucher> selectByExample(VoucherExample example);

    Voucher selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Voucher record, @Param("example") VoucherExample example);

    int updateByExample(@Param("record") Voucher record, @Param("example") VoucherExample example);

    int updateByPrimaryKeySelective(Voucher record);

    int updateByPrimaryKey(Voucher record);

    /**
     * 自定义 订单中心 返回优惠券的列表
     */
    List<VoucherCenter> getVoucherList(@Param("memberId") String memberId , @Param("units") String units, @Param("warehouseId") String warehouseId);
}