package org.designpatterns.abstractfactory;

public class Main {
    public static void main(String[] args) {
        Application app=new Application(new CarFactory());
        app.start();
    }
}
