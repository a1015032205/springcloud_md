package com.md.springcloud.service.impl;

import com.md.springcloud.dao.PayMentMapper;
import com.md.springcloud.pojo.PayMent;
import com.md.springcloud.service.PayMentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-07-09 20:52
 * @Description:
 */

@Slf4j
@Service(value = "payMentServiceImpl")
@SuppressWarnings("unchecked")
@Transactional(rollbackFor = Exception.class)
public class PayMentServiceImpl implements PayMentService {

    @Autowired
    private PayMentMapper payMentMapper;


    @Override
    public int create(PayMent payMent) {
        return payMentMapper.create(payMent);
    }

    @Override
    public PayMent getPayMentById(Long id) {
        return payMentMapper.getPayMentById(id);
    }


    @Override
    public Object isOk(String id) {
        String str = Thread.currentThread().getName() + "              IS   OK            " + id;
        System.out.println(str);
        return str;
    }

    @Override
    @HystrixCommand(fallbackMethod = "isTimeOutFallBask", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")
    })
    public Object isTimeOut(String id) {
        try {
            //   int a = 0 / 0;
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String str = Thread.currentThread().getName() + "         IS   TIME OUT " + id;
        System.out.println(str);
        return str;
    }

    private Object isTimeOutFallBask(String id) {
        return Thread.currentThread().getName() + "  程序超时或出错       IS   TIME OUT " + id;
    }


    @Override
    @HystrixCommand(fallbackMethod = "serviceFuseFallbackMethod", commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),//开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "5"),//请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),//时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "40"),//失败率达到多少熔断
    })
    public Object serviceFuse(int id) {
        if (id < 0) {
            throw new RuntimeException("id不能小于0");
        }

        return Thread.currentThread().getName() + "  >>>>>>>>>>>>>>>  " + id;
    }


    public Object serviceFuseFallbackMethod(int id) {
        return Thread.currentThread().getName() + "   Id不能小于0！ " + "  >>>>>>  " + id;
    }
}
