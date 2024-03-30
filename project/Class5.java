import java.util.Arrays;

/**
 * Represents Class5 with various methods.
 */
public class Class5 {
    /**
     * Checks if a string is empty.
     * @param str The string to check
     * @return True if the string is empty, false otherwise
     */
    public boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    /**
     * Returns the length of a string.
     * @param str The string to measure
     * @return The length of the string
     */
    public int stringLength(String str) {
        return str.length();
    }

    /**
     * Converts a string to uppercase.
     * @param str The string to convert
     * @return The string in uppercase
     */
    public String toUpperCase(String str) {
        return str.toUpperCase();
    }

    /**
     * Checks if a number is even.
     * @param num The number to check
     * @return True if the number is even, false otherwise
     */
    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    /**
     * Adds two numbers.
     * @param a The first number
     * @param b The second number
     * @return The sum of the two numbers
     */
    public int add(int a, int b) {
        return a + b;
    }
}
