package com.tns.superclass;
class Employee{
	int salary=100000;
}
class SeniorEmployee extends Employee{
	int salary=200000;
void displayinfo()
{
	System.out.println("seniorEmployee salary"+salary);
	System.out.println("Employee salary"+super.salary);
}
}
    


public class Main {
public static void main(String[] args) {
	SeniorEmployee s1=new SeniorEmployee();
s1.displayinfo();
}
}
