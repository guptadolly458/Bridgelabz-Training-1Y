package com.food;

public class VegItem extends FoodItem implements Discountable {

    public VegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        return total - applyDiscount();
    }

    public double applyDiscount() {
        return getPrice() * getQuantity() * 0.10; // 10% discount
    }

    public String getDiscountDetails() {
        return "Veg Item Discount: 10% applied";
    }
}