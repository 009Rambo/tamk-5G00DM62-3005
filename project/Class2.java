
import java.util.Arrays;

/**
 * Represents Class2 with various methods.
 */
public class Class2 {
    /**
     * Calculates the area of a circle given its radius.
     * @param radius Radius of the circle
     * @return Area of the circle
     */
    public double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    /**
     * Calculates the area of a triangle given its base and height.
     * @param base Base of the triangle
     * @param height Height of the triangle
     * @return Area of the triangle
     */
    public double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    /**
     * Sorts an array of integers in ascending order.
     * @param arr Array to sort
     * @return Sorted array
     */
    public int[] sortArray(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    /**
     * Checks if a number is prime.
     * @param num Number to check
     * @return True if the number is prime, false otherwise
     */
    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Reverses a string.
     * @param str String to reverse
     * @return Reversed string
     */
    public String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
