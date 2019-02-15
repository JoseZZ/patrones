package com.training.proxy.security;

// Esta clase actuara como proxy
public class NoriaProxy implements Atraccion {

    private static Atraccion atraccion;
    private static final int LIMITE = 16;

    public NoriaProxy() {
        // Creamos el objeto como si fuera el original
        atraccion = new Noria();
    }

    @Override
    public void subir(Cliente cliente) {
        if (cliente.getEdad() < LIMITE) {
            System.out.println("Lo siento " + cliente.getNombre() + " pero debes tener " +
                LIMITE + " años y tienes solo " + cliente.getEdad());
        } else {
            System.out.println("Puedes pasar");
            atraccion.subir(cliente);
        }
    }
}
