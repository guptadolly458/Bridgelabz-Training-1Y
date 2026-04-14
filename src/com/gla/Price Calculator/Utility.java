package com.gla.PriceCalculator;

import java.util.List;

class Utility {
    public static double calculateTotal(List<? extends Product> items) {
        double total = 0;
        for (Product p : items) {
            total += p.getPrice();
        }
        return total;
    }
}
