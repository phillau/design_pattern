package com.liufei.chapter1.factory_methodAndabstract_factory.pizza;

import com.liufei.chapter1.factory_methodAndabstract_factory.ingredient.PizzaIngredientFactory;

public interface Pizza {
    void prepare(PizzaIngredientFactory pizzaIngredientFactory);

    void bake();

    void cut();

    void box();
}
