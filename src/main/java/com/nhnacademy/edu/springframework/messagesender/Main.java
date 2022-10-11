package com.nhnacademy.edu.springframework.messagesender;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:/beans.xml");

        MessageSender smsMessageSender = context.getBean("smsMessageSender", MessageSender.class);
        MessageSender emailMessageSender = context.getBean("emailMessageSender", MessageSender.class);

        new MessageSendService(smsMessageSender).doSendMessage();
        new MessageSendService(emailMessageSender).doSendMessage();
    }


}
