package com.mustafa.Aug23.collectionTest;




import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListUsingStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> stack = new LinkedList<>();

        // Read number of operations
        System.out.println("enter the");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            String command = input[0];

            switch (command) {
                case "push":
                    int value = Integer.parseInt(input[1]);
                    stack.addFirst(value); // push at head
                    System.out.println("Pushed: " + value);
                    break;

                case "pop":
                    if (!stack.isEmpty()) {
                        int popped = stack.removeFirst();
                        System.out.println("Popped Element: " + popped);
                    } else {
                        System.out.println("Stack is Empty");
                    }
                    break;

                case "peek":
                    if (!stack.isEmpty()) {
                        System.out.println("Top Element: " + stack.getFirst());
                    } else {
                        System.out.println("Stack is Empty");
                    }
                    break;

                case "isEmpty":
                    System.out.println("Is Empty: " + stack.isEmpty());
                    break;

                case "size":
                    System.out.println("Stack Size: " + stack.size());
                    break;

                default:
                    System.out.println("Invalid Command");
            }
        }

        sc.close();
    }
}
