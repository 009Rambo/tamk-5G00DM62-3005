import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Creating instances of Class1 and Class2
        Class1 class1 = new Class1();
        Class2 class2 = new Class2();

        // Testing methods of Class1
        System.out.println("Testing Class1:");
        try {
            System.out.println("Addition: " + class1.add(2, 3)); // Expected output: 5
            System.out.println("Subtraction: " + class1.subtract(5, 3)); // Expected output: 2
            System.out.println("Multiplication: " + class1.multiply(2, 3)); // Expected output: 6
            System.out.println("Division: " + class1.divide(10, 2)); // Expected output: 5
            System.out.println("Is Even: " + class1.isEven(6)); // Expected output: true
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
    }
}
