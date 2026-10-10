package com.tns.polymorphism;

class Bank{
	void calculateInterest(double amount) {
		System.out.println("calculate the a standard");
		System.out.println("calculateInterest");
	}
}

class SavingAccount extends Bank{
	@Override
	void calculateInterest(double amount) {
		double interest=amount*0.04;
		System.out.println("saving account");
		System.out.println("primciple amount"+amount);
		System.out.println("interest :"+interest);
	}
}

class FixedAccount extends Bank{
	@Override
	void calculateInterest(double amount) {
		double interest=amount*0.07;
		System.out.println("fixed deposite");
		System.out.println("principle amoount :"+amount);
		System.out.println("interest :"+interest);
	}
}

class CurrentAccout extends Bank{
	@Override
	void calculateInterest(double amount) {
		double interest=amount*0.10;
		System.out.println("current account");
		System.out.println("principle amoount :"+amount);
		System.out.println("interest :"+interest);
	}
}
public class OverrindingPrgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank a;
		a=new SavingAccount();
		a.calculateInterest(10000);
		System.out.println();
		
		a=new FixedAccount();
		a.calculateInterest(10000);
		System.out.println();

		a=new CurrentAccout();
		a.calculateInterest(10000);
		System.out.println();
      
	}

}
