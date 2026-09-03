package com.tns.staticprogram;

public class String {
	static int calculatebonus(int salary) {
		return salary*10/100;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bonus=String.calculatebonus(30000);
		System.out.println("bonus="+bonus);
	}

}