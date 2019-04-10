package com.liufei.chapter1.template.concrete;

import com.liufei.chapter1.template.template.CoffeineBeverage;

public class Coffee extends CoffeineBeverage {

    private boolean isAddCondiments;

    public Coffee(boolean isAddCondiments) {
        this.isAddCondiments = isAddCondiments;
    }

    @Override
    public void brew() {
        System.out.println("steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("add lemon");
    }

    @Override
    public boolean isAddCondiments() {
        return isAddCondiments;
    }
}
