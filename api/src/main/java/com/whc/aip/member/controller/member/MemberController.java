package com.whc.aip.member.controller.member;

import com.wanhuchina.common.code.CommonCode;
import com.wanhuchina.common.code.TxResultResponse;
import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.member.model.member.Member;
import com.whc.aip.member.model.member.WeiSupperMan;
import com.whc.aip.member.service.member.MemberService;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * Created by WangHu
 * Email：wanghu@wanhuchina.com
 * Date：2017/6/7
 * Time：16:53
 */
@RestController
@RequestMapping("/memberManage")
public class MemberController {
    public static final org.slf4j.Logger log = LoggerFactory.getLogger(MemberController.class);
    @Resource
    private MemberService memberService;

    /**
     * 获取menber
     * @param openId
     * @param isSub
     * @return
     */
    @RequestMapping(value = "/getMember",method = RequestMethod.GET)
    public TxResultResponse getMember(@RequestParam String openId,@RequestParam String isSub){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");
        try{
            HashMap<String, String> data = memberService.CheckFocusByisSub(openId, isSub);
            resultResponse.setData(data);
            return resultResponse;
        } catch (CommonException e) {
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e) {
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }
    }

    /**
     * 通过memberID
     * 查询member
     * @param memberId
     * @return
     */
    @RequestMapping(value = "/getMemberByMemId",method = RequestMethod.POST)
    public TxResultResponse getMemberById(@RequestParam String memberId){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");
        try{
            Member member = memberService.selByMemberId(memberId);
            resultResponse.setData(member);
            return resultResponse;
        } catch (CommonException e) {
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e) {
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }
    }


    /**
     * 通过openId查询member
     * @param openId
     * @return
     */
    @RequestMapping(value = "/getMemberByOpenId",method = RequestMethod.POST)
    public TxResultResponse getMemberByOpenId(@RequestParam String openId){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");
        try{
            Member member = memberService.selByOpenId(openId);
            resultResponse.setData(member);
            return resultResponse;
        } catch (CommonException e) {
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e) {
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }
    }

    /**
     * 添加member
     * @param member
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/insMember",method = RequestMethod.POST)
    public TxResultResponse insMember(@RequestBody Member member){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");
        try{
            int index = memberService.insMember(member);
            if(index ==1 ){

                return resultResponse;
            }else{

                return new TxResultResponse(CommonCode.PARAM_ERROR.getCode(),"添加member失败");
            }
        } catch (CommonException e) {
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e) {
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }
    }

    /**
     * 修改member
     * @param member
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updMember",method = RequestMethod.POST)
    public TxResultResponse updMember(@RequestBody Member member){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");
        try{
            int index = memberService.updMember(member);
            if(index > 0 ){

                return resultResponse;
            }else{

                return new TxResultResponse(CommonCode.PARAM_ERROR.getCode(),"修改member失败");
            }
        } catch (CommonException e) {
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e) {
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }
    }

    /**
     * 通过openID修改member
     * @param member
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updMemberByOpenId",method = RequestMethod.POST)
    public TxResultResponse updMemberByOpenId(@RequestBody Member member){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");
        try{
            int index = memberService.updMemberByOpenId(member);
            if(index > 0 ){

                return resultResponse;
            }else{

                return new TxResultResponse(CommonCode.PARAM_ERROR.getCode(),"修改member失败");
            }
        } catch (CommonException e) {
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e) {
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }
    }


    /**
     * 修改member
     * @param memberId
     * @return
     */
    @RequestMapping(value = "/getSupperMan",method = RequestMethod.POST)
    public TxResultResponse getSupperMan(@RequestParam String memberId){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");
        try{
            WeiSupperMan supperMan = memberService.selBySuperMan(memberId);
            if(supperMan!=null){
                resultResponse.setData(supperMan);
                return resultResponse;
            }else{
                return new TxResultResponse(CommonCode.PARAM_ERROR.getCode(),"参数为空");
            }
        } catch (CommonException e) {
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e) {
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }
    }
}
