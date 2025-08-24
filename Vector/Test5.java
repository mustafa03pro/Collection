package com.mustafa.Aug11.Vector;

import java.util.ArrayList;
import java.util.List;

public class Test5
{
       public static void main(String[] args) 
       {
            List<String> list1 = new ArrayList<String>();
		list1.add("Dohni");
		list1.add("Sahwag");
		list1.add("Bumrah");
		list1.set(0, "Virat");
		list1.add(0, "Rohit");
		System.out.println(list1);
       }
}
