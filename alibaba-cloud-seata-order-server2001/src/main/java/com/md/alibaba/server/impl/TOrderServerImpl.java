package com.md.alibaba.server.impl;

import com.md.alibaba.dao.TOrderMapper;
import com.md.alibaba.pojo.TOrder;
import com.md.alibaba.server.TOrderServer;
import com.md.alibaba.server.TAccountServer;
import com.md.alibaba.server.TStorageServer;
import io.seata.spring.annotation.GlobalTransactional;
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
@Service(value = "tOrderServerImpl")
public class TOrderServerImpl implements TOrderServer {

    @Autowired
    private TOrderMapper tOrderMapper;

    @Autowired
    private TAccountServer taccountServer;


    @Autowired
    private TStorageServer tstorOrderServer;


    @Override
    @GlobalTransactional(name = "text",rollbackFor = Exception.class)
    public Object create(TOrder record) {
        log.info("----->start创建订单");
        tOrderMapper.insert(record);
        log.info("------>end创建订单  start扣除库存count");

        log.info("------>start减库存");
        tstorOrderServer.decrease(record.getProductId(), record.getCount());
        log.info("------>end减库存  start扣除money");

        log.info("------>start扣除money");
        taccountServer.decrease(record.getUserId(), record.getMoney());
        log.info("------>end扣除money  修改订单状态");

        log.info("------>START  修改订单状态");
        tOrderMapper.updateStatus(record.getId());
        log.info("------>END  修改订单状态");

        log.info("------>OK 成功下订单");
        return "------>OK 成功下订单";
    }


}
