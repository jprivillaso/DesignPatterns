package com.main.java.abstractFactory;

public class CarFactory extends AbstractFactory{

	@Override
	public Car getCar(String name) {
		
		switch (name) {
		case "Coupe":
			return new Coupe("Coupe1");
		case "Sedan":
			return new Sedan("Sedan1");
		default:
			break;
		}
		
		return null;
		
	}
	
}
