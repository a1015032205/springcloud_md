package com.md.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-07-09 20:25
 * @Description: 支付
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> implements Serializable {


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
