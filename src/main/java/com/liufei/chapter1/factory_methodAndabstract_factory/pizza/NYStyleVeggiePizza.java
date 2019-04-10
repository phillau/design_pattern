package com.liufei.chapter1.factory_methodAndabstract_factory.pizza;

import com.liufei.chapter1.factory_methodAndabstract_factory.ingredient.PizzaIngredientFactory;

public class NYStyleVeggiePizza implements Pizza {
    public void prepare(PizzaIngredientFactory pizzaIngredientFactory) {
        pizzaIngredientFactory.createSauce();
        pizzaIngredientFactory.createCheese();
        pizzaIngredientFactory.createVeggies();
    }

    public void bake() {
        System.out.println("bake NYStyleVeggiePizza");
    }

    public void cut() {
        System.out.println("cut NYStyleVeggiePizza");
    }

    public void box() {
        System.out.println("box NYStyleVeggiePizza");
    }
}
