package Inheritance;
class Vehicle {
    String colour = "black";

    void speed() {
        System.out.println("high speed");
    }
}

class Car extends Vehicle {
    void engine() {
        System.out.println("good");
    }
}

class MiniCar extends Car {
    void show() {
        System.out.println("good speed");
    }


    
public class Main {
	public static void main(String[] args) {

        MiniCar m = new MiniCar();

        m.speed();
        m.engine();
        m.show();

        Car c = new Car();
        c.speed();
    }
}
}
