package com.lasertagproject.player.controller;

import com.lasertagproject.player.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class PlayerWhoHitPlayerMessgController {
    @Autowired
    Message messg;

    @MessageMapping("/message")
    @SendTo("/room/public")
    public Message receiveMessage(@Payload Message message){
        message.setMessage(messg.getMessage());
        messg.setMessage("null");
        return message;
    }
}