package com.md.alibaba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-08-10 22:39
 * @Description:
 */

@RequestMapping(value = {"/sentinel"})
@RestController
public class SentinelController {

    @GetMapping("/test1")
    public Object test1(){
//        try {
//            TimeUnit.MILLISECONDS.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("访问test1");
        return Thread.currentThread().getName()+">>>>>>>>test1";
    }

    @GetMapping("/test2")
    public Object test2(){
        System.out.println("访问test2");
        return Thread.currentThread().getName()+">>>>>>>>test2";
    }
}
