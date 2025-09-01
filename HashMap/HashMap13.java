package com.mustafa.Aug20.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMap13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
	       map.put("A", null);

	       System.out.println(map.getOrDefault("A", 10));
	       System.out.println(map.getOrDefault("B", 20)); 
	}

}
