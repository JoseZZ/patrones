package com.training.command.remotecontrol;

/**
 * @author <a href="changeme@ext.inditex.com">Jose Gonzalez</a>
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
