package org.designpatterns.factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("1: Petrol \n2: Diesel\n3: Electric");
        String choice=s.next();
        Car car=CarFactory.getInstance(choice);
        System.out.println(car);
    }
}
