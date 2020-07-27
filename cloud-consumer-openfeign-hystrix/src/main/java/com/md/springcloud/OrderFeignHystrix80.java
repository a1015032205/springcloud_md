package com.md.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-07-09 23:22
 * @Description: 服务消费者80端口
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderFeignHystrix80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignHystrix80.class);
    }
}
