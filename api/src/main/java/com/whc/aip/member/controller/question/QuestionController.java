package com.whc.aip.member.controller.question;

import com.wanhuchina.common.code.CommonCode;
import com.wanhuchina.common.code.TxResultResponse;
import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.member.model.question.UserQuestion;
import com.whc.aip.member.service.question.UserQuestionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by shenshanghua
 * Email shenshanghua@wanhuchina.com
 * Date：2017/6/20
 * Time：13:07
 */
@RestController
@RequestMapping("/questionManage")
public class QuestionController {

    @Resource
    private UserQuestionService userQuestionService;

    /**
     * 添加问题  客户使用
     * @param question
     * @return
     */
    @RequestMapping(value = "/addQuestion" , method = RequestMethod.POST)
    @ResponseBody
    public TxResultResponse addQuestion(@RequestBody UserQuestion question){

        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"提交成功");

        String quest_browse_message = question.getQuest_browse_message();
        try {
            if(quest_browse_message!=null && !"".equals(quest_browse_message)){
                if(quest_browse_message.indexOf("(") > 0 ){

                    String[] browse = quest_browse_message.split("\\(");
                    String quest_browes = browse[0];//浏览器
                    String quest_browse_masker = browse[1].split("\\)")[0];//浏览器标头
                    String quest_access_os = browse[1].split("\\)")[0];
                    if(quest_browse_message.indexOf("NetType")>0){

                        String quest_net_type = quest_browse_message.substring(quest_browse_message.indexOf("NetType"));
                        question.setNetType(quest_net_type);
                    }
                    question.setBrowse(quest_browes);
                    question.setBrowseMarker(quest_browse_masker);
                    question.setAccessOs(quest_access_os);
                }
            }

            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String time = formatter.format(date);
            question.setCreateTime(time);
            int i = userQuestionService.submitQuestion(question);
            if(i==1){

                return  resultResponse;
            }else{
                return new TxResultResponse(CommonCode.PARAM_ERROR.getCode(),"提交失败");
            }

        } catch (CommonException e) {
            return new TxResultResponse(e.getCode(),e.getMessage());
        } catch (Exception e){
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),CommonCode.SERVER_ERROR.getMsg());
        }


    }
}
