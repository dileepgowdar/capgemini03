package com.tns.inheritance;

class Father{   // parent class
	int money=50000;  // variables 
	String car="BMW";
	
	void read() {
		System.out.println("reading a news paper");//methods
	}
}
class Son extends Father{  // child class
	String cycle="blue";
	
	void play() {
		System.out.println("playing cirket");
	}

}

public class SingleLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s=new Son();
		System.out.println(s.money);//p
		System.out.println(s.car);//p
		System.out.println(s.cycle);//s
		s.read();
		s.play();

	}

}
