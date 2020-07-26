package com.md.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-07-25 19:39
 * @Description:
 */
@FeignClient(value = "CLOUD-PAYMENT-SERVER")
@Component
public interface OpenFeignService {

    @GetMapping("/PayMent/{id}")
     Object getPayMentById(@PathVariable(name = "id") Long id);

    @GetMapping(value = {"/PayMent/getServerInfo"})
     Object getServerInfo();

    @GetMapping("/PayMent/feign/timeout")
     String timeOut();
}
