package com.liufei.chapter1.command.invoker;

import com.liufei.chapter1.command.command.Command;
import com.liufei.chapter1.command.command.NoCommand;

public class RemoteControl {

    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < 7 ; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int index, Command onCommand, Command offCommand){
        onCommands[index] = onCommand;
        offCommands[index] = offCommand;
    }

    public void pressButtonOn(int index){
        onCommands[index].execute();
        undoCommand = onCommands[index];
    }

    public void pressButtonOff(int index){
        offCommands[index].execute();
        undoCommand = offCommands[index];
    }

    public void pressButtonUndo(){
        undoCommand.undo();
    }
}
