package com.liufei.chapter1.strategy.behavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("no fly...");
    }
}
