package com.md.springcloud.service.impl;

import com.md.springcloud.dao.PayMentMapper;
import com.md.springcloud.pojo.PayMent;
import com.md.springcloud.service.PayMentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-07-09 20:52
 * @Description:
 */

@Slf4j
@Service(value = "payMentServiceImpl")
@SuppressWarnings("unchecked")
@Transactional(rollbackFor = Exception.class)
public class PayMentServiceImpl implements PayMentService {

    @Autowired
    private PayMentMapper payMentMapper;

    @Override
    public int create(PayMent payMent) {
        return payMentMapper.create(payMent);
    }

    @Override
    public PayMent getPayMentById(Long id) {
        return payMentMapper.getPayMentById(id);
    }
}
