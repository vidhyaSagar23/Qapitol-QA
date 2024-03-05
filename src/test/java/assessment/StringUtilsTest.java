package assessment;

import org.junit.assessment.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class StringUtilsTest {

   static StringUtils utils=null;

    @BeforeAll
    public static void setUp(){
        utils=new StringUtils();
    }

    @ParameterizedTest
    @CsvSource({
            "abc,cba",
            "sagar,ragas"
    })
    public void reverseTest(String word,String expected){
        Assertions.assertEquals(expected,utils.reverse(word));
    }

    @ParameterizedTest
    @CsvSource({
            "sagar,SAGAR",
            "sai,SAI"
    })
    public void upperCaseTest(String word,String expected){
        Assertions.assertEquals(expected,utils.upperCase(word));
    }

    @ParameterizedTest
    @ValueSource(strings={"level","pop"})
    public void palindromeTest(String word){
        Assertions.assertTrue(utils.isPalindrome(word));
    }
}
