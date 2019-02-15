package com.training.proxy.security;

/**
 * @author <a href="changeme@ext.inditex.com">Jose Gonzalez</a>
 */
public class Noria implements Atraccion {

    @Override
    public void subir(Cliente cliente) {
        System.out.println("Disfruta de la atraccion " + cliente.getNombre());
    }
}
