package com.mustafa.Aug12.Collection;


import java.util.Scanner;
import java.util.Vector;

public class LibraryManagement {

	public static void main(String[] args)
	{
		Vector<Book> vb=new Vector<>();
		vb.add(new Book(101, "Java", "jamesGousling"));
		vb.add(new Book(102, "python", "Lawrence"));
		vb.add(new Book(103, "c", "Denis ritchi"));
		vb.add(new Book(104, "C++", "Denis Ritchi big"));
		System.out.println("Select from the Menu :\r\n"
				+ "	 1) Display Books Available in the Library :\r\n"
				+ "	 2) Search a Book in the Library :\r\n"
				+ "	 3) Issue a Book from the Library :\r\n"
				+ "	 4) Exit from the application :\r\n"
				+ "Please Enter your Choice :");
		Library l1=new Library();
		Scanner sc=new Scanner(System.in);
		int choice=Integer.parseInt(sc.nextLine());
	
		
		switch(choice) {
		case 1:l1.displayAvailableBooks(vb);
		break;
		case 2:
			l1.issueBook(vb, sc);
			break;
		case 3:l1.searchBook(vb, sc);
		break;
		case 4:
			System.out.println("Thank you for visiting");
			break;
			
		}

	}

}
