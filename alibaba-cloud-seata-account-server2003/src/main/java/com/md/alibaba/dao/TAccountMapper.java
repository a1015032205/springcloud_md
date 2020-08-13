package com.md.alibaba.dao;

import com.md.alibaba.pojo.TAccount;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

public interface TAccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TAccount record);

    int insertSelective(TAccount record);

    TAccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TAccount record);

    int updateByPrimaryKey(TAccount record);

    int decrease(@Param("money") BigDecimal money, @Param("userId") Integer userId);
}