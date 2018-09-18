import java.nio.charset.StandardCharsets;

public class CaesarCipherEncoder {
    private String plainText;
    private int key;

    public CaesarCipherEncoder(String plainText, int key){
        this.key=key;
        this.plainText=plainText;
    }

    /**
     * This method builds an encoded message given a plaintext and key
     * @return the encoded message
     */
    public String encodeText(){
        String encodedString = "";
        byte[] ascii = plainText.getBytes(StandardCharsets.US_ASCII);
        for (int i = 0; i < ascii.length; i++) {
            //check for space - don't want to convert spaces
            if (ascii[i] != 32) {
                //main logic - need to check if the letter will go beyond the end of the alphabet
                if (ascii[i] + key > 90) {
                    ascii[i] = (byte) (ascii[i] - (26 - key));
                } else {
                    ascii[i] = (byte) (ascii[i] + key);
                }
            }
        }
        //enter the loop to build the new encodedString based on a set of ascii values
        for (int i = 0; i < ascii.length; i++) {

            encodedString += Character.toString((char) ascii[i]);
        }
        return encodedString;
    }

    //getters and setters
    public String getPlainText() {
        return plainText;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }
}
