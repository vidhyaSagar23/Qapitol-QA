package org.designpeinciples.di;

public class Runner {
    public static void main(String[] args) {
        ISwitchableDevice s1=new LightBulb();
        s1.turnOff();
        s1.turnOn();

        ISwitchableDevice s2=new Fan();
        s2.turnOn();
        s2.turnOff();
    }
}
