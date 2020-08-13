package com.md.alibaba.server;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-08-13 19:59
 * @Description:  商品
 */

public interface TStorageServer {

    Object decrease(Integer productId, Integer count);

}
