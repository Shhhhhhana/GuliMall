package com.cw.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cw.common.utils.PageUtils;
import com.cw.gulimall.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author cw
 * @email HeJieLin@gulimall.com
 * @date 2021-05-22 19:42:06
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

