package com.cw.gulimall.member.feign;

import com.cw.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

/**
 * @Description:
 * @Created: with IntelliJ IDEA.
 * @author: cw
 * @createTime: 2021-06-08 15:34
 **/

@FeignClient("gulimall-order")
public interface OrderFeignService {

    /**
     * 分页查询当前登录用户的所有订单信息
     * @param params
     * @return
     */
    @PostMapping("/order/order/listWithItem")
    R listWithItem(@RequestBody Map<String, Object> params);

}
