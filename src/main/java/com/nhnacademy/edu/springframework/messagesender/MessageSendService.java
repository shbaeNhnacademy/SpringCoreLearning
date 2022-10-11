package com.nhnacademy.edu.springframework.messagesender;

public class MessageSendService {
    private final MessageSender messageSender;

    public MessageSendService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void doSendMessage() {
         User user = new User("a@b.com", "8201099914501");
        messageSender.sendMessage(user, "hello~");
    }
}
