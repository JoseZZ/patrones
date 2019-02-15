package com.training.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author <a href="changeme@ext.inditex.com">Jose Gonzalez</a>
 */
public class Handler implements InvocationHandler {

    private final Saludo saludo;

    public Handler(Saludo saludo) {
        this.saludo = saludo;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
        throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        System.out.println("ANTES");
        method.invoke(saludo, args);
        System.out.println("DESPUES");
        return null;
    }
}
