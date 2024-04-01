
/**
 * This class represents Class1 with various methods.
 */


public class Class1 {


    /**
     * Method to add two integers.
     * @param a First integer
     * @param b Second integer
     * @return Sum of the two integers
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Method to subtract one integer from another.
     * @param a First integer
     * @param b Second integer
     * @return Result of subtracting the second integer from the first
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Method to multiply two integers.
     * @param a First integer
     * @param b Second integer
     * @return Product of the two integers
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Method to divide one integer by another.
     * @param a Dividend
     * @param b Divisor
     * @return Quotient of the division
     * @throws IllegalArgumentException if the divisor is zero
     */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return a / b;
    }

    /**
    * Method to check if an integer is a perfect square.
    * @param num Integer to check
    * @return True if the integer is a perfect square, false otherwise
    */
    public boolean isPerfectSquare(int num) {
    if (num < 0) {
        return false; // Negative numbers are not perfect squares
    }
    int sqrt = (int) Math.sqrt(num);
    return sqrt * sqrt == num;
    }


}
