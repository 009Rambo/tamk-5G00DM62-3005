public class Class7 {
    /**
     * Checks if a given number is positive.
     * @param num The number to check
     * @return True if the number is positive, false otherwise
     */
    public boolean isPositive(int num) {
        return num > 0;
    }

    /**
     * Calculates the factorial of a given non-negative integer.
     * @param n The non-negative integer
     * @return The factorial of the given integer
     * @throws IllegalArgumentException if the input is negative
     */
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Determines if a given year is a leap year.
     * @param year The year to check
     * @return True if the year is a leap year, false otherwise
     */
    public boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if a given string is empty or null.
     * @param str The string to check
     * @return True if the string is empty or null, false otherwise
     */
    public boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }

    /**
     * Counts the number of vowels in a given string.
     * @param str The input string
     * @return The number of vowels in the string
     */
    public int countVowels(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
}
