package com.gla.PersonalizedMealPlanGenerator;

class Main {
    public static void main(String[] args) {
        VegetarianMeal veg = new VegetarianMeal();
        Utility.generateMeal(veg);
    }
}
