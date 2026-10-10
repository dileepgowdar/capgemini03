package com.tns.collectionFrameWork;

import java.util.TreeSet;

public class TreeSetDemo {
public static void main(String[] args) {
	TreeSet<Integer> t=new TreeSet<>();
	
	t.add(250000);
	t.add(250000);
//	t.add(null);
	//t.add(null);
	t.add(20000);
	t.add(350000);
	t.add(350000);
	t.add(50000);
	t.add(70000);
	t.add(80000);
	
	System.out.println("salaries :"+t);
	System.out.println("Total Salaries :"+t.size());
	
	System.out.println("Contains 50000? "+t.contains(50000));
	
	//lowest salary
	
	System.out.println("Lowest salary :"+t.first());
	
	System.out.println(t.last());
	
	//below 
	System.out.println(t.headSet(50000));
	
	//above
	System.out.println(t.tailSet(50000));
	
	//between
	System.out.println(t.subSet(3000, 60000));
	
}
}