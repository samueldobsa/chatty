package com.example.chatty.controller;

import com.example.chatty.entity.Message;
import com.example.chatty.entity.OutputMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class ChatController {

    @MessageMapping("/message")
    @SendTo("/topic/messages")
    public OutputMessage send(Message message) {
        String from = message.getFrom(); // Get username from the message
        return new OutputMessage(from, HtmlUtils.htmlEscape(message.getText()));
    }
}

