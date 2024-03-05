package basics;

import org.basics.Calci;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalciTest {

    @Test
    public void testAdd(){
        Calci c = new Calci();
       Assert.assertEquals(10,c.add(5,5));
        System.out.println("Inside test");
    }


    @Before
    public void displayBefore(){
        System.out.println("Before method");
    }
}
