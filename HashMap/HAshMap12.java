package com.mustafa.Aug20.hashmap;

import java.util.HashMap;
import java.util.Map;

public interface HAshMap12 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
	      map.put(1, "One");
	      map.put(2, "Two");

	      System.out.println(map.getOrDefault(1, "Default"));
	      System.out.println(map.getOrDefault(3, "Default"));   

	}

}
