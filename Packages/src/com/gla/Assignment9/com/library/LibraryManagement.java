package com.library;

import java.util.*;

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<LibraryItem> items = new ArrayList<>();

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("\n1. Book  2. Magazine  3. DVD");
            int choice = sc.nextInt();

            System.out.print("Enter Item ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Title: ");
            String title = sc.nextLine();

            System.out.print("Enter Author: ");
            String author = sc.nextLine();

            LibraryItem item;

            if (choice == 1) {
                item = new Book(id, title, author);
            } else if (choice == 2) {
                item = new Magazine(id, title, author);
            } else {
                item = new DVD(id, title, author);
            }

            items.add(item);
        }
        System.out.println("\n--- Library Items ---");
        for (LibraryItem item : items) {
            item.getItemDetails();

            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;

                System.out.println("Available: " + r.checkAvailability());
                r.reserveItem();
                System.out.println("Available after reservation: " + r.checkAvailability());
            }

            System.out.println("---------------------------");
        }
    }
}