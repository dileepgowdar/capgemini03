package com.tns.collectionFrameWork;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> p=new ArrayList<>();
		p.add("mobile"); 
		p.add("laptop");
		p.add("watches");
		System.out.println(p);
		System.out.println("product :"+p.get(0));
		System.out.println("contains mobile?"+p.contains("mobile"));
		System.out.println(p.size());
		p.remove("mobile");
		System.out.println(p);
		for(String i:p);{
			System.out.println();
		}
	}

}
