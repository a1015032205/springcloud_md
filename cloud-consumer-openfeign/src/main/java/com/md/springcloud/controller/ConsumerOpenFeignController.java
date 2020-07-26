package com.md.springcloud.controller;

import com.md.springcloud.service.OpenFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-07-09 23:24
 * @Description:
 */
@RestController
@RequestMapping("/consumer/feign")
public class ConsumerOpenFeignController {

    @Resource
    private OpenFeignService openFeignService;

    @GetMapping("/{id}")
    public Object getPayMentById(@PathVariable(name = "id") Long id) {
        return openFeignService.getPayMentById(id);
    }


    @GetMapping(value = {"/getServerInfo"})
    private Object getServerInfo() {
        return openFeignService.getServerInfo();
    }

    @GetMapping("/timeout")
    private String timeOut(){
        return openFeignService.timeOut();
    }
}
