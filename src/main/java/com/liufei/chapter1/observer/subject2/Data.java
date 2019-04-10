package com.liufei.chapter1.observer.subject2;

public class Data{
    private String temperature;
    private String humidity;
    private String pressure;

    public Data(String temperature, String humidity, String pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return "Data{" +
                "temperature='" + temperature + '\'' +
                ", humidity='" + humidity + '\'' +
                ", pressure='" + pressure + '\'' +
                '}';
    }
}
