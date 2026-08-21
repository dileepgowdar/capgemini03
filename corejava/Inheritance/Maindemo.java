package Inheritance;
class Father {
    int money = 50000;
    String car = "BMW";

    void read() {
        System.out.println("Reading a newspaper");
    }
}

class Son extends Father {
    String cycle = "Blue";

    void play() {
        System.out.println("Playing cricket");
    }
}
public class Maindemo {
	  public static void main(String[] args) {
	        Son s = new Son();

	        System.out.println(s.money);
	        System.out.println(s.car);
	        System.out.println(s.cycle);

	        s.read();
	        s.play();
	    }
	}

