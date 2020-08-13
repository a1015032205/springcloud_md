package com.md.alibaba.server;

import com.md.alibaba.pojo.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-08-13 19:59
 * @Description:  商品
 */
@FeignClient(value = "seata-storage-server2002")
public interface TStorageServer {

    /**
     * 减库存
     * @param productId 订单ID
     * @param count 数量
     * @return
     */
    @PostMapping(value = {"/storage/decrease"})
    CommonResult decrease(@RequestParam("productId") Integer productId, @RequestParam("count") Integer count);

}
