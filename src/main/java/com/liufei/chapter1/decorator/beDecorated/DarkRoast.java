package com.liufei.chapter1.decorator.beDecorated;

public class DarkRoast extends Beverage {

    @Override
    public String getDescription() {
        return "DarkRoast";
    }

    @Override
    public Double cost() {
        return 1.9;
    }
}
