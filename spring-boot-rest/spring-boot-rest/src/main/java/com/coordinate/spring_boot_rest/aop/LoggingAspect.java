package com.coordinate.spring_boot_rest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAspect {

    private static final Logger LOGGER= LoggerFactory.getLogger(LoggingAspect.class);

    //syntax-return type fully qualified class name.method name(args)
    // || pipe for combining multiple methods -method1(args) || method2...
    @Before("execution(* com.coordinate.spring_boot_rest.service.JobService.*(..))")
    public void logMethodCall(JoinPoint jp){
        LOGGER.info("Method called " + jp.getSignature().getName());

    }
    @After("execution(* com.coordinate.spring_boot_rest.service.JobService.*(..))")
    public void logMethodExecution(JoinPoint jp){
        LOGGER.info("Method executed " + jp.getSignature().getName());

    }

    @AfterThrowing("execution(* com.coordinate.spring_boot_rest.service.JobService.*(..))")
    public void logMethodException(JoinPoint jp){
        LOGGER.info("Method exception " + jp.getSignature().getName());

    }

}
