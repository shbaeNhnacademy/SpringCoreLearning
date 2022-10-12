package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.annotation.SMS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

public class MessageSenderService {
    private final MessageSender messageSender;
    private final String name;

    @Autowired
    public MessageSenderService(@SMS MessageSender messageSender,
                                @Value("${from}") String name) {
        this.messageSender = messageSender;
        this.name = name;
        System.out.println("MessageSenderService - name = " + name);
    }

    public void doSendMessage(User user, String message) {
        messageSender.sendMessage(user, message);
    }
}
