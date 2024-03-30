
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
    }

    @Test
    public void testIsOdd() {
        assertTrue(class4.isOdd(5));
        assertFalse(class4.isOdd(6));
    }

    @Test
    public void testConcatenate() {
        assertEquals("HelloWorld", class4.concatenate("Hello", "World"));
    }

    @Test
    public void testReverseArray() {
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, class4.reverseArray(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void testSum() {
        assertEquals(15, class4.sum(new int[]{1, 2, 3, 4, 5}));
    }
}
