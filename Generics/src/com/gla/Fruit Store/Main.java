package com.gla.FruitStorage;
class Main {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.add(new Apple());

        FruitBox<Mango> mangoBox = new FruitBox<>();
        mangoBox.add(new Mango());

        appleBox.display();
        mangoBox.display();

        // FruitBox<Car> ❌ Not allowed (compile-time error)
    }
}
