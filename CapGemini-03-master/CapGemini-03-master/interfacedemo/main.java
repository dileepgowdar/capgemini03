package com.tns.interfacedemo;

interface payment{
	void pay(double amount);
	void checkstatus();
}
class UPI implements payment{

	@Override
	public void pay(double amount) {
		System.out.println("paid. "+amount+" Using upi");
	}
	@Override
	public void checkstatus() {
		System.out.println("upi payment successfull.");
	}
		
}

public class main {
public static void main(String[] args) {
	UPI u=new UPI();
	u.pay(1500.90);
	u.checkstatus();
	}	
}




























