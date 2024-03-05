package org.designpatterns.abstractfactory.bike;

import org.designpatterns.abstractfactory.Engine;

public class BikeEngine implements Engine {
    @Override
    public void tataEngine() {
        System.out.println("Bike Engine");
    }
}
