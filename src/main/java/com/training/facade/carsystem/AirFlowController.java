package com.training.facade.carsystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AirFlowController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AirFlowController.class);
    private AirFlowMeter airFlowMeter = new AirFlowMeter();

    public void takeAir() {
        airFlowMeter.getMeasurements();
        LOGGER.info("Se suministra aire!");
    }

    public void off() {
        LOGGER.info("Se apaga el controlador del aire.");
    }
}
