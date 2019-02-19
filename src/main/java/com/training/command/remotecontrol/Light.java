package com.training.command.remotecontrol;

/**
 * @author <a href="changeme@ext.inditex.com">Jose Gonzalez</a>
 */
public class Light {

    String location = "";

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " light is on");
    }

    public void off() {
        System.out.println(location + " light is off");
    }
}
