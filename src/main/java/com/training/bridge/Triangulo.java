package com.training.bridge;

/**
 * Created by Jose Gonzalez on 13/02/2019.
 */
public class Triangulo extends Figura {

    public Triangulo(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Dibujo un triangulo. " + color.rellenar();
    }
}
