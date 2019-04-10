package com.liufei.chapter1.decorator.beDecorated;

public abstract class Beverage {
    private String description;

    public String getDescription() {
        return description;
    }

    public abstract Double cost();
}
