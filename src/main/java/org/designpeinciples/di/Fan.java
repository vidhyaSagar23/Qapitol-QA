package org.designpeinciples.di;

public class Fan implements ISwitchableDevice{
    @Override
    public void turnOn() {
        System.out.println("Fan turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is turned off");
    }
}
