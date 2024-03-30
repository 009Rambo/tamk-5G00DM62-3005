
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Class3Test {
    Class3 class3 = new Class3();

    @Test
    public void testFactorial() {
        assertEquals(120, class3.factorial(5));
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(class3.isPalindrome("radar"));
        assertFalse(class3.isPalindrome("hello"));
    }

    @Test
    public void testMergeArrays() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, class3.mergeArrays(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
    }

    @Test
    public void testFindMax() {
        assertEquals(5, class3.findMax(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void testFindMin() {
        assertEquals(1, class3.findMin(new int[]{1, 2, 3, 4, 5}));
    }
}
