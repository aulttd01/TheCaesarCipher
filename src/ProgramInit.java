import java.util.*;

public class ProgramInit {
    private Scanner scan = new Scanner(System.in);
    public ProgramInit(){
    }

    public String displayCaesar(int userChoice){
        String result ="";
        if(userChoice==1){
            System.out.println("Enter Encrypted Code!");
            String cipherText = scan.nextLine();
            for(int i = 0; i<=25;i++) {
                CaesarCipherBreaker caesarCipherBreaker = new CaesarCipherBreaker(i);
                result +=("Using Key = " + i + ":");
                result+="\n" + (caesarCipherBreaker.breakCipher(cipherText) +"\n");
            }
            return "Select your decoded message based on results!\n" + result;
        }
        else if(userChoice ==2 ){
            System.out.println("Enter plain text to be encoded!");
            String plainText = scan.nextLine();
            /*System.out.println("Enter key to be used!");
            int key = scan.nextInt()*/;
            for(int i=0;i<=25;i++) {
                CaesarCipherEncoder caesarCipherEncoder = new CaesarCipherEncoder(plainText, i);
                result += ("Your encrypted message: \n" + caesarCipherEncoder.encodeText() +"\n");
            }
            return result;
        }
        return "You Must enter a Valid Choice!";
    }

}
