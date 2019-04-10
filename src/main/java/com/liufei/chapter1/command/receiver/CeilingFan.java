package com.liufei.chapter1.command.receiver;

public class CeilingFan {
    private static int HIGH = 3;
    private static int MIDDLE =  2;
    private static int LOW = 1;
    private static int OFF = 0;
    private int speed;
    public static int preSpeed;

    public int getSpeed() {
        return speed;
    }

    public void high(){
        speed = HIGH;
        System.out.println("ceilingFan speed is high");
    }

    public void middle(){
        speed = MIDDLE;
        System.out.println("ceilingFan speed is middle");
    }

    public void low(){
        speed = LOW;
        System.out.println("ceilingFan speed is low");
    }

    public void off(){
        speed = OFF;
        System.out.println("ceilingFan is off");
    }
}
