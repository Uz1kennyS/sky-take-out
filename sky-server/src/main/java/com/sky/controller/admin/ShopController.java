package com.sky.controller.admin;

import com.sky.result.Result;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController("adminShopController")
@RequestMapping("/admin/shop")
@Api(tags = "店铺接口")
public class ShopController {

    @Autowired
    private RedisTemplate redisTemplate;


    @PutMapping("/{status}")
    public Result setStatus(@PathVariable Integer status) {
        log.info("当前营业状态为：{}", status==1?"营业中":"打样中");
        redisTemplate.opsForValue().set("SHOP_STATUS", status);
        return Result.success();
    }

    @GetMapping("/status")
    public Result<Integer> getShopStatus() {
        Integer status = (Integer) redisTemplate.opsForValue().get("SHOP_STATUS");
        return Result.success(status);
    }
}
