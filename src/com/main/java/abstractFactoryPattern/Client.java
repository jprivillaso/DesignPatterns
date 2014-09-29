package com.main.java.abstractFactory;

public class Client{
	
	public static void main(String [] args){
		
		// Create instance of car factory
		AbstractFactory carFactory = new CarFactory();
		
		// Create as many cars as you want
		Car sedan = carFactory.getCar("Sedan");
		sedan.getCarInfo();
		
		Car coupe = carFactory.getCar("Coupe");
		coupe.getCarInfo();
		
	}
	
}
