package com.mustafa.Aug11.Vector;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionExample11 {
	 public static void main(String[] argv) 
     {
           Collection c = new ArrayList<>();
           c.add("1");
           c.add("2");
           c.add("3");
           Collection c1 = new ArrayList();
           c1.add("1");
           //c1.add("2");
           c.retainAll(c1);
           System.out.println(c);
     }

}
