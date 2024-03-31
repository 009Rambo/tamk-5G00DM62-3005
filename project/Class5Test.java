import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Class5Test {
    Class5 class5 = new Class5();

    @Test
    public void testIsEmpty() {
        assertTrue(class5.isEmpty(""));
        assertTrue(class5.isEmpty(null));
        assertFalse(class5.isEmpty("Hello"));
    }

    @Test
    public void testStringLength() {
        assertEquals(5, class5.stringLength("Hello"));
        assertEquals(0, class5.stringLength(""));
        assertEquals(3, class5.stringLength("Yes"));
    }

    @Test
    public void testToUpperCase() {
        assertEquals("HELLO", class5.toUpperCase("hello"));
        assertEquals("", class5.toUpperCase(""));
        assertEquals("YES", class5.toUpperCase("yes"));
    }

    @Test
    public void testIsEven() {
        assertTrue(class5.isEven(2));
        assertFalse(class5.isEven(3));
        assertTrue(class5.isEven(0));
    }

    @Test
    public void testAdd() {
        assertEquals(5, class5.add(2, 3));
        assertEquals(0, class5.add(-2, 2));
        assertEquals(10, class5.add(5, 5));
    }
}
