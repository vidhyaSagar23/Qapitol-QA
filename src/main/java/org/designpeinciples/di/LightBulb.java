package org.designpeinciples.di;

public class LightBulb implements ISwitchableDevice{
    @Override
    public void turnOn() {
        System.out.println("Light turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Light turned off");
    }
}
