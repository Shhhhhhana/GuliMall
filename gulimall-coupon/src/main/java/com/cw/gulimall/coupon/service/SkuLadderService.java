package com.cw.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cw.common.utils.PageUtils;
import com.cw.gulimall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author cw
 * @email HeJieLin@gulimall.com
 * @date 2021-05-22 19:35:30
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

