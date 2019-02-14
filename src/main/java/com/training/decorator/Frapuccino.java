package com.training.decorator;

/**
 * @author <a href="changeme@ext.inditex.com">Jose Gonzalez</a>
 */
public class Frapuccino extends Bebida {

    public Frapuccino() {
        description = "Cafe con leche y hielo picado";
    }

    @Override
    public double cost() {
        return 4.20;
    }
}
