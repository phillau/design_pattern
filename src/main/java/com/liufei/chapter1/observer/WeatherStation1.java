package com.liufei.chapter1.observer;

import com.liufei.chapter1.observer.observer1.CurrentDisplay;
import com.liufei.chapter1.observer.observer1.ForecastDisplay;
import com.liufei.chapter1.observer.observer1.StatisticsDisplay;
import com.liufei.chapter1.observer.subject1.WeatherData;

public class WeatherStation1 {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentDisplay currentDisplay = new CurrentDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setFakeMeaurements("31度","60","低");
        System.out.println("----------------------------更新天气状况完毕------------------------------");
        weatherData.setFakeMeaurements("33度","55","高");
        weatherData.removeObserver(statisticsDisplay);
        System.out.println("----------------------------移除天气统计布告板完毕------------------------------");
        weatherData.setFakeMeaurements("33度","55","高");
        currentDisplay.removeSelf();
        System.out.println("----------------------------移除目前状况布告板完毕------------------------------");
        weatherData.setFakeMeaurements("33度","55","高");
    }
}
