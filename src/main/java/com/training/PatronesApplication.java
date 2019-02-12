package com.training;

import com.training.builder.facets.Empleado;
import com.training.builder.facets.PersonBuilder;
import com.training.builder.simple.Persona;
import com.training.factory.abstractfactory.AbstractFactory;
import com.training.factory.abstractfactory.Animal;
import com.training.factory.abstractfactory.Color;
import com.training.factory.abstractfactory.FactoryProvider;
import com.training.factory.method.Shape;
import com.training.factory.method.ShapeFactory;
import com.training.singleton.EnumSingleton;
import com.training.singleton.InnerStaticSingleton;
import com.training.singleton.LazySingleton;
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
			System.out.println("2.- Patron factory method");
			System.out.println("3.- Patron abstract factory");
			System.out.println("4.- Patron singleton");
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
				// 2. Patron factory method
				case 2:
					ShapeFactory shapeFactory = new ShapeFactory();

					//get an object of Circle and call its draw method.
					Shape shape1 = shapeFactory.getShape("CIRCLE");

					//call draw method of Circle
					shape1.draw();

					//get an object of Rectangle and call its draw method.
					Shape shape2 = shapeFactory.getShape("RECTANGLE");

					//call draw method of Rectangle
					shape2.draw();

					//get an object of Square and call its draw method.
					Shape shape3 = shapeFactory.getShape("SQUARE");

					//call draw method of square
					shape3.draw();
					break;
				// 3. Patron abstract factory
				case 3:
					// Abstract factory
					AbstractFactory abstractFactory;

					//creating a brown toy dog
					abstractFactory = FactoryProvider.getFactory("Toy");
					Animal toy = abstractFactory.getAnimal("Dog");

					abstractFactory = FactoryProvider.getFactory("Color");
					Color color = abstractFactory.getColor("Brown");

					String result = "A " + toy.getType() + " with " + color.getColor() + " color " + toy.makeSound();

					System.out.println(result);
					break;
				// 4. Singleton
				case 4:
					// Lazy
					LazySingleton instance = LazySingleton.getInstance();
					System.out.println("Primer singleton: " + instance.getMensaje());
					LazySingleton instance2 = LazySingleton.getInstance();
					System.out.println("Segundo singleton: " + instance2.getMensaje());

					// Inner class
					InnerStaticSingleton instance3 = InnerStaticSingleton.getInstance();
					System.out.println("Tercer singleton: " + instance3.getMensaje());
					InnerStaticSingleton instance4 = InnerStaticSingleton.getInstance();
					System.out.println("Cuarto singleton: " + instance4.getMensaje());

					// Enum
					EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE.getInstance();
					System.out.println(enumSingleton1.getInfo()); //Initial enum info
					EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE.getInstance();
					enumSingleton2.setInfo("New enum info");
					System.out.println(enumSingleton1.getInfo()); // New enum info
					System.out.println(enumSingleton2.getInfo()); // New enum info

					break;

				default:
					break;
			}
		}
		System.out.println("Adios");
	}

}

