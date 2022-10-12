package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationMain {
    public static void main(String[] args) {
//        String basePackage = "com.nhnacademy.edu.springframework.messagesender";
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

        MessageSender smsMessageSender = context.getBean("smsMessageSender", MessageSender.class);
        MessageSender emailMessageSender = context.getBean("emailMessageSender", MessageSender.class);

        User user = new User("a@b.com", "820109");
        String msg = "hi hello";

        smsMessageSender.sendMessage(user, msg);
        emailMessageSender.sendMessage(user, msg);

    }
}
