package com.training.singleton;

import java.time.LocalDateTime;

/**
 * Created by Jose Gonzalez on 12/02/2019.
 */
public class InnerStaticSingleton {

    private static String mensaje;

    private InnerStaticSingleton(String mensaje){
        this.mensaje = mensaje;
    }

    // Al utilizar una clase interna nos aseguramos de que sea threat safe
    // Las clases internas no se cargan hasta que son referenciadas
    // La clase LazyHolder no se ejecuta hasta que se llama con getInstance
    // Entonces la maquina virtual carga la clase interna y se inicializa la variable estatica
    // llamando al constructor de la clase externa.
    // Como la fase de inicializacion es secuencial, y por tanto no concurrente, no se necesita
    // sincronizacion en getInstance durante la carga y la inicializacion
    private static class LazyHolder{
        private static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton(LocalDateTime.now().toString());
    }

    public static InnerStaticSingleton getInstance(){
        return LazyHolder.INSTANCE;
    }

    public String getMensaje(){
        return mensaje;
    }
}
