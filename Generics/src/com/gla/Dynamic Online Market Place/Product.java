package com.gla.DynamicOnlineMarketplace;

class Product<T> {
    T category;
    double price;

    Product(T category, double price) {
        this.category = category;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

