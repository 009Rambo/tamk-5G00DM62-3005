import java.util.Arrays;

/**
 * Represents Class4 with various methods.
 */
public class Class4 {
     public static void main(String[] args) {
        System.out.println(" Hello from Class4 ! ");
    }
    /**
     * Calculates the square of a number.
     * @param num The number to square
     * @return The square of the number
     */
    public int square(int num) {
        return num * num;
    }

    /**
     * Checks if a number is odd.
     * @param num The number to check
     * @return True if the number is odd, false otherwise
     */
    public boolean isOdd(int num) {
        return num % 2 != 0;
    }

    /**
     * Concatenates two strings.
     * @param str1 The first string
     * @param str2 The second string
     * @return The concatenated string
     */
    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    /**
     * Reverses an array of integers.
     * @param array The array to reverse
     * @return The reversed array
     */
    public int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[array.length - 1 - i] = array[i];
        }
        return reversedArray;
    }

    /**
     * Finds the sum of elements in an array.
     * @param array The array of integers
     * @return The sum of elements in the array
     */
    public int sum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
