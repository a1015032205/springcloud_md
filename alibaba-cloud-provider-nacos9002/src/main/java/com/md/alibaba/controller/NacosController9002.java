package com.md.alibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-08-04 23:07
 * @Description:
 */

@RestController
@RequestMapping(value = {"/nacos"})
public class NacosController9002 {

    @Value("${server.port}")
    private String serverPort;


    @GetMapping
    public String getServerPort(){
        return "nacos服务提供者：" + serverPort;
    }
}
