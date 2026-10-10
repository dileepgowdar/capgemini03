package com.tns.superclass;

class Employe{
	int Salary=50000;
}
class SeniorEmployee extends Employe{
	int Salary=80000;
	
	void displayinfo() {
		System.out.println("senior employee salary:"+Salary);
		System.out.println(" employee salary:"+super.Salary);
	}
}

public class SuperPrgm {
public static void main(String[] args) {
	SeniorEmployee s=new SeniorEmployee();
	
s.displayinfo();
}
}
