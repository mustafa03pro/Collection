package com.mustafa.Aug20.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMap9 {

	public static void main(String[] args) {
		 Map<Integer, String> map = new HashMap<>();
	        map.put(1, "Java");
	        map.put(2, "Python");

	        map.computeIfPresent(1, (k, v) -> v + "Script");
	        map.computeIfPresent(3, (k, v) -> "C++");

	        System.out.println(map);


	}

}
