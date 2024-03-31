import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Class1Test {
    Class1 class1 = new Class1();

    @Test
    public void testAdd() {
        assertEquals(5, class1.add(2, 3));
        assertEquals(-1, class1.add(2, -3));
        assertEquals(10, class1.add(7, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, class1.subtract(4, 3));
        assertEquals(5, class1.subtract(2, -3));
        assertEquals(-2, class1.subtract(1, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(15, class1.multiply(3, 5));
        assertEquals(-6, class1.multiply(2, -3));
        assertEquals(0, class1.multiply(0, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2, class1.divide(6, 3));
        assertEquals(-2, class1.divide(6, -3));
        try {
            class1.divide(6, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Division by zero", e.getMessage());
        }
    }

    @Test
    public void testIsPerfectSquare() {
    assertTrue(class1.isPerfectSquare(4));
    assertFalse(class1.isPerfectSquare(5));
    assertTrue(class1.isPerfectSquare(0));
    }

}
