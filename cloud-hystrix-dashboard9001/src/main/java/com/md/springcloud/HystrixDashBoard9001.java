package com.md.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author 秒度
 * @Email fangxin.md@Gmail.com
 * @Date 2020/7/29 上午10:55
 * @Description
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashBoard9001 {
	public static void main(String[] args) {
		SpringApplication.run(HystrixDashBoard9001.class);
	}
}
