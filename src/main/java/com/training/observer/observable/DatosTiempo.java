package com.training.observer.observable;

import java.util.Observable;

/**
 * @author <a href="changeme@ext.inditex.com">Jose Gonzalez</a>
 */
public class DatosTiempo extends Observable {

    private float temperatura;
    private float humedad;
    private float presion;

    // El constructor ya no va a necesitar una estructura que almacene
    // los observers
    public DatosTiempo() {
    }

    public void measurementsChanged() {
        // Con este metodo indicamos que el estado de nuestro objeto ha cambiado
        setChanged();
        // Con este metodo notificamos a los observadores. Es necesario el paso previo
        notifyObservers();
    }

    public void setMeasurements(float temperatura, float humedad, float presion) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.presion = presion;
        measurementsChanged();
    }

    public float getTemperatura() {
        return temperatura;
    }

    public float getHumedad() {
        return humedad;
    }

    public float getPresion() {
        return presion;
    }
}
