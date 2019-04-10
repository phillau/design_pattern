package com.liufei.chapter1.observer;

import com.liufei.chapter1.observer.observer2.CurrentDisplay;
import com.liufei.chapter1.observer.observer2.ForecastDisplay;
import com.liufei.chapter1.observer.subject2.Data;
import com.liufei.chapter1.observer.subject2.WeatherData;

public class WeatherStation2 {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
//        CurrentDisplay currentDisplay = new CurrentDisplay(weatherData);
        CurrentDisplay currentDisplay = new CurrentDisplay();
        weatherData.addObserver(currentDisplay);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setFakeMeaurements(new Data("35度","100","高"));
        System.out.println("-------------------------------");
        weatherData.deleteObserver(forecastDisplay);
        weatherData.setFakeMeaurements(new Data("35度","68","低"));
    }
}