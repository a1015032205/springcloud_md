package com.md.springcloud.service;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-07-25 19:39
 * @Description:
 */

public interface LoadBalancer {

     ServiceInstance getServiceInstance(List<ServiceInstance> instances);
}
