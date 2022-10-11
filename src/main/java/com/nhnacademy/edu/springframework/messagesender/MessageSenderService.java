package com.nhnacademy.edu.springframework.messagesender;

import org.springframework.stereotype.Controller;

public class MessageSenderService {
    private MessageSender messageSender;
//
//    public MessageSenderService(MessageSender messageSender) {
//        this.messageSender = messageSender;
//    }


    public MessageSenderService() {
    }


    public void setSmsMessageSender(MessageSender messageSender) {
        System.out.println("MessageSenderService.setMessageSender");
        this.messageSender = messageSender;
    }

    public void doSendMessage(User user, String message) {
        messageSender.sendMessage(user, message);
    }
}
