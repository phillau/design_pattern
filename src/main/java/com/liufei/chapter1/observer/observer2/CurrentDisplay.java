package com.liufei.chapter1.observer.observer2;

import com.liufei.chapter1.observer.subject2.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class CurrentDisplay implements Observer,DisplayElement{

    private Object arg;

//    public CurrentDisplay(Observable observable) {
//        observable.addObserver(this);
//    }

    public CurrentDisplay() {
    }

    public void update(Observable o, Object arg) {
        /**
         * 当为自己拉数据时，arg就不会有值了
         */
//        this.arg = arg;
        if(o instanceof WeatherData){
            this.arg = ((WeatherData) o).getData();
        }
        display();
    }

    public void display() {
        System.out.println("目前状况为："+arg);
    }
}
