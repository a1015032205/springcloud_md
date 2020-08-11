package com.md.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.md.alibaba.myhandler.CustmerBlockHandler;
import com.md.springcloud.pojo.CommonResult;
import com.md.springcloud.pojo.PayMent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-08-11 22:10
 * @Description:
 */

@RestController
public class RateLimitController {

    @GetMapping("/byResource")
    @SentinelResource(value = "byResource", blockHandler = "byResourceBlock")
    public Object byResource() {
        return new CommonResult<>(200, "按资源类型", new PayMent(100L, "ASD"));
    }


    public Object byResourceBlock(BlockException blockException) {
        return new CommonResult<>(444, blockException.getClass().getCanonicalName()+">>>>>>SERVER ERROR");
    }

    @GetMapping("/byUrl")
    @SentinelResource(value = "byUrl")
    public Object byUrl() {
        return new CommonResult<>(200, "byUrl", new PayMent(100L, "url"));
    }


    @GetMapping("/byDyi")
    @SentinelResource(value = "byDyi",blockHandlerClass = CustmerBlockHandler.class,blockHandler = "handler2")
    public Object byDyi() {
        return new CommonResult<>(200, "byDyi", new PayMent(100L, "byDyi"));
    }
}
