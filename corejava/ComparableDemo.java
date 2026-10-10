package com.tns.ComparableInterface;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
	
	int marks;
	String name;
	public Student(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.marks-o.marks;
	
	
	}
	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}
	
	
}





public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> s=new ArrayList<>();
		s.add(new Student(20,"dileep"));
		s.add(new Student(85,"shabu"));
		s.add(new Student(55,"bharath"));
		s.add(new Student(25,"che"));
		Collections.sort(s);
		System.out.println(s);
		
	}

}
