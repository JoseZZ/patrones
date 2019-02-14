package com.training.facade.carsystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Radiator {

    private static final Logger LOGGER = LoggerFactory.getLogger(Radiator.class);

    public void on() {
        LOGGER.info("Radiador encendido");
    }

    public void off() {
        LOGGER.info("Radiador apagado!");
    }

    public void setSpeed(Integer speed) {
        LOGGER.info("Configurando la velocidad de radiador en {}", speed);
    }
}
