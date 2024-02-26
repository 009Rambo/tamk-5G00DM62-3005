import java.util.HashMap;
import java.util.Map;

/**
 * Array Morse Code
 *
 * Convert a string (phone number) into Morse code for numbers.
 *
 * Variables:
 * String phoneNumber = "050123456";
 *
 * Output format:
 * Display the Morse code representation of the phone number.
 *
 * Example Usage:
 * String phoneNumber = "050123456";
 * convertToMorseCode(phoneNumber);
 *
 * @author Ramesh Pandey <ramesh.pandey@tuni.fi>
 * @version 2024.0226
 * @since 17.0
 */
class ArrayMorseCode {

    /**
     * This is main method to convert a string (phone number) into Morse code for numbers.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        String phoneNumber = "050123456";
        convertToMorseCode(phoneNumber);
    }

    /**
     * Converts a string (phone number) into Morse code for numbers.
     *
     * @param phoneNumber The phone number to convert.
     */
    public static void convertToMorseCode(String phoneNumber) {
        Map<Character, String> morseCodeMap = createMorseCodeMap();
        for (int i = 0; i < phoneNumber.length(); i++) {
            char digit = phoneNumber.charAt(i);
            if (Character.isDigit(digit)) {
                String morseCode = morseCodeMap.get(digit);
                if (morseCode != null) {
                    System.out.print(morseCode + " ");
                }
            }
        }
    }

    /**
     * Creates a map with Morse code representations for digits.
     *
     * @return A map containing Morse code representations for digits.
     */
    public static Map<Character, String> createMorseCodeMap() {
        Map<Character, String> morseCodeMap = new HashMap<>();
        morseCodeMap.put('0', "-----");
        morseCodeMap.put('1', ".----");
        morseCodeMap.put('2', "..---");
        morseCodeMap.put('3', "...--");
        morseCodeMap.put('4', "....-");
        morseCodeMap.put('5', ".....");
        morseCodeMap.put('6', "-....");
        morseCodeMap.put('7', "--...");
        morseCodeMap.put('8', "---..");
        morseCodeMap.put('9', "----.");
        return morseCodeMap;
    }
}
