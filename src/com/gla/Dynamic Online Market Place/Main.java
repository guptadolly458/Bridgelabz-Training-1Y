package com.gla.DynamicOnlineMarketplace;

class Main {
    public static void main(String[] args) {
        Product<String> book = new Product<>("Book", 500);
        Utility.applyDiscount(book, 10);

        System.out.println(book.getPrice());
    }
}
