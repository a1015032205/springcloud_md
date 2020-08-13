package com.md.alibaba.server;

import java.math.BigDecimal;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-08-13 19:59
 * @Description:  商品
 */

public interface TAccountServer {

    Object decrease(BigDecimal money, Integer userId);

}
