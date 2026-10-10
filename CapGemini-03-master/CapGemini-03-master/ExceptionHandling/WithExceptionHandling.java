package com.tns.ExceptionHandling;

public class WithExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("goood morning");
		int a=10;
		int b=0;
		try {
		System.out.println("result"+a/b);
		}
		catch(Exception e){
		System.out.println(e);
		}

	}

}
