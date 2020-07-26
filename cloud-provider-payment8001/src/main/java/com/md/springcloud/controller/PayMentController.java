package com.md.springcloud.controller;

import cn.hutool.core.map.MapUtil;
import com.md.springcloud.pojo.CommonResult;
import com.md.springcloud.pojo.PayMent;
import com.md.springcloud.service.PayMentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-07-09 20:57
 * @Description:
 */

@RestController
@RequestMapping(value = {"/PayMent"})
public class PayMentController extends BaseController {

    @Autowired
    @Qualifier(value = "payMentServiceImpl")
    private PayMentService payMentService;

    @Resource
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String port;

    @Value("spring.application.name")
    private String serverName;

    @PostMapping
    public CommonResult<?> create(@RequestBody PayMent payMent) {

        return new CommonResult(200, "服务提供者：" + port, payMentService.create(payMent));
    }

    @GetMapping("/{id}")
    public CommonResult<?> getPayMentById(@PathVariable(name = "id") Long id) {
        return new CommonResult(200, "服务提供者：" + port, payMentService.getPayMentById(id));
    }

    @GetMapping(value = {"/getServerInfo"})
    private Object getServerInfo() {
        //获得服务ID
        List<String> services = discoveryClient.getServices();

        HashMap<Object, Object> map = new LinkedHashMap<>(16);
        map.put("服务名称", services);
        services.forEach(name -> {
            //获得服务实例
            List<ServiceInstance> instances = discoveryClient.getInstances(name);
            instances.forEach(x -> {
                HashMap<Object, Object> info = MapUtil.newHashMap();
                info.put("serverId", x.getServiceId());
                info.put("serverPort", x.getPort());
                info.put("serverIp", x.getHost());
                info.put("serverURL", x.getUri());
                info.put("serverInstanceId", x.getInstanceId());
                map.put(name, info);
            });
        });
        return map;
    }

    @GetMapping("/getPort")
    private String getPort() {
        return port;
    }


    @GetMapping("/feign/timeout")
    private String timeOut() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return port;
    }
}
