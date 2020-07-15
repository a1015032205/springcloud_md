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
public class PayMent implements Serializable {


    private Long id;

    private String serial;

}
