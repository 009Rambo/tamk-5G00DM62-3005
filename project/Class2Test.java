
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Class2Test {
    Class2 class2 = new Class2();

    @Test
    public void testCalculateCircleArea() {
        assertEquals(50.265, class2.calculateCircleArea(4), 0.001);
    }

    @Test
    public void testCalculateTriangleArea() {
        assertEquals(6.0, class2.calculateTriangleArea(3, 4), 0.001);
    }

    @Test
    public void testSortArray() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, class2.sortArray(new int[]{3, 5, 1, 2, 4}));
    }

    @Test
    public void testIsPrime() {
        assertTrue(class2.isPrime(5));
        assertFalse(class2.isPrime(6));
    }

    @Test
    public void testReverseString() {
        assertEquals("dlrow olleh", class2.reverseString("hello world"));
    }
}
