package com.whc.aip.member.dao.question;

import com.whc.aip.member.model.question.UserQuestion;
import com.whc.aip.member.model.question.UserQuestionExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserQuestionMapper {
    int countByExample(UserQuestionExample example);

    int deleteByExample(UserQuestionExample example);

    int insert(UserQuestion record);

    int insertSelective(UserQuestion record);

    List<UserQuestion> selectByExample(UserQuestionExample example);

    int updateByExampleSelective(@Param("record") UserQuestion record, @Param("example") UserQuestionExample example);

    int updateByExample(@Param("record") UserQuestion record, @Param("example") UserQuestionExample example);
}