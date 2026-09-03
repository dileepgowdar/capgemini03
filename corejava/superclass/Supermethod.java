package com.tns.superclass;
class Demo {

    void calculatePerformance() {
        System.out.println("Calculating employee performance");
    }

    class SeniorEmployee extends Demo {

        
        super.calculatePerformance() ;
            System.out.println("Calculating senior employee performance");
    }

public class Supermethod {
public static void main(String[] args) {
    
    SeniorEmployee s2 = new SeniorEmployee();

    s2.calculatePerformance();
}
}
}
}

