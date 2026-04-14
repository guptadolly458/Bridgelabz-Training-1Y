package com.gla.PersonalizedMealPlanGenerator;

class Utility {
    public static <T extends MealPlan> void generateMeal(T meal) {
        System.out.println("Meal generated: " + meal.getClass().getSimpleName());
    }
}
