package com.cw.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cw.common.utils.PageUtils;
import com.cw.gulimall.product.entity.SkuInfoEntity;
import com.cw.gulimall.product.vo.SkuItemVo;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/**
 * sku信息
 *
 * @author cw
 * @email HeJieLin@gulimall.com
 * @date 2021-05-22 19:00:18
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSkuInfo(SkuInfoEntity skuInfoEntity);

    PageUtils queryPageCondition(Map<String, Object> params);

    List<SkuInfoEntity> getSkusBySpuId(Long spuId);

    /**
     * 查询商品详情
     * @param skuId
     * @return
     */
    SkuItemVo item(Long skuId) throws ExecutionException, InterruptedException;
}

