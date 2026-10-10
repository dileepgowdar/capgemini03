package com.tns.scanner;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter yoour name :");
		String name=sc.nextLine();
		
		System.out.println("enter your age");
		int age=sc.nextInt();
		
		System.out.println("enter your salary:");
		double salary=sc.nextDouble();
		
		
		System.out.println("Name:"+name);
		System.out.println("age:"+age);
		System.out.println("salary:"+salary);
	}

}

