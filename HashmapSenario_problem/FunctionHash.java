package com.mustafa.Aug22.HashMap;

import java.util.HashMap;

public class FunctionHash {
	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		map.computeIfAbsent("A", key->key.length());
		map.computeIfAbsent("B", key->100);
		map.computeIfAbsent("c", key->200);
		map.computeIfAbsent("a", key->null);
		map.computeIfAbsent(null, key->400);
		System.out.println(map);
	}

}
