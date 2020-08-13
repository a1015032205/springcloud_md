package com.md.alibaba.server.impl;

import com.md.alibaba.dao.TAccountMapper;
import com.md.alibaba.server.TAccountServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-08-13 19:59
 * @Description:
 */
@Slf4j
@SuppressWarnings(value = "unchecked")
@Service(value = "tAccountServerImpl")
public class TAccountServerImpl implements TAccountServer {

    @Autowired
    private TAccountMapper tAccountMapper;



    @Override
    public Object decrease(BigDecimal money, Integer userId) {
        log.info("----->start 扣除余额");
        //模拟异常  全局回滚
        int i = 10 / 0;
        tAccountMapper.decrease( money,  userId);
        log.info("------>end  扣除余额");
        return "------>OK 成功扣除余额";
    }


}
