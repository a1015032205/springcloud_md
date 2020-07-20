package com.md.springcloud.dao;

import com.md.springcloud.pojo.PayMent;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-07-09 20:34
 * @Description:
 */

public interface PayMentMapper {

    int create(PayMent payMent);

    PayMent getPayMentById(@Param("id") Long id);
}
