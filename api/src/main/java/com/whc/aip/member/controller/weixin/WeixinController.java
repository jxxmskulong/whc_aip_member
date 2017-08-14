package com.whc.aip.member.controller.weixin;

import com.google.common.base.Strings;
import com.wanhuchina.common.code.CommonCode;
import com.wanhuchina.common.code.TxResultResponse;
import com.wanhuchina.common.exception.CommonException;
import com.wanhuchina.common.util.weixin.cgi.WeixinUtil;
import com.wanhuchina.common.util.zk.ZkPropertyUtil;
import com.whc.aip.member.model.member.Member;
import com.whc.aip.member.service.member.MemberService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by shenshanghua
 * Email shenshanghua@wanhuchina.com
 * Date：2017/6/16
 * Time：17:20
 */
@RestController
@RequestMapping("/weixinManage")
public class WeixinController {
    @Resource
    private MemberService memberService;
    
    @RequestMapping(value = "/weixinByMember",method = RequestMethod.POST)
    public TxResultResponse weixinByMemer(@RequestParam String fromUserName,@RequestParam String wahoId,@RequestParam String personId ){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");
        HashMap<String,String> data = new HashMap<String,String>();
        try {
            Member member = memberService.selByOpenId(fromUserName);
            if(member == null){
                member = new Member();
                member.setOpenId(fromUserName);
                member.setIsDel("0");
                member.setRegDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
                Map userInfo = WeixinUtil.getMemberInfoByOpenId(ZkPropertyUtil.get("corpId"), ZkPropertyUtil.get("secret"), fromUserName);
                String nickName = "";
                String headimgurl = "";
                String sex = "";
                if (userInfo != null) {
                    if (!Strings.isNullOrEmpty((String)userInfo.get("nickname"))) {
                        nickName = (String)userInfo.get("nickname");
                    }
                    if (!Strings.isNullOrEmpty((String)userInfo.get("headimgurl"))) {
                        headimgurl = (String)userInfo.get("headimgurl");
                    }
                    if (!Strings.isNullOrEmpty((String)userInfo.get("sex"))) {
                        sex = (String)userInfo.get("sex");
                    }
                }

                member.setNickName(nickName);
                member.setName(nickName);
                member.setPhoto(headimgurl);
                member.setSex(sex);
                member.setWeigateStatus("0");
                member.setSource(personId);
                member.setIsSub("1");
                member.setWahoId(wahoId);
                int index = memberService.insMember(member);
                if(index == 1){
                    return resultResponse;
                }else{
                    return new TxResultResponse(CommonCode.PARAM_ERROR.getCode(),"失败");
                }
            }else{
                return new TxResultResponse(CommonCode.PARAM_ERROR.getCode(),"失败");
            }
        } catch (CommonException e) {
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e){
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),CommonCode.SERVER_ERROR.getMsg());

        }

    }
    
}
