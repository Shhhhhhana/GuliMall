package com.cw.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cw.common.utils.PageUtils;
import com.cw.gulimall.member.entity.MemberEntity;
import com.cw.gulimall.member.exception.PhoneException;
import com.cw.gulimall.member.exception.UsernameException;
import com.cw.gulimall.member.vo.MemberUserLoginVo;
import com.cw.gulimall.member.vo.MemberUserRegisterVo;
import com.cw.gulimall.member.vo.SocialUser;

import java.util.Map;

/**
 * 会员
 *
 * @author cw
 * @email HeJieLin@gulimall.com
 * @date 2021-05-22 19:42:06
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 用户注册
     * @param vo
     */
    void register(MemberUserRegisterVo vo);

    /**
     * 判断邮箱是否重复
     * @param phone
     * @return
     */
    void checkPhoneUnique(String phone) throws PhoneException;

    /**
     * 判断用户名是否重复
     * @param userName
     * @return
     */
    void checkUserNameUnique(String userName) throws UsernameException;

    /**
     * 用户登录
     * @param vo
     * @return
     */
    MemberEntity login(MemberUserLoginVo vo);

    /**
     * 社交用户的登录
     * @param socialUser
     * @return
     */
    MemberEntity login(SocialUser socialUser) throws Exception;

    /**
     * 微信登录
     * @param accessTokenInfo
     * @return
     */
    MemberEntity login(String accessTokenInfo);
}

