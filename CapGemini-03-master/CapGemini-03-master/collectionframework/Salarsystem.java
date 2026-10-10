package com.tns.collectionframework;

import java.util.TreeSet;

public class Salarsystem {
public static void main(String[] args) {
	TreeSet<Integer> t=new TreeSet<>();
	
	t.add(250000);
	t.add(200000);
	t.add(150000);
	t.add(350000);
	t.add(30000);
	
	
	System.out.println("salaries :"+t);
	
	System.out.println("Total salaries :"+t.size());
	
	System.out.println("Contains 150000?"+t.contains(200000));
	
	System.out.println("Lowest Salary :"+t.first());
	
	System.out.println(t.last());
	
	//below
	System.out.println(t.headSet(30000));
	
	//above
	System.out.println(t.tailSet(150000));
	
	//between
	System.out.println(t.subSet(30000, 250000));
	}
}
