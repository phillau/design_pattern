package com.liufei.chapter1.strategy.duck;

import com.liufei.chapter1.strategy.behavior.QuackBehavior;
import com.liufei.chapter1.strategy.behavior.QuackGuaGua;

public class DuckCall {
    private QuackBehavior quackBehavior;

    public void performQuack(){
        quackBehavior.quack();
    }

    public DuckCall(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public static void main(String[] args) {
        DuckCall duckCall = new DuckCall(new QuackGuaGua());
        duckCall.performQuack();
    }
}
