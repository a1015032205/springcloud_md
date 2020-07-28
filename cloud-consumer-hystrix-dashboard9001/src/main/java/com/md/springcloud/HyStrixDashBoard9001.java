package com.md.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-07-28 22:37
 * @Description: Hystrix图形化
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HyStrixDashBoard9001 {
    public static void main(String[] args) {
        SpringApplication.run(HyStrixDashBoard9001.class);
    }
}
