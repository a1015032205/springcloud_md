package com.md.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-07-30 21:38
 * @Description:
 */
@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator createRoute(RouteLocatorBuilder builder){
     return
             builder
                .routes()
                     .route("spring_rain", r -> r.path("/md")
                        .uri("https://www.bookstack.cn/explore"))
                            .build();
    }
}
