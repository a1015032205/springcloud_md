package com.md.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.md.springcloud.dao")
@EnableTransactionManagement
@EnableEurekaClient
@EnableCircuitBreaker
public class PaymentMainHystrix9001 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMainHystrix9001.class, args);
    }

}
