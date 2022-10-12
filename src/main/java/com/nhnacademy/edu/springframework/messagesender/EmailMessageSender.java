package com.nhnacademy.edu.springframework.messagesender;


import org.springframework.stereotype.Component;

@Component
public class EmailMessageSender implements MessageSender {

    public EmailMessageSender() {
        System.out.println("EmailMessageSender.EmailMessageSender");
    }

    public void sendMessage(User user, String message) {
        System.out.println("EMAIL Message Sent to " + user.getEmail() + " : " + message);
    }

    public void cleanup() {
        System.out.println(" + EmailMessageSender destroy");
    }

}
