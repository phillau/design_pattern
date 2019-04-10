package com.liufei.chapter1.factory_methodAndabstract_factory.ingredient;

public class CHPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public void createSauce() {
        System.out.println("create NewYork style sauce");
    }

    @Override
    public void createCheese() {
        System.out.println("create NewYork style cheese");
    }

    @Override
    public void createVeggies() {
        System.out.println("create NewYork style veggies");
    }
}
