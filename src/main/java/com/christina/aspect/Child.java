package com.christina.aspect;

public class Child {

	private String name;
	
	public String getName() {
		return name;
	}

	@Loggable
	public void setName(String nC) {
		this.name = nC;
	}
	
	public void throwException(){
		throw new RuntimeException("Dummy Exception");
	}
	
}
