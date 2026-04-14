package com.gla.PersonalizedMealPlanGenerator;

class Meal<T extends MealPlan> {
    T plan;

    Meal(T plan) {
        this.plan = plan;
    }
}

