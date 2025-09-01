package com.mustafa.Aug20.hashmap;

import java.util.HashMap;

public class HashMap4 {

	public static void main(String[] args) {
		 HashMap<String, Integer> map = new HashMap<>();
	        map.put("A", 1);
	        map.put("B", 2);
	        map.put("C", 3);

	        map.remove("B");
	        System.out.println(map.containsKey("B"));


	}

}
