import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Class7Test {
    Class7 class7 = new Class7();

    @Test
    public void testIsPositive_PositiveNumber() {
        assertTrue(class7.isPositive(5));
    }

    @Test
    public void testIsPositive_NegativeNumber() {
        assertFalse(class7.isPositive(-10));
    }

    @Test
    public void testIsPositive_Zero() {
        assertFalse(class7.isPositive(0));
    }

    @Test
    public void testFactorial_Zero() {
        assertEquals(1, class7.factorial(0));
    }

    @Test
    public void testFactorial_One() {
        assertEquals(1, class7.factorial(1));
    }

    @Test
    public void testFactorial_PositiveNumber() {
        assertEquals(120, class7.factorial(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorial_NegativeNumber() {
        class7.factorial(-3);
    }

    @Test
    public void testIsLeapYear_LeapYear() {
        assertTrue(class7.isLeapYear(2020));
    }

    @Test
    public void testIsLeapYear_NotLeapYear() {
        assertFalse(class7.isLeapYear(1900));
    }

    @Test
    public void testIsLeapYear_NotDivisibleBy4() {
        assertFalse(class7.isLeapYear(2021));
    }

    @Test
    public void testIsNullOrEmpty_EmptyString() {
        assertTrue(class7.isNullOrEmpty(""));
    }

    @Test
    public void testIsNullOrEmpty_NullString() {
        assertTrue(class7.isNullOrEmpty(null));
    }

    @Test
    public void testIsNullOrEmpty_NonEmptyString() {
        assertFalse(class7.isNullOrEmpty("Hello"));
    }

    @Test
    public void testCountVowels_MultipleVowels() {
        assertEquals(3, class7.countVowels("hello world"));
    }

    @Test
    public void testCountVowels_NoVowels() {
        assertEquals(0, class7.countVowels("12345"));
    }

    @Test
    public void testCountVowels_MixedCharacters() {
        assertEquals(2, class7.countVowels("apple1234"));
    }
}
