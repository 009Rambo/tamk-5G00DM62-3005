import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Class6Test {
    Class6 class6 = new Class6();

    @Test
    public void testIsAdult() {
        assertTrue(class6.isAdult(25));
        assertFalse(class6.isAdult(16));
        assertTrue(class6.isAdult(18));
    }

    @Test
    public void testFindOldestPerson() {
        String[] names = {"Alice", "Bob", "Charlie"};
        int[] ages = {25, 30, 20};
        assertEquals("Bob", class6.findOldestPerson(names, ages));

    }

    @Test
    public void testCalculateAverageHeight() {
        double[] heights = {160.5, 175.3, 180.0, 165.8};
        assertEquals(170.4, class6.calculateAverageHeight(heights), 0.01);

        double[] emptyHeights = {};
        try {
            class6.calculateAverageHeight(emptyHeights);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            // Exception thrown as expected
        }
    }

    @Test
    public void testSumNumbers() {
        int[] numbers = {1, 2, 3, 4, 5};
        assertEquals(15, class6.sumNumbers(numbers));

        int[] emptyNumbers = {};
        assertEquals(0, class6.sumNumbers(emptyNumbers));
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(class6.isPalindrome("racecar"));
        assertFalse(class6.isPalindrome("hello"));
        assertTrue(class6.isPalindrome("level"));
    }
}
