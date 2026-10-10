package com.tns.encapsulation;

import java.util.Scanner;

//demo for encapsulation
class BankAccount{
	//private data members
	private String AccountHolder;
	private double balance;
	public BankAccount(String accountHolder, double balance) {
		super();
		AccountHolder = accountHolder;
		this.balance = balance;
	}
	// getter & setter 
	public String getAccountHolder() {
		return AccountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		AccountHolder = accountHolder;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void display() {
		System.out.println("AccountHolder"+AccountHolder);
		System.out.println("balance"+balance);
	}
	
	// depposit method
	
	public void deposit(double amount) {
		if(amount>0) {
			balance=balance+amount;
			System.out.println("amount deposit successfully");
		}
		else
		{
			System.out.println("invalid amount");
		}
	}
	
	//withdraw
	
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance=balance-amount;
			System.out.println("amount withdraw successfully");
		}
		else {
			System.out.println("invalid amount");
		}
	}
	
}





public class Encapsulation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter account holder name:");
		String name=sc.nextLine();
		
		System.out.println("enter initial balance:");
		double Balance=sc.nextInt();
		
		BankAccount b=new BankAccount(name,Balance);
		b.display();
		
		System.out.println("enter amount to deposite:");
		double depositamount=sc.nextDouble();
		b.deposit(depositamount);
		
		System.out.println("enter the amount to withdraw:");
		double withdraw=sc.nextDouble();
		b.withdraw(withdraw);
		
		System.out.println("final balance"+b.getBalance());
		
	
	}

}
