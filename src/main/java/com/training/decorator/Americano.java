package com.training.decorator;

/**
 * @author <a href="changeme@ext.inditex.com">Jose Gonzalez</a>
 */
public class Americano extends Bebida {

    public Americano() {
        description = "Cafe largo estilo americano";
    }

    @Override
    public double cost() {
        return 2.65;
    }
}
