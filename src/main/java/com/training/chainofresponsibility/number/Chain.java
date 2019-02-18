package com.training.chainofresponsibility.number;

/**
 * @author <a href="changeme@ext.inditex.com">Jose Gonzalez</a>
 */
public interface Chain {

    public abstract void setNext(Chain nextInChain);

    public abstract void process(Number request);
}