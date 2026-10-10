package com.tns.Static;

public class StaticMethod {
	static int calculatebonus(int salary) {
		return salary*10/100;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bonus=StaticMethod.calculatebonus(30000);
		System.out.println("bonus="+bonus);
	}

}

