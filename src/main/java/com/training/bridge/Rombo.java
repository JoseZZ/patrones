package com.training.bridge;

/**
 * Created by Jose Gonzalez on 13/02/2019.
 */
public class Rombo extends Figura {

    public Rombo(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Dibujo un rombo. " + color.rellenar();
    }
}
