package com.training.command.remotecontrol;

// Esta clase modelara el caso de que el boton no ejecute ningun comando, en lugar de devolver un null
public class NoCommand implements Command {

    @Override
    public void execute() {
    }
}
