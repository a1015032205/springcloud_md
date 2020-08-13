package com.md.alibaba.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-08-12 23:13
 * @Description: common
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {


    public static final String SUCCESS = "SUCCESS";

    private Integer code;

    private String message;

    private T data;


    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }


    public CommonResult(T data) {
        this(200, SUCCESS, data);
    }
}
