package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.annotation.TimeLogging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MessageSenderService {
    private final MessageSender messageSender;

    @Value("${from}")
    private String name;
    @Autowired //@SMS
    public MessageSenderService(MessageSender messageSender) {
        this.messageSender = messageSender;
        System.out.println("name = " + name);
    }


    public void doSendMessage(User user, String message) {
        messageSender.sendMessage(user, message);
        System.out.println("name = " + name);
    }

    @TimeLogging(value = "직접 만든 어노테이션 ")
    public void doSendMessage(User user, String message,String myName) {
        messageSender.sendMessage(user, message);
        System.out.println("myName = " + myName);
        System.out.println("프로퍼티스 파일 name = " + name);
    }
}
