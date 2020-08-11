package com.md.alibaba.controller;

import cn.hutool.core.map.MapUtil;
import com.md.springcloud.pojo.CommonResult;
import com.md.springcloud.pojo.PayMent;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.HashMap;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-08-04 23:07
 * @Description:
 */

@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    private static HashMap map;

    @PostConstruct
    public void init() {
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put(1, new PayMent(1L, "111111111111111111111111"));
        hashMap.put(2, new PayMent(2L, "222222222222222222222222"));
        hashMap.put(3, new PayMent(3L, "3333333333333333333333333"));
        map = hashMap;
    }


    @GetMapping("/getId/{id}")
    public Object getServerPort(@PathVariable("id")Integer id) {
        PayMent payMent = MapUtil.get(map, id, PayMent.class);
        return   new CommonResult<>(200, "from sql,port:" + serverPort, payMent);
    }
}
