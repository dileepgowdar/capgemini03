package com.tns.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a=Arrays.asList("shabu","dileep","bharath","chethan");
		Optional<String> r=a.stream().skip(3).findFirst();
		System.out.println(r.orElse("not found"));
	}

}
