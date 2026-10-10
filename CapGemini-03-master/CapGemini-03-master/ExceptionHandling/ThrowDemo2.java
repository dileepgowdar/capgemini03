package com.tns.ExceptionHandling;

public class ThrowDemo2 {
	static void checkpassword(String password) {
		if(password.length()<6) {
			throw new IllegalArgumentException("possword is too short");
		}
		System.out.println("password accepted");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			checkpassword("asdfl");
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
