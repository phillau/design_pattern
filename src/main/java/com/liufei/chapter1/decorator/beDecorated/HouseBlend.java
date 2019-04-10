package com.liufei.chapter1.decorator.beDecorated;

public class HouseBlend extends Beverage {

    @Override
    public String getDescription() {
        return "HouseBlend";
    }

    @Override
    public Double cost() {
        return 3.9;
    }
}
