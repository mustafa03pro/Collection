package com.mustafa.Aug21.HashMapScenario;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class StudentDataManagement {

	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("------ Student Management Menu ------\r\n"
				+ "1. Add Student\r\n"
				+ "2. Update Marks\r\n"
				+ "3. Delete Stu"
				+ "dent\r\n"
				+ "4. Search Student\r\n"
				+ "5. Display All Students\r\n"
				+ "6. Show Topper\r\n"
				+ "7. Show Lowest Scorer\r\n"
				+ "8. Show Total and Average Marks\r\n"
				+ "9. Exit\r\n"
				+ "Enter your choice: ");
		int choice=Integer.parseInt(sc.nextLine());
	
			switch(choice) {
			case 1:
				System.out.println("enter the name");
				String name=sc.nextLine();
				System.out.println("enter the marks");
				int marks=Integer.parseInt(sc.nextLine());
				map.put(name, marks);
				System.out.println("Student added successfully!\r\n"
						+ "");
				break;
			case 2:
				
				System.out.println("enter the name:");
				String name1=sc.nextLine();
				System.out.println("enter marks to update");
				int Newmark=Integer.parseInt(sc.nextLine());
				if(map.containsKey(name1)) {
					map.put(name1, Newmark);
					System.out.println("marks updated");
					System.out.println(map);
					
				}
				else {
				    System.err.println("Student not found.");
				}
				
				break;
			case 3:
				System.out.println("enter the name:");
				String name2=sc.nextLine();
				map.remove(name2);
				System.out.println("student deleted");
				//System.out.println(map);
				break;
				
			case 4:
				System.out.println("enter the name:");
				String name3=sc.nextLine();
				boolean k=map.containsKey(name3);
				System.out.println(k);
				
				break;
			case 5:
				System.out.println("Student record");
				for(HashMap.Entry<String, Integer> entry:map.entrySet()) {
					
					System.out.println(entry.getKey()+"=>"+entry.getValue());
					
				}
				
				
				break;
			case 6:
				
				Map.Entry<String, Integer> topper = Collections.max(map.entrySet(),(s1,s2)->s1.getValue().compareTo(s2.getValue()));
				System.out.println(topper.getKey()+" => "+topper.getValue());
				break;
			case 7:
				
				Map.Entry<String, Integer> lowest = Collections.max(map.entrySet(),(s2,s1)->s1.getValue().compareTo(s2.getValue()));
				System.out.println(lowest.getKey()+" => "+lowest.getValue());
				break;
			case 8:
				int total=0;
				for(int value: map.values()) {
				 total=total+value;
				}
				int avg=total/map.size();
				System.out.println("the total marks"+total);
				System.out.println("the avg is"+avg);
			
				
				break;
			case 9:
				System.out.println("thankyou visit again");
				System.exit(0);
				
				
				
			}
			
		}
		
		

	}

}
