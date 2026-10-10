package com.tns.collectionFrameWork;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s= new Stack<>();
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		
		
		System.out.println(s);
		s.pop();
		
		System.out.println(s);
		
		s.peek();
		System.out.println(s);

	}

}
