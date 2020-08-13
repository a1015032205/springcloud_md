package com.md.alibaba.controller;

import com.md.alibaba.common.CommonController;
import com.md.alibaba.server.TAccountServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-08-13 20:44
 * @Description:
 */

@RestController
@RequestMapping(value = {"/account"})
public class TAccountController extends CommonController {

    @Autowired
    private TAccountServer tStorageServer;

    @PostMapping(value = {"/decrease"})
    Object decrease(@RequestParam("urerId") Integer urerId, @RequestParam("money") BigDecimal money) {
        return returnData(tStorageServer.decrease(money, urerId));
    }

}
