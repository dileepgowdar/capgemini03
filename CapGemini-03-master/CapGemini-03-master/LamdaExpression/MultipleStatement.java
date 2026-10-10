package com.tns.LamdaExpression;

@FunctionalInterface
interface Demo{
	String say(String message);
}


public class MultipleStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo s=(message)->{String str1="hiiii";
							String str2=str1+message;
							return str2;};
		System.out.println(s.say("hlo"));
		}
	}


