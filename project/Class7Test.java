import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Class7Test {
    Class7 class7 = new Class7();

    @Test
    public void testIsPositive() {
        assertTrue(class7.isPositive(5));
        assertFalse(class7.isPositive(-10));
        assertFalse(class7.isPositive(0));
    }

    @Test
    public void testFactorial() {
        assertEquals(1, class7.factorial(0));
        assertEquals(1, class7.factorial(1));
        assertEquals(120, class7.factorial(5));
        try {
            class7.factorial(-3);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            // Exception thrown as expected
        }
    }

    @Test
    public void testIsLeapYear() {
        assertTrue(class7.isLeapYear(2020));
        assertFalse(class7.isLeapYear(1900));
        assertFalse(class7.isLeapYear(2021));
    }

    @Test
    public void testIsNullOrEmpty() {
        assertTrue(class7.isNullOrEmpty(""));
        assertTrue(class7.isNullOrEmpty(null));
        assertFalse(class7.isNullOrEmpty("Hello"));
    }

    @Test
    public void testCountVowels() {
        assertEquals(3, class7.countVowels("hello world"));
        assertEquals(0, class7.countVowels("12345"));
        assertEquals(2, class7.countVowels("apple1234"));
    }
}
