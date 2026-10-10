package com.tns.collectionframework;

import java.util.HashSet;

public class Skillcomparisionhashsetdemo {
	public static void main(String[] args) {
		
HashSet<String> Javateam=new HashSet<>();

Javateam.add("Java");
Javateam.add("Sql");
Javateam.add("GIT");
Javateam.add("Spring");
Javateam.add("Docker");
Javateam.add(null);
Javateam.add(null);
System.out.println(Javateam);

HashSet<String> PythonTeam=new HashSet<>();

PythonTeam.add("Python");
PythonTeam.add("Sql");
PythonTeam.add("git");
PythonTeam.add("AWS");
System.out.println(PythonTeam);

//create a copy of java team's skills

HashSet<String> common =(HashSet<String>) Javateam.clone();
System.out.println(common);

//keep only skills available in both teams

common.retainAll(PythonTeam);
System.out.println("common skills :"+common);

//create another copy of java team's skills

HashSet<String> OnlyJava=(HashSet<String>) Javateam.clone();
System.out.println(OnlyJava);

	}
}
