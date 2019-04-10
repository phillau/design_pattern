package com.liufei.chapter1.factory_methodAndabstract_factory.store;

import com.liufei.chapter1.factory_methodAndabstract_factory.ingredient.PizzaIngredientFactory;
import com.liufei.chapter1.factory_methodAndabstract_factory.pizza.CHStyleCheesePizza;
import com.liufei.chapter1.factory_methodAndabstract_factory.pizza.CHStyleVeggiePizza;
import com.liufei.chapter1.factory_methodAndabstract_factory.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    public ChicagoPizzaStore(PizzaIngredientFactory pizzaIngredientFactory) {
        super(pizzaIngredientFactory);
    }

    @Override
    protected Pizza createPizza(String type) {
        if("cheese".equals(type)){
            return new CHStyleCheesePizza();
        }else if("veggie".equals(type)) {
            return new CHStyleVeggiePizza();
        }
        throw new RuntimeException("传入了错误的pizza类型");
    }
}
