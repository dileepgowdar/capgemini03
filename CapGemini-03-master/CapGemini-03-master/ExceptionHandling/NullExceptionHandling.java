package com.tns.ExceptionHandling;

public class NullExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=null;
		try {
			System.out.println(str.length());
		}
		catch(NullPointerException n){
			System.out.println(n);
		}
	}

}
