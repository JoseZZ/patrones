package com.training.decorator;

/**
 * @author <a href="changeme@ext.inditex.com">Jose Gonzalez</a>
 */
public class Expresso extends Bebida {

    public Expresso() {
        description = "Cafe Expresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
