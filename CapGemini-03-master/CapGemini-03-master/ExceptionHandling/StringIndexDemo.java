package com.tns.ExceptionHandling;

import java.util.jar.Attributes.Name;

public class StringIndexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="java";
		try {
			System.out.println(name.charAt(0));
			System.out.println(name.charAt(1));
			System.out.println(name.charAt(9));
			System.out.println("welcome");
		}
		catch(Exception e){
			System.out.println(e);
	}
		System.out.println("program continue");

}
}