package com.tns.lambdaexpressiondemo;

interface hello{
	String say(String Hi);
}

public class Simplelambdaexpr {
	public static void main(String[] args) {
		hello s=(Hi)->{String str="Hi ma'am ,";
						return str+Hi;
		};
		System.out.println(s.say("I am Shoaib"));
	}
}
