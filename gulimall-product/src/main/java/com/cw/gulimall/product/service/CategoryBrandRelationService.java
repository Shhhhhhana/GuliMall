package com.cw.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cw.common.utils.PageUtils;
import com.cw.gulimall.product.entity.CategoryBrandRelationEntity;
import com.cw.gulimall.product.entity.BrandEntity;

import java.util.List;
import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author cw
 * @email HeJieLin@gulimall.com
 * @date 2021-05-22 19:00:18
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 保存详细信息
     * @param categoryBrandRelation
     */
    void saveDetail(CategoryBrandRelationEntity categoryBrandRelation);

    void updateBrand(Long brandId, String name);

    void updateCategory(Long catId, String name);

    List<BrandEntity> getBrandsByCatId(Long catId);
}

