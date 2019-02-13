package com.training.adapter;

/**
 * Created by Jose Gonzalez on 13/02/2019.
 */
// Esta clase se encargara de adaptar la interfaz de gallina que tenemos a la
// interfaz de pato que necesitamos
public class GallinaAdapter implements Pato{

    Gallina gallina;

    public GallinaAdapter(Gallina gallina) {
        this.gallina = gallina;
    }

    @Override
    public void quack() {
        gallina.cacarea();
    }

    @Override
    public void volar() {
        // Las gallinas vuelan en intervalos cortos, no como los patos
        // Lo figuramos con vuelos repetidos
        for(int i = 0; i < 5; i++){
            gallina.volar();
        }
    }
}
