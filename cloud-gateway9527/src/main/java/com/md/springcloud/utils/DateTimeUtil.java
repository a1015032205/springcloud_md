package com.md.springcloud.utils;

import java.time.ZonedDateTime;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-07-30 22:18
 * @Description:
 */

public class DateTimeUtil {
    public static void main(String[] args) {
        getTime();
    }

    private static void getTime(){
        //默认时区
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
    }
}
