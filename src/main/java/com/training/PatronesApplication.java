package com.training;

import com.training.builder.facets.Empleado;
import com.training.builder.facets.PersonBuilder;
import com.training.builder.simple.Persona;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Scanner;

@SpringBootApplication
public class PatronesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatronesApplication.class, args);
		Scanner scanner = new Scanner(System.in);
		int opcion = 0;

		while(opcion < 10) {
			System.out.println("Opcion: " + opcion);
			System.out.println("Introduce el numero de prueba: ");
			System.out.println("1.- Patron builder");
			opcion = scanner.nextInt();
			switch (opcion) {
				// 1. Patron builder
				case 1:
					// Creamos una persona
					Persona persona = new Persona.Builder("039487T")
							.nombre("Alfonso")
							.apellido("Gutierrez")
							.ciudad("Madrid")
							.direccion("Alcala 87")
							.nacimiento(LocalDate.of(1987, 3, 12))
							.genero(Persona.Genero.HOMBRE)
							.build();
					System.out.println(persona);

					// Creamos una persona con facets
					PersonBuilder personBuilder = new PersonBuilder();
					Empleado otra = personBuilder.vive()
										.direccion("Castellana 53")
										.codigoPostal("26094")
										.cuidad("Madrid")
									.trabaja()
										.empresa("Kairos")
										.posicion("Programador")
										.earning(20000)
									.build();
					System.out.println(otra);
					break;
				default:
					break;
			}
		}
		System.out.println("Adios");
	}

}
