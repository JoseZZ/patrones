package com.training.command.remotecontrol;

/**
 * @author <a href="changeme@ext.inditex.com">Jose Gonzalez</a>
 */
public class CeilingFanOnCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    public void execute() {
        ceilingFan.high();
    }
}
