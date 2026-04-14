package com.gla.NumericSum;

import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<Double> dblList = Arrays.asList(1.5, 2.5, 3.5);

        System.out.println(Utility.sumNumbers(intList));
        System.out.println(Utility.sumNumbers(dblList));
    }
}