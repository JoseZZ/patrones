package com.training.decorator;

/**
 * @author <a href="changeme@ext.inditex.com">Jose Gonzalez</a>
 */
public class Moka extends ExtraDecorator {

    // El decorator debe tener el objeto que quiere decorar
    Bebida bebida;

    public Moka(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescription() {
        return bebida.getDescription() + ", Moka";
    }

    @Override
    public double cost() {
        return 0.20 + bebida.cost();
    }
}
