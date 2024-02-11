

/**
 * @author      Ramesh Pandey <ramesh.pandey@tuni.fi>
 * @version     2024.0206
 * @since       17.0
 */

class HelloWorld {
    /**
     * Composes a string with persons name,
     * surrounded by "box" character ch.
     * @param  ch Character to use in the box.
     * @return String for name in the box.
     */
    public static String name(String ch) {
    String str = ch + " Hello, I am John Doe " + ch;
    return str;
    }
    /**
     * Returns a user defined string.
     * @param  ch  Character to use.
     * @param  len Length of the returned string.
     * @return String that can be drawn as a line.
     */
    public static String line(String ch, int len) {
    String str = "";

    for (int i = 0; i < len; i++)
        str += ch;

    return str;
    }
    /**
     * Implements homework 1.1.
     *
     * @param  args   Command line args. Not used.
     */
    public static void main(String[] args) {
    String ch = "*";
    System.out.println(line(ch, 24));
    System.out.println(name(ch));
    System.out.println(line(ch, 24));
    }
}



// End of file

