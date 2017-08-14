package com.whc.aip.member.service.impl.member;

import com.wanhuchina.common.code.CommonCode;
import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.member.dao.member.MemCenterMapper;
import com.whc.aip.member.dao.member.MemberMapper;
import com.whc.aip.member.dao.member.WeiSupperManMapper;
import com.whc.aip.member.dao.order.OrderMapper;
import com.whc.aip.member.model.member.Member;
import com.whc.aip.member.model.member.MemberCenter;
import com.whc.aip.member.model.member.WeiSupperMan;
import com.whc.aip.member.model.member.WeiSupperManExample;
import com.whc.aip.member.model.order.OrderDetail;
import com.whc.aip.member.model.order.OrderRenewDetail;
import com.whc.aip.member.service.member.MemCenterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * Created by shenshanghua
 * Email shenshanghua@wanhuchina.com
 * Date：2017/6/14
 * Time：0:46
 */
@Service("memCenterService")
public class MemCenterServiceImpl implements MemCenterService{
    @Resource
    private MemCenterMapper memCenterMapper;
    @Resource
    private MemberMapper memberMapper;
    @Resource
    private OrderMapper orderMapper;
    @Resource
    private WeiSupperManMapper weiSupperManMapper;

    @Override
    public HashMap<String,Object> getMemCenterList(String memberId, String status) throws CommonException {
        HashMap<String,Object> data = new HashMap<String,Object>();

        try {
            Member member = memberMapper.selectByPrimaryKey(memberId);

            List<MemberCenter> memCenterList = memCenterMapper.getMemCenterList(memberId, status);

            WeiSupperManExample example = new WeiSupperManExample();
            WeiSupperManExample.Criteria criteria = example.createCriteria();
            criteria.andMemberIdEqualTo(memberId);
            List<WeiSupperMan> weiSupperMen = weiSupperManMapper.selectByExample(example);

            data.put("supperman",weiSupperMen.size()==0 ?"0":"1");
            data.put("member",member);
            data.put("memPhoto",member.getPhoto());
            data.put("resultList",memCenterList);
            return data;
        } catch (CommonException e) {
            throw new CommonException(CommonCode.SQL_SELECT_ERROR.getCode(),CommonCode.SQL_SELECT_ERROR.getMsg());
        }

    }

    /**
     * 点击进入订单详情
     * @param orderId
     * @return
     * @throws CommonException
     */

    @Override
    public HashMap<String, Object> getOrderDetail(String orderId) throws CommonException {
        HashMap<String, Object> data = new HashMap<String, Object>();

        try {
            List<OrderDetail> orderDetails = orderMapper.selDetailById(orderId);
            List<OrderRenewDetail> orderRenew = orderMapper.getOrderRenew(orderId);
            data.put("orderInfo",orderDetails);
            data.put("orderRenewInfoList",orderRenew);
            return data;

        } catch (CommonException e) {
            throw new CommonException(CommonCode.SQL_SELECT_ERROR.getCode(),CommonCode.SQL_SELECT_ERROR.getMsg());
        }


    }
}
