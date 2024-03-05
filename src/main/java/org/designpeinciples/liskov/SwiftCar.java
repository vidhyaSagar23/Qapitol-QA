package org.designpeinciples.liskov;

public class SwiftCar implements ICar,IFuelType{
    @Override
    public void move() {
        System.out.println("car is moving");
    }

    @Override
    public void color() {
        System.out.println("red color");
    }

    @Override
    public void fuel() {
        System.out.println("FuelType");
    }
}
