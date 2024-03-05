package org.designpeinciples.di;

public class Switch {
    ISwitchableDevice device;

    public Switch(ISwitchableDevice device){
        this.device=device;
    }
    public void press() {
        device.turnOn();
    }
}
