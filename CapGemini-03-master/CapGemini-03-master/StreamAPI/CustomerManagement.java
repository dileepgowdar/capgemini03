package com.tns.StreamAPI;

import java.util.Arrays;
import java.util.List;

class Customer{
	private String name;
	private String city;
	public Customer(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}



public class CustomerManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer> c=Arrays.asList(new Customer ("shabu","banglore"),
										new Customer ("chethan","udupi"),
										new Customer ("dileep","tumkur"),
										new Customer ("shoib","banglore"),
										new Customer ("rehan","delhi"),
										new Customer ("manoj","mumbai")
				);
		c.stream().filter(c1->c1.getCity().equals("banglore")).forEach(c1->System.out.println(c1.getName()+" "+c1.getCity()));
		
		}

}
