package org.designpatterns.abstractfactory;

import org.designpatterns.abstractfactory.bike.BikeEngine;
import org.designpatterns.abstractfactory.bike.BikeWheels;

public class BikeFactory implements Vehicle{
    @Override
    public Wheels createWheels() {
        return new BikeWheels();
    }

    @Override
    public Engine createEngine() {
        return new BikeEngine();
    }
}
