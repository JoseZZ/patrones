package com.training.facade.carsystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoolingController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CoolingController.class);
    private static final Integer DEFAULT_RADIATOR_SPEED = 10;

    private Integer temperatureUpperLimit;
    private Radiator radiator = new Radiator();
    private TemperatureSensor temperatureSensor = new TemperatureSensor();

    public void setTemperatureUpperLimit(Integer temperatureUpperLimit) {
        LOGGER.info("Estableciendo el limite superior de temperatura en {}", temperatureUpperLimit);
        this.temperatureUpperLimit = temperatureUpperLimit;
    }

    public void run() {
        LOGGER.info("Controlador de enfriado listo!");
        radiator.setSpeed(DEFAULT_RADIATOR_SPEED);
    }

    public void cool(Integer maxAllowedTemp) {
        LOGGER.info("Programado enfriamiento con temperatura máxima permitida {}", maxAllowedTemp);
        temperatureSensor.getTemperature();
        radiator.on();
    }

    public void stop() {
        LOGGER.info("Parando controlador de enfriamiento...");
        radiator.off();
    }
}
