package com.md.springcloud.service.fallback;

import com.md.springcloud.service.OpenFeignService;
import org.springframework.stereotype.Component;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-07-28 21:08
 * @Description: 服务降级
 */
@Component
public class OpenFeignServiceFallBackImpl implements OpenFeignService {

    @Override
    public String isOk(String id) {
        return "isOk ----------  服务不可用!";
    }

    @Override
    public String isTimeOut(String id) {
        return "isTimeOut ----------  服务不可用";
    }

    @Override
    public Object getServerInfo() {
        return "getServerInfo ----------  服务不可用";
    }
}
