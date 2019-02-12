package com.training.singleton;

/**
 * Created by Jose Gonzalez on 12/02/2019.
 */
public enum EnumSingleton {

    // Un enum tiene un numero fijo de instancias definido por los posibles valores
    // Tiene por defecto un constructor privado. No se puede hacer un constructor publico
    // No se puede heredar de un enum
    // Cuando se serializa solo se serializa el nombre de la instancia
    // Por defecto esta sincronizado

    INSTANCE("Informacion de mi instancia");

    private String info;

    private EnumSingleton(String info){
        this.info = info;
    }

    public EnumSingleton getInstance(){
        return INSTANCE;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
