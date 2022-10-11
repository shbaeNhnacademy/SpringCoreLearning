package com.nhnacademy.edu.springframework.messagesender;

public class Main {
    public static void main(String[] args) {
        User user = new User("a@b.com", "8201099914501");
       new MessageSendService(new SmsMessageSender()).doSendMessage(user, "hello message");
       new MessageSendService(new EmailMessageSender()).doSendMessage(user, "hello message");
    }


}
