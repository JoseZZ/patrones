package com.training.command.undo;

// Esta clase modelara el caso de que el boton no ejecute ningun comando, en lugar de devolver un null
public class NoCommand implements CommandUndo {

    @Override
    public void execute() {
    }

    @Override
    public void undo() {

    }
}
