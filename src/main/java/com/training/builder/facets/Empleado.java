package com.training.builder.facets;

/**
 * Created by Jose Gonzalez on 10/02/2019.
 */
public class Empleado {

    public String direccion;
    public String codigopostal;
    public String ciudad;
    public String posicion;
    public String empresa;
    public int sueldo;

    @Override
    public String toString() {
        return "Empleado{" +
                "direccion='" + direccion + '\'' +
                ", codigopostal='" + codigopostal + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", posicion='" + posicion + '\'' +
                ", empresa='" + empresa + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}

