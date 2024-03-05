package parameterized;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.parameterizedtest.Calculator;


public class CalculatorTest {
    Calculator c=null;
    @BeforeEach
    public void setup(){
        c=new Calculator();
    }

    @ParameterizedTest
    @CsvSource({
            "1,2,3",
            "2,4,6",
            "3,3,6",
            "6,7,13",
            "122,122,244"
    })
    public void addTest(int a,int b,int expected){
        Assertions.assertEquals(expected,c.add(a,b));
    }
}
