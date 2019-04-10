package com.liufei.chapter1.strategy.duck;

import com.liufei.chapter1.strategy.behavior.FlyBehavior;
import com.liufei.chapter1.strategy.behavior.FlyNoWay;
import com.liufei.chapter1.strategy.behavior.QuackBehavior;
import com.liufei.chapter1.strategy.behavior.QuackGuaGua;

public class NormalDuck extends Duck {

    public NormalDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    @Override
    public void display() {
        System.out.println("i'm a normal duck");
    }

}
