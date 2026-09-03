package com.tns.Polymorphism;
class Bank{
	void calculateInterest(double amount) {
		System.out.println("Calculating the a standard bank intrest");
		System.out.println("Amount"+amount);
		
	}
}
class SavingAccount extends Bank{
	@Override
	void calculateInterest(double amount) {
		double Interest=amount*0.04;
		System.out.println("Saving account");
		System.out.println("principal:"+amount);
		System.out.println("interest:"+Interest);
		
		
	}
}
class Fixeddeposit extends Bank{
	@Override
	void calculateInterest(double amount) {
		double Interest=amount*0.07;
		System.out.println("Fixed Deposit");
		System.out.println("principal"+amount);
		System.out.println("interset"+Interest);
	}
}
class CurrentAccount extends Bank{
	@Override
	void calculateInterest(double amount) {
		System.out.println("current account");
		System.out.println("no interest provided");
	}
}
public class Methodoverriding {
public static void main(String[] args) {
	Bank a;
	a=new Fixeddeposit();
	a.calculateInterest(1000000);
	System.out.println();
	a=new SavingAccount();
	a.calculateInterest(1000000);
	System.out.println();
	a=new CurrentAccount();
	a.calculateInterest(1000000);
	
	}
}
