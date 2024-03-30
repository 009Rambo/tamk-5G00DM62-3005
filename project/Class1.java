
/**
 * This class represents Class1 with various methods.
 */


public class Class1 {

     public static void main(String[] args) {
        // Add your code here to execute when running Class1
        System.out.println("Hello from Class1!");
    }
    
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
     * Method to check if an integer is even.
     * @param num Integer to check
     * @return True if the integer is even, false otherwise
     */
    public boolean isEven(int num) {
        return num % 2 == 0;
    }
}
