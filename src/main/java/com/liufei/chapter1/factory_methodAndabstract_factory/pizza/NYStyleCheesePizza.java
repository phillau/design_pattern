package com.liufei.chapter1.factory_methodAndabstract_factory.pizza;

import com.liufei.chapter1.factory_methodAndabstract_factory.ingredient.PizzaIngredientFactory;

public class NYStyleCheesePizza implements Pizza {
    public void prepare(PizzaIngredientFactory pizzaIngredientFactory) {
        pizzaIngredientFactory.createSauce();
        pizzaIngredientFactory.createCheese();
        pizzaIngredientFactory.createVeggies();
    }

    public void bake() {
        System.out.println("bake NYStyleCheesePizza");
    }

    public void cut() {
        System.out.println("cut NYStyleCheesePizza");
    }

    public void box() {
        System.out.println("box NYStyleCheesePizza");
    }
}
