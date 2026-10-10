package com.tns.LamdaExpression;

import java.util.Scanner;

@FunctionalInterface
interface SquareDemo{
	int Calculate(int side);
}

public class AreaOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sides value");
		int sides=sc.nextInt();
		SquareDemo hii=(side)->{return sides*sides;};
	}

}
