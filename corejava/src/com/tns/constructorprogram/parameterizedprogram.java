package com.tns.constructorprogram;

import java.util.Scanner;

class Employee1{
	
int id;
	String name;
	String department;
	double salary;
	Employee1 (int id,String name,String department,double salary)
	{
		this.id=id;
		this.department=department;
		this.salary=salary;
		
	}
	void displayinfo() {
		System.out.println("employee Details");
		System.out.println("employee id"+id);
	    System.out.println("department"+department);
	    System.out.println("salary"+salary);
	}

		}

public class parameterizedprogram {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter yourid");
	String department=sc.nextLine();
	System.out.println("enter your name");
	int id=sc.nextInt();
	System.out.println("enter department");
	
	String name=sc.nextLine();
	System.out.println("enter your salary");
	Double salary=sc.nextDouble();
	Employee1 e=new Employee1(id,name,department,salary);
	e.displayinfo();
	sc.close();
	}}

