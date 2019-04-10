package com.liufei.chapter1.template.concrete;

import com.liufei.chapter1.template.template.CoffeineBeverage;

public class Tea extends CoffeineBeverage {
    @Override
    public void brew() {
        System.out.println("dripping coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("add sugar and milk");
    }
}
