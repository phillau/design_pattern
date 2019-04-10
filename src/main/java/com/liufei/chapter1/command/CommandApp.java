package com.liufei.chapter1.command;

import com.liufei.chapter1.command.command.*;
import com.liufei.chapter1.command.receiver.CeilingFan;
import com.liufei.chapter1.command.receiver.GarageDoor;
import com.liufei.chapter1.command.receiver.Light;
import com.liufei.chapter1.command.invoker.RemoteControl;

public class CommandApp {
    public static void main(String[] args) {
        Light livingRoomLight = new Light("living room");
        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);

        Light kitchenLight = new Light("kitchen");
        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        CeilingFan ceilingFan = new CeilingFan();
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMiddleCommand ceilingFanMiddleCommand = new CeilingFanMiddleCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0,livingRoomLightOnCommand,livingRoomLightOffCommand);
        remoteControl.setCommand(1,kitchenLightOnCommand,kitchenLightOffCommand);
        remoteControl.setCommand(2,garageDoorOpenCommand,garageDoorCloseCommand);
        remoteControl.pressButtonOn(0);
        remoteControl.pressButtonOff(0);
        remoteControl.pressButtonUndo();
        System.out.println("-----------------------------");
        remoteControl.pressButtonOff(1);
        remoteControl.pressButtonOn(1);
        remoteControl.pressButtonUndo();
        System.out.println("-----------------------------");
        remoteControl.pressButtonOn(2);
        remoteControl.pressButtonOff(2);
        remoteControl.pressButtonOff(3);
        System.out.println("-----------------------------");
        remoteControl.setCommand(3,ceilingFanHighCommand,ceilingFanOffCommand);
        remoteControl.setCommand(4,ceilingFanMiddleCommand,ceilingFanOffCommand);
        remoteControl.setCommand(5,ceilingFanLowCommand,ceilingFanOffCommand);
        remoteControl.pressButtonOn(3);
        remoteControl.pressButtonOn(4);
        remoteControl.pressButtonUndo();
        remoteControl.pressButtonOn(5);
        remoteControl.pressButtonUndo();
        remoteControl.pressButtonOff(3);
        remoteControl.pressButtonUndo();
        System.out.println("-----------------------------");
        Command[] partyOnCommands = {livingRoomLightOnCommand,garageDoorOpenCommand,ceilingFanHighCommand};
        Command[] partyOffCommands = {livingRoomLightOffCommand,garageDoorCloseCommand,ceilingFanOffCommand};
        MacroCommand partyOnCommand = new MacroCommand(partyOnCommands);
        MacroCommand partyOffCommand = new MacroCommand(partyOffCommands);
        remoteControl.setCommand(6,partyOnCommand,partyOffCommand);
        remoteControl.pressButtonOn(6);
        System.out.println("-----------------------------");
        remoteControl.pressButtonOff(6);
        System.out.println("-----------------------------");
        remoteControl.pressButtonUndo();
    }
}