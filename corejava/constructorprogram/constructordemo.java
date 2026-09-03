package com.tns.constructorprogram;

class Employee{
	String name;
	int salary;
	Employee(){
		name="UNKNOW";
		salary=45000;
		
		
	}
	void Display() {
		System.out.println("name"+name);
		System.out.println("salary"+salary);
	}
}

public class constructordemo {
public static void main(String[] args) {
	Employee e=new Employee();
	e.Display();
	}
}
