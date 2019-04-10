package com.liufei.chapter1.observer.observer1;

import com.liufei.chapter1.observer.subject1.WeatherObject;

public class StatisticsDisplay implements Observer, DisplayElement {
    private String temperature;
    private String humidity;
    private String pressure;
    private WeatherObject weatherObject;

    public void update(String temperature, String humidity, String pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public StatisticsDisplay(WeatherObject weatherObject) {
        this.weatherObject = weatherObject;
        weatherObject.registerObserver(this);
    }

    public void display() {
        System.out.println("天气统计布告板：temperature=" + temperature + ",humidity=" + humidity + ",pressure=" + pressure);
    }
}
