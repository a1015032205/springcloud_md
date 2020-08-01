package com.md.springcloud.filter;

import cn.hutool.core.util.StrUtil;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-07-30 22:58
 * @Description: 过滤器
 */
@Component
public class MyGatewayFilter implements GlobalFilter, Ordered {

    /**
     * @param exchange 类似士request
     * @param chain    过滤
     * @return
     */
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        System.out.println("MyGatewayFilter》》》》》》" + new Date());
        String name = exchange.getRequest().getQueryParams().getFirst("name");
        if (StrUtil.isBlank(name)) {
            System.out.println("用户名为空，非法用户");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }
        return chain.filter(exchange);
    }

    /**
     * 数字越小  优先级越高
     *
     * @return
     */
    @Override
    public int getOrder() {
        return 0;
    }

}
