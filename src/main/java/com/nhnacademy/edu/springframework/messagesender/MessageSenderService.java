package com.nhnacademy.edu.springframework.messagesender;

public class MessageSenderService {
    private final MessageSender messageSender;

    public MessageSenderService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void doSendMessage(User user,String message) {
        messageSender.sendMessage(user, message);
    }
}
