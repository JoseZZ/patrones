package com.training.facade.carsystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FuelInjector {

    private static final Logger LOGGER = LoggerFactory.getLogger(FuelInjector.class);

    private FuelPump fuelPump = new FuelPump();

    public void on() {
        LOGGER.info("Inyector de fuel listo para inyectar combustible.");
    }

    public void inject() {
        fuelPump.pump();
        LOGGER.info("Fuel inyectado.");
    }

    public void off() {
        LOGGER.info("Parando inyector de fuel...");
    }
}
