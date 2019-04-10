package com.liufei.chapter1.decorator.decorator;

import com.liufei.chapter1.decorator.beDecorated.Beverage;

public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ,whip";
    }

    @Override
    public Double cost() {
        return beverage.cost() + 0.3;
    }
}
