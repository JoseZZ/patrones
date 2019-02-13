package com.training.adapter;

/**
 * Created by Jose Gonzalez on 13/02/2019.
 */
public class PatoColorao implements Pato{
    @Override
    public void quack() {
        System.out.println("Cuakkkkk!!!!!");
    }

    @Override
    public void volar() {
        System.out.println("Vuelo al sur!!!");
    }
}
