package com.md.springcloud.controller;


import com.md.springcloud.service.OpenFeignService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-07-09 23:24
 * @Description:
 */
@RestController
@RequestMapping("/order/hystrix")
public class ConsumerOpenFeignController {

    @Autowired
    private OpenFeignService openFeignService;


    @GetMapping(value = "/isok/{id}")
    private String isOk(@PathVariable("id") String id) {
        return openFeignService.isOk(id);
    }

    @GetMapping("/isTimeOut")
    @HystrixCommand(fallbackMethod = "isTimeOutFallBask", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
    })
    private String isTimeOut(@RequestParam("id") String id) {
        return openFeignService.isTimeOut(id);
    }

    private String isTimeOutFallBask(@RequestParam("id") String id) {

        return Thread.currentThread().getName() + "  我是80   垃圾系统  " + id;
    }
}
