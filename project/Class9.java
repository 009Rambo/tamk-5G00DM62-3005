/**
 * Represents Class9 with various utility methods.
 */
public class Class9 {
    /**
     * Checks if an email address is valid.
     * @param email The email address to validate
     * @return True if the email address is valid, false otherwise
     */
    public boolean isEmailValid(String email) {
        // Your implementation here
        return email.contains("@") && email.contains(".");
    }

    /**
     * Generates a random password.
     * @return The randomly generated password
     */
    public String generateRandomPassword() {
        // Your implementation here
        return "randompassword";
    }

    /**
     * Calculates the factorial of a given number.
     * @param n The number for which factorial is to be calculated
     * @return The factorial of the given number
     */
    public int calculateFactorial(int n) {
        // Your implementation here
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    /**
     * Masks a phone number for privacy.
     * @param phoneNumber The phone number to mask
     * @return The masked phone number
     */
    public String maskPhoneNumber(String phoneNumber) {
        // Your implementation here
        return phoneNumber.replaceAll("\\d(?=\\d{4})", "*");
    }

    /**
     * Formats a Social Security Number (SSN) for privacy.
     * @param ssn The SSN to format
     * @return The formatted SSN
     */
    public String formatSSN(String ssn) {
        // Your implementation here
        return "***-**-" + ssn.substring(ssn.length() - 4);
    }
}
