package com.training.adapter;

/**
 * Created by Jose Gonzalez on 13/02/2019.
 */
public class Caponata implements Gallina{
    @Override
    public void cacarea() {
        System.out.println("Quiquiriqui!!!");
    }

    @Override
    public void volar() {
        System.out.println("Vuelo poco pero vuelo!!!");
    }
}
