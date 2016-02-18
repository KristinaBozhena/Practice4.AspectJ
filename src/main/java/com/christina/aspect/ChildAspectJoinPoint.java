package com.christina.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ChildAspectJoinPoint {

	@Before("execution(public void com.christina.aspect..set*(*))")
	public void loggingAdvice(JoinPoint joinPoint) {
		System.out.println("Names: " + Arrays.toString(joinPoint.getArgs()));

	}
	
	@Before("args(name)")
	public void logStringArguments(String name) {
		System.out.println("My name is " + name);
	}
}
