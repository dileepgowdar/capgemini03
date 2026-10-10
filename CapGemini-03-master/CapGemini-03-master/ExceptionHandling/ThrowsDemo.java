package com.tns.ExceptionHandling;

public class ThrowsDemo {
static void calculate(int a,int b)throws ArithmeticException{
	int result=a/b;
	System.out.println("result:"+ result);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			calculate(10,10);
		}
		catch(ArithmeticException a) {
			System.out.println("cannot divided by 0 ");
		}

	}

}
