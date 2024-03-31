import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Class4Test {
    Class4 class4 = new Class4();

    @Test
    public void testSquare() {
        assertEquals(25, class4.square(5));
        assertEquals(16, class4.square(4));
        assertEquals(1, class4.square(1));
        assertEquals(0, class4.square(0));
    }

    @Test
    public void testIsOdd() {
        assertTrue(class4.isOdd(5));
        assertFalse(class4.isOdd(6));
        assertTrue(class4.isOdd(-3));
        assertFalse(class4.isOdd(0));
        assertFalse(class4.isOdd(100));
    }

    @Test
    public void testConcatenate() {
        assertEquals("HelloWorld", class4.concatenate("Hello", "World"));
        assertEquals("OpenAI", class4.concatenate("Open", "AI"));
        assertEquals("TestConcatenate", class4.concatenate("Test", "Concatenate"));
        assertEquals("", class4.concatenate("", ""));
    }

    @Test
    public void testReverseArray() {
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, class4.reverseArray(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{}, class4.reverseArray(new int[]{}));
        assertArrayEquals(new int[]{1, 2, 3}, class4.reverseArray(new int[]{3, 2, 1}));
        assertArrayEquals(new int[]{-1, -2, -3}, class4.reverseArray(new int[]{-3, -2, -1})); 
    }

    @Test
    public void testSum() {
        assertEquals(15, class4.sum(new int[]{1, 2, 3, 4, 5}));
        assertEquals(0, class4.sum(new int[]{}));
        assertEquals(10, class4.sum(new int[]{1, 2, 3, 4}));
        assertEquals(55, class4.sum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }
}
