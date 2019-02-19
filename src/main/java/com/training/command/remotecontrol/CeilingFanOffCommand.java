package com.training.command.remotecontrol;

/**
 * @author <a href="changeme@ext.inditex.com">Jose Gonzalez</a>
 */
public class CeilingFanOffCommand implements Command {

    CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }
}
