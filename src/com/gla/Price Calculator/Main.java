package com.gla.PriceCalculator;

import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<Mobile> mobiles = Arrays.asList(new Mobile(10000), new Mobile(20000));
        List<Laptop> laptops = Arrays.asList(new Laptop(50000), new Laptop(70000));

        System.out.println(Utility.calculateTotal(mobiles));
        System.out.println(Utility.calculateTotal(laptops));
    }
}
