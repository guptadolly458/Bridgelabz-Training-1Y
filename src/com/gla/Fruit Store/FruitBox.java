package com.gla.FruitStorage;
class FruitBox<T extends Fruit> {
    private java.util.List<T> fruits = new java.util.ArrayList<>();

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public void display() {
        for (T f : fruits) {
            System.out.println(f.name);
        }
    }
}
