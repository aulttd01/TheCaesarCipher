import java.nio.charset.StandardCharsets;
import java.util.*;
public class CaesarCipherBreaker {

    private int key;
    public CaesarCipherBreaker(int key) {
        this.key=key;
    }

    /**
     * This method cracks the Caesar code for any given key as defined in the main method
     * It takes the passed in string and converts it into a byte array of ascii values
     * using the StandardCharsets allows for more flexibility than just using ASCII
     *
     * @param cipherText is the String passed in which is to be decoded by this method
     * @return decodedString which is the decoded representation of the original passed in cipherText
     */
    public String breakCipher(String cipherText) {
        String decodedString = "";
        byte[] ascii = cipherText.getBytes(StandardCharsets.US_ASCII);
        for (int i = 0; i < ascii.length; i++) {
            //check for space - don't want to convert spaces
            if (ascii[i] != 32) {
                //main logic - need to check if the letter will go beyond the beginning of the alphabet
                if (ascii[i] - key < 65) {
                    ascii[i] = (byte) (ascii[i] + (26 - key));
                } else {
                    ascii[i] = (byte) (ascii[i] - key);
                }
            }
        }
        //enter the loop to build the new decodedString based on a set of ascii values
        for (int i = 0; i < ascii.length; i++) {

            decodedString += Character.toString((char) ascii[i]);
        }
        return decodedString;
    }

}
