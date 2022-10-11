package com.nhnacademy.edu.springframework.messagesender;

public class MessageSenderService {
    private MessageSender messageSender;
//
//    public MessageSenderService(MessageSender messageSender) {
//        this.messageSender = messageSender;
//    }


    public MessageSenderService() {
    }

    public void setMessageSender(MessageSender messageSender) {
        System.out.println("MessageSenderService.setMessageSender");
        this.messageSender = messageSender;
    }

    public void doSendMessage(User user, String message) {
        messageSender.sendMessage(user, message);
    }
}
