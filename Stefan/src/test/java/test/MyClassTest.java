import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyClassTest {
    @BeforeClass
    public static void testSetup() {
    }
    @AfterClass
    public static void testCleanup() {
// Teardown for data used by the unit tests
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExceptionIsThrown() {
        junit.MyClass tester = new junit.MyClass();
        tester.multiply(1000, 5);
    }
    @Test
    public void testMultiply() {
        junit.MyClass tester = new junit.MyClass();
        assertEquals("10 x 5 must be 50", 50,  tester.multiply(10, 5));
    }
}
