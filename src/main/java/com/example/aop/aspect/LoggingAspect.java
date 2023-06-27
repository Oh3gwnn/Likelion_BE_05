package com.example.aop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Slf4j      // log
@Aspect     // 관점(Aspect) 클래스 어노테이션
@Component  // Bean 객체 등록
public class LoggingAspect {
    // 컨트롤러 클래스 Full Name
    // @Before: Advice, 실제 실행될 코드
    // @Before.value: Pointcut Designator, 어느 JoinPoint에서 실행될 것인지
    @Before("this(com.example.aop.controller.AopController)")
    // JoinPoint: 이 Advice가 실행된 JoinPoint (addUser)
    public void logParameters(JoinPoint joinPoint) {
        // Signature: JoinPiont의 정보를 담은 객체
        Signature signature = joinPoint.getSignature();
        // 메소드 로그 이름
        log.info(signature.getName());
        // 메소드 인자들 확인
        Object[] arguments = joinPoint.getArgs();
        // 인자 없을 시
        if (arguments.length == 0) log.info("no args");

        for (Object argument : arguments) log.info("argument: [{}]", argument);
    }
}
