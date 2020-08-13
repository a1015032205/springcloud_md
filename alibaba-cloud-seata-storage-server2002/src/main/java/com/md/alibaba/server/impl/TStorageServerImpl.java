package com.md.alibaba.server.impl;

import com.md.alibaba.dao.TStorageMapper;
import com.md.alibaba.server.TStorageServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-08-13 19:59
 * @Description:
 */
@Slf4j
@SuppressWarnings(value = "unchecked")
@Service(value = "tStorageServerImpl")
public class TStorageServerImpl implements TStorageServer {

    @Autowired
    private TStorageMapper tStorageMapper;


    @Override
    public Object decrease(Integer productId, Integer count) {
        log.info("----->start 减库存");
        tStorageMapper.decrease(productId, count);
        log.info("------>end  减库存");
        return "------>OK 成功减库存";
    }


}
