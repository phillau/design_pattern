package com.liufei.chapter1.decorator.decorator;

import com.liufei.chapter1.decorator.beDecorated.Beverage;

public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ,soy";
    }

    @Override
    public Double cost() {
        return beverage.cost() + 0.1;
    }
}
