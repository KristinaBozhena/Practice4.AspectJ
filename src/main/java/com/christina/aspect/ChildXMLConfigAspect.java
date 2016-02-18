package com.christina.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class ChildXMLConfigAspect {

	public Object childAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		Object value = null;
		try {
			value = proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("Child XML Config Aspect: Return value = " + value);
		return value;
	}
}
