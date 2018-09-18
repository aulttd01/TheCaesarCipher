import java.util.Scanner;

/**
 * these are the test cases for the assignment - will work for any text
 * For Cipher Case: PIDM NCV EPQTM EWZSQVO PIZL -> Key = 8, decoded plain text = HAVE FUN WHILE WORKING HARD
 * For Cipher Case: IKHZKTFFBGZ BL GHM YNG -> Key = 19, decoded plain text = PROGRAMMING IS NOT FUN
 */

public class driver {

    public static void main(String[] args) {


       Scanner in = new Scanner(System.in);

        ProgramInit programInit = new ProgramInit();
        System.out.println("Welcome to the Monoalphabetic Cipher Program!\nPlease Enter:\n\t 1 to break a cipher\n\t 2 to encode a message");
        try {
            int userChoice = in.nextInt();
            System.out.println(programInit.displayCaesar(userChoice));
        }
        catch (Exception InputMismatchException){
            System.out.println("Please enter a valid option!");
        }


    }

}
