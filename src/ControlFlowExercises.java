import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args){

        // ========= while loop ======== \\
//        boolean condition = true;
//        int myNum = 1;
//
//        while ( condition ) {
//            if (myNum == 10) {
//                condition = false;
//            }
//            System.out.println(myNum);
//            myNum++;
//        }
//
//        System.out.println("break");
//        myNum = 1;
//        condition = true;

        // ========= curr. exercise1 ======== \\

//        int i = 5;
//
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++ ;
//        }



        // ========= do while loop ======== \\
//        do {
//            if (myNum == 10) {
//                condition = false;
//            }
//            System.out.println(myNum);
//            myNum++;
//        } while (condition);

        // ========= do-while curr. exercise count by 2's ======== \\

//          int i = 0;
//
//          do {
//              System.out.println(i);
//              i+= 2;
//          } while (i <= 100);


        // ========= do-while curr. exercise decrement 5's ======== \\

//      int i = 100;
//        do{
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);


        // ========= do-while 2^2 ======== \\


//        long numSq = 2;
//        do {
//            System.out.println(numSq);
//            numSq *= numSq;
//        } while (numSq <= 65536);


        // ========= for loop ======== \\

//        for (int i = 0; i<= 10 ;i++)
//            System.out.println("i = " + i);
//        sout-> i = i to show the value before you break
//            if (i == 5){
//                break;
//            }

        // ========= FizzBuzz ======== \\

//        for (int i = 1; i <= 100; i += 1) {
//
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0 ){
//                System.out.println("Buzz");
//            } else if (i % 3 == 0){
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

        // ========= Table of Powers ======== \\

        Scanner sc = new Scanner(System.in);
//        System.out.println("What number would you like to go up to?");
//        int userInputTable = sc.nextInt();
////
//        souf-> " %-7d", i
//        sout -> print("|");
//        souf-> " %-8d", i * i
//        sout -> print("|");
//        souf-> " %-9d", i * i * i
//
//        System.out.println("Here is your table!");
//        System.out.println(" number |  squared  |  cubed ");
//        for (int i = 1; i <= userInputTable; i++ ) {
//
//            System.out.println("  " + i + "     | " + (i * i) + "         |  " + (i * i * i));
//
//        }

//         create a loop until the user doesnt want to enter in a number
//        string confirmation = sc.next()
//        if (!confirmation) {
//          confirmation = false;
//        } while (confirmation);


        // ========= Grade Scale ======== \\

        System.out.println("What is your number grade?");
        int userGrade = sc.nextInt();

        if (userGrade >= 97){
            System.out.println("A+");
        }
        else if (userGrade >= 93){
            System.out.println("A");
        }
        else if (userGrade >= 90){
            System.out.println("A-");
        }
        else if (userGrade >= 87){
            System.out.println("B+");
        }
        else if (userGrade >= 83){
            System.out.println("B");
        }
        else if (userGrade >= 80){
            System.out.println("B-");
        }
        else if (userGrade >= 77){
            System.out.println("C+");
        }
        else if (userGrade >= 73){
            System.out.println("C");
        }
        else if (userGrade >= 70){
            System.out.println("C-");
        }
        else if (userGrade >= 67){
            System.out.println("D+");
        }
        else if (userGrade >= 63){
            System.out.println("D");
        }
        else if (userGrade >= 60){
            System.out.println("D-");
        }
        else if (userGrade >= 0){
            System.out.println("F");
        } else {
            System.out.println("That is not a valid grade!");
        }
        // ======== next line inserted to allow usr input ======== \\
        sc.nextLine();
        System.out.println("Would you like to continue? [y/N]");
        String userInput = sc.nextLine();

        boolean confirmation = userInput.equalsIgnoreCase("y");

        // ========= Second user input grade response  ======== \\
        if (confirmation) {

            System.out.println("Enter another integer grade value.");
            int userSecondGrade = sc.nextInt();

            if (userSecondGrade >= 97) {
                System.out.println("A+ falls between : 97 - 100");
            } else if (userSecondGrade >= 93) {
                System.out.println("A falls between : 93 - 96");
            } else if (userSecondGrade >= 90) {
                System.out.println("A- falls between : 90 - 92 ");
            } else if (userSecondGrade >= 87) {
                System.out.println("B+ falls between : 87 - 89");
            } else if (userSecondGrade >= 83) {
                System.out.println("B falls between : 83 - 86");
            } else if (userSecondGrade >= 80) {
                System.out.println("B- falls between : 80 - 82");
            } else if (userSecondGrade >= 77) {
                System.out.println("C+ falls between : 77 - 79");
            } else if (userSecondGrade >= 73) {
                System.out.println("C falls between : 73 - 76");
            } else if (userSecondGrade >= 70) {
                System.out.println("C- falls between : 70 - 72");
            } else if (userSecondGrade >= 67) {
                System.out.println("D+ falls between : 67 - 69");
            } else if (userSecondGrade >= 63) {
                System.out.println("D falls between : 63 - 66");
            } else if (userSecondGrade >= 60) {
                System.out.println("D- falls between : 60 - 62");
            } else if (userSecondGrade >= 0) {
                System.out.println("F falls between : 0 - 50");
            } else {
                System.out.println("That is not valid.");
            }
        }

        // ========= response if confirmation is false ======== \\
        if (!confirmation){
            System.out.println("Goodbye.");
        }


        // ========= end of main method ======== \\
    }
}
