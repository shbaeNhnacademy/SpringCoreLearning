package com.nhnacademy.edu.springframework.messagesender;

public class SmsMessageSender implements MessageSender {
    public SmsMessageSender() {
        System.out.println("SmsMessageSender.SmsMessageSender");
    }

    public void sendMessage(User user, String message) {
        System.out.println("SMS Message Sent to " + user.getPhoneNumber() + " : " + message);
    }
}
