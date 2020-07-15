package com.md.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-07-09 23:42
 * @Description:
 */
@Configuration
public class WebConfig {
    @Bean
    public RestTemplate init() {
        return new RestTemplate();
    }
}
