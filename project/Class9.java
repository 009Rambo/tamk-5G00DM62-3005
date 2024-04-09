import java.util.Random;

/**
 * Represents Class9 with various utility methods.
 */
class Class9 {
    /**
     * Checks if an email address is valid.
     * @param email The email address to validate
     * @return True if the email address is valid, false otherwise
     */
    public boolean isEmailValid(String email) {
        return email.contains("@") && email.contains(".");
    }

    /**
     * Generates a random password.
     * @return The randomly generated password
     */
    public String generateRandomPassword() {
        StringBuilder password = new StringBuilder();
        Random random = new Random();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }
        return password.toString();
    }

    /**
     * Calculates the factorial of a given number.
     * @param n The number for which factorial is to be calculated
     * @return The factorial of the given number
     */
   /* public int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }*/

    /**
 * Calculates the factorial of a given number.
 * @param n The number for which factorial is to be calculated
 * @return The factorial of the given number
 * @throws IllegalArgumentException if the input is negative
 */
public int calculateFactorial(int n) {
    if (n < 0) {
        throw new IllegalArgumentException("Input must be non-negative");
    }

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
    return phoneNumber.replaceAll("\\d(?=\\d{4})", "*");
    }

    /**
     * Formats a Social Security Number (SSN) for privacy.
     * @param ssn The SSN to format
     * @return The formatted SSN
     */
    public String formatSSN(String ssn) {
    return "***-**-" + ssn.substring(ssn.length() - 4);
    }
}

