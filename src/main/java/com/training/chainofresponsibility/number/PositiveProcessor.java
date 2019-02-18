package com.training.chainofresponsibility.number;

/**
 * @author <a href="changeme@ext.inditex.com">Jose Gonzalez</a>
 */
public class PositiveProcessor implements Chain {

    private Chain nextInChain;

    @Override
    public void setNext(Chain c) {
        nextInChain = c;
    }

    @Override
    public void process(Number request) {
        if (request.getNumber() > 0) {
            System.out.println("PositiveProcessor : " + request.getNumber());
        } else {
            nextInChain.process(request);
        }
    }
}
