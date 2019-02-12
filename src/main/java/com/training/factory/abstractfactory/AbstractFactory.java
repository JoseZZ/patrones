package com.training.factory.abstractfactory;

public interface AbstractFactory {
    Animal getAnimal(String toyType) ;
    Color getColor(String colorType);
}