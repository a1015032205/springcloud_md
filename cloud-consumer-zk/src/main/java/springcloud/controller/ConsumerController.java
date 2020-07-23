package springcloud.controller;

import cn.hutool.core.map.MapUtil;
import com.md.springcloud.pojo.CommonResult;
import com.md.springcloud.pojo.PayMent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-07-09 23:24
 * @Description:
 */
@RestController
@RequestMapping("consumer/zk")
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
        return restTemplate.postForEntity(server + "PayMent/zk/", payMent, CommonResult.class);

    }

    @GetMapping("/{id}")
    public Object getPayMentById(@PathVariable(name = "id") Long id) {
        return restTemplate.getForObject(server + "PayMent/zk/" + id, CommonResult.class);
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
}
