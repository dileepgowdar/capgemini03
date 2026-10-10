package com.tns.constructor;

import java.util.Scanner;
class Employee2{
	int id;
	String name;
	String department;
	double salary;
	
	public Employee2(int id, String name, String department, double salary) {
	
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	void displayinfo() {
		System.out.println("employee details");
		System.out.println("emp id:"+id);
		System.out.println("emp name:"+name);
		System.out.println("emp department:"+department);
		System.out.println("emp salary:"+salary);
	}
	
}
public class Parameterized {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the id");
	int id=sc.nextInt();
	sc.nextLine();
	System.out.println("enter the name");
	String name=sc.nextLine();
	
	System.out.println("enter the department");
	String department=sc.nextLine();
	
	System.out.println("enter the salary");
	double salary=sc.nextDouble();
	
   Employee2 e=new Employee2(id, name, department, salary);
   e.displayinfo();
   sc.close();
}
}
