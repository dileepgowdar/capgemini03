package com.tns.abstraction;
abstract class Movie{
	abstract void bookticket(double price);
	void showdetails() {
		System.out.println("Moviedetails");
	}
class Toxic extends Movie{

	@Override
	void bookticket(double price) {
		
		 System.out.println("Ticket booked for ₹" + price);
	}
	
}
public class Mainabstract {
	public static void main(String[] args) {

        Toxic t =new Toxic();
System.out.println("");
	}
}
}
