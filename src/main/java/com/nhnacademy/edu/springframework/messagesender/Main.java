package com.nhnacademy.edu.springframework.messagesender;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:/beans.xml");

        MessageSender smsMessageSender = context.getBean("smsMessageSender", MessageSender.class);
        MessageSender emailMessageSender = context.getBean("emailMessageSender", MessageSender.class);

        User user = new User("a@b.com", "8201099914501");
        new MessageSendService(smsMessageSender).doSendMessage(user,"Hello~~");
        new MessageSendService(emailMessageSender).doSendMessage(user,"Hello~~");
    }


}
