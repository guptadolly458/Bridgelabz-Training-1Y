package com.gla.CopyListElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<Number> dest = new ArrayList<>();
        List<Integer> src = Arrays.asList(1, 2, 3);

        Utility.copyList(dest, src);
        System.out.println(dest);
    }
}
