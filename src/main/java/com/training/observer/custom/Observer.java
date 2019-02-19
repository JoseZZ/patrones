package com.training.observer.custom;

// Esta interfaz sera implementada por todos los observers
public interface Observer {

    public void update(float temperatura, float humedad, float presion);
}
