package com.md.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.md.alibaba.server.PaymentServer;
import com.md.springcloud.pojo.CommonResult;
import com.md.springcloud.pojo.PayMent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-08-04 23:28
 * @Description:
 */
@RestController
@RequestMapping("/sentinelConsumer")
public class SentinelOrderController {


    @Value("${payMent.server}")
    private String serverName;


    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/getId/{id}")
    // @SentinelResource(value = "fallback")//没有配置
    // @SentinelResource(value = "fallback", fallback = "getInfoFallback")//只负责业务异常
    // @SentinelResource(value = "fallback", blockHandler = "getInfoBlockHandler")//只负责sentinel规则
    @SentinelResource(value = "fallback", fallback = "getInfoFallback", blockHandler = "getInfoBlockHandler", exceptionsToIgnore ={RuntimeException.class} )
    public Object getInfo(@PathVariable("id") Long id) {
        CommonResult forObject = restTemplate.getForObject(serverName + "getId/" + id, CommonResult.class, id);
        if (id == 4) {
            throw new RuntimeException("非法参数异常");
        } else if (forObject.getData() == null) {
            throw new NullPointerException("没数据  NPE异常");
        }

        return forObject;
    }

    //fallback
    public Object getInfoFallback(@PathVariable("id") Long id, Throwable e) {
        return new CommonResult<>(4444, "getInfoFallback" + e.getMessage(), new PayMent(id, null));
    }


    public Object getInfoBlockHandler(@PathVariable("id") Long id, BlockException e) {
        return new CommonResult<>(5555, "getInfoBlockHandler" + e.getMessage(), new PayMent(id, null));
    }



    //-================> openfeign

    @Resource
    private PaymentServer paymentServer;

    @GetMapping("/paymentServer/{id}")
    public Object paymentServer(@PathVariable("id") Integer id){
        return paymentServer.getServerPort(id);
    }
}
