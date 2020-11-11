package com.my.bye;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.*;

@Component
@Aspect

public class TimeTracer1 {
	
	@Around(value="execution(* com.my.bye.ByeController.sayBye(..))")
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable {
		
		Signature s = joinPoint.getSignature(); //클래스이름 메서드이름이 나옴 (메서드라고 생각하면 됌)
		
		String methodName = s.getName();
		System.out.println("[Log]Before : "+methodName+"time check start");
		long startTime = System.nanoTime();
		
		Object result = joinPoint.proceed();
		
		long endTime = System.nanoTime();
		System.out.println("[Log]After : "+methodName+"time check end");
		System.out.println("[Log] "+methodName+"Proceeding time is "+(endTime-startTime)+"ns");
		return result;
	
	
	
	}
	
	
}
