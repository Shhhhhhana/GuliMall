package com.cw.gulimall.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cw.gulimall.product.entity.AttrGroupEntity;
import com.cw.gulimall.product.vo.SpuItemAttrGroupVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 属性分组
 * 
 * @author cw
 * @email HeJieLin@gulimall.com
 * @date 2021-05-22 19:00:18
 */
@Mapper
public interface AttrGroupDao extends BaseMapper<AttrGroupEntity> {

    List<SpuItemAttrGroupVo> getAttrGroupWithAttrsBySpuId(@Param("spuId") Long spuId, @Param("catalogId") Long catalogId);
}
