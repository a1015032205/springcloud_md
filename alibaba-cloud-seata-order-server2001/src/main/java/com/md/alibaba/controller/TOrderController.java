package com.md.alibaba.controller;

import com.md.alibaba.common.CommonController;
import com.md.alibaba.pojo.TOrder;
import com.md.alibaba.server.TOrderServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-08-13 20:44
 * @Description:
 */

@RestController
@RequestMapping(value = {"/order"})
public class TOrderController extends CommonController {

    @Autowired
    private TOrderServer tOrderServer;

    @GetMapping
    Object create(TOrder order) {
        return returnData(tOrderServer.create(order));
    }

}
