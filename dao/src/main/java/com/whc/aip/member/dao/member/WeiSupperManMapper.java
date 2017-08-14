package com.whc.aip.member.dao.member;

import com.whc.aip.member.model.member.WeiSupperMan;
import com.whc.aip.member.model.member.WeiSupperManExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeiSupperManMapper {
    int countByExample(WeiSupperManExample example);

    int deleteByExample(WeiSupperManExample example);

    int insert(WeiSupperMan record);

    int insertSelective(WeiSupperMan record);

    List<WeiSupperMan> selectByExample(WeiSupperManExample example);

    int updateByExampleSelective(@Param("record") WeiSupperMan record, @Param("example") WeiSupperManExample example);

    int updateByExample(@Param("record") WeiSupperMan record, @Param("example") WeiSupperManExample example);
}