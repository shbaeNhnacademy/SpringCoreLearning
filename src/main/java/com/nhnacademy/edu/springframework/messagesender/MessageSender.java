package com.nhnacademy.edu.springframework.messagesender;

public interface MessageSender {
    public boolean sendMessage(User user, String message);
}
