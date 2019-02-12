package com.training.factory.method;

/**
 * Created by Jose Gonzalez on 12/02/2019.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Soy un Rectangle::draw() method.");
    }
}