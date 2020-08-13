package com.md.alibaba.dao;

import com.md.alibaba.pojo.TStorage;
import org.apache.ibatis.annotations.Param;

public interface TStorageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TStorage record);

    int insertSelective(TStorage record);

    TStorage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TStorage record);

    int updateByPrimaryKey(TStorage record);

    int decrease(@Param("productId") Integer productId, @Param("count") Integer count);
}