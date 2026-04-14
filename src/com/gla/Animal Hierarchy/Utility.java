package com.gla.AnimalHierarchy;

import java.util.List;

class Utility {
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) {
            a.sound();
        }
    }
}
