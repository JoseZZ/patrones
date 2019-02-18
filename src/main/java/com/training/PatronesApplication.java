package com.training;

import com.training.adapter.*;
import com.training.bridge.*;
import com.training.builder.facets.Empleado;
import com.training.builder.facets.PersonBuilder;
import com.training.builder.simple.Persona;
import com.training.chainofresponsibility.logger.AbstractLogger;
import com.training.chainofresponsibility.logger.ConsoleLogger;
import com.training.chainofresponsibility.logger.ErrorLogger;
import com.training.chainofresponsibility.logger.FileLogger;
import com.training.chainofresponsibility.number.*;
import com.training.chainofresponsibility.number.Number;
import com.training.composite.Camarera;
import com.training.composite.Menu;
import com.training.composite.MenuComponent;
import com.training.composite.MenuItem;
import com.training.decorator.*;
import com.training.facade.CarEngineFacade;
import com.training.factory.abstractfactory.AbstractFactory;
import com.training.factory.abstractfactory.Animal;
import com.training.factory.abstractfactory.Color;
import com.training.factory.abstractfactory.FactoryProvider;
import com.training.factory.method.Shape;
import com.training.factory.method.ShapeFactory;
import com.training.flyweight.FactoriaMacs;
import com.training.flyweight.MacBookAir;
import com.training.prototype.copiasuperficial.Enemigo;
import com.training.prototype.copiasuperficial.GestorEnemigo;
import com.training.proxy.dynamic.Buenas;
import com.training.proxy.dynamic.Handler;
import com.training.proxy.dynamic.Saludo;
import com.training.proxy.security.Atraccion;
import com.training.proxy.security.Cliente;
import com.training.proxy.security.Noria;
import com.training.proxy.security.NoriaProxy;
import com.training.singleton.EnumSingleton;
import com.training.singleton.InnerStaticSingleton;
import com.training.singleton.LazySingleton;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Proxy;
import java.time.LocalDate;
import java.util.Scanner;

@SpringBootApplication
public class PatronesApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatronesApplication.class, args);
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion < 20) {
            System.out.println("Opcion: " + opcion);
            System.out.println("Introduce el numero de prueba: ");
            System.out.println("1.- Patron builder");
            System.out.println("2.- Patron factory method");
            System.out.println("3.- Patron abstract factory");
            System.out.println("4.- Patron singleton");
            System.out.println("5.- Patron prototype");
            System.out.println("6.- Patron bridge");
            System.out.println("7.- Patron adapter");
            System.out.println("8.- Patron composite");
            System.out.println("9.- Patron decorator");
            System.out.println("10.- Patron facade");
            System.out.println("11.- Patron flyweight");
            System.out.println("12.- Patron proxy");
            System.out.println("13.- Patron chainofresponsibility");
            System.out.println("14.- Patron command");
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
                // 5. Prototype
                // Se utiliza para crear copias de objetos de forma rapida, util si los objetos
                // tienes propiedades comunes (libros, personas, etc.)
                // Clonar un objeto es mas rapido que crearlo
                case 5:
                    // Este ejemplo es para clonado superficial, donde el objeto clonado tiene
                    // los mismos valores que el original, guardando tambien las referencias a
                    // otros objetos. Se crea un objeto, el prototipo, y luego copias del mismo
                    GestorEnemigo objGP = new GestorEnemigo();

                    // Obtenemos el Guerrero original
                    Enemigo g1 = objGP.getEnemigo("Warrior1");

                    System.out.println("==============================");

                    // Mostramos su datos
                    System.out.println("El Guerrero original se llama [" + g1.getNombre() + "]");
                    System.out.println("Su arma es [" + g1.getArma() + "]");

                    System.out.println("==============================");

                    // Obtener un segundo Guerrero (clon del anterior)
                    Enemigo g2 = objGP.getClon("Warrior1");

                    // Mostrar los datos  (ambos tienen datos similares)
                    System.out.println("Clon del Guerrero creado:");
                    System.out.println("Su nombre es [" + g2.getNombre() + "]");
                    System.out.println("Su arma es [" + g2.getArma() + "]");

                    System.out.println("==============================");

                    // Modificamos el Guerrero clonado
                    g2.setNombre("Warrior2");
                    g2.setArma("HACHA");

                    // Mostrar los datos de ambos Guerreros (ambos tienen diferentes datos)
                    System.out.println("Tras modificar el clon, ahora se llama [" + g2.getNombre() + "]");
                    System.out.println("Su arma es [" + g2.getArma() + "]\n");

                    System.out.println("El nombre del Guerrero original es [" + g1.getNombre() + "]");
                    System.out.println("Su arma es [" + g1.getArma() + "]");

                    System.out.println("==============================");

                    // Modificamos el Guerrero original
                    g1.setNombre("Warrior-1");
                    g1.setArma("MAZA");

                    // Mostrar los datos de ambos Guerreros tras la modificación (ambos tienen diferentes datos)
                    System.out.println("Tras modificar el original, ahora es [" + g1.getNombre() + "]");
                    System.out.println("Su arma es [" + g1.getArma() + "]\n");

                    System.out.println("El nombre del clon es [" + g2.getNombre() + "]");
                    System.out.println("Su arma es [" + g2.getArma() + "]");
                    break;
                // 6. Bridge
                // Desacoplamos la abstraccion de la implementacion, de forma que ambos pueden
                // variar independientemente
                case 6:
                    Figura rombo = new Rombo(new Rojo());
                    System.out.println(rombo.draw());
                    Figura triangulo = new Triangulo(new Azul());
                    System.out.println(triangulo.draw());
                    break;

                // 7. Adapter
                // Convierte la interfaz de una clase en la interfaz que el cliente necesita
                case 7:
                    Pato patocolorao = new PatoColorao();
                    Gallina caponata = new Caponata();
                    GallinaAdapter adapter = new GallinaAdapter(caponata);

                    System.out.println("La gallina hace:");
                    caponata.cacarea();
                    caponata.volar();
                    System.out.println("============================");
                    System.out.println("El pato hace:");
                    patocolorao.quack();
                    patocolorao.volar();
                    System.out.println("============================");
                    System.out.println("El adaptador de gallinas hace:");
                    testPato(adapter);
                    break;

                // 8. Composite
                case 8:
                    // Preparamos un menu con submenus
                    MenuComponent pancakeHouseMenu = new Menu("MENU TARTA DE LA CASA", "Desayuno");
                    MenuComponent dinerMenu = new Menu("MENU ALMUERZO", "Almuerzo");
                    MenuComponent cafeMenu = new Menu("MENU CAFE", "Cena");
                    MenuComponent dessertMenu = new Menu("MENU POSTRE", "Pidete un postre!");
                    // Este menu contendra la carta entera
                    MenuComponent allMenus = new Menu("TODOS LOS MENUS", "Lista de todos los menus");
                    allMenus.add(pancakeHouseMenu);
                    allMenus.add(dinerMenu);
                    allMenus.add(cafeMenu);
                    // add menu items here
                    dinerMenu.add(new MenuItem(
                        "Pasta",
                        "Espaguetis con salsa marinera, y una rebanada de pan de masa madre",
                        true,
                        3.89));
                    dinerMenu.add(dessertMenu);
                    dessertMenu.add(new MenuItem("Tarta de Manzana",
                        "Tarta de manzana con superficie crujiente, con una bola de helado de vainilla",
                        true,
                        1.59));
                    cafeMenu.add(new MenuItem(
                        "Capuccino",
                        "Cafe capuccino con galletas de canela y nubecilla de nata",
                        true,
                        2.54));
                    pancakeHouseMenu.add(new MenuItem(
                        "Tarta del dia",
                        "Tarta tres leches casera",
                        false,
                        4.97));

                    // La camarera nos cantara el menu completo
                    Camarera camarera = new Camarera(allMenus);
                    camarera.printMenu();
                    System.out.println("\n");
                    break;

                // 9. Decorator
                // Este patron se utiliza para añadir nuevas funcionalidades a clases ya existentes
                // sin necesidad de modificarlas y de forma dinamica
                case 9:
                    Bebida bebida = new Expresso();
                    System.out.println(bebida.getDescription() + " $ " + bebida.cost());

                    Bebida americano = new Americano();
                    // Añadimos algunos extras a nuestro cafe
                    americano = new Moka(americano);
                    americano = new Moka(americano);
                    americano = new Desnatado(americano);
                    System.out.println(americano.getDescription() + " $ " + americano.cost());

                    Bebida frapu = new Frapuccino();
                    // Extras
                    frapu = new Soja(frapu);
                    frapu = new Moka(frapu);
                    frapu = new Desnatado(frapu);
                    System.out.println(frapu.getDescription() + " $ " + frapu.cost());
                    break;

                // 10. Facade
                // Ofrece una interfaz unificada y sencilla a un conjunto de interfaces
                // en un subsistema. Si queremos usar el subsistema tambien podemos
                case 10:
                    // En el ejemplo de arrancar y parar el motor de un coche, varias partes
                    // entran en juego y hay que activar varias cosas. Ofrecemos una interfaz sencilla
                    // para encender y parar
                    CarEngineFacade facade = new CarEngineFacade();
                    facade.startEngine();
                    facade.stopEngine();
                    break;

                // 11. Flyweight
                // Este patron se utiliza para reducir el consumo de memoria
                // Funciona como una factoria que recicla los objetos creados previamente
                case 11:
                    // Imagina que necesitamos crear miles de equipos, pero el numero de configuraciones
                    // posibles son solo dos o tres. No necesitamos crear mil objetos, solo reusar aquel
                    // que tenga la configuracion que necesitamos
                    MacBookAir m1 = FactoriaMacs.crearMacBookAir("1", 4, 128);
                    MacBookAir m2 = FactoriaMacs.crearMacBookAir("2", 4, 128);
                    MacBookAir m3 = FactoriaMacs.crearMacBookAir("3", 8, 256);
                    MacBookAir m4 = FactoriaMacs.crearMacBookAir("4", 8, 256);
                    // Con este ejemplo solo deben crearse 2 Macs, ya que solo hay dos configuraciones distintas
                    break;

                // 12. Proxy
                // El proxy debe ofrecer exactamente el mismo interfaz que el objeto al que representa
                case 12:
                    // Podemos usar el proxy para controlar el acceso
                    Noria noria = new Noria();
                    noria.subir(new Cliente(19, "Luisa"));
                    Atraccion atraccion = new NoriaProxy();
                    atraccion.subir(new Cliente(12, "Julian"));
                    atraccion.subir(new Cliente(16, "Pedro"));
                    atraccion.subir(new Cliente(18, "Miguel"));
                    System.out.println();

                    // Proxy dinamico
                    // Permite que una clase con un metodo sirve para multiples llamadas a distintas
                    // clases con un numero arbitrario de metodos. Es como un tipo de Facade. Se enrutan
                    // todas las llamadas a un unico metodo
                    Buenas buenas = new Buenas();
                    Handler handler = new Handler(buenas);
                    // La clase proxy generara un proxy y devolvera el objeto que necesitamos
                    Saludo f = (Saludo) Proxy.newProxyInstance(Saludo.class.getClassLoader(),
                        new Class[]{Saludo.class},
                        handler);
                    f.originalMethod("Hola muy buenas");
                    break;

                // 13. Chain of responsibility
                // Cada procesador de la cadena tendra su forma de procesar el comando
                // Cada procesador en la cadena tendra una referencia al siguiente procesador
                // Cada procesador tendra la responsabilidad de delegar en el siguiente procesador
                // Los procesadores tendran cuidado de no formar un bucle
                // Solo un procesador de la cadena gestionara el comando
                case 13:
                    // Creamos una cadena para gestionar las trazas
                    // Aunque un logger gestione los mensajes, no bloquea y lo pasa al siguiente logger
                    // que tenga configurado. Dependera del nivel que se muestre o no
                    AbstractLogger loggerChain = getChainOfLoggers();

                    loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
                    loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");
                    loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");

                    // En este caso cuando una clase procese la peticion, ya no pasa al siguiente
                    // Configuramos la cadena de responsabilidad
                    Chain c1 = new NegativeProcessor();
                    Chain c2 = new ZeroProcessor();
                    Chain c3 = new PositiveProcessor();
                    c1.setNext(c2);
                    c2.setNext(c3);
                    System.out.println();
                    // Procesamos distintos numeros
                    c1.process(new Number(90));
                    c1.process(new Number(-50));
                    c1.process(new Number(0));
                    c1.process(new Number(91));

                    break;

                // 14. Command
                case 14:

                    break;
                default:
                    break;
            }
        }
        System.out.println("Adios");
    }

    private static void testPato(Pato adapter) {
        adapter.quack();
        adapter.volar();
    }

    private static AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }


}

