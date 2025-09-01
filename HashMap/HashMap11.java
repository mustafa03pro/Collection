package com.mustafa.Aug20.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMap11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<Integer, String> map = new HashMap<>();

	      map.computeIfAbsent(10, k -> null);
	      map.put(20, "x");
	      map.computeIfAbsent(20, k -> "y");

	      System.out.println(map); 

	}

}
