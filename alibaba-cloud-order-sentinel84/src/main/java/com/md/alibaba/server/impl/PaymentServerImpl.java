package com.md.alibaba.server.impl;

import com.md.alibaba.server.PaymentServer;
import com.md.springcloud.pojo.CommonResult;
import com.md.springcloud.pojo.PayMent;
import org.springframework.stereotype.Component;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-08-11 23:57
 * @Description:
 */
@Component
public class PaymentServerImpl implements PaymentServer {

    @Override
    public Object getServerPort(Integer id) {
        return new CommonResult<>(4444, "服务降级》》》PaymentServerImpl", new PayMent(1l, "errorServer"));
    }
}
