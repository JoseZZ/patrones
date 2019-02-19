package com.training.command.remotecontrol;

// Esta clase hara las veces de nuestro control remoto
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void apretarBoton() {
        slot.execute();
    }

}
