import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Class4Test {
    Class4 class4 = new Class4();

    @Test
    public void testSquare_PositiveNumber() {
        assertEquals(25, class4.square(5));
    }

    @Test
    public void testSquare_Zero() {
        assertEquals(0, class4.square(0));
    }

    @Test
    public void testSquare_NegativeNumber() {
        assertEquals(16, class4.square(-4));
    }

    @Test
    public void testIsOdd_OddNumber() {
        assertTrue(class4.isOdd(5));
    }

    @Test
    public void testIsOdd_EvenNumber() {
        assertFalse(class4.isOdd(6));
    }

    @Test
    public void testIsOdd_NegativeOddNumber() {
        assertTrue(class4.isOdd(-3));
    }

    @Test
    public void testIsOdd_Zero() {
        assertFalse(class4.isOdd(0));
    }

    @Test
    public void testIsOdd_LargeEvenNumber() {
        assertFalse(class4.isOdd(100));
    }

    @Test
    public void testConcatenate() {
        assertEquals("HelloWorld", class4.concatenate("Hello", "World"));
    }

    @Test
    public void testConcatenate_EmptyStrings() {
        assertEquals("", class4.concatenate("", ""));
    }

    @Test
    public void testReverseArray_NormalArray() {
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, class4.reverseArray(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void testReverseArray_EmptyArray() {
        assertArrayEquals(new int[]{}, class4.reverseArray(new int[]{}));
    }

    @Test
    public void testReverseArray_ReverseSortedArray() {
        assertArrayEquals(new int[]{1, 2, 3}, class4.reverseArray(new int[]{3, 2, 1}));
    }

    @Test
    public void testReverseArray_NegativeValuesArray() {
        assertArrayEquals(new int[]{-1, -2, -3}, class4.reverseArray(new int[]{-3, -2, -1}));
    }

    @Test
    public void testSum_NormalArray() {
        assertEquals(15, class4.sum(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void testSum_EmptyArray() {
        assertEquals(0, class4.sum(new int[]{}));
    }

    @Test
    public void testSum_LimitedValuesArray() {
        assertEquals(10, class4.sum(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void testSum_LargeValuesArray() {
        assertEquals(55, class4.sum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }
}
