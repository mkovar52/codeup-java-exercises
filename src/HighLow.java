import java.util.Scanner;
import java.lang.Math;

//        Game picks a random number between 1 and 100.
//        Prompts user to guess the number
//        All user inputs are validated
//        If user's guess is less than the number, it outputs "HIGHER"
//        If user's guess is more than the number, it outputs "LOWER"
//        If a user guesses the number, the game should declare "GOOD GUESS!"

public class HighLow {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

//  ===== method call to initiate game ==== \\
        numValidate();
        System.out.println("you made it out of the loop and didn't die!");


//   main end  \\
    }

    public static void numValidate() {

        int randomNumGen = (int) (Math.random() * 100) + 1;
//  used to check computer's number \\
//        System.out.println(randomNumGen);

        boolean confirmation = true;
        int userGuessCount = 0;

        while (confirmation) {
            System.out.println("Welcome to an endless loop.. You can only escape by guess the number I've picked from 1-100:");
            int userGuess = sc.nextInt();

            if (userGuess == randomNumGen) {
                System.out.println("GOOD GUESS!!! You win!");
                confirmation = false;
            } else if (userGuess > randomNumGen) {
                System.out.println("TOO HIGH! You are at guess number: " + userGuessCount);
                userGuessCount+= 1;

            } else if (userGuess < randomNumGen) {
                System.out.println("TOO LOW!" + userGuessCount);
                userGuessCount+= 1;

            } else {
                System.out.println("Not a valid number..." + userGuessCount);
                userGuessCount+= 1;
            }
        }
    }


//   class end  \\
}
