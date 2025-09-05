package com.sky.controller.user;

import com.sky.result.Result;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

@RestController("userShopController")
@RequestMapping("/user/shop")
@Api(tags = "店铺接口")
public class ShopController {

    @Autowired
    private RedisTemplate redisTemplate;



    @GetMapping("/status")
    public Result<Integer> getShopStatus() {
        Integer status = (Integer) redisTemplate.opsForValue().get("SHOP_STATUS");
        return Result.success(status);
    }
}
