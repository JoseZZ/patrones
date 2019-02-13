package com.training.bridge;

/**
 * Created by Jose Gonzalez on 13/02/2019.
 */
// Esta clase abstracta es la referencia (bridge) al objeto Color
public abstract class Figura {

    protected Color color;

    public Figura(Color color) {
        this.color = color;
    }

    abstract public String draw();
}
