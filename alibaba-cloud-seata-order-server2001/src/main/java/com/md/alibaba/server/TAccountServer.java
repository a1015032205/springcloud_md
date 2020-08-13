package com.md.alibaba.server;

import com.md.alibaba.pojo.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-08-13 19:59
 * @Description:  金额
 */
@FeignClient(value = "seata-account-server2003")
public interface TAccountServer {

    @PostMapping(value = {"/account/decrease"})
    CommonResult decrease( @RequestParam("urerId") Integer urerId, @RequestParam("money") BigDecimal money);

}
