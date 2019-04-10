package com.liufei.chapter1.observer.subject2;

import java.util.Observable;

public class WeatherData extends Observable {
    Data data;

    /**
     * 让观察者到时候自己通过weatherData对象的get方法自己拉数据
     */
    public Data getData() {
        return data;
    }

    public void measurementsChanged(){
        setChanged();
        /**
         * 推数据给观察者
         */
//        notifyObservers(data);
        /**
         * 让观察者到时候自己通过weatherData对象拉数据
         */
        notifyObservers();
    }

    public void setFakeMeaurements(Data data){
        this.data = data;
        measurementsChanged();
    }
}

