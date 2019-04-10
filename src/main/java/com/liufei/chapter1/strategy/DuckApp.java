package com.liufei.chapter1.strategy;

import com.liufei.chapter1.strategy.behavior.FlyNoWay;
import com.liufei.chapter1.strategy.behavior.QuackGuaGua;
import com.liufei.chapter1.strategy.duck.NormalDuck;

public class DuckApp {
    public static void main(String[] args) {
        NormalDuck normalDuck = new NormalDuck(new FlyNoWay(), new QuackGuaGua());
        normalDuck.display();

        normalDuck.performFly();
        normalDuck.performQuack();
        normalDuck.swim();
    }
}
