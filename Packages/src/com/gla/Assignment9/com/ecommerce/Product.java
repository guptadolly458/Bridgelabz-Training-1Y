package com.ecommerce;

public abstract class Product {
    private int productId;
    private String name;
    private double price;
    public Product(int id, String name, double price) {
        this.productId = id;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

   
    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calculateDiscount();

    public double getFinalPrice() {
        double tax = 0;

        if (this instanceof Taxable) {
            tax = ((Taxable) this).calculateTax();
        }

        return price + tax - calculateDiscount();
    }

    public void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Base Price: " + price);
        System.out.println("Discount: " + calculateDiscount());

        if (this instanceof Taxable) {
            Taxable t = (Taxable) this;
            System.out.println("Tax: " + t.calculateTax());
            System.out.println(t.getTaxDetails());
        }

        System.out.println("Final Price: " + getFinalPrice());
        System.out.println("---------------------------");
    }
}