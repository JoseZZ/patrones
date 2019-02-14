package com.training.decorator;

/**
 * @author <a href="changeme@ext.inditex.com">Jose Gonzalez</a>
 */
public class Soja extends ExtraDecorator {

    // El decorator debe tener el objeto que quiere decorar
    Bebida bebida;

    public Soja(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescription() {
        return bebida.getDescription() + ", Leche de Soja";
    }

    @Override
    public double cost() {
        return 0.50 + bebida.cost();
    }
}
