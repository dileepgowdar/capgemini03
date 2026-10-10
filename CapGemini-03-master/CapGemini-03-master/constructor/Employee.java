package com.tns.constructor;

class Employee1 {
	String name;
	int salary;
	
	 Employee1(){
		name="unknown";
		salary=30000;
	}
	void display() {
		System.out.println("name"+name);
		System.out.println("salary"+salary);
	}
}
 public class Employee{
	 public static void main(String[] args) {
		Employee1 e=new Employee1();
		e.display();
	}

	 
 }