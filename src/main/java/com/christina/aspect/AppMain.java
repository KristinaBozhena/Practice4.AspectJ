package com.christina.aspect;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.christina.service.ChildService;

public class AppMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("SpringBean.xml");
		ChildService childService = ctx.getBean("childService", ChildService.class);
		System.out.println(childService.getChild().getName());
		childService.getChild().setName("Lysi");
		ctx.close();
	}

}
