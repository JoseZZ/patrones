package com.training.builder.facets;

/**
 * Created by Jose Gonzalez on 12/02/2019.
 */
// Builder facade
public class PersonBuilder{
    // El objeto que queremos construir
    Empleado empleado = new Empleado();

    public PersonJobBuilder trabaja()
    {
        return new PersonJobBuilder(empleado);
    }

    public PersonAddressBuilder vive()
    {
        return new PersonAddressBuilder(empleado);
    }

    public Empleado build()
    {
        return empleado;
    }

    public class PersonAddressBuilder extends PersonBuilder
    {
        public PersonAddressBuilder(Empleado empleado)
        {
            this.empleado = empleado;
        }

        public PersonAddressBuilder direccion(String streetAddress)
        {
            empleado.direccion = streetAddress;
            return this;
        }

        public PersonAddressBuilder codigoPostal(String postcode)
        {
            empleado.codigopostal = postcode;
            return this;
        }

        public PersonAddressBuilder cuidad(String city)
        {
            empleado.ciudad = city;
            return this;
        }
    }

    public class PersonJobBuilder extends PersonBuilder
    {
        public PersonJobBuilder(Empleado empleado)
        {
            this.empleado = empleado;
        }

        public PersonJobBuilder empresa(String companyName)
        {
            empleado.empresa = companyName;
            return this;
        }

        public PersonJobBuilder posicion(String position)
        {
            empleado.posicion = position;
            return this;
        }

        public PersonJobBuilder earning(int annualIncome)
        {
            empleado.sueldo = annualIncome;
            return this;
        }
    }
}

