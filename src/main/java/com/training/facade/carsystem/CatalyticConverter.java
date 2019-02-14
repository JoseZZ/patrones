package com.training.facade.carsystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CatalyticConverter {

    private static final Logger LOGGER = LoggerFactory.getLogger(CatalyticConverter.class);

    public void on() {
        LOGGER.info("Convertidor Catalitico encendido!");
    }

    public void off() {
        LOGGER.info("Convertidor Catalitico apagado!");
    }
}
