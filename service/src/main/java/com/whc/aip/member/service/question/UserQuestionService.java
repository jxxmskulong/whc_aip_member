package com.whc.aip.member.service.question;

import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.member.model.question.UserQuestion;

/**
 * Created by shenshanghua
 * Email shenshanghua@wanhuchina.com
 * Date：2017/6/20
 * Time：12:53
 */
public interface UserQuestionService {

    int submitQuestion(UserQuestion userQuestion) throws CommonException;
}
