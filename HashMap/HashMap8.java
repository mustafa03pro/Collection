package com.mustafa.Aug20.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMap8 {

	public static void main(String[] args) {
		 Map<Integer, String> map = new HashMap();
	        map.put(1, "Java");

	        map.computeIfAbsent(1, k -> "Python");
	        map.computeIfAbsent(2, k -> "C++");

	        System.out.println(map);


	}

}
