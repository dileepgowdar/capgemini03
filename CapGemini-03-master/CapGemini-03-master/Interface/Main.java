package com.tns.Interface;

interface Payment{
	void pay(double amount);
	void checkstatus();
}

class UPI implements Payment{

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Paid: "+amount+" using UPI");
		
	}

	@Override
	public void checkstatus() {
		// TODO Auto-generated method stub
		System.out.println("upi payment successfully");
		
	}
	
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UPI u=new UPI();
		u.pay(15000.90);
		u.checkstatus();
	}

}
