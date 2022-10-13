package com.nhnacademy.edu.springframework.messagesender;


import org.springframework.stereotype.Component;

@Component
public class EmailMessageSender implements MessageSender {

    public EmailMessageSender() {
        System.out.println("EmailMessageSender.EmailMessageSender");
    }

    public boolean sendMessage(User user, String message) {
        System.out.println("EMAIL Message Sent to " + user.getEmail() + " : " + message);
        return true;
    }

    public void cleanup() {
        System.out.println(" + EmailMessageSender destroy");
    }

}
