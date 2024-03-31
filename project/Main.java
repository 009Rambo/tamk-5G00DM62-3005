import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Creating instances of Class1, Class2, Class3, Class4, and Class5
        Class1 class1 = new Class1();
        Class2 class2 = new Class2();
        Class3 class3 = new Class3();
        Class4 class4 = new Class4();
        Class5 class5 = new Class5();

        // Testing methods of Class1
        System.out.println("Testing Class1:");
        try {
            System.out.println("Addition: " + class1.add(2, 3)); // Expected output: 5
            System.out.println("Subtraction: " + class1.subtract(5, 3)); // Expected output: 2
            System.out.println("Multiplication: " + class1.multiply(2, 3)); // Expected output: 6
            System.out.println("Division: " + class1.divide(10, 2)); // Expected output: 5
            System.out.println("Is Perfect Square: " + class1.isPerfectSquare(4)); // Expected output: true
        } catch (Exception e) {
            System.err.println("An error occurred while testing Class1: " + e.getMessage());
        }

        // Testing methods of Class2
        System.out.println("\nTesting Class2:");
        try {
            System.out.println("Circle Area: " + class2.calculateCircleArea(4)); // Expected output: Approximately 50.265
            System.out.println("Triangle Area: " + class2.calculateTriangleArea(3, 4)); // Expected output: 6.0
            System.out.println("Sorted Array: " + Arrays.toString(class2.sortArray(new int[]{3, 5, 1, 2, 4}))); // Expected output: [1, 2, 3, 4, 5]
            System.out.println("Is Prime: " + class2.isPrime(5)); // Expected output: true
            System.out.println("Reversed String: " + class2.reverseString("hello world")); // Expected output: "dlrow olleh"
        } catch (Exception e) {
            System.err.println("An error occurred while testing Class2: " + e.getMessage());
        }

        // Testing methods of Class3
        System.out.println("\nTesting Class3:");
        try {
            System.out.println("Factorial of 5: " + class3.factorial(5)); // Expected output: 120
            System.out.println("Is 'radar' a palindrome: " + class3.isPalindrome("radar")); // Expected output: true
            System.out.println("Merged Array: " + Arrays.toString(class3.mergeArrays(new int[]{1, 2, 3}, new int[]{4, 5, 6}))); // Expected output: [1, 2, 3, 4, 5, 6]
            System.out.println("Max in Array: " + class3.findMax(new int[]{1, 5, 3, 9, 2})); // Expected output: 9
            System.out.println("Min in Array: " + class3.findMin(new int[]{1, 5, 3, 9, 2})); // Expected output: 1
        } catch (Exception e) {
            System.err.println("An error occurred while testing Class3: " + e.getMessage());
        }

        // Testing methods of Class4
        System.out.println("\nTesting Class4:");
        try {
            System.out.println("Square of 5: " + class4.square(5)); // Expected output: 25
            System.out.println("Is 5 odd: " + class4.isOdd(5)); // Expected output: true
            System.out.println("Concatenation: " + class4.concatenate("Hello", "World")); // Expected output: "HelloWorld"
            System.out.println("Reversed Array: " + Arrays.toString(class4.reverseArray(new int[]{1, 2, 3, 4, 5}))); // Expected output: [5, 4, 3, 2, 1]
            System.out.println("Sum of array: " + class4.sum(new int[]{1, 2, 3, 4, 5})); // Expected output: 15
        } catch (Exception e) {
            System.err.println("An error occurred while testing Class4: " + e.getMessage());
        }

        // Testing methods of Class5
        System.out.println("\nTesting Class5:");
        try {
            System.out.println("Is empty: " + class5.isEmpty("")); // Expected output: true
            System.out.println("String length: " + class5.stringLength("Hello")); // Expected output: 5
            System.out.println("To uppercase: " + class5.toUpperCase("hello")); // Expected output: "HELLO"
            System.out.println("Is even: " + class5.isEven(6)); // Expected output: true
            System.out.println("Addition: " + class5.add(2, 3)); // Expected output: 5
        } catch (Exception e) {
            System.err.println("An error occurred while testing Class5: " + e.getMessage());
        }
    }
}
