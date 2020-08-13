package com.md.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-08-13 20:52
 * @Description:
 */
@Configuration
@MapperScan("com.md.alibaba.dao")
public class MyBatisConfig {
}
