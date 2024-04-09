import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Class2Test {
    Class2 class2 = new Class2();

    @Test
    public void testCalculateCircleArea_Radius4() {
        assertEquals(50.265, class2.calculateCircleArea(4), 0.001);
    }

    @Test
    public void testCalculateCircleArea_Radius5() {
        assertEquals(78.54, class2.calculateCircleArea(5), 0.001);
    }

    @Test
    public void testCalculateCircleArea_Radius10() {
        assertEquals(314.159, class2.calculateCircleArea(10), 0.001);
    }

    @Test
    public void testCalculateTriangleArea_Sides3And4() {
        assertEquals(6.0, class2.calculateTriangleArea(3, 4), 0.001);
    }

    @Test
    public void testCalculateTriangleArea_Sides6And4() {
        assertEquals(12.0, class2.calculateTriangleArea(6, 4), 0.001);
    }

    @Test
    public void testCalculateTriangleArea_Sides5And6() {
        assertEquals(15.0, class2.calculateTriangleArea(5, 6), 0.001);
    }

    @Test
    public void testSortArray_UnsortedArray() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, class2.sortArray(new int[]{3, 5, 1, 2, 4}));
    }

    @Test
    public void testSortArray_ArrayWithDuplicates() {
        assertArrayEquals(new int[]{1, 2, 3, 4}, class2.sortArray(new int[]{3, 1, 2, 4}));
    }

    @Test
    public void testSortArray_ArrayWithNegativeNumbers() {
        assertArrayEquals(new int[]{-2, 0, 1, 3, 5}, class2.sortArray(new int[]{3, 5, -2, 1, 0}));
    }

    @Test
    public void testIsPrime_PrimeNumber() {
        assertTrue(class2.isPrime(5));
    }

    @Test
    public void testIsPrime_NonPrimeNumber() {
        assertFalse(class2.isPrime(6));
    }

    @Test
    public void testIsPrime_AnotherPrimeNumber() {
        assertTrue(class2.isPrime(7));
    }

    @Test
    public void testReverseString_NormalString() {
        assertEquals("dlrow olleh", class2.reverseString("hello world"));
    }

    @Test
    public void testReverseString_SingleWord() {
        assertEquals("gnirts", class2.reverseString("string"));
    }

    @Test
    public void testReverseString_NumericString() {
        assertEquals("7654321", class2.reverseString("1234567"));
    }
}
