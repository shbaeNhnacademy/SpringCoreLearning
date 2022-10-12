package com.nhnacademy.edu.springframework.messagesender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class SmsMessageSender implements MessageSender {

    @Value("${from}")
    private String name;

    @Value("${mail.domain}")
    private String emailDomain;


    public SmsMessageSender() {
        System.out.println("SmsMessageSender.SmsMessageSender");
    }

    public void sendMessage(User user, String message) {
        System.out.println("SMS Message Sent to " + user.getPhoneNumber() + " : " + message);
    }

    public void init() {
        System.out.println("name = " + name);
        System.out.println("emailDomain = " + emailDomain);
        System.out.println(" + SmsMessageSender initializing");
    }
}
