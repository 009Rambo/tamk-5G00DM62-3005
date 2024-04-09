import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Class1Test {
    Class1 class1 = new Class1();

    @Test
    public void testAdd_PositiveNumbers() {
        assertEquals(5, class1.add(2, 3));
    }

    @Test
    public void testAdd_PositiveAndNegativeNumbers() {
        assertEquals(-1, class1.add(2, -3));
    }

    @Test
    public void testAdd_LargeNumbers() {
        assertEquals(10, class1.add(7, 3));
    }

    @Test
    public void testSubtract_PositiveNumbers() {
        assertEquals(1, class1.subtract(4, 3));
    }

    @Test
    public void testSubtract_PositiveAndNegativeNumbers() {
        assertEquals(5, class1.subtract(2, -3));
    }

    @Test
    public void testSubtract_NegativeResult() {
        assertEquals(-2, class1.subtract(1, 3));
    }

    @Test
    public void testMultiply_PositiveNumbers() {
        assertEquals(15, class1.multiply(3, 5));
    }

    @Test
    public void testMultiply_PositiveAndNegativeNumbers() {
        assertEquals(-6, class1.multiply(2, -3));
    }

    @Test
    public void testMultiply_ByZero() {
        assertEquals(0, class1.multiply(0, 5));
    }

    @Test
    public void testDivide_PositiveNumbers() {
        assertEquals(2, class1.divide(6, 3));
    }

    @Test
    public void testDivide_PositiveAndNegativeNumbers() {
        assertEquals(-2, class1.divide(6, -3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivide_ByZero() {
        class1.divide(6, 0);
    }

    @Test
    public void testIsPerfectSquare_PerfectSquare() {
        assertTrue(class1.isPerfectSquare(4));
    }

    @Test
    public void testIsPerfectSquare_NotPerfectSquare() {
        assertFalse(class1.isPerfectSquare(5));
    }

    @Test
    public void testIsPerfectSquare_Zero() {
        assertTrue(class1.isPerfectSquare(0));
    }
}
