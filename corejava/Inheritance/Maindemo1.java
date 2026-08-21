package Inheritance;
class Payment {
    void pay(double amount) {
        System.out.println("processing payment :" + amount);
    }
}

class Creditcardpayment extends Payment {
    void payByCard() {
        System.out.println("payment through credit card");
    }
}

class UPIPayment extends Payment {
    void paybyUPI() {
        System.out.println("payment through upi");
    }
}


public class Maindemo1 {
	 public static void main(String[] args) {

	        UPIPayment c = new UPIPayment();

	        c.pay(5000);
	        c.paybyUPI();

	        Creditcardpayment c1 = new Creditcardpayment();

	        c1.pay(4000.90);
	        c1.payByCard();
	    }
	}
