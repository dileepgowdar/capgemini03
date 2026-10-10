package com.tns.collectionframework;

import java.util.ArrayList;

public class Arraylistdemo {
public static void main(String[] args) {
	
	//Object Creation
	
	ArrayList<String> p=new ArrayList<>();
	//add
	
	p.add("Laptop");
	p.add("Mobile");
	p.add("Headphone");
	p.add(null);
	p.add("Speaker");
	
	
	System.out.println(p);
	
	System.out.println("product 1:"+p.get(1));
	
	System.out.println("contains mobile ?"+p.contains("Mobile"));
	
	//no elements
	
	System.out.println(p.size());
	
	p.remove("Headphone");
	p.remove(null);
	
	System.out.println(p);
	
	for(String i:p) {
		System.out.println(i);
		}	
	}
}
