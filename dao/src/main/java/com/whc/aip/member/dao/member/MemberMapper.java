package com.whc.aip.member.dao.member;

import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.member.model.member.Member;
import com.whc.aip.member.model.member.MemberExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MemberMapper {
    int countByExample(MemberExample example);

    int deleteByExample(MemberExample example);

    int deleteByPrimaryKey(String id);

    int insert(Member record);

    int insertSelective(Member record);

    List<Member> selectByExample(MemberExample example);

    Member selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByExample(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);

    Member getMemberId(String openId) throws CommonException;

}