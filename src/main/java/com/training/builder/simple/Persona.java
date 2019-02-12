package com.training.builder.simple;

import java.time.LocalDate;
import java.util.Date;

/**
 * Created by Jose Gonzalez on 10/02/2019.
 */

public class Persona {

    public static enum Genero{
        HOMBRE,
        MUJER
    }

    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private LocalDate nacimiento ;
    private Genero genero;
    private String ciudad;

    private Persona(Builder builder) {
        this.nombre = builder.nombre;
        this.apellido = builder.apellido;
        this.dni = builder.dni;
        this.direccion = builder.direccion;
        this.nacimiento = builder.nacimiento;
        this.genero = builder.genero;
        this.ciudad = builder.ciudad;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", direccion='" + direccion + '\'' +
                ", nacimiento=" + nacimiento +
                ", genero=" + genero +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }

    public static class Builder{
        // Podemos definir parametros obligatorios en el constructor
        private String dni;

        // Parametros opcionales
        private String nombre;
        private String apellido;
        private String direccion;
        private LocalDate nacimiento ;
        private Genero genero;
        private String ciudad;

        public Builder(String dni){
            this.dni = dni;
        }

        // Metodos del builder para generar el objeto de forma fluent
        public Builder nombre(String nombre){
            this.nombre = nombre;
            return this;
        }

        public Builder apellido(String apellido){
            this.apellido = apellido;
            return this;
        }

        public Builder direccion(String direccion){
            this.direccion = direccion;
            return this;
        }

        public Builder ciudad(String ciudad){
            this.ciudad = ciudad;
            return this;
        }

        public Builder nacimiento(LocalDate nacimiento){
            this.nacimiento = nacimiento;
            return this;
        }

        public Builder genero(Genero genero){
            this.genero = genero;
            return this;
        }

        public Persona build(){
            return new Persona(this);
        }
    }
}
