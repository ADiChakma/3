import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import strlength.Strlength;
/**
 *
 * @author Adison
 */
public class strlengthUnitTest {
    
    public strlengthUnitTest() {
    }
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Before class");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("After class");
    }
    
    @Before
    public void setUp() {
        System.out.println("Before");
    }
    
    @After
    public void tearDown() {
        System.out.println("After");
    }
    
    @Test
    public void testMatchingStringLength() {
        String inputString = "Hello";
        int targetLength = 5;

        boolean isMatch = Strlength.Match(inputString, targetLength);
        assertTrue(isMatch);
    }

    @Test
    public void testNonMatchingStringLength() {
        String inputString = "World";
        int targetLength = 5;

        boolean isMatch = Strlength.Match(inputString, targetLength);
        assertFalse(isMatch);
    }

    @Test
    public void testEmptyStringLength() {
        String inputString = "";
        int targetLength = 0;

        boolean isMatch = Strlength.Match(inputString, targetLength);
        assertTrue(isMatch);
    }
}