package com.nhnacademy.edu.springframework.messagesender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;


public class MessageSenderService {
    private final MessageSender messageSender;

    @Value("${from}")
    private String name;
    @Autowired //@SMS
    public MessageSenderService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void doSendMessage(User user, String message) {
        messageSender.sendMessage(user, message);
        System.out.println("name = " + name);

    }
}
