package com.md.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-07-09 20:57
 * @Description:
 */

@Component
@EnableBinding(Sink.class)
public class ReceiveMessageController extends BaseController {


    @Value("${server.port}")
    private String port;

    @StreamListener(Sink.INPUT)
    void sendMessage(Message<String> stringMessage){
        System.out.println("消费者："+port+"----》成功消费===》》"+stringMessage.getPayload());
    }

}
