package com.my.bye;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.*;


@Component
@Aspect
public class LogAspect1 {
	
	@Pointcut(value="execution(* com.my.bye.ByeController.sayBye(..))")
	private void ByePointcut() {}
	
	@Before("ByePointcut()")
	public void beforeLog(JoinPoint joinPoint) {
		Signature s = joinPoint.getSignature();
		System.out.println("클래스: "+s.getDeclaringTypeName()+" 메서드: "+s.getName()+"시작.");
	}
	
	@After("ByePointcut()")
	public void afterLog(JoinPoint joinPoint) {
		
	Signature s = joinPoint.getSignature();
	System.out.println("클래스: "+s.getDeclaringTypeName()+" 메서드: "+s.getName()+"종료.");

	}


}
