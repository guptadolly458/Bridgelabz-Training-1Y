package com.gla.SmartWarehouseManegementSystem;

class Main {
    public static void main(String[] args) {
        Storage<Electronics> storage = new Storage<>();
        storage.addItem(new Electronics("TV"));

        Utility.displayAll(storage.getItems());
    }
}
