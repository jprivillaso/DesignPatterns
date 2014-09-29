package com.main.java.abstractFactory;

public class Coupe implements Car{
	
	private String name;
	
	public Coupe(String name){
		this.name = name;
	}
	
	@Override
	public void getCarInfo() {
		System.out.println("Coupe car: " + name);
	}
	
}
