package com.gla.Assignment7;
    class CartItem {
        String itemName;
        double price;
        int quantity;

        void addItem(String name, double p, int q) {
            itemName = name;
            price = p;
            quantity = q;
        }

        void removeItem() {
            itemName = "";
            price = 0;
            quantity = 0;
            System.out.println("Item removed");
        }

        void displayTotalCost() {
            System.out.println("Total Cost: " + (price * quantity));
        }

        public static void main(String[] args) {
            CartItem cart = new CartItem();
            cart.addItem("Book", 200, 2);
            cart.displayTotalCost();
            cart.removeItem();
        }
    }

