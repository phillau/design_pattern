package com.liufei.chapter1.observer.subject1;

import com.liufei.chapter1.observer.observer1.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherData implements WeatherObject {
    private Set<Observer> observers = new HashSet();

    private String temperature;
    private String humidity;
    private String pressure;

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setFakeMeaurements(String temperature, String humidity, String pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
