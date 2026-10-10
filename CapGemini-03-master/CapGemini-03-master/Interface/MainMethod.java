package com.tns.Interface;

interface OrderService{
	boolean validateOrder(double amount);
	void ProcessPayment(double amount);
	void GenerateInvoice(String orderID,double amount);
	void updateOrderStatus(String orderID,String status);
	
}

class OnlineOrder implements OrderService{
	private String customername;
	private String OrderID;
	
	
	public OnlineOrder(String customername,String orderID) {
		super();
		this.customername=customername;
		OrderID=orderID;
	}

	@Override
	public boolean validateOrder(double amount) {
		// TODO Auto-generated method stub
		if(amount>0) {
			System.out.println("order validation successfull");
		return true;
		}
	        System.out.println("invalid validation");
	    return false;
	}

	@Override
	public void ProcessPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("processing payament"+amount);
		System.out.println("payment successfull");
	}

	@Override
	public void GenerateInvoice(String orderID, double amount) {
		// TODO Auto-generated method stub
		System.out.println("invoice generated");
		System.out.println("orderID"+orderID);
		System.out.println("customer name"+customername);
		System.out.println("amount:"+amount);
	}

	@Override
	public void updateOrderStatus(String orderID, String status) {
		// TODO Auto-generated method stub
		System.out.println("order"+orderID+"status updated to :"+status);
	}
	
}

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnlineOrder o=new OnlineOrder("shabu","ORD1001");
		
		double amount=15000.0;
		if(o.validateOrder(amount)) {
			o.ProcessPayment(amount);
			o.GenerateInvoice("ORD1001", amount);
			o.updateOrderStatus("ORD1001","confirmed");
		}
	}

}
