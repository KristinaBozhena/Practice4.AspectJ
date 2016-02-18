package com.christina.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class ChildAroundAspect {

	@Around("execution(* com.christina.aspect.Child.getName())")
	public Object childAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
		Object value = null;
		try {
			value = proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("Return value = "+value);
		return value;
	}
}
