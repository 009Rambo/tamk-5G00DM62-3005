import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Class9Test {
    Class9 class9 = new Class9();

    @Test
    public void testIsValidEmail() {
        assertTrue(class9.isValidEmail("example@example.com"));
        assertFalse(class9.isValidEmail("invalid.email.com"));
        assertFalse(class9.isValidEmail("user@example"));
    }

    @Test
    public void testMaskPhoneNumber() {
        assertEquals("123-456-****", class9.maskPhoneNumber("123-456-7890"));
        assertEquals("**********", class9.maskPhoneNumber("1234567890"));
    }

    @Test
    public void testCalculateAge() {
        assertEquals(30, class9.calculateAge(1990, 2020));
        assertEquals(25, class9.calculateAge(1996, 2021));
        try {
            class9.calculateAge(2022, 2021);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            // Exception thrown as expected
        }
    }

    @Test
    public void testGenerateUsername() {
        String username = class9.generateUsername("John", "Doe");
        assertTrue(username.matches("john.doe\\d{1,3}"));
    }

    @Test
    public void testIsSecurePassword() {
        assertTrue(class9.isSecurePassword("SecurePassword123!"));
        assertFalse(class9.isSecurePassword("weakpassword"));
        assertFalse(class9.isSecurePassword("abc123"));
        assertFalse(class9.isSecurePassword("Password123")); // Missing special character
    }
}
