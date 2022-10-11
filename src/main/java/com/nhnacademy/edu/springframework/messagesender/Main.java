package com.nhnacademy.edu.springframework.messagesender;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:/beans.xml"); //실행 -> 조립

        User user = new User("a@b.com", "820109");
        String msg = "hi hello";

        System.out.println("======================================");

        new MessageSendService(context.getBean("smsMessageSender", MessageSender.class)).doSendMessage(user,msg);
        new MessageSendService(context.getBean("emailMessageSender", MessageSender.class)).doSendMessage(user,msg);
        new MessageSendService(context.getBean("smsMessageSender", MessageSender.class)).doSendMessage(user,msg);
        new MessageSendService(context.getBean("emailMessageSender", MessageSender.class)).doSendMessage(user,msg);

        context.close();
    }
    // app 종료 =>  spring bean 종료


}
