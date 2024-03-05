package org.designpatterns.abstractfactory;

import org.designpatterns.abstractfactory.car.CarEngine;
import org.designpatterns.abstractfactory.car.CarWheels;

public class CarFactory implements Vehicle{
    @Override
    public Wheels createWheels() {
        return new CarWheels();
    }

    @Override
    public Engine createEngine() {
        return new CarEngine();
    }
}
