package com.training.observer.custom;

// Esta clase se encargara de mostrar los datos del tiempo
// Implementa la interfaz Observer, por lo que puede ver los cambios del objeto WeatherData
// Implementa DisplayElement porque el API va a requerir mostrar todos los
// elementos que implementan esta nterfaz
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperatura;
    private float humedad;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        // Registramos el display como un observer
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperatura, float humedad, float presion) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        display();
    }

    // Mostramos los datos mas recientes
    @Override
    public void display() {
        System.out.println("Condiciones actuales: " + temperatura
            + "ºC y " + humedad + "% de humedad");
    }
}
