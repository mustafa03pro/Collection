package com.mustafa.Aug10.ListInterface;

import java.util.*;
class VectorDemo5 
{
 public static void main(String args[]) {
 Vector obj = new Vector(4,2);
 obj.addElement(new Integer(3));
 obj.addElement(new Integer(2));
 obj.addElement(new Integer(6));
 obj.insertElementAt(new Integer(8), 2);
 System.out.println(obj);
 } 
}
