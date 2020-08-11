package com.md.alibaba.server;

import com.md.alibaba.server.impl.PaymentServerImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-08-11 23:56
 * @Description:
 */

@FeignClient(value = "sentinel-payment-provider", fallback = PaymentServerImpl.class)
public interface PaymentServer {

    @GetMapping("/getId/{id}")
    Object getServerPort(@PathVariable("id") Integer id);
}
