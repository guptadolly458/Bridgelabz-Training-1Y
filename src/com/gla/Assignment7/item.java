package com.gla.Assignment7;

public class item {
        int itemCode;
        String itemName;
        double price;

        void displayDetails() {
            System.out.println("Code: " + itemCode);
            System.out.println("Name: " + itemName);
            System.out.println("Price: " + price);
        }

        double calculateTotal(int quantity) {
            return price * quantity;
        }

        public static void main(String[] args) {
            item item = new item();
            item.itemCode = 1;
            item.itemName = "Pen";
            item.price = 10;

            item.displayDetails();
            System.out.println("Total Cost: " + item.calculateTotal(5));
        }
    }

}
