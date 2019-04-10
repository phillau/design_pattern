package com.liufei.chapter1.command.command;

import com.liufei.chapter1.command.receiver.CeilingFan;

public class CeilingFanMiddleCommand implements Command {
    private CeilingFan ceilingFan;

    public CeilingFanMiddleCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        CeilingFan.preSpeed = ceilingFan.getSpeed();
        ceilingFan.middle();
    }

    @Override
    public void undo() {
        if (CeilingFan.preSpeed == 0) {
            ceilingFan.off();
        } else if (CeilingFan.preSpeed == 1) {
            ceilingFan.low();
        } else if (CeilingFan.preSpeed == 2) {
            ceilingFan.middle();
        } else if (CeilingFan.preSpeed == 3) {
            ceilingFan.high();
        }
    }
}
