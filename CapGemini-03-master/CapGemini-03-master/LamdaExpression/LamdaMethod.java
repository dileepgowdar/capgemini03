package com.tns.LamdaExpression;

import java.util.Scanner;

interface ElectricBill{
	double calculate(int units);
}



public class LamdaMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Electricity bill");
		int units=sc.nextInt();
		ElectricBill bill=(u)->{
			if(u<100) {
				return u*3;
			}
			else if(u<200) {
				return(100*3)+(u-100)*5;
			}
			else {
				return(100*3)+(100*5)+(u-100)*5;
			}
		};
	}

}
