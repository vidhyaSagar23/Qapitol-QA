package org.designpatterns.abstractfactory.car;

import org.designpatterns.abstractfactory.Wheels;

public class CarWheels implements Wheels {
    @Override
    public void tubeless() {
        System.out.println("Car wheels");
    }
}
