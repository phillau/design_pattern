package com.liufei.chapter1.decorator;

import com.liufei.chapter1.decorator.beDecorated.Beverage;
import com.liufei.chapter1.decorator.beDecorated.DarkRoast;
import com.liufei.chapter1.decorator.beDecorated.Espresso;
import com.liufei.chapter1.decorator.decorator.Soy;
import com.liufei.chapter1.decorator.decorator.Whip;

public class DecoratorApp {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription()+" "+espresso.cost());
        Beverage beverage = new DarkRoast();
        beverage = new Soy(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription()+" "+beverage.cost());
    }
}
