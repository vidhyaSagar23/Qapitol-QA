package org.designpatterns.abstractfactory.bike;

import org.designpatterns.abstractfactory.Wheels;

public class BikeWheels implements Wheels {
    @Override
    public void tubeless() {
        System.out.println("Bike wheels");
    }
}
