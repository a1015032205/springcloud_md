package com.md.springcloud.controller;

import com.md.springcloud.pojo.CommonResult;
import com.md.springcloud.pojo.PayMent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-07-09 23:24
 * @Description:
 */
@RestController
@RequestMapping("consumer/consul")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Resource
    private DiscoveryClient discoveryClient;

    @Value("spring.application.name")
    private String serverName;

    @Value("${payMent.server}")
    private String server;

    @PostMapping
    public Object create(@RequestBody PayMent payMent) {
        return restTemplate.postForEntity(server + "PayMent/consul/", payMent, CommonResult.class);

    }

    @GetMapping("/{id}")
    public Object getPayMentById(@PathVariable(name = "id") Long id) {
        return restTemplate.getForObject(server + "PayMent/consul/" + id, CommonResult.class);
    }

    @GetMapping(value = {"/getServerInfo"})
    private Object getServerInfo() {

        return restTemplate.getForObject(server + "PayMent/consul/getServerInfo" , Map.class);
    }
}
