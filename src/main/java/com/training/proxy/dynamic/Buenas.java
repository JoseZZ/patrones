package com.training.proxy.dynamic;

/**
 * @author <a href="changeme@ext.inditex.com">Jose Gonzalez</a>
 */
public class Buenas implements Saludo {

    @Override
    public void originalMethod(String s) {
        System.out.println(s);
    }
}
