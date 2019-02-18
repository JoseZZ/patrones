package com.training.chainofresponsibility.number;

/**
 * @author <a href="changeme@ext.inditex.com">Jose Gonzalez</a>
 */
public class NegativeProcessor implements Chain {

    private Chain nextInChain;

    @Override
    public void setNext(Chain siguiente) {
        nextInChain = siguiente;
    }

    @Override
    public void process(Number request) {
        if (request.getNumber() < 0) {
            System.out.println("NegativeProcessor : " + request.getNumber());
        } else {
            nextInChain.process(request);
        }
    }
}
