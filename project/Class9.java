public class Class9 {
    /**
     * Checks if a given email address is valid.
     * @param email The email address to check
     * @return True if the email address is valid, false otherwise
     */
    public boolean isValidEmail(String email) {
        return email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
    }

    /**
     * Masks sensitive information in a phone number by replacing digits with asterisks.
     * @param phoneNumber The phone number to mask
     * @return The masked phone number
     */
    public String maskPhoneNumber(String phoneNumber) {
        return phoneNumber.replaceAll("\\d", "*");
    }

    /**
     * Calculates the age of a person based on their birth year and the current year.
     * @param birthYear The birth year of the person
     * @param currentYear The current year
     * @return The age of the person
     * @throws IllegalArgumentException if the birth year is greater than the current year
     */
    public int calculateAge(int birthYear, int currentYear) {
        if (birthYear > currentYear) {
            throw new IllegalArgumentException("Birth year cannot be greater than the current year");
        }
        return currentYear - birthYear;
    }

    /**
     * Generates a random username based on the person's first name and last name.
     * @param firstName The first name of the person
     * @param lastName The last name of the person
     * @return A randomly generated username
     */
    public String generateUsername(String firstName, String lastName) {
        return firstName.toLowerCase() + "." + lastName.toLowerCase() + (int)(Math.random() * 1000);
    }

    /**
     * Checks if a given password meets the security requirements.
     * @param password The password to check
     * @return True if the password meets the security requirements, false otherwise
     */
    public boolean isSecurePassword(String password) {
        // Password must be at least 8 characters long and contain at least one uppercase letter, one lowercase letter, one digit, and one special character
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[a-z].*") &&
               password.matches(".*\\d.*") &&
               password.matches(".*[!@#$%^&*()\\-_=+\\\\|\\[{\\]};:'\",<.>/?].*");
    }
}
