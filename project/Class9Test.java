import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Class9Test {
    Class9 class9 = new Class9();

    @Test
    public void testIsEmailValid_ValidEmail() {
        assertTrue(class9.isEmailValid("test@example.com"));
    }

    @Test
    public void testIsEmailValid_InvalidEmail1() {
        assertFalse(class9.isEmailValid("test@example"));
    }

    @Test
    public void testIsEmailValid_InvalidEmail2() {
        assertFalse(class9.isEmailValid("test.example.com"));
    }

    @Test
    public void testGenerateRandomPassword_Length() {
        assertEquals(8, class9.generateRandomPassword().length());
    }

    @Test
    public void testCalculateFactorial_PositiveNumber() {
        assertEquals(120, class9.calculateFactorial(5));
    }

    @Test
    public void testCalculateFactorial_Zero() {
        assertEquals(1, class9.calculateFactorial(0));
    }

    @Test
    public void testCalculateFactorial_One() {
        assertEquals(1, class9.calculateFactorial(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateFactorial_NegativeNumber() {
        class9.calculateFactorial(-1);
    }

    @Test
    public void testFormatSSN_Formatting() {
        assertEquals("***-**-7890", class9.formatSSN("1234567890"));
    }

    @Test
    public void testMaskPhoneNumber_Masking() {
        assertEquals("123-456-7890", class9.maskPhoneNumber("123-456-7890"));
    }
}
