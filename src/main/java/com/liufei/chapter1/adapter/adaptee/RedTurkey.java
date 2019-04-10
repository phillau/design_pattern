package com.liufei.chapter1.adapter.adaptee;

public class RedTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("ge ge");
    }

    @Override
    public void fly() {
        System.out.println("fly a short distance");
    }
}
