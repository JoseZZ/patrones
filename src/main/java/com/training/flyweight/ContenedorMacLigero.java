package com.training.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author <a href="changeme@ext.inditex.com">Jose Gonzalez</a>
 */

// Almacerana los Mac ligeros
public class ContenedorMacLigero {

    private static Map<String, MacLigero> macLigeros = new HashMap<>();

    public static MacLigero getMacLigero(int ram, int disco) {
        String clave = ram + ":" + disco;
        System.out.println(clave);
        // Si no existe un mac con esa configuracion, lo guardamos
        // Si no lo devolvemos
        if (!macLigeros.containsKey(clave)) {
            macLigeros.put(clave, new MacLigero(ram, disco));
        }
        return macLigeros.get(clave);
    }
}
