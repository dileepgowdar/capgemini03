package com.tns.lambdaexpressiondemo;

import java.util.Scanner;

interface Loginvalidation{
	boolean validate( String user ,String  paas);
}

public class Loginmethod {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username :");
		String username=sc.nextLine();
		
		System.out.println("Enter password :");
		String password=sc.nextLine();
		
		Loginvalidation login=(user,pass)->{
			if(user.equals("admin")&&pass.equals("admin123")) {
				return true;
			}
			return false;
		};
		boolean result=login.validate(username, password);
		if(result)
			System.out.println("Login successful");
		else
			System.out.println("Invalid login");
	}
}
