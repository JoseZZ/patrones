package com.training.command.undo;

/**
 * @author <a href="changeme@ext.inditex.com">Jose Gonzalez</a>
 */
public interface CommandUndo {

    public void execute();

    public void undo();
}
