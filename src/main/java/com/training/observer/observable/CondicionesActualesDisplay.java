package com.training.observer.observable;

import java.util.Observable;
import java.util.Observer;

/**
 * @author <a href="changeme@ext.inditex.com">Jose Gonzalez</a>
 */
public class CondicionesActualesDisplay implements Observer, DisplayElemento {

    Observable observable;
    private float temperature;
    private float humidity;

    public CondicionesActualesDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof DatosTiempo) {
            DatosTiempo weatherData = (DatosTiempo) obs;
            temperature = weatherData.getTemperatura();
            humidity = weatherData.getHumedad();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
            + "F degrees and " + humidity + "% humidity");
    }
}
