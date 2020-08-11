package com.md.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.md.springcloud.pojo.CommonResult;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-08-11 22:26
 * @Description:
 */

public class CustmerBlockHandler {

    public static Object handler1(BlockException ex){
          return new CommonResult<>(5555, "用户自定义返回》》》》》》》》》1111");
    }

    public static Object handler2(BlockException ex){
        return new CommonResult<>(5555, "用户自定义返回》》》》》》》》》2222");
    }
}
