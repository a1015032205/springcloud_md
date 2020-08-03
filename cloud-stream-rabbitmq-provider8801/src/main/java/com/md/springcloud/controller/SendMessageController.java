package com.md.springcloud.controller;

import com.md.springcloud.service.MessageServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-07-09 20:57
 * @Description:
 */

@RestController
@RequestMapping(value = {"/8801"})
public class SendMessageController extends BaseController {

    @Autowired
    private MessageServer messageServer;

    @GetMapping("/sendMessage")
    String sendMessage(){
        return messageServer.send();
    }

}
