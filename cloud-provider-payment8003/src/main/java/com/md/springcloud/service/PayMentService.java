package com.md.springcloud.service;

import com.md.springcloud.pojo.PayMent;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-07-09 20:44
 * @Description:
 */

public interface PayMentService {

    int create(PayMent payMent);

    PayMent getPayMentById(@Param("id") Long id);
}
