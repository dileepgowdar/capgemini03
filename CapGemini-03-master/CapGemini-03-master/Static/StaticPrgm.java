package com.tns.Static;

class Employee{
	int id;
	String name;
	static String company="TCS";
	
	Employee(int id, String name){
		this.id=id;
		this.name=name;
	}
	void display() {
		System.out.println(id+""+name+""+company);
	}
}


public class StaticPrgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(101,"shabu");
		Employee e2=new Employee(102,"efg");
		Employee e3=new Employee(103,"hij");
		Employee e4=new Employee(104,"abc");
		
		e1.display();
		e2.display();
		e3.display();
		e4.display();
	}

}
