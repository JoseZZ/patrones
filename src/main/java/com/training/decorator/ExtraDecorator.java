package com.training.decorator;

/**
 * @author <a href="changeme@ext.inditex.com">Jose Gonzalez</a>
 */
public abstract class ExtraDecorator extends Bebida {

    @Override
    public abstract String getDescription();

    @Override
    public abstract double cost();
}