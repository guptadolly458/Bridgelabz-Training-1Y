package com.food;

public class NonVegItem extends FoodItem implements Discountable {

    public NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        total += 50; // extra charge
        return total - applyDiscount();
    }

    public double applyDiscount() {
        return getPrice() * getQuantity() * 0.05; 
    }

    public String getDiscountDetails() {
        return "Non-Veg Discount: 5% applied + ₹50 extra charge";
    }
}