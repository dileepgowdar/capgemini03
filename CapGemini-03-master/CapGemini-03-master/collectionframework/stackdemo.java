package com.tns.collectionframework;

import java.util.Stack;

public class stackdemo {
public static void main(String[] args) {
	Stack<Integer> s=new Stack<>();
	
	s.push(50);
	s.push(90);
	s.push(45);
	s.push(55);
	s.push(100);
	System.out.println(s);
	
	System.out.println(s.size());
	
	s.pop();
	System.out.println(s);
	
	s.pop();
	System.out.println(s);
	
	s.peek();
	System.out.println(s);
	
	s.pop();
	System.out.println(s);
	
	s.peek();
	System.out.println(s);
	
	for(Integer n:s) {
		System.out.println(n);
	}
	
	System.out.println(s.search(2));
	
	}
}
