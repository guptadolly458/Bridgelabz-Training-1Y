package com.food;

import java.util.*;

public class FoodDeliverySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<FoodItem> orders = new ArrayList<>();

        System.out.print("Enter number of food items: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\n1. Veg Item  2. Non-Veg Item");
            int choice = sc.nextInt();

            sc.nextLine();
            System.out.print("Enter Item Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();

            FoodItem item;

            if (choice == 1) {
                item = new VegItem(name, price, quantity);
            } else {
                item = new NonVegItem(name, price, quantity);
            }

            orders.add(item);
        }
        System.out.println("\n--- Order Details ---");
        for (FoodItem item : orders) {
            item.getItemDetails();

            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                System.out.println(d.getDiscountDetails());
            }

            System.out.println("Total Price: " + item.calculateTotalPrice());
            System.out.println("---------------------------");
        }
    }
}