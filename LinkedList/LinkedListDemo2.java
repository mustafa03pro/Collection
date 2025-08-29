package com.mustafa.Aug17.LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		List<Integer> linkedList=new LinkedList();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1: insert element");
			System.out.println("2: Delete element");
			System.out.println("3: Show element");
			System.out.println("4: Exit element");
			int choice=Integer.parseInt(sc.nextLine());
			switch(choice) {
			case 1:
				System.out.print("enter the number to add");
				int elementadd=Integer.parseInt(sc.nextLine());
				linkedList.add(elementadd);
				break;
			case 2:
				System.out.print("enter the number to delete");
				int elementdel=Integer.parseInt(sc.nextLine());
				boolean remove=linkedList.remove(Integer.valueOf(elementdel));
				if(remove) {
					
					System.out.println("element is deleted sucessfully"+elementdel);
					
				}
				else {
					System.err.println("element is not present in the list"+elementdel);
				}
				
				break;
			case 3:
				System.out.println(linkedList);
				break;
			case 4:
				System.out.println("thank you");
				System.exit(0);
				
				
			}
			
		}
		
		

	}

}
