package parameterized;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.parameterizedtest.Employee;

public class EmployeeTest {
    Employee emp=null;

    @BeforeEach
    public void setup(){
        emp=new Employee();
    }

    @ParameterizedTest
    @ValueSource(strings ={"Sagar","Sai","Vidhya","Elangovan"})
    public void testName(String fname){
        Assertions.assertTrue( emp.eName(fname));
    }

    @ParameterizedTest
    @ValueSource(strings={"sagar","sai","vidhYa","ElaNGOvan",""})
    public void testFailName(String fname){
        Assertions.assertFalse(emp.eName(fname));
    }

    @ParameterizedTest
    @ValueSource(strings ={"9876543210","9344504141"})
    public void testPhoneNum(String phno){
        Assertions.assertTrue(emp.phno(phno));
    }

    @ParameterizedTest
    @ValueSource(strings ={"987654321","93 4 5504141"})
    public void testPhoneNumFails(String phno){
        Assertions.assertFalse(emp.phno(phno));
    }
}
