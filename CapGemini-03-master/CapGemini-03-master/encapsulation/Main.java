package com.tns.encapsulation;

class Employee {

    private int employeeid;
    private String employeeName;
    private double salary;
    private String department;

    // Constructor
    Employee(int employeeid, String employeeName, double salary, String department) {
        this.employeeid = employeeid;
        this.employeeName = employeeName;
        this.salary = salary;
        this.department = department;
    }

    // Getters and Setters
    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Increase salary by percentage
    public void increaseSalary(double percentage) {
        salary = salary + (salary * percentage / 100);
    }

    // Display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeid);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println();
    }
}



    

public class Main {

	
		public static void main(String[] args) {

	        // Creating objects using constructor
	        Employee emp1 = new Employee(101, "Rahul", 40000, "IT");
	        Employee emp2 = new Employee(102, "Priya", 35000, "HR");

	        System.out.println("Employee Details:");
	        System.out.println();

	        emp1.displayEmployeeDetails();
	        emp2.displayEmployeeDetails();

	     
	        emp1.increaseSalary(10);

	        System.out.println("After Salary Increase:");
	        System.out.println();

	        emp1.displayEmployeeDetails();
	        emp2.displayEmployeeDetails();
	    }
	}