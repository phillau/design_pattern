package com.liufei.chapter1.decorator.decorator;

import com.liufei.chapter1.decorator.beDecorated.Beverage;

public abstract class CondimentDecorator extends Beverage {
    @Override
    public abstract String getDescription();
}
