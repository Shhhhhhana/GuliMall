package com.cw.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cw.common.to.SkuReductionTo;
import com.cw.common.utils.PageUtils;
import com.cw.gulimall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author cw
 * @email HeJieLin@gulimall.com
 * @date 2021-05-22 19:35:30
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSkuReduction(SkuReductionTo skuReductionTo);
}

