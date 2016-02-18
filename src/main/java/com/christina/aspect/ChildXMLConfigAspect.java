package com.christina.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class ChildXMLConfigAspect {

	public Object childAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		System.out.println("ChildXMLConfigAspect:: Before invoking getName() method");
		Object value = null;
		try {
			value = proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("ChildXMLConfigAspect:: After invoking getName() method. Return value=" + value);
		return value;
	}
}
