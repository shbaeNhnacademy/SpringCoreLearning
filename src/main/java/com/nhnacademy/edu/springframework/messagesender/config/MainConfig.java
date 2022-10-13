package com.nhnacademy.edu.springframework.messagesender.config;

import com.nhnacademy.edu.springframework.messagesender.EmailMessageSender;
import com.nhnacademy.edu.springframework.messagesender.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.SmsMessageSender;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"com.nhnacademy.edu"})
@PropertySource("classpath:sender.properties")
@EnableAspectJAutoProxy
public class MainConfig {

//    @Bean
//    public MessageSender smsMessageSender() {
//        return new SmsMessageSender();
//    }


//    @Bean
//    public MessageSender emailMessageSender() {
//
//        return new EmailMessageSender();
//    }

}
