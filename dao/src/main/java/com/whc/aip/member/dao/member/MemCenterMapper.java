package com.whc.aip.member.dao.member;

import com.whc.aip.member.model.member.MemberCenter;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by shenshanghua
 * Email shenshanghua@wanhuchina.com
 * Date：2017/6/14
 * Time：0:50
 */
@Repository
public interface MemCenterMapper {

    /**
     * 订单中心的订单列表
     */
    List<MemberCenter> getMemCenterList(@Param("memberId") String memberId,@Param("status") String status);
}
