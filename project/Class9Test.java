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

        // Additional test cases
        assertTrue(class9.isEmailValid("john.doe@example.com"));
        assertFalse(class9.isEmailValid("test@examplecom"));
    }

    @Test
    public void testGenerateRandomPassword() {
        assertEquals(8, class9.generateRandomPassword().length());

        // Additional test cases
        assertEquals(8, class9.generateRandomPassword().length());
        assertEquals(8, class9.generateRandomPassword().length());
    }

    @Test
    public void testCalculateFactorial() {
        assertEquals(120, class9.calculateFactorial(5));
        assertEquals(1, class9.calculateFactorial(0));
        assertEquals(1, class9.calculateFactorial(1));

        // Additional test cases
        assertEquals(6, class9.calculateFactorial(3));
        assertEquals(720, class9.calculateFactorial(6));
    }

    @Test
    public void testMaskPhoneNumber() {
        assertEquals("[123-456]-****", class9.maskPhoneNumber("123-456-7890"));

        // Additional test cases
        assertEquals("[123-456]-****", class9.maskPhoneNumber("123-456-7890"));
        assertEquals("[123-456]-****", class9.maskPhoneNumber("123-456-7890"));
    }

    @Test
    public void testFormatSSN() {
        assertEquals("***-**-1234", class9.formatSSN("123456789"));

        // Additional test cases
        assertEquals("***-**-5678", class9.formatSSN("987654321"));
        assertEquals("***-**-9012", class9.formatSSN("901234567"));
    }
}
