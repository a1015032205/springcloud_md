package com.md.springcloud.controller;

import com.md.springcloud.pojo.CommonResult;
import com.md.springcloud.pojo.PayMent;
import com.md.springcloud.service.PayMentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-07-09 20:57
 * @Description:
 */

@RestController
@RequestMapping(value = {"/PayMent"})
public class PayMentController extends BaseController {

    @Autowired
    @Qualifier(value = "payMentServiceImpl")
    private PayMentService payMentService;

    @PostMapping
    public CommonResult<?> create(@RequestBody PayMent payMent) {

        return new CommonResult<>(payMentService.create(payMent));
    }

    @GetMapping("/{id}")
    public CommonResult<?> getPayMentById(@PathVariable(name = "id") Long id) {
        return new CommonResult<>(payMentService.getPayMentById(id));
    }
}
