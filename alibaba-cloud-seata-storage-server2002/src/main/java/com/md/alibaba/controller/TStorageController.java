package com.md.alibaba.controller;

import com.md.alibaba.common.CommonController;
import com.md.alibaba.server.TStorageServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-08-13 20:44
 * @Description:
 */

@RestController
@RequestMapping(value = {"/storage"})
public class TStorageController extends CommonController {

    @Autowired
    private TStorageServer tStorageServer;

    @PostMapping(value = {"/decrease"})
    Object decrease(@RequestParam("productId") Integer productId, @RequestParam("count") Integer count) {
        return returnData(tStorageServer.decrease(productId, count));
    }

}
