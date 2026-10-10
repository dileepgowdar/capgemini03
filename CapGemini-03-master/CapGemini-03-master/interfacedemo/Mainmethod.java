package com.tns.interfacedemo;

// demo for e-commerce order procession

interface Orderservice{
	boolean ValidateOrder(double amount);
	void ProcessPayment(double amount); 
	void GenerativeInvoice(String orderId,double amount);
	void UpdateOrderstatus(String orderId,String status);
}

class Onlineorder implements Orderservice{

	private String customername;
	private String OrderId;
	
	public Onlineorder(String customername, String orderid) {
	super();
	this.customername=customername;
	OrderId=orderid;
	}

	@Override
	public boolean ValidateOrder(double amount) {
		
		if(amount>0) {
			
		System.out.println("order validation successful");
		return true;
		}
		
		System.out.println("Invalid order amount");
		return false;
	}

	@Override
	public void ProcessPayment(double amount) {
		
		System.out.println("procession payment"+amount);
		
		System.out.println("payment successful");
	}

	@Override
	public void GenerativeInvoice(String orderId, double amount) {
		
		System.out.println("Invoice generated");
		
		System.out.println("orderid :"+OrderId);
		
		System.out.println("Customername :"+customername);
		
		System.out.println("Amount :"+amount);
	}

	@Override
	public void UpdateOrderstatus(String orderId, String status) {
		
		System.out.println("order :"+orderId+",status updated to :"+status);
		
	}
}


public class Mainmethod {
public static void main(String[] args) {
	
	Onlineorder o=new Onlineorder("Shoaib","ORD101");
	
	double amount=5500;
	if(o.ValidateOrder(amount)) {
		o.ProcessPayment(amount);
		o.GenerativeInvoice("ORD101", amount);
		o.UpdateOrderstatus("ORD101", "confirmed");
		}
	}
}
