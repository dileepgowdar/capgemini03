package com.tns.inheritance;

class Vehicle{
	
	String colour="black";
	void speed() {
		System.out.println("high speed");
	}
}
class Car extends Vehicle{
	void engine() {
		System.out.println("good");
	}
}
class minicar extends Car{
	void show() {
		System.out.println("good speed");
	

}
}
public class MultiLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		minicar m=new minicar();
		m.speed();
		m.engine();
		m.show();
	Car c=new Car();
	c.speed();

	}

}
