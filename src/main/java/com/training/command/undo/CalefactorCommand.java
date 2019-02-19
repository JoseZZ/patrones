package com.training.command.undo;

// Creamos esta clase para unificar el comando undo en todos nuestros comandos
public abstract class CalefactorCommand implements CommandUndo {

    Calefactor calefactor;
    int prevSpeed;

    @Override
    public abstract void execute();

    @Override
    public void undo() {
        if (prevSpeed == Calefactor.HIGH) {
            calefactor.high();
        } else if (prevSpeed == Calefactor.MEDIUM) {
            calefactor.medium();
        } else if (prevSpeed == Calefactor.LOW) {
            calefactor.low();
        } else if (prevSpeed == Calefactor.OFF) {
            calefactor.off();
        }
    }
}
