package com.md.alibaba.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * t_storage
 * @author 
 */
@Data
public class TStorage implements Serializable {
    private Integer id;

    /**
     * 产品ID
     */
    private Integer productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;

    private static final long serialVersionUID = 1L;
}