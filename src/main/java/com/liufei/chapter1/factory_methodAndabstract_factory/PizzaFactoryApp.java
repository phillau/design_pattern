package com.liufei.chapter1.factory_methodAndabstract_factory;

import com.liufei.chapter1.factory_methodAndabstract_factory.ingredient.CHPizzaIngredientFactory;
import com.liufei.chapter1.factory_methodAndabstract_factory.ingredient.NYPizzaIngredientFactory;
import com.liufei.chapter1.factory_methodAndabstract_factory.store.ChicagoPizzaStore;
import com.liufei.chapter1.factory_methodAndabstract_factory.store.NewYorkPizzaStore;
import com.liufei.chapter1.factory_methodAndabstract_factory.store.PizzaStore;

/**
 * 工厂方法模式，将实例化推迟到子类
 */
public class PizzaFactoryApp {
    public static void main(String[] args) {
        PizzaStore newYorkPizzaStore = new NewYorkPizzaStore(new NYPizzaIngredientFactory());
        newYorkPizzaStore.orderPizza("cheese");
        System.out.println("---------------------------------");
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore(new CHPizzaIngredientFactory());
        chicagoPizzaStore.orderPizza("cheese");
    }
}
