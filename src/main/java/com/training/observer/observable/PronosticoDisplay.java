package com.training.observer.observable;

import java.util.Observable;
import java.util.Observer;

/**
 * @author <a href="changeme@ext.inditex.com">Jose Gonzalez</a>
 */
public class PronosticoDisplay implements Observer, DisplayElemento {

    private float currentPressure = 29.92f;
    private float lastPressure;

    public PronosticoDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof DatosTiempo) {
            DatosTiempo weatherData = (DatosTiempo) observable;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPresion();
            display();
        }
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

}