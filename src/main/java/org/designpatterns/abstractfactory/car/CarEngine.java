package org.designpatterns.abstractfactory.car;

import org.designpatterns.abstractfactory.Engine;

public class CarEngine implements Engine {
    @Override
    public void tataEngine() {
        System.out.println("Car Engine");
    }
}
