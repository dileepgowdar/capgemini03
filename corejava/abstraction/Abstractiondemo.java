package com.tns.abstraction;
abstract class Delivery{
	abstract double calculatecharge(double distance);
	void showDeliveryType() {
		System.out.println("delivery serivce selected");
		}
	}
class BikeDelivery extends Delivery{

	@Override
	double calculatecharge(double distance) {
		// TODO Auto-generated method stub
		return distance*10;
	}
	
}
class DroneDelivery extends Delivery{

	@Override
	double calculatecharge(double distance) {
		// TODO Auto-generated method stub
		return distance*20;
	}
	
}

public class Abstractiondemo {
public static void main(String[] args) {
	BikeDelivery b=new BikeDelivery();
	System.out.println("bike charge:"+b.calculatecharge(7));	

DroneDelivery d=new DroneDelivery();
System.out.println("Drone charge:"+d.calculatecharge(5));
}
}
