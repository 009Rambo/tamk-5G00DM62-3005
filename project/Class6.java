import java.util.Arrays;

public class Class6 {
    /**
     * Checks if a given age indicates adulthood (age 18 or older).
     * @param age The age to check
     * @return True if the age is 18 or older, false otherwise
     */
    public boolean isAdult(int age) {
        return age >= 18;
    }

    /**
     * Finds the oldest person from the provided names and ages.
     * @param names An array of names
     * @param ages An array of ages corresponding to the names
     * @return The name of the oldest person
     * @throws IllegalArgumentException if the names and ages arrays have different lengths or are empty
     */
    public String findOldestPerson(String[] names, int[] ages) {
        if (names.length != ages.length || names.length == 0) {
            throw new IllegalArgumentException("Names and ages arrays must have the same length and cannot be empty");
        }

        int maxAge = Integer.MIN_VALUE;
        String oldestPerson = "";

        for (int i = 0; i < ages.length; i++) {
            if (ages[i] > maxAge) {
                maxAge = ages[i];
                oldestPerson = names[i];
            }
        }

        return oldestPerson;
    }

    /**
     * Calculates the average height from an array of heights.
     * @param heights An array of heights
     * @return The average height
     * @throws IllegalArgumentException if the heights array is empty
     */
    public double calculateAverageHeight(double[] heights) {
        if (heights.length == 0) {
            throw new IllegalArgumentException("Heights array cannot be empty");
        }

        double sum = 0;
        for (double height : heights) {
            sum += height;
        }

        return sum / heights.length;
    }

    /**
     * Sums up all the numbers in the provided array.
     * @param numbers An array of integers
     * @return The sum of all numbers in the array
     */
    public int sumNumbers(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    /**
     * Checks if a given string is a palindrome.
     * @param str The string to check
     * @return True if the string is a palindrome, false otherwise
     */
    public boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
