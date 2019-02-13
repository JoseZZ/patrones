package com.training.composite;

/**
 * Created by Jose Gonzalez on 13/02/2019.
 */
// Esta clase solo servira para mostrar el listado completo
public class Camarera {

    MenuComponent allMenus;

    public Camarera(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }
    public void printMenu() {
        allMenus.print();
    }

}
