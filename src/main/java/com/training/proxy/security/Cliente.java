package com.training.proxy.security;

import lombok.Data;

@Data
public class Cliente {

    private int edad;
    private String nombre;

    public Cliente(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }
}
