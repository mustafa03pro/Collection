package com.mustafa.Aug20.hashmap;

import java.util.HashMap;
import java.util.*;

public class HashMap6 {

	public static void main(String[] args) {
		 HashMap<String, String> map = new HashMap<>();
	        map.put("Java", "James Gosling");
	        map.put("HTML", "Tim Berners Lee");

	        for (Map.Entry<String,String> entry : map.entrySet()){
	       System.out.print(entry.getKey() + ":" + entry.getValue() + " ");
	        }


	}

}
