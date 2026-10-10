package com.tns.collectionframework;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
	
	int marks;
	String name;
	
	public Student(int marks, String name) {
		this.marks = marks;
		this.name = name;
	}
	
// For integers
	
	@Override
	public int compareTo(Student o) {
		return this.marks-o.marks;
	}

	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}
}

public class Comparableinterfacedemo {
public static void main(String[] args) {
	ArrayList<Student> s=new ArrayList<>();
	s.add(new Student(85,"Shabu"));
	s.add(new Student(89,"Manoj"));
	s.add(new Student(75,"Dileep"));
	s.add(new Student(95,"Shoaib"));
	
	Collections.sort(s);
	System.out.println(s);
	}
}
