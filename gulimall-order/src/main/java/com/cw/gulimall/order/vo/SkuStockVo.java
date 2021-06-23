package com.cw.gulimall.order.vo;

import lombok.Data;

/**
 * @Description: 库存vo
 * @Created: with IntelliJ IDEA.
 * @author: cw
 * @createTime: 2021-06-03 18:13
 **/

@Data
public class SkuStockVo {


    private Long skuId;

    private Boolean hasStock;

}
