package com.whc.aip.member.service.impl.question;

import com.wanhuchina.common.code.CommonCode;
import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.member.dao.question.UserQuestionMapper;
import com.whc.aip.member.model.question.UserQuestion;
import com.whc.aip.member.service.question.UserQuestionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by shenshanghua
 * Email shenshanghua@wanhuchina.com
 * Date：2017/6/20
 * Time：13:00
 */
@Service("userQuestionService")
public class UserQuestionServiceImpl implements UserQuestionService {

    @Resource
    private UserQuestionMapper userQuestionMapper;

    @Override
    public int submitQuestion(UserQuestion userQuestion) throws CommonException {

        try {
            int index = userQuestionMapper.insertSelective(userQuestion);
            return index;
        } catch (Exception e) {
            throw new CommonException(CommonCode.SQL_UPD_ERROR.getCode(),CommonCode.SQL_UPD_ERROR.getMsg());
        }
    }
}
