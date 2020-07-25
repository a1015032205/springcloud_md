package com.md.springcloud.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-07-25 19:40
 * @Description:
 */
@Component
@Slf4j
public class LoadBalancerImpl implements LoadBalancer {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    /**
     * 计算第几次请求
     *
     * @return
     */
    final int getNext() {
        //预期值
        int current;
        //新值
        int next;
        do {
            current = this.atomicInteger.get();
            //如果大于int最大范围
            next = current >= Integer.MAX_VALUE ? 0 : current + 1;
            //自旋锁
        } while (!this.atomicInteger.compareAndSet(current, next));
        log.info("访问次数：" + next);
        return next;
    }

    @Override
    public ServiceInstance getServiceInstance(List<ServiceInstance> instances) {
        //访问次数 % 可用服务个数集合的长度 得到index就是本次访问的服务的下标
        return instances.get(getNext() % instances.size());
    }
}
