package com.cw.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cw.common.utils.PageUtils;
import com.cw.gulimall.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author cw
 * @email HeJieLin@gulimall.com
 * @date 2021-05-22 19:35:30
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

