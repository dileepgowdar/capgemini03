package com.tns.ExceptionHandling;

public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(6/0);
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println(a);
		}
		catch(Exception b) {
			System.out.println(b);
		}
		finally {
			System.out.println("calculated..");
		}
	}

}
