package com.md.alibaba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-08-04 23:28
 * @Description:
 */
@RestController
@RequestMapping("/nacosConsumer")
public class NacosOrderController {


    @Value("${payMent.server}")
    private String serverName;


    @Autowired
    private RestTemplate restTemplate;


    @GetMapping()
    private String getInfo(){
        return restTemplate.getForObject(serverName + "nacos", String.class);
    }
}
