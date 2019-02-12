package com.training.singleton;

import java.time.LocalDateTime;

/**
 * Created by Jose Gonzalez on 12/02/2019.
 */
public class LazySingleton {

    // Ponemos synchronized para hacerlo threat safe, y hacemos doble check para no sincronizar siempre
    private static LazySingleton instance = null;
    private final String mensaje;

    private LazySingleton() {
        mensaje = LocalDateTime.now().toString();
    }

    public static LazySingleton getInstance(){
        if(instance == null){
            synchronized (LazySingleton.class){
                if(instance == null){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    public String getMensaje(){
        return mensaje;
    }
}
