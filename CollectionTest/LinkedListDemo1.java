package com.mustafa.Aug23.collectionTest;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDemo1 {

	public static void main(String[] args) {
	     Scanner sc= new Scanner(System.in);
	     System.out.println("enter the no operation");
	     LinkedList<Integer> stack=new LinkedList<Integer>();
	     int n=Integer.parseInt(sc.nextLine());
	     for(int i=0;i<n;i++) {
	    	 String [] input=sc.nextLine().split(" ");
	    	 String command=input[0];
	    	 switch (command) {
			case "push": 
				   int element=Integer.parseInt(input[1]);
				   stack.addFirst(element);
				   System.out.println("pushed "+element);
				   break;
				   case "pop":
					   if(! stack.isEmpty()) {
						  int poped= stack.removeFirst();
						   System.out.println("poped "+ poped);
						   
					   }
					   else {
						   System.out.println("stack is empty");
					   }
					   break;
				   case "peek":
					   if(!stack.isEmpty()) {
						   
						   System.out.println("peeked"+stack.getFirst());
					   }
					   else {
						   System.err.println("stack is empty");
					   }
					   break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + command);
			}
	     }
	}

}
