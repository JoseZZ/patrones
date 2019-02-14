package com.training.decorator;

/**
 * @author <a href="changeme@ext.inditex.com">Jose Gonzalez</a>
 */
public class Desnatado extends ExtraDecorator {

    // El decorator debe tener el objeto que quiere decorar
    Bebida bebida;

    public Desnatado(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescription() {
        return bebida.getDescription() + ", Leche desnatada";
    }

    @Override
    public double cost() {
        return 0.10 + bebida.cost();
    }
}
