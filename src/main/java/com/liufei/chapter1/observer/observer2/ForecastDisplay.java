package com.liufei.chapter1.observer.observer2;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer,DisplayElement{

    private Object arg;

    public ForecastDisplay(Observable observable) {
        observable.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        this.arg = arg;
        display();
    }

    public void display() {
        System.out.println("天气预报为："+arg);
    }
}
