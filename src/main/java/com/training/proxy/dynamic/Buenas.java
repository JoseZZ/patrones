package com.training.proxy.dynamic;

// El objeto que queremos pasar por el proxy debe tener una interfaz
public class Buenas implements Saludo {

    @Override
    public void originalMethod(String s) {
        System.out.println(s);
    }
}
