package com.liufei.chapter1.factory_methodAndabstract_factory.store;

import com.liufei.chapter1.factory_methodAndabstract_factory.ingredient.PizzaIngredientFactory;
import com.liufei.chapter1.factory_methodAndabstract_factory.pizza.Pizza;

public abstract class PizzaStore {
    PizzaIngredientFactory pizzaIngredientFactory;

    public PizzaStore(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    protected abstract Pizza createPizza(String type);

    public void orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare(pizzaIngredientFactory);
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
