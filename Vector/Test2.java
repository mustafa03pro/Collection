package com.mustafa.Aug11.Vector;

import java.util.*;
public class Test2
{
     public static void main(String[] args)
     {
           Integer int1 = new Integer(10);
           Vector vec1 = new Vector();
           LinkedList list = new LinkedList();
           vec1.add(int1);
           list.add(int1);
           if(vec1.equals(list)) 
                System.out.println("equal");
           else  
                System.out.println("not equal");
     }
}
