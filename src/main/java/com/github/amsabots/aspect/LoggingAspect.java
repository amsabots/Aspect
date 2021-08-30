package com.github.amsabots.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class LoggingAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    @Pointcut("@annotation(Loggable)")
    public void executeLogging() {
    }

//    @Before("executeLogging()")
//    public void logMethodCall(JoinPoint joinPoint){
//    StringBuilder stringBuilder = new StringBuilder("Method: ");
//    stringBuilder.append(joinPoint.getSignature().getName());
//    Object[] args = joinPoint.getArgs();
//    if(args !=null && args.length>0){
//        stringBuilder.append("args=[ | ");
//        Arrays.asList(args).forEach(a->{
//            stringBuilder.append(a).append(" | ");
//        });
//        stringBuilder.append("]");
//    }else{
//        stringBuilder.append("No arguments for this method call");
//    }
//    LOGGER.info(stringBuilder.toString());
//    }

    @AfterReturning(value="executeLogging()", returning="returnValue")
    public void logMethodCall(JoinPoint joinPoint, Object returnValue){
        StringBuilder stringBuilder = new StringBuilder("Method: ");
    stringBuilder.append(joinPoint.getSignature().getName());
    Object[] args = joinPoint.getArgs();
    if(args !=null && args.length>0){
        stringBuilder.append("args=[ | ");
        Arrays.asList(args).forEach(a->{
            stringBuilder.append(a).append(" | ");
        });
        stringBuilder.append("]");
    }else{
        stringBuilder.append("No arguments for this method call");
    }
    LOGGER.info(stringBuilder.toString());
    }
}
