package com.liufei.chapter1.strategy.duck;

import com.liufei.chapter1.strategy.behavior.FlyBehavior;
import com.liufei.chapter1.strategy.behavior.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    public void swim(){
        System.out.println("swimming...");
    }

    public void performFly(){
        flyBehavior.fly();
    };

    public void performQuack(){
        quackBehavior.quack();
    };
}
