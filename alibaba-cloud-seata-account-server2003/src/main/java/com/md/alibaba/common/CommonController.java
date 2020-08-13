package com.md.alibaba.common;

import com.md.springcloud.pojo.CommonResult;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-08-13 20:48
 * @Description:
 */
@CrossOrigin
public class CommonController {

    public Object returnData(Object obj) {
        return new CommonResult<>(200, "成功", obj);
    }
}
