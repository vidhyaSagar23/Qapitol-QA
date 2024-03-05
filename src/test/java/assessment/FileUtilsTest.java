package assessment;

import org.junit.assessment.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FileUtilsTest {
   static private FileUtils utils=null;

    @BeforeAll
    public static void setUp(){
        utils=new FileUtils();
    }

    @ParameterizedTest
    @ValueSource(strings={"I am sagar"})
    public void writeFileTest(String word){
        Assertions.assertTrue(utils.writeData("C:\\Users\\sagar\\Desktop\\SELENIUM TESTING\\Java Basics" +
                "\\src\\main\\java\\org\\junit\\assessment\\test.txt",word));
    }

    @Test
    public void readFileTest() {
        String expectedContent = "I am sagar\n";

        String actualContent = utils.readData("C:\\Users\\sagar\\Desktop\\SELENIUM TESTING\\Java Basics" +
                "\\src\\main\\java\\org\\junit\\assessment\\test.txt");

        Assertions.assertEquals(expectedContent, actualContent);
    }
}
