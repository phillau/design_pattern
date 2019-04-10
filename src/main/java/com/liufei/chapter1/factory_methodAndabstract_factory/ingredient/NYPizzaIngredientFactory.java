package com.liufei.chapter1.factory_methodAndabstract_factory.ingredient;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public void createSauce() {
        System.out.println("create Chicago style sauce");
    }

    @Override
    public void createCheese() {
        System.out.println("create Chicago style cheese");
    }

    @Override
    public void createVeggies() {
        System.out.println("create Chicago style veggies");
    }
}
