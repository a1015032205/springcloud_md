package com.md.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-07-26 19:38
 * @Description: FeignLogConfig
 */
@Configuration
public class FeignLogConfig {
    @Bean
     Logger.Level getFeignLogLevel(){
        return Logger.Level.FULL;
    }
}
