import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Class3Test {
    Class3 class3 = new Class3();

    @Test
    public void testFactorial_PositiveNumber() {
        assertEquals(120, class3.factorial(5));
    }

    @Test
    public void testFactorial_Zero() {
        assertEquals(1, class3.factorial(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorial_NegativeNumber() {
    class3.factorial(-1);
    }


    @Test
    public void testFactorial_One() {
        assertEquals(1, class3.factorial(1));
    }

    @Test
    public void testIsPalindrome_PalindromeString() {
        assertTrue(class3.isPalindrome("radar"));
    }

    @Test
    public void testIsPalindrome_NonPalindromeString() {
        assertFalse(class3.isPalindrome("hello"));
    }

    @Test
    public void testIsPalindrome_SingleCharacterString() {
        assertTrue(class3.isPalindrome("level"));
    }

    @Test
    public void testMergeArrays_NormalArrays() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, class3.mergeArrays(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
    }

    @Test
    public void testMergeArrays_EmptyArrays() {
        assertArrayEquals(new int[]{}, class3.mergeArrays(new int[]{}, new int[]{}));
    }

    @Test
    public void testMergeArrays_OneEmptyArray() {
        assertArrayEquals(new int[]{1, 2, 3}, class3.mergeArrays(new int[]{1}, new int[]{2, 3}));
    }

    @Test
    public void testFindMax_NormalArray() {
        assertEquals(5, class3.findMax(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void testFindMax_NegativeNumbersArray() {
        assertEquals(-1, class3.findMax(new int[]{-5, -1, -2, -3, -4}));
    }

    @Test
    public void testFindMax_LargeNumbersArray() {
        assertEquals(10, class3.findMax(new int[]{1, 2, 3, 4, 5, 10}));
    }

    @Test
    public void testFindMin_NormalArray() {
        assertEquals(1, class3.findMin(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void testFindMin_NegativeNumbersArray() {
        assertEquals(-5, class3.findMin(new int[]{-5, -1, -2, -3, -4}));
    }

    @Test
    public void testFindMin_LargeNumbersArray() {
        assertEquals(1, class3.findMin(new int[]{10, 5, 3, 4, 1}));
    }
}
