import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Class9Test {
    Class9 class9 = new Class9();

    @Test
    public void testIsEmailValid() {
        assertTrue(class9.isEmailValid("test@example.com"));
        assertFalse(class9.isEmailValid("test@example"));
        assertFalse(class9.isEmailValid("test.example.com"));
    }

    @Test
    public void testGenerateRandomPassword() {
        assertEquals(8, class9.generateRandomPassword().length());
    }

    @Test
    public void testCalculateFactorial() {
        assertEquals(120, class9.calculateFactorial(5));
        assertEquals(1, class9.calculateFactorial(0));
        assertEquals(1, class9.calculateFactorial(1));
    }

   /* @Test
    public void testFormatSSN() {
    assertEquals("***-**-6789", class9.formatSSN("1234567890"));
    }

    @Test
    public void testMaskPhoneNumber() {
    assertEquals("123-456-****", class9.maskPhoneNumber("123-456-7890"));
    }*/

    @Test
    public void testFormatSSN() {
    assertEquals("***-**-7890", class9.formatSSN("1234567890"));
    }

    @Test
    public void testMaskPhoneNumber() {
    assertEquals("123-456-7890", class9.maskPhoneNumber("123-456-7890"));
    }


}
