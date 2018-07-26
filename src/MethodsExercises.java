import java.util.Scanner;
import java.lang.Math;

public class MethodsExercises {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

//  ======= passing values & calling Basic Arithmetic methods ======= \\
//        System.out.println(add(1,1));
//        System.out.println(subtract(100,10));
//        System.out.println(divide(50,10));
//        System.out.println(multiply(5,5));

//  ======= scanner setup for user input  ======= \\
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter a number between 1 and 10: ");
//
//        int userInput;
//        int min = 1;
//        int max = 10;
////        int userInput = getInteger(1, 10);
////        System.out.println(getInteger(1, 10));
//
//       while (true) {
//           userInput = sc.nextInt();
//            if (userInput >=min & userInput <= max) {
//                System.out.println("Thanks for submitting a valid number");
//
//                break;
//            } else {
//                System.out.print("Please enter a valid number: ");
//            }
//       }



// === factorial method call === \\
        factorial();


// === dice rolling === \\
//        Ask the user to enter the number of sides for a pair of dice. X
//        Prompt the user to roll the dice. X
//        "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//        Use static methods to implement the method(s) that generate the random numbers.
//        Use the .random method of the java.lang.Math class to generate random numbers.


// ==== method call to run dice game ==== \\
//      rollDice();


//   ==== main end === \\
    }

    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static int subtract(int num1, int num2){
        return num1 - num2;
    }

    public static int divide(int num1, int num2){
        return num1 / num2;
    }

    public static int multiply(int num1, int num2){
        return num1 * num2;
    }


// === getInteger Method === \\

//public static int getInteger(int min, int max) {
//
//        if (min >= 1 && max <=10) {
//            System.out.print("Confirmed");
//            return 1;
//        } else {
//            System.out.print("Enter another number: ");
//        }
//}


//   === Calc factorial of num ===  \\
//    Display the factorial of the number entered by the user.
//    Ask if the user wants to continue.
//    Use a for loop to calculate the factorial.
//    Assume that the user will enter an integer, but verify it’s between 1 and 10.
//    Use the long type to store the factorial.
//    Continue only if the user agrees to.
//    A factorial is a number multiplied by each of the numbers before it.
//    Factorials are denoted by the exclamation point (n!)

//    example output:
//    1! = 1               = 1
//    2! = 1 x 2           = 2
//    3! = 1 x 2 x 3       = 6
//    4! = 1 x 2 x 3 x 4   = 24

// === factorial === \\
public static void factorial(){

    System.out.print("Please enter a number between 1-10 to see its' factorial breakdown: ");
    int num = sc.nextInt();

        if (num == 1) {
            System.out.print(num +"! " + "= 1  " + "    = 1");

        } else if (num == 2) {
            System.out.print(num +"! " + "= 1 x 2 " + "    = "+ num);

        } else if (num == 3){
            System.out.print(num +"! " + "= 1 x 2 x 3 " + "    = " + num*2);

        } else if (num == 4) {
            System.out.print(num +"! " + "= 1 x 2 x 3 x 4  " + "    = " + num*2*3);

        } else if (num == 5){
            System.out.print(num +"! " + "= 1 x 2 x 3 x 4 x 5  " + "    = " +num*2*3*4);

        } else if(num == 6) {
            System.out.print(num +"! " + "= 1 x 2 x 3 x 4 x 5 x 6 " + "    = " + num*2*3*4*5);

        } else if(num == 7) {
            System.out.print(num +"! " + "= 1 x 2 x 3 x 4 x 5 x 6 x 7  " + "    = " + num*2*3*4*5*6);

        } else if(num == 8) {
            System.out.print(num +"! " + "= 1 x 2 x 3 x 4 x 5 x 6 x 7 x 8  " + "    = " + num*2*3*4*5*6*7);

        } else if(num == 9) {
            System.out.print(num +"! " + "= 1 x 2 x 3 x 4 x 5 x 6 x 7 x 8 x 9  " + "    = " + num*2*3*4*5*6*7);

        } else if(num == 10) {
            System.out.print(num +"! " + "= 1 x 2 x 3 x 4 x 5 x 6 x 7 x 8 x 9 X 10" + "    = " + num*2*3*4*5*6*7);

        }
}

// === role dice simulation === \\
public static void rollDice(){

    System.out.print("Enter the number of sides of your dice: ");
    int desiredDiceSize = sc.nextInt();

    int i = 1;

     while (i == 1) {
         System.out.print("Ready to roll? (y/n)");
         String rollConfirmation = sc.next();

         if (rollConfirmation.equalsIgnoreCase("y")) {
                 int dice1 = (int) (Math.random() * desiredDiceSize) + 1;
                 int dice2 = (int) (Math.random() * desiredDiceSize) + 1;
                 System.out.print("Dice one is: " + dice1 +"\n");
                 System.out.print("Dice two is: " + dice2 + "\n");

         } else if (rollConfirmation.equalsIgnoreCase("n")) {
             System.out.print("Goodbye!");
             i += 1;
         } else {
             System.out.print("You're wrong.");
         }
     }
}

//class end
}
