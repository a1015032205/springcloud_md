package com.md.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-07-08 23:44
 * @Description: springboot
 */
@SpringBootApplication
@MapperScan("com.md.springcloud.dao")
@EnableTransactionManagement
@EnableDiscoveryClient
public class PayMentMainConsul8007 {
    public static void main(String[] args) {
        SpringApplication.run(PayMentMainConsul8007.class);
    }
}
