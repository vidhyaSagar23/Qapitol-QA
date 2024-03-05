package org.designpatterns.abstractfactory;

public interface Vehicle {
    Wheels createWheels();

    Engine createEngine();
}
