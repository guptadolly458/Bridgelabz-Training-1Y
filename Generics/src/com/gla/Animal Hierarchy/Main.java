package com.gla.AnimalHierarchy;

import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<Dog> dogs = Arrays.asList(new Dog(), new Dog());
        List<Cat> cats = Arrays.asList(new Cat(), new Cat());

        Utility.printAnimals(dogs);
        Utility.printAnimals(cats);
    }
}
