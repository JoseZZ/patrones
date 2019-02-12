package com.training.factory.simple;

/**
 * Created by Jose Gonzalez on 12/02/2019.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Soy un Circle::draw() method.");
    }
}