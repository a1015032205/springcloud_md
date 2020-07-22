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
@EnableDiscoveryClient//该注解用于向consul或者zookeeper作为服务中心时注册服务
public class PayMentMain8005 {
    public static void main(String[] args) {
        SpringApplication.run(PayMentMain8005.class);
    }
}
