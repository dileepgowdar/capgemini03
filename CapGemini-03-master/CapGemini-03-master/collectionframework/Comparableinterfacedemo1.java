package com.tns.collectionframework;

import java.util.ArrayList;
import java.util.Collections;

class Student2 implements Comparable<Student2>{
	
	int marks;
	String name;
	
	public Student2(int marks, String name) {
		this.marks = marks;
		this.name = name;
	}
					
	// For Strings
	
	@Override
	public int compareTo(Student2 o) {
		return this.name.compareTo(this.name);
	}

	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}
}

public class Comparableinterfacedemo1 {
public static void main(String[] args) {
	ArrayList<Student2> s=new ArrayList<>();
	s.add(new Student2(85,"Shabu"));
	s.add(new Student2(89,"Manoj"));
	s.add(new Student2(75,"Dileep"));
	s.add(new Student2(95,"Shoaib"));
	
	Collections.sort(s);
	System.out.println(s);
	}
}

