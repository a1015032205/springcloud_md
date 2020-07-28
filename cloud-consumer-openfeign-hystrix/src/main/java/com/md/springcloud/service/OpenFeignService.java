package com.md.springcloud.service;

import com.md.springcloud.service.fallback.OpenFeignServiceFallBackImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-07-25 19:39
 * @Description:
 */
@FeignClient(value = "CLOUD-PAYMENT-HYSTRIX-SERVER",fallback = OpenFeignServiceFallBackImpl.class)
@Component
public interface OpenFeignService {

    @GetMapping("/PayMent/Hystrix/isok/{id}")
    String isOk(@PathVariable("id")String id);

    @GetMapping(value = {"/PayMent/Hystrix/isTimeOut"})
    String isTimeOut(@RequestParam("id")String id);

    @GetMapping(value = {"/PayMent/Hystrix/getServerInfo"})
     Object getServerInfo();
}
