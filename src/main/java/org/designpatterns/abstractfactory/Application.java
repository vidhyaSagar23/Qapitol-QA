package org.designpatterns.abstractfactory;

public class Application {
    private Wheels wheels;
    private Engine engine;

    public Application(Vehicle vechicle){
        wheels=vechicle.createWheels();
        engine=vechicle.createEngine();
    }

    public void start(){
        wheels.tubeless();
        engine.tataEngine();
    }
}
