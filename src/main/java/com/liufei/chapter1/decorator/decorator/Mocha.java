package com.liufei.chapter1.decorator.decorator;

import com.liufei.chapter1.decorator.beDecorated.Beverage;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ,mocha";
    }

    @Override
    public Double cost() {
        return beverage.cost() + 0.2;
    }
}
