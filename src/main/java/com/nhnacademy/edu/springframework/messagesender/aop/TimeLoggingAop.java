package com.nhnacademy.edu.springframework.messagesender.aop;

import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.annotation.TimeLogging;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
@Aspect
public class TimeLoggingAop {


    @Pointcut("execution(* com.nhnacademy.edu.springframework.messagesender.MessageSenderService.*(..))")
    private void pointcut() {
    }


    @Before("@annotation(timeLogging) && args(user,s2,myName)")
    public void before(JoinPoint joinPoint, TimeLogging timeLogging, User user, String s2, String myName) { //
        System.out.println("===================================================");
        System.out.println("signature name = " + joinPoint.getSignature().getName());
        System.out.println("timeLogging value = " + timeLogging.value());
        System.out.println(" args  = " + myName);
        System.out.println("===================================================");
    }

//    @Before("pointcut()")
//    private void beforeMethod(JoinPoint point) {
//        System.out.println("======== AOP 적용 ========   [" + point.getSignature().getName()+"]");
//    }

    @Around("pointcut()")
    public Object checkOperatingTime(ProceedingJoinPoint point) throws Throwable {

        StopWatch stopWatch = new StopWatch("time Tracker");
        try {
            stopWatch.start();
            Object proceed = point.proceed();
            return proceed;
        } finally {
            stopWatch.stop();
            System.out.println(stopWatch.prettyPrint() +"  "+ stopWatch.getTotalTimeMillis());
        }
    }
}
