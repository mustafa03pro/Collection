package com.mustafa.Aug22.HashMap;

import java.util.HashMap;

public class MergeFunction {

	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		map.merge("A", 10, (oldvalue,newvalue)->oldvalue+newvalue);
		map.merge("A", 15, (oldvalue,newvalue)->oldvalue+newvalue);
		map.merge("A", 25, (oldvalue,newvalue)->oldvalue+newvalue);
		map.merge("B", 25, (oldvalue,newvalue)->oldvalue+newvalue);
		map.merge("B", 25, (oldvalue,newvalue)->oldvalue+newvalue);
		System.out.println(map);
				

	}

}
