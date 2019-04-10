package com.liufei.chapter1.decorator.beDecorated;

public class Espresso extends Beverage {

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public Double cost() {
        return 2.9;
    }
}
