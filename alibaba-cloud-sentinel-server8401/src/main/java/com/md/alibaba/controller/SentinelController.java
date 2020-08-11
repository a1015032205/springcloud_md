package com.md.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-08-10 22:39
 * @Description:
 */

@RequestMapping(value = {"/sentinel"})
@RestController
@Slf4j
public class SentinelController {

    @GetMapping("/test1")
    public Object test1() {
//        try {
//            TimeUnit.MILLISECONDS.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("访问test1");
        return Thread.currentThread().getName() + ">>>>>>>>test1";
    }

    @GetMapping("/test2")
    public Object test2() {
        log.info(Thread.currentThread().getName() + "访问test2");
        return Thread.currentThread().getName() + ">>>>>>>>test2";
    }

    @GetMapping("/test3")
    public Object test3() {
        return Thread.currentThread().getName() + ">>>>>>>>test3";
    }

    @GetMapping("/test4")
    public Object test4() {
//        try {
//            TimeUnit.SECONDS.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        int i = 10 / 0;
        log.info("test RT");
        return Thread.currentThread().getName() + ">>>>>>>>test4";
    }


    @GetMapping("/test5")
    public Object test5() {
//        try {
//            TimeUnit.SECONDS.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        int i = 10 / 0;
        log.info("test 异常数");
        return Thread.currentThread().getName() + ">>>>>>>>test5";
    }


    @GetMapping("/test6")
    @SentinelResource(value = "test6", blockHandler = "test6Block")
    public Object test6(@RequestParam(value = "p1", required = false) String p1,
                        @RequestParam(value = "p2", required = false) String p2) {
        return Thread.currentThread().getName() + ">>>>>>>>test6";
    }


    public Object test6Block(String p1, String p2, BlockException blockException) {
        return Thread.currentThread().getName() + ">>>>>>>>test6Block";
    }
}
