package com.mustafa.Aug14.Collection2;

import java.util.ArrayList;
import java.util.Scanner;

public class BookLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Library library = new Library();
		
		while(true) {
			System.out.println("1. Add Book\r\n"
					+ "2. Display Books\r\n"
					+ "3. Update Quantity\r\n"
					+ "4. Delete Book\r\n"
					+ "5. Exit\r\n"
					+ "Choose an option: 1\r\n"
					+ "");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				 System.out.print("Enter Title: ");
                 String title = sc.nextLine();
                 System.out.print("Enter Author: ");
                 String author = sc.nextLine();
                 System.out.print("Enter ISBN: ");
                 long isbn = sc.nextLong();
                 System.out.print("Enter Price: ");
                 double price = sc.nextDouble();
                 System.out.print("Enter Quantity: ");
                 int quantity = sc.nextInt();
                 Book newBook = new Book(title, author, isbn, price, quantity);
                 library.addBook(newBook);
                 break;
			 case 2:
				 library.displayAllBooks();
                 
                 break;

             case 3:
                 System.out.print("Enter ISBN: ");
                 long searchIsbn = sc.nextLong();
                 System.out.println("Updating quantity of book : ");
                 System.out.print("Enter new Quantity: ");
                 int newQty = sc.nextInt();
                 library.updateBookQuantityByISBN(searchIsbn, newQty);
                 break;

             case 4:
                 System.out.print("Enter Book Title : ");
                 String deleteTitle = sc.nextLine();
                 library.deleteBookByTitle(deleteTitle);
                 break;

             case 5:
                 System.out.println("Exiting from the Application. Thank you!!!");
                 sc.close();
                 return;

             default:
                 System.out.println("Invalid option. Please try again.");
			}

			
		}
		
	
		
	}

}
