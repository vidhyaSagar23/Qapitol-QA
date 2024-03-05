package org.designpeinciples.liskov;

public class Runner {
    public static void main(String[] args) {
        SwiftCar s1=new SwiftCar();
        s1.color();
        s1.move();
        s1.fuel();

        TeslaCar t=new TeslaCar();
        t.move();
        t.color();
        t.battery();
    }
}
