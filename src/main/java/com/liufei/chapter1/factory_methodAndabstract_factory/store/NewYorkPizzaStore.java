package com.liufei.chapter1.factory_methodAndabstract_factory.store;

import com.liufei.chapter1.factory_methodAndabstract_factory.ingredient.PizzaIngredientFactory;
import com.liufei.chapter1.factory_methodAndabstract_factory.pizza.NYStyleCheesePizza;
import com.liufei.chapter1.factory_methodAndabstract_factory.pizza.NYStyleVeggiePizza;
import com.liufei.chapter1.factory_methodAndabstract_factory.pizza.Pizza;

public class NewYorkPizzaStore extends PizzaStore {
    public NewYorkPizzaStore(PizzaIngredientFactory pizzaIngredientFactory) {
        super(pizzaIngredientFactory);
    }

    @Override
    protected Pizza createPizza(String type) {
        if("cheese".equals(type)){
            return new NYStyleCheesePizza();
        }else if("veggie".equals(type)) {
            return new NYStyleVeggiePizza();
        }
        throw new RuntimeException("传入了错误的pizza类型");
    }
}
