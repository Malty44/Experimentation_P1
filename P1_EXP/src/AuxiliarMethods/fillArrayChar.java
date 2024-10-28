package AuxiliarMethods;

import java.util.Random;

public class fillArrayChar {

    private static final int UPPERCASE_START = 65; // ASCII 'A'
    private static final int UPPERCASE_END = 90;   // ASCII 'Z'
    private static final int LOWERCASE_START = 97; // ASCII 'a'
    private static final int LOWERCASE_END = 122;  // ASCII 'z'

    public Character[] generateRandomCharArray(Character[] charArray) {
        Random random = new Random();
        for (int i = 0; i < charArray.length; i++) {
            if (random.nextBoolean()) {
                // Random uppercase letter
                charArray[i] = (char) (UPPERCASE_START + random.nextInt(UPPERCASE_END - UPPERCASE_START + 1));
                //System.out.println(charArray[i]);
            } else {
                // Random lowercase letter
                charArray[i] = (char) (LOWERCASE_START + random.nextInt(LOWERCASE_END - LOWERCASE_START + 1));
            }
        }
        return charArray;
    }
    /*

    !DOES NOT WORK! WILL FIX LATER !

    public void print(Character[] charArray) {
        for (Character c : charArray) {
            System.out.print(c + " "); // Print on the same line
        }
        System.out.println(); // For a new line at the end
    }
*/
}
