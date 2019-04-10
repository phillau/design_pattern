package com.liufei.chapter1.command.command;

import com.liufei.chapter1.command.receiver.GarageDoor;

public class GarageDoorCloseCommand implements Command{
    GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.close();
    }

    @Override
    public void undo() {
        garageDoor.enterPassword();
        garageDoor.open();
    }
}
