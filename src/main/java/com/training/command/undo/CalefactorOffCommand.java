package com.training.command.undo;

/**
 * @author <a href="changeme@ext.inditex.com">Jose Gonzalez</a>
 */
public class CalefactorOffCommand extends CalefactorCommand {

    public CalefactorOffCommand(Calefactor calefactor) {
        this.calefactor = calefactor;
    }

    @Override
    public void execute() {
        prevSpeed = calefactor.getSpeed();
        calefactor.off();
    }

}
