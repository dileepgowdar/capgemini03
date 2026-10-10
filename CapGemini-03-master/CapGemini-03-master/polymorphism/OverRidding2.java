package com.tns.polymorphism;

class Vehicle {

    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with a key");
    }
}

class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike starts with a self-start");
    }
}


public class OverRidding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Vehicle v1 = new Car();
	        Vehicle v2 = new Bike();

	        v1.start();
	        v2.start();

	}

}
