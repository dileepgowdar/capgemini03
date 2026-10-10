package com.tns.interfacedemo;


interface Calculator {
 int calculate(int a, int b);
}


public class FuncInterface {
public static void main(String[] args) {
	 Calculator addition = (a, b) -> a + b;
     Calculator multiplication = (a, b) -> a * b;

     System.out.println("Sum: " + addition.calculate(10, 5));        
     System.out.println("Product: " + multiplication.calculate(10, 5)); 
	}
}
