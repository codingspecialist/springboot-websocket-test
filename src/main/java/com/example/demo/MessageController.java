package com.example.demo;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class MessageController {

    private final SimpMessageSendingOperations sms;

    @MessageMapping("/hello")
    public void hello(Message message) {
        System.out.println("메시지 들어옴");
        sms.convertAndSend("/sub/channel/" + message.getChannelId(), message);
    }
}
