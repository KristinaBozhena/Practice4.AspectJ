package com.christina.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class ChildAfterAspect {

	@After("args(name)")
	public void logStringArguments(String name) {
		System.out.println("This toies are property of " + name);
	}

}
