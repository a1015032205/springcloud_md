package com.md.springcloud.service.impl;

import com.md.springcloud.service.MessageServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import java.util.UUID;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-07-09 20:52
 * @Description:
 */

@Slf4j
@EnableBinding(Source.class)//定义消息的推送管道
public class MessageServerImpl implements MessageServer {


    /**
     * 消息发送管道 多个实现类
     * output
     * errorChannel
     * nullChannel
     */
    @Autowired
    @Qualifier("output")
    private MessageChannel output;

    @Override
    public String send() {
        String uuid = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(uuid).build());
        log.info(uuid);
        return null;
    }


}
