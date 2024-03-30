
import java.util.Arrays;

/**
 * Represents Class3 with various methods.
 */
public class Class3 {
     public static void main(String[] args) {
        System.out.println(" Hello from Class3 ! ");
    }
    /**
     * Calculates the factorial of a non-negative integer.
     * @param n Non-negative integer
     * @return Factorial of the integer
     */
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    /**
     * Checks if a string is a palindrome.
     * @param str String to check
     * @return True if the string is a palindrome, false otherwise
     */
    public boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    /**
     * Merges two arrays into one.
     * @param arr1 First array
     * @param arr2 Second array
     * @return Merged array
     */
    public int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        return result;
    }

    /**
     * Finds the maximum value in an array of integers.
     * @param arr Array of integers
     * @return Maximum value in the array
     */
    public int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    /**
     * Finds the minimum value in an array of integers.
     * @param arr Array of integers
     * @return Minimum value in the array
     */
    public int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
