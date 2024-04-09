import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Class6Test {
    Class6 class6 = new Class6();

    @Test
    public void testIsAdult_AdultAge() {
        assertTrue(class6.isAdult(25));
    }

    @Test
    public void testIsAdult_MinorAge() {
        assertFalse(class6.isAdult(16));
    }

    @Test
    public void testIsAdult_EighteenYearsOld() {
        assertTrue(class6.isAdult(18));
    }

    @Test
    public void testFindOldestPerson() {
        String[] names = {"Alice", "Bob", "Charlie"};
        int[] ages = {25, 30, 20};
        assertEquals("Bob", class6.findOldestPerson(names, ages));
    }

    @Test
    public void testCalculateAverageHeight_NonEmptyArray() {
        double[] heights = {160.5, 175.3, 180.0, 165.8};
        assertEquals(170.4, class6.calculateAverageHeight(heights), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateAverageHeight_EmptyArray() {
        double[] emptyHeights = {};
        class6.calculateAverageHeight(emptyHeights);
    }

    @Test
    public void testSumNumbers_NonEmptyArray() {
        int[] numbers = {1, 2, 3, 4, 5};
        assertEquals(15, class6.sumNumbers(numbers));
    }

    @Test
    public void testSumNumbers_EmptyArray() {
        int[] emptyNumbers = {};
        assertEquals(0, class6.sumNumbers(emptyNumbers));
    }

    @Test
    public void testIsPalindrome_PalindromeString() {
        assertTrue(class6.isPalindrome("racecar"));
    }

    @Test
    public void testIsPalindrome_NonPalindromeString() {
        assertFalse(class6.isPalindrome("hello"));
    }

    @Test
    public void testIsPalindrome_SameCharacters() {
        assertTrue(class6.isPalindrome("level"));
    }
}
