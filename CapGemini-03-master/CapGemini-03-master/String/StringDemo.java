package com.tns.String;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="sachin";
		String s2=s1;
		String s3=s1;
		System.out.println("before ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println("After");
		s1="tendulka";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}

}
