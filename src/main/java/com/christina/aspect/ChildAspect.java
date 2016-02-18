package com.christina.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ChildAspect {

	@Before("execution(public String getName())")
	public void getNameAdvice(){
		System.out.println("I have a name. ");
	}
	
	@Before("execution(* com.christina.service.*.get*())")
	public void getAllAdvice(){
		System.out.println("I can play!");
	}
}
