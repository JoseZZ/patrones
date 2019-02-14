package com.training.decorator;

/**
 * @author <a href="changeme@ext.inditex.com">Jose Gonzalez</a>
 */
public abstract class Bebida {

    String description = "Bebida desconocida";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
