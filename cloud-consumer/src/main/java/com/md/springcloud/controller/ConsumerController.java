package com.md.springcloud.controller;

import com.md.springcloud.pojo.CommonResult;
import com.md.springcloud.pojo.PayMent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-07-09 23:24
 * @Description:
 */
@RestController
@RequestMapping("consumer")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${payMent.server}")
    private String server;

    @PostMapping
    public Object create(@RequestBody PayMent payMent) {
        return restTemplate.postForEntity(server + "PayMent/", payMent, CommonResult.class);

    }

    @GetMapping("/{id}")
    public Object getPayMentById(@PathVariable(name = "id") Long id) {
        return restTemplate.getForObject(server + "PayMent/" + id, CommonResult.class);
    }
}
