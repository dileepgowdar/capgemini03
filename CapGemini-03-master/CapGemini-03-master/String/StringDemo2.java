package com.tns.String;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello java programming";
		
		//length()
		
		System.out.println("length:"+s.length());
		
		//charAT()
		System.out.println("character at the index 6:"+s.charAt(6));
		
		//to upper and lower
		System.out.println("upper case:"+s.toUpperCase());
		System.out.println("to lower case:"+s.toLowerCase());
		
		//contains
		System.out.println(s.contains("java"));
		
		//start with 
		System.out.println(s.startsWith("word"));
		
		//end with
		System.out.println(s.endsWith("hello"));
		
		System.out.println(s.substring(6,10));
		
		System.out.println(s.replace("java","python"));
	}

}
