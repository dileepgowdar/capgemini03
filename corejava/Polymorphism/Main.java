package com.tns.Polymorphism;
class Calculator {
    double calculateArea(double radius) {
        return 3.14 * radius * radius;
    }
    
    double calculateArea(double length, double breadth) {
        return length * breadth;
    }
    
    double calculateArea(int side) {
        return side * side;
    }
}
public class Main {
	 public static void main(String[] args) {
	        Calculator calc = new Calculator();
	        
	        System.out.println("Circle Area: " + calc.calculateArea(5.0));
	        System.out.println("Rectangle Area: " + calc.calculateArea(10.0, 5.0));
	        System.out.println("Square Area: " + calc.calculateArea(4));
	    }
	
}
