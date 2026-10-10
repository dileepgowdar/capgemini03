package com.tns.interfacedemo;

interface GPS{
	void tracklocation();
	void calculateroute();
}

interface Vehiclesafety{
	void detectCollision();
	void applyEmergencyBrake();
}

 
	

class Smartvehicle implements GPS,Vehiclesafety{

	String vehiclenumber;
	int model;
	double currentspeed;
	String location;
	boolean collisionDetection;
	double speedlimit;
	
	Smartvehicle(String vehiclenumber,int model,double currentspeed,String location,boolean collisionDetection,double speedlimit){
	
	this.vehiclenumber=vehiclenumber;
	this.model=model;
	this.currentspeed=currentspeed;
	this.location=location;
	this.speedlimit=speedlimit;
	this.collisionDetection =false;
	}

	@Override
	public void detectCollision() {
		collisionDetection=true;
		if(collisionDetection) {
			System.out.println("WARNING :collision detected!");
			applyEmergencyBrake();
		}
		else {
			System.out.println("No collision detected.");
		}
		
	}

	@Override
	public void applyEmergencyBrake() {
		currentspeed=0;
		System.out.println("Emeregency Brake Activated!");
		System.out.println("Vehicle stopped safely.");
		
	}

	@Override
	public void tracklocation() {
		System.out.println("CurrentLocation :"+location);
		
	}

	@Override
	public void calculateroute() {
	String route ="Route: CityCenter -> MainRoad -> Airport";
		System.out.println(route);
		
	}
}


public class Task {
public static void main(String[] args) {
	Smartvehicle vehicle=new Smartvehicle("KA06SH5678",
			2012,
					100,
					"BANGLORE",
					false,
					50);
	vehicle.tracklocation();
	vehicle.calculateroute();
	vehicle.detectCollision();
	
	}
}
