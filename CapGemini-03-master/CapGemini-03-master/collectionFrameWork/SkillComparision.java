package com.tns.collectionFrameWork;

import java.util.HashSet;

public class SkillComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> javateam=new HashSet<>();
		javateam.add("java");
		javateam.add("sql");
		javateam.add("git");
		javateam.add("spring");
		javateam.add("docker");
		javateam.add(null);
		javateam.add(null);
		System.out.println(javateam);
		
		HashSet<String> pythonteam=new HashSet<>();
		pythonteam.add("Python");
		pythonteam.add("sql");
		pythonteam.add("git");
		pythonteam.add("AWS");
		System.out.println(pythonteam);
		
		HashSet<String> common=(HashSet<String>) javateam.clone();
		System.out.println(common);
		
		common.retainAll(pythonteam);
		System.out.println("common sills :"+common);
		
		
		HashSet<String> onlyjava=(HashSet<String>) javateam.clone();
		System.out.println(onlyjava);
	}

}
