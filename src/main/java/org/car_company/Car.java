package org.car_company;

import java.util.HashMap;

public class Car {
    static HashMap<String,Integer> cars=new HashMap<>();

    static {
        cars.put("Swift",500000);
        cars.put("Hyundai",800000);
        cars.put("Mercedes",1000000);
        cars.put("Rangerover",9000000);
    }


    public int getPrice(String carName) {
        if (carName.isEmpty()){
            throw new NullPointerException("car name cannot be empty");
        }
        if (cars.containsKey(carName)){
            return cars.get(carName);
        }
        else{
            throw new NullPointerException("Car not found");
        }
    }
}
