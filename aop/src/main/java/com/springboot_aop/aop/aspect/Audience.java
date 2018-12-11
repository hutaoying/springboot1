package com.springboot_aop.aop.aspect;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Audience {
    @Pointcut("execution(public * com.springboot_aop.aop.concert.Performance.perform(..))")
    public void performance(){}

    @Before("performance()")
    public void silenceCellPhones(){
        System.out.println("Silencing cell phones");
    }
    @Before("performance()")
    public void takeSeats(){
        System.out.println("Taking seata");
    }
    @AfterReturning("performance()")
    public void applause(){
        System.out.println("CALL CALL");
    }
    @AfterThrowing("performance()")
    public void demandRefund(){
        System.out.println("Demanding a refund");
    }

}
