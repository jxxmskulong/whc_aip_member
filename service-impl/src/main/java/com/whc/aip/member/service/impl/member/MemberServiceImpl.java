package com.whc.aip.member.service.impl.member;

import com.google.common.base.Strings;
import com.wanhuchina.common.code.CommonCode;
import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.member.dao.member.MemberMapper;
import com.whc.aip.member.dao.member.WeiSupperManMapper;
import com.whc.aip.member.model.member.Member;
import com.whc.aip.member.model.member.MemberExample;
import com.whc.aip.member.model.member.WeiSupperMan;
import com.whc.aip.member.model.member.WeiSupperManExample;
import com.whc.aip.member.model.voucher.Voucher;
import com.whc.aip.member.service.impl.voucher.VoucherMongoImpl;
import com.whc.aip.member.service.member.MemberService;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * Created by WangHu
 * Email：wanghu@wanhuchina.com
 * Date：2017/6/7
 * Time：16:31
 */
@Service("memberService")
public class MemberServiceImpl implements MemberService{
    public static final org.slf4j.Logger log = LoggerFactory.getLogger(MemberService.class);

    @Resource
    private MemberMapper memberMapper;
    @Resource
    private WeiSupperManMapper weiSupperManMapper;

    @Resource
    private VoucherMongoImpl voucherMongoImpl;

    /**
     * 扫码验证 跳转方向
     * @param openId
     * @param isSub
     * @return
     * @throws CommonException
     */
    @Override
    public HashMap<String,String> CheckFocusByisSub (String openId, String isSub) throws CommonException {
        HashMap<String,String> data = new HashMap<String,String>();
        List<Member> memberList = null;
        Member member = new Member();
        try {
            Member memberId = memberMapper.getMemberId(openId);
            MemberExample record = new MemberExample();
            MemberExample.Criteria criteria = record.createCriteria();
            criteria.andOpenIdEqualTo(openId).andIsSubEqualTo(isSub);
            memberList = memberMapper.selectByExample(record);
            if(memberList.size()>0){

                data.put("isMember","true");
            }else{

                data.put("isMember","false");
            }
            return data;
        } catch (Exception e) {
            throw new CommonException(CommonCode.SQL_SELECT_ERROR.getCode(),CommonCode.SQL_SELECT_ERROR.getMsg());
        }

    }

    /**
     * 通过openId得到member
     * @param openId
     * @return
     * @throws CommonException
     */
    @Override
    public Member selByOpenId(String openId) throws CommonException {
        Member member = new Member();
        try {
            MemberExample record = new MemberExample();
            MemberExample.Criteria criteria = record.createCriteria();
            criteria.andOpenIdEqualTo(openId);
            List<Member> memberList  = memberMapper.selectByExample(record);
            for (Member mem: memberList
                 ) {
                member = mem;
            }
            return member;
        } catch (Exception e) {
            throw new CommonException(CommonCode.SQL_SELECT_ERROR.getCode(),CommonCode.SQL_SELECT_ERROR.getMsg());
        }
    }

    /**
     * 通过主键查询member
     * @param memberId
     * @return
     * @throws CommonException
     */
    @Override
    public Member selByMemberId(String memberId) throws CommonException {

        try {
            Member member = memberMapper.selectByPrimaryKey(memberId);
            Voucher voucher =new Voucher();
//            voucher.setCode("1111");
//            voucher.setAmount("100");
//            voucherMongoImpl.insertVoucherList(voucher);
            return member;
        } catch (Exception e) {
            log.error("EXCEPTION==="+e.getMessage());
            throw new CommonException(CommonCode.SQL_SELECT_ERROR.getCode(),CommonCode.SQL_SELECT_ERROR.getMsg());
        }

    }

    @Override
    public int insMember(Member member) throws  CommonException{

        try {
            if(member != null){
                return memberMapper.insertSelective(member);
            }else{
                return 0;
            }
        } catch (Exception e) {
            throw new CommonException(CommonCode.SQL_UPD_ERROR.getCode(),"添加member失败");
        }
    }

    @Override
    public int updMember(Member member) throws CommonException {

        try {
            if(member != null){
               return memberMapper.updateByPrimaryKeySelective(member);
            }else{
                return 0;
            }
        } catch (Exception e) {
            throw new CommonException(CommonCode.SQL_UPD_ERROR.getCode(),"修改member失败");
        }


    }

    /**
     * 通过openID修改member
     * @param member
     * @return
     * @throws CommonException
     */
    @Override
    public int updMemberByOpenId(Member member) throws CommonException {
        MemberExample example = new MemberExample();
        MemberExample.Criteria criteria = example.createCriteria();
        criteria.andOpenIdEqualTo(member.getOpenId());

        try {
            if(member != null){
                return memberMapper.updateByExampleSelective(member,example);
            }else{
                return 0;
            }
        } catch (Exception e) {
            throw new CommonException(CommonCode.SQL_UPD_ERROR.getCode(),"修改member失败");
        }
    }

    /**
     * 获取superman 仓的权限
     * @param memberId
     * @return
     * @throws CommonException
     */
    @Override
    public WeiSupperMan selBySuperMan(String memberId) throws CommonException {
        WeiSupperMan weiSuperMan = new WeiSupperMan();
        try {
            if(!Strings.isNullOrEmpty(memberId)){
                WeiSupperManExample example = new WeiSupperManExample();
                WeiSupperManExample.Criteria criteria = example.createCriteria();
                criteria.andMemberIdEqualTo(memberId);
                List<WeiSupperMan> weiSupperMenList = weiSupperManMapper.selectByExample(example);
                for (WeiSupperMan supperMan : weiSupperMenList) {
                    weiSuperMan = supperMan;
                }
                return weiSuperMan;
            }else{
                throw new CommonException(CommonCode.DATA_NOT_FOUND.getCode(),"入参memberId为空");
            }
        } catch (CommonException e) {
            throw new CommonException(CommonCode.SQL_UPD_ERROR.getCode(),"查询sql失败");
        }
    }


}
