package com.ecommerce;

import java.util.*;

public class EcommercePlatform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\n1. Electronics  2. Clothing  3. Groceries");
            int choice = sc.nextInt();

            System.out.print("Enter Product ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Product Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            Product p;

            if (choice == 1) {
                p = new Electronics(id, name, price);
            } else if (choice == 2) {
                p = new Clothing(id, name, price);
            } else {
                p = new Groceries(id, name, price);
            }

            products.add(p);
        }
		
        System.out.println("\n--- Product Details ---");
        for (Product p : products) {
            p.display();
        }
    }
}