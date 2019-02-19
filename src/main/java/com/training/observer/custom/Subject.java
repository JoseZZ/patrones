package com.training.observer.custom;

// Esta clase modelara el objeto a observar
public interface Subject {

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
