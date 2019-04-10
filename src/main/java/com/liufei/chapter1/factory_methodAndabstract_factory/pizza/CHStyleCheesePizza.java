package com.liufei.chapter1.factory_methodAndabstract_factory.pizza;

import com.liufei.chapter1.factory_methodAndabstract_factory.ingredient.PizzaIngredientFactory;

public class CHStyleCheesePizza implements Pizza {
    public void prepare(PizzaIngredientFactory pizzaIngredientFactory) {
        pizzaIngredientFactory.createSauce();
        pizzaIngredientFactory.createCheese();
        pizzaIngredientFactory.createVeggies();
    }

    public void bake() {
        System.out.println("bake CHStyleCheesePizza");
    }

    public void cut() {
        System.out.println("cut CHStyleCheesePizza");
    }

    public void box() {
        System.out.println("box CHStyleCheesePizza");
    }
}
