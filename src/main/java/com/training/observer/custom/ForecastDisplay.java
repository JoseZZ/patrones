package com.training.observer.custom;

/**
 * @author <a href="changeme@ext.inditex.com">Jose Gonzalez</a>
 */
public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("El tiempo va mejorando!");
        } else if (currentPressure == lastPressure) {
            System.out.println("Mas de lo mismo");
        } else if (currentPressure < lastPressure) {
            System.out.println("Van a caer chuzos de punta!");
        }
    }

}
