package com.liufei.chapter1.adapter;

import com.liufei.chapter1.adapter.adaptee.RedTurkey;
import com.liufei.chapter1.adapter.adapter.TurkeyAdapter;
import com.liufei.chapter1.adapter.target.Duck;

public class AdapterApp {
    public static void main(String[] args) {
        Duck turkeyAdapter = new TurkeyAdapter(new RedTurkey());
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}

