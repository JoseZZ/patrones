package com.training.observer.observable;

import java.util.Observable;
import java.util.Observer;

/**
 * @author <a href="changeme@ext.inditex.com">Jose Gonzalez</a>
 */
public class EstadisticasDisplay implements Observer, DisplayElemento {

    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;

    public EstadisticasDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof DatosTiempo) {
            DatosTiempo weatherData = (DatosTiempo) observable;
            float temp = weatherData.getTemperatura();
            tempSum += temp;
            numReadings++;

            if (temp > maxTemp) {
                maxTemp = temp;
            }

            if (temp < minTemp) {
                minTemp = temp;
            }

            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
            + "/" + maxTemp + "/" + minTemp);
    }
}