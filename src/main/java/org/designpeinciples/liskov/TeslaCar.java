package org.designpeinciples.liskov;

public class TeslaCar implements ICar,IBatterType{

    @Override
    public void battery() {
        System.out.println("battery type");
    }

    @Override
    public void move() {
        System.out.println("car is moving");
    }

    @Override
    public void color() {
        System.out.println("blue color");
    }
}
