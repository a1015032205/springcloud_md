package com.md.alibaba.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * t_account
 * @author 
 */
@Data
public class TAccount implements Serializable {
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 总额度
     */
    private Long total;

    /**
     * 已用额度
     */
    private Long user;

    /**
     * 剩余额度
     */
    private Long residue;

    private static final long serialVersionUID = 1L;
}