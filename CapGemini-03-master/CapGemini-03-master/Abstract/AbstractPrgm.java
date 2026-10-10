package com.tns.Abstract;

abstract class Delivery{
	abstract double calculateCharge(double distance);
	
	void ShoeDeliveryType() {
		System.out.println("delivery serivce selected");
	}
}

class BikeDelivery extends Delivery{

	@Override
	double calculateCharge(double distance) {
		// TODO Auto-generated method stub
		return distance*10;
	}
	
}
class DroneDelivery extends Delivery{

	@Override
	double calculateCharge(double distance) {
		// TODO Auto-generated method stub
		return distance*20;
	}
	
}

public class AbstractPrgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BikeDelivery a=new BikeDelivery();
		System.out.println("bike charges:"+a.calculateCharge(5));

		DroneDelivery b=new DroneDelivery();
		System.out.println("bike charges:"+b.calculateCharge(5));
	}

}
