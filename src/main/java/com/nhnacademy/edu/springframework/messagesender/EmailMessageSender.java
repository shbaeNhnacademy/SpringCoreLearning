package com.nhnacademy.edu.springframework.messagesender;

public class EmailMessageSender implements MessageSender {

    public EmailMessageSender() {
        System.out.println("EmailMessageSender.EmailMessageSender");
    }

    public void sendMessage(User user, String message) {
        System.out.println("EMAIL Message Sent to " + user.getEmail() + " : " + message);
    }
}
