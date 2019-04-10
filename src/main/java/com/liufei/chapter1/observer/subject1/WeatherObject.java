package com.liufei.chapter1.observer.subject1;

import com.liufei.chapter1.observer.observer1.Observer;

public interface WeatherObject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
