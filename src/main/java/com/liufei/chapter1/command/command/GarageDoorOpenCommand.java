package com.liufei.chapter1.command.command;

import com.liufei.chapter1.command.receiver.GarageDoor;

public class GarageDoorOpenCommand implements Command{
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.enterPassword();
        garageDoor.open();
    }

    @Override
    public void undo() {
        garageDoor.close();
    }
}
