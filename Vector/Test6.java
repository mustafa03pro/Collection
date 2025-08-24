package com.mustafa.Aug11.Vector;

import java.util.*;
public class Test6
{
 public static void main(String argv[])
	 {
    	 
    	ArrayList list = new ArrayList(); 
    	ArrayList listStr = list; 
    	ArrayList listBuf = list; 
    	listStr.add(0, "Hello"); 
    	StringBuffer buff = (StringBuffer) listBuf.get(0); 
       System.out.println(buff.toString());
    }

}
