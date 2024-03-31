import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Creating instances of Classes.
        Class1 class1 = new Class1();
        Class2 class2 = new Class2();
        Class3 class3 = new Class3();
        Class4 class4 = new Class4();
        Class5 class5 = new Class5();
        Class6 class6 = new Class6();
        Class7 class7 = new Class7();
        //Class6 class8 = new Class8();
        Class9 class9 = new Class9();
        Class10 class10 = new Class10();

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

        // Testing methods of Class6
        System.out.println("\nTesting Class6:");

        try {
            System.out.println("Is Adult: " + class6.isAdult(20)); // Expected output: true
            System.out.println("Oldest person: " + class6.findOldestPerson(new String[]{"Alice", "Bob", "Charlie"}, new int[]{30, 25, 35})); // Expected output: "Charlie"
            System.out.println("Average height: " + class6.calculateAverageHeight(new double[]{5.5, 6.0, 5.8})); // Expected output: Approximately 5.77
            System.out.println("Sum of numbers: " + class6.sumNumbers(new int[]{1, 2, 3, 4, 5})); // Expected output: 15
            System.out.println("Is palindrome: " + class6.isPalindrome("level")); // Expected output: true
        } catch (Exception e) {
            System.err.println("An error occurred while testing Class6: " + e.getMessage());
        }

        // Testing methods of Class7
        System.out.println("\nTesting Class7:");

        try {
            System.out.println("Is positive: " + class7.isPositive(5)); // Expected output: true
            System.out.println("Factorial: " + class7.factorial(5)); // Expected output: 120
            System.out.println("Is leap year: " + class7.isLeapYear(2024)); // Expected output: true
            System.out.println("Is null or empty: " + class7.isNullOrEmpty("")); // Expected output: true
            System.out.println("Count vowels: " + class7.countVowels("Hello")); // Expected output: 2
        } catch (Exception e) {
            System.err.println("An error occurred while testing Class7: " + e.getMessage());
        }

        // Testing methods of Class8
        System.out.println("\nTesting Class8:");
        Class8 class8 = new Class8("Toyota", 2015, 50000, "Automatic");
        try {
            System.out.println("Is mileage acceptable: " + class8.isMileageAcceptable()); // Expected output: true
            System.out.println("Fuel efficiency category: " + class8.getFuelEfficiencyCategory()); // Expected output: "High"
            System.out.println("Total cost of ownership: " + class8.calculateTotalCostOfOwnership(25000, 2000, 5000)); // Expected output: 32000.0
            System.out.println("Is model year in range: " + class8.isModelYearInRange(2024, 2000, 2025)); // Expected output: true
            System.out.println("Has automatic transmission: " + class8.hasAutomaticTransmission()); // Expected output: true
        } catch (Exception e) {
            System.err.println("An error occurred while testing Class8: " + e.getMessage());
        }

        // Testing methods of Class9
        System.out.println("\nTesting Class9:");

        try {
            System.out.println("Is email valid: " + class9.isEmailValid("example@example.com")); // Expected output: true
            System.out.println("Generated random password: " + class9.generateRandomPassword()); // Expected output: Random string of characters
            System.out.println("Factorial: " + class9.calculateFactorial(5)); // Expected output: 120
            System.out.println("Masked phone number: " + class9.maskPhoneNumber("1234567890")); // Expected output: "*******7890"
            System.out.println("Formatted SSN: " + class9.formatSSN("123456789")); // Expected output: "***-**-6789"
        } catch (Exception e) {
            System.err.println("An error occurred while testing Class9: " + e.getMessage());
        }

        // Testing methods of Class10
        System.out.println("\nTesting Class10:");

        try {
            System.out.println("Is valid car year: " + class10.isValidCarYear(2010)); // Expected output: true
            System.out.println("Determine car type: " + class10.determineCarType("Gasoline")); // Expected output: "Gasoline"
            System.out.println("Depreciation rate: " + class10.calculateDepreciationRate(25000, 5)); // Expected output: Approximately 0.405
            System.out.println("Is luxury car: " + class10.isLuxuryCar("BMW")); // Expected output: true
            System.out.println("Recommended oil type: " + class10.determineRecommendedOil("Toyota", 2015)); // Expected output: "5W-30"
        } catch (Exception e) {
            System.err.println("An error occurred while testing Class10: " + e.getMessage());
        }
    }
}


