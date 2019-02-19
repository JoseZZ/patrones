package com.training.command.undo;

/**
 * @author <a href="changeme@ext.inditex.com">Jose Gonzalez</a>
 */
public class CalefactorMedioCommand extends CalefactorCommand {

    public CalefactorMedioCommand(Calefactor calefactor) {
        this.calefactor = calefactor;
    }

    @Override
    public void execute() {
        this.prevSpeed = calefactor.getSpeed();
        this.calefactor.medium();
    }

}
