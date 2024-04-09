import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Class5Test {
    Class5 class5 = new Class5();

    @Test
    public void testIsEmpty_EmptyString() {
        assertTrue(class5.isEmpty(""));
    }

    @Test
    public void testIsEmpty_NullString() {
        assertTrue(class5.isEmpty(null));
    }

    @Test
    public void testIsEmpty_NonEmptyString() {
        assertFalse(class5.isEmpty("Hello"));
    }

    @Test
    public void testStringLength_NonEmptyString() {
        assertEquals(5, class5.stringLength("Hello"));
    }

    @Test
    public void testStringLength_EmptyString() {
        assertEquals(0, class5.stringLength(""));
    }

    @Test
    public void testStringLength_ShortString() {
        assertEquals(3, class5.stringLength("Yes"));
    }

    @Test
    public void testToUpperCase_NonEmptyString() {
        assertEquals("HELLO", class5.toUpperCase("hello"));
    }

    @Test
    public void testToUpperCase_EmptyString() {
        assertEquals("", class5.toUpperCase(""));
    }

    @Test
    public void testToUpperCase_LowercaseString() {
        assertEquals("YES", class5.toUpperCase("yes"));
    }

    @Test
    public void testIsEven_EvenNumber() {
        assertTrue(class5.isEven(2));
    }

    @Test
    public void testIsEven_OddNumber() {
        assertFalse(class5.isEven(3));
    }

    @Test
    public void testIsEven_Zero() {
        assertTrue(class5.isEven(0));
    }

    @Test
    public void testAdd_PositiveNumbers() {
        assertEquals(5, class5.add(2, 3));
    }

    @Test
    public void testAdd_NegativeAndPositiveNumbers() {
        assertEquals(0, class5.add(-2, 2));
    }

    @Test
    public void testAdd_SameNumbers() {
        assertEquals(10, class5.add(5, 5));
    }
}
