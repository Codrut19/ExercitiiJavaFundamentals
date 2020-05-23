import org.junit.*;

import java.sql.Timestamp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringOperationsTest {
    StringOperations stringOperations = new StringOperations();
    @BeforeClass
    public static void initialize(){
        System.out.println("Starting tests at " + System.currentTimeMillis());
    }

    @Before
    public void beforeRunningTest(){
        System.out.println("Testul a inceput la " + System.currentTimeMillis());
    }

    @Test
    public void stringLength(){
        System.out.println("Rulam testul pentru string lenght");
        String text = "Alex";
        int result=stringOperations.stringLength(text);

        assertEquals(result,4);

    }
    @Test
    public void stringConcatenareTest(){
        System.out.println("Rulam testul pentru concatenare");
        String text1 = "Ana";
        String text2 = "Mere";
        String result = stringOperations.stringConcatenare(text1,text2);

        assert result.equals("AnaMere");
    }
    @Test
    public void stringContainsTest(){
        System.out.println("Rulam testul de contains");
        String text1 = "Toamna";
        String text2 = "am";
        boolean result=stringOperations.stringContains(text1,text2);
        assertTrue(result);

    }
    @After
    public void afterRunningTest(){
        System.out.println("Testul s-a terminat la " + System.currentTimeMillis());
    }
    @AfterClass
    public static void end(){
        System.out.println("Done running tests at " + System.currentTimeMillis());
    }
}
