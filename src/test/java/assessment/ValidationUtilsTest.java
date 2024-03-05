package assessment;

import org.junit.assessment.ValidationUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ValidationUtilsTest {

    static ValidationUtils utils;

    @BeforeAll
    public static void setUp(){
        utils=new ValidationUtils();
    }

    @ParameterizedTest
    @ValueSource(strings={"Sagar.12@12gmail.com","raghu@gmail.com","sagar@yahoo.com"})
    public void emailTest(String email){
        Assertions.assertTrue(utils.isValidEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings={"+91 9344504141","8220248986"})
    public void numberTest(String number){
        Assertions.assertTrue(utils.isValidNumber(number));
    }

    @ParameterizedTest
    @ValueSource(strings={"Sagar@123","raghuM@12"})
    public void passwordTest(String pwd){
        Assertions.assertTrue(utils.isValidPassword(pwd));
    }
}
