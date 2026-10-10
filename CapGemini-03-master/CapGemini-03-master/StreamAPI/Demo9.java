package com.tns.StreamAPI;

import java.util.Arrays;
import java.util.List;

class Employee{
	private int id;
	private String name;
	private String department;
	private double salary;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
public Employee(int id, String name, String department, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}


}



public class Demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> e=Arrays.asList(new Employee(101,"shabu","IT",250000),
										new Employee(102,"chethan","IT",2500000),
										new Employee(103,"dileep","HR",500000),
										new Employee(104,"Rehan","DATA",20000),
										new Employee(105,"shoib","IT",40099),
										new Employee(106,"manoj","Finance",35000));
		List<String> r=e.stream().filter(employee->employee.getDepartment().equals("IT"))
				.filter(employee->employee.getSalary()>50000)
				.map(employee->employee.getName())
				.sorted().toList();
			System.out.println(r);
	}

}
