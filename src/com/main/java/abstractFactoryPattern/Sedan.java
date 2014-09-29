package com.main.java.abstractFactory;

public class Sedan implements Car{
	
	private String name;
	
	public Sedan(String name){
		this.name = name;
	}

	@Override
	public void getCarInfo() {
		System.out.println("Sedan name: " + name);
	}
	
}
