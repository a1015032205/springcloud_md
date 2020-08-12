package com.md.alibaba.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * t_order
 * @author 
 */
@Data
public class TOrder implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 产品id
     */
    private Integer productId;

    /**
     * 数量
     */
    private Integer count;

    /**
     * 金额
     */
    private Long money;

    /**
     * 0:创建中 1:已完结
     */
    private Integer status;

    private static final long serialVersionUID = 1L;
}