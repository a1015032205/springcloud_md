package com.md.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-08-01 21:47
 * @Description:
 */
@RestController
@RefreshScope //及时config刷配置
public class ConfigController {

    @Value("${cfx}")
    private String rain;



    @RequestMapping("/getRain")
    public String getRain(){
        return rain;
    }

}
