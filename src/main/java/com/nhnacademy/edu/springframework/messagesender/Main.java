package com.nhnacademy.edu.springframework.messagesender;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context =
                     new ClassPathXmlApplicationContext("classpath:/beans.xml");) {
            MessageSenderService messageSenderService = context.getBean("messageSenderService", MessageSenderService.class);
            User user = new User("a@b.com", "820109");
            String msg = "hi hello";
            System.out.println("======================================");
//            messageSenderService.doSendMessage(user, msg);
        }
    }
}
