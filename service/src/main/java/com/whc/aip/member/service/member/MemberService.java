package com.whc.aip.member.service.member;

import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.member.model.member.Member;
import com.whc.aip.member.model.member.WeiSupperMan;

import java.util.HashMap;

/**
 * Created by WangHu
 * User：wanghu@wanhuchina.com
 * Date：2017/6/7
 * Time：16:20
 */
public interface MemberService {

    HashMap<String,String> CheckFocusByisSub(String openId, String isSub) throws CommonException;

    Member selByOpenId(String openId) throws CommonException;

    Member selByMemberId(String  memberId) throws CommonException;

    int insMember(Member member) throws  CommonException;

    int updMember(Member member) throws CommonException;

    int updMemberByOpenId(Member member) throws CommonException;

    WeiSupperMan selBySuperMan(String memberId) throws CommonException;
}
