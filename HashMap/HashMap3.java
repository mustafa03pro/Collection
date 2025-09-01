package com.mustafa.Aug20.hashmap;

import java.util.HashMap;

public class HashMap3 {

	public static void main(String[] args) {
		 HashMap<Integer, String> map = new HashMap<>();
	        map.put(1, "One");
	        map.put(2, "Two");
	        map.put(3, "Three");

	        for (Integer key : map.keySet()) 
		{
	            System.out.print(key + " ");
	        }


	}

}
