package org.designpatterns.factory;

public class CarFactory {
    public static Car getInstance(String choice){
        Car car=null;
        if(choice.equalsIgnoreCase("Petrol")){
            car=new PetrolCar();
        } else if (choice.equalsIgnoreCase("Diesel")) {
            car=new DieselCar();
        } else if (choice.equalsIgnoreCase("Electric")) {
            car=new ElectricCar();
        }
        return car;
    }
}
