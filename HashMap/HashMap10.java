package com.mustafa.Aug20.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMap10 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
	      map.put("A", 5);
	      map.put("B", 10);

	      map.computeIfPresent("A", (k, v) -> v * 2);
	      map.computeIfPresent("B", (k, v) -> null);

	      System.out.println(map);

	}

}
