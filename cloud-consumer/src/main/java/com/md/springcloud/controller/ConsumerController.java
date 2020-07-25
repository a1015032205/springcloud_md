package com.md.springcloud.controller;

import cn.hutool.core.collection.CollUtil;
import com.md.springcloud.pojo.CommonResult;
import com.md.springcloud.pojo.PayMent;
import com.md.springcloud.service.LoadBalancer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-07-09 23:24
 * @Description:
 */
@RestController
@RequestMapping("/consumer/eureka")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancer loadBalancer;

    @Resource
    private DiscoveryClient discoveryClient;

    @Value("spring.application.name")
    private String serverName;

    @Value("${payMent.server}")
    private String server;

    @PostMapping
    public Object create(@RequestBody PayMent payMent) {
        return restTemplate.postForEntity(getLoadBalancer() + "PayMent/", payMent, CommonResult.class);

    }

    @GetMapping("/{id}")
    public Object getPayMentById(@PathVariable(name = "id") Long id) {
        return restTemplate.getForObject(getLoadBalancer() + "PayMent/" + id, CommonResult.class);
    }

    @GetMapping("/entity/{id}")
    public Object getPayMentByIdEntity(@PathVariable(name = "id") Long id) {
        return restTemplate.getForEntity(getLoadBalancer() + "PayMent/" + id, Object.class);
    }

    @GetMapping(value = {"/getServerInfo"})
    private Object getServerInfo() {
        return restTemplate.getForObject(getLoadBalancer() + "PayMent/getServerInfo", Object.class);
    }

    @GetMapping(value = {"/getLoadBalancer"})
    public Object getLoadBalancer() {
        //拿到服务端所有可用服务
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVER");
        if (CollUtil.isEmpty(instances)) {
            return null;
        }
        ServiceInstance serviceInstance = loadBalancer.getServiceInstance(instances);
        return serviceInstance.getUri();
    }

}
