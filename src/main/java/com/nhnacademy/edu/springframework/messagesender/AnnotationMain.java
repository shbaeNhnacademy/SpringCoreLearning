package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.config.MainConfig;
import com.nhnacademy.edu.springframework.messagesender.config.ServiceConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationMain {
    public static void main(String[] args) {
        String basePackage = "com.nhnacademy.edu.springframework.messagesender.config";
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(basePackage); //MainConfig.class, ServiceConfig.class

        User user = new User("a@b.com", "820109");
        String msg = "hi hello";

        MessageSenderService bean = context.getBean(MessageSenderService.class);
//        bean.doSendMessage(user, msg);
        bean.doSendMessage(user, msg,"myName");



    }
}
