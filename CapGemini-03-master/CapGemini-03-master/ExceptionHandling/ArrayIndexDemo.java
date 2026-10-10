package com.tns.ExceptionHandling;

public class ArrayIndexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[]= {80,75,69,34};
		
		try {
			System.out.println(marks[2]);
			System.out.println(marks[5]);
			System.out.println(marks[1]);
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println(a);
		}
		System.out.println("processing completed");
	}

}
