package com.training.command.remotecontrol;

/**
 * @author <a href="changeme@ext.inditex.com">Jose Gonzalez</a>
 */
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
