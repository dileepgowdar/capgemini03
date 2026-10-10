package com.tns.ExceptionHandling;

public class ThrowDemo {
	public static void CheckAge(int age) {
		if(age<16) {
			throw new ArithmeticException("student is not eligible");
		}
		
		System.out.println("student is eligible");
	}
	public static void main(String[] args) {
		try {
			CheckAge(4);
		}
	    catch(ArithmeticException e){
	    	System.out.println(e);
	    }
			
		}

	}


