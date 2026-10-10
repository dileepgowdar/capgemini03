package com.tns.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Product{
	private String name;
	private double price;
	
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}


public class Demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> p=Arrays.asList(new Product("mobile",500000),
				new Product("mobile",50000),
				new Product("camera",25000),
				new Product("charger",3000),
				new Product("mobileCase",1500));
		p.stream().filter(product->product.getPrice()>5000).forEach(product->System.out.println(product.getPrice()+" "+product.getName()));
	}

}
