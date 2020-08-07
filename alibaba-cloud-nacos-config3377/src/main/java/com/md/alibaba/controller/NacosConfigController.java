package com.md.alibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-08-04 23:28
 * @Description:
 */
@RestController
@RefreshScope //动态刷新
public class NacosConfigController {

    @Value("${config}")
    private String config;

    @GetMapping("/getYml")
    public String getInfo() {
        return config;
    }
}
