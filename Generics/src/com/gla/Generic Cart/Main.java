package com.gla.GenericCart;

class Main {
    public static void main(String[] args) {
        Cart<Electronics> eCart = new Cart<>();
        eCart.addItem(new Electronics("Laptop"));

        Cart<Clothing> cCart = new Cart<>();
        cCart.addItem(new Clothing("T-Shirt"));

        eCart.displayItems();
        cCart.displayItems();
    }
}
