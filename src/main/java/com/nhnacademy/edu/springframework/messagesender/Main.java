package com.nhnacademy.edu.springframework.messagesender;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        User user = new User("a@b.com", "8201099914501");
        main.sendSmsMessage(user, "hello Message");
    }

    private void sendSmsMessage(User user, String message) {
        System.out.println("SMS Message Sent to " + user.getPhoneNumber() + " : " + message);
    }

    private void sendEmailMessage(User user, String message) {
        System.out.println("EMAIL Message Sent to " + user.getEmail() + " : " + message);
    }
}
