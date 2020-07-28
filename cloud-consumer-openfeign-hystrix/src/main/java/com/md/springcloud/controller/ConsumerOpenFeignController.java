package com.md.springcloud.controller;


import com.md.springcloud.service.OpenFeignService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
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
@DefaultProperties(defaultFallback = "isTimeOutFallBaskPublic")
public class ConsumerOpenFeignController {

    @Autowired
    private OpenFeignService openFeignService;


    @GetMapping(value = "/isok/{id}")
    @HystrixCommand
    public String isOk(@PathVariable("id") String id) {
        int i = 0 / 0;
        return openFeignService.isOk(id);
    }

    @GetMapping("/isTimeOut")
    @HystrixCommand(fallbackMethod = "isTimeOutFallBask", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
    })
    public String isTimeOut(@RequestParam("id") String id) {
        int i = 0 / 0;
        return openFeignService.isTimeOut(id);
    }

    public String isTimeOutFallBask(@RequestParam("id") String id) {
        return Thread.currentThread().getName() + "  我是80 MD 又出异常 又超时了！  " + id;
    }

    public String isTimeOutFallBaskPublic() {
        return Thread.currentThread().getName() + " 全局降级方法 ";
    }

    @GetMapping(value = {"/getServerInfo"})
    public Object getServerInfo() {
        return openFeignService.getServerInfo();
    }


}
