package com.christina.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ChildAspectPointcut {
	
	@Pointcut("execution(public String getName())")
	public void getNamePointcut(){}
	
	@Before("allMethodsPointcut()")
	public void allServiceMethodsAdvice(){
		System.out.println("Before");
	}
	
	//Pointcut to execute on all the methods of classes in a package
	@Pointcut("within(com.christina.service.*)")
	public void allMethodsPointcut(){}
	
}
