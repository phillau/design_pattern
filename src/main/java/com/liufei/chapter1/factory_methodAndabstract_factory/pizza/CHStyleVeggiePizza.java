package com.liufei.chapter1.factory_methodAndabstract_factory.pizza;

import com.liufei.chapter1.factory_methodAndabstract_factory.ingredient.PizzaIngredientFactory;

public class CHStyleVeggiePizza implements Pizza {
    public void prepare(PizzaIngredientFactory pizzaIngredientFactory) {
        pizzaIngredientFactory.createSauce();
        pizzaIngredientFactory.createCheese();
        pizzaIngredientFactory.createVeggies();
    }

    public void bake() {
        System.out.println("bake CHStyleVeggiePizza");
    }

    public void cut() {
        System.out.println("cut CHStyleVeggiePizza");
    }

    public void box() {
        System.out.println("box CHStyleVeggiePizza");
    }
}
