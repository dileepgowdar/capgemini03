package com.tns.superclass;

class Demo {

    void calculatePerformance() {
        System.out.println("Calculating employee performance");
    }
}


	class SeniorEmployee1 extends Demo {

	    @Override
	    void calculatePerformance() {
	        super.calculatePerformance();
	        System.out.println("Calculating senior employee performance");
	    }
	}

	public class SuperMothod {

	    public static void main(String[] args) {

	        SeniorEmployee1 s2 = new SeniorEmployee1();

	        s2.calculatePerformance();
	    }
	}