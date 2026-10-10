package com.tns.ExceptionHandling;

public class ArithmaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary=50000;
		int workingdays=25;
		int bonusdays=5;
		
		try {
			int dailysalary=salary/workingdays;
			System.out.println("daily salary:"+dailysalary);
			
			int bonusperday=salary/0;
			System.out.println("bonus:"+(bonusperday*bonusdays));
		}
		catch(ArithmeticException a) {
			System.out.println("cannot calculate salary bonus,,");
			System.out.println(a);
		}
		System.out.println("salary processing completed,,");
	}

}
