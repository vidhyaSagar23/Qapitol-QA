package cars;

import org.car_company.Car;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarTest {

        Car c=null;

        @BeforeEach
        public void setup(){
                c=new Car();
        }

        @Test
        public void findCarPrice(){
                String carName="Mercedes";
                int expectedPrice=1000000;
                int price=c.getPrice(carName);
                Assertions.assertEquals(expectedPrice,price);
        }

        @Test
        public void findEmptyInput(){
                String carName="";
                Throwable exception=Assertions.assertThrows(NullPointerException.class,()->{
                        c.getPrice(carName);
                });
                Assertions.assertEquals("car name cannot be empty",exception.getMessage());
        }

        @Test
        public void findInvaidOutput(){
                String carName="BMW";
                Throwable exception=Assertions.assertThrows(NullPointerException.class,()->{
                        c.getPrice(carName);
                });
                Assertions.assertEquals("Car not found",exception.getMessage());
        }
}
