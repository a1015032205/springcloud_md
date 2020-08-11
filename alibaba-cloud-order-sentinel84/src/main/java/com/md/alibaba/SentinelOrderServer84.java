package com.md.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-08-04 23:04
 * @Description: nacos
 */

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
@EnableFeignClients
public class SentinelOrderServer84 {
    public static void main(String[] args) {
        SpringApplication.run(SentinelOrderServer84.class);
    }
}
