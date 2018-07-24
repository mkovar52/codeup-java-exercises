import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //============ storing int  ========= \\
//        System.out.print("How old are you? :");
//        int userAge = sc.nextInt();
//        System.out.println("You are " + userAge + " Years old. Cool!");

        //============ three words ========= \\
//        System.out.println("What are three words you like?");
//        String firstWord = sc.next();
//        String secondWord = sc.next();
//        String thirdWord = sc.next();
//        System.out.printf("You like %s %s %s", firstWord, secondWord, thirdWord);

        //============ fav sentence ========= \\
//        System.out.println("What is your favorite sentence?");
//        String newString = sc.nextLine();
////        only prints the first word/letter
//        System.out.println(newString);

        //============ area & perimeter  ========= \\

        System.out.println("Let's check the area & perimeter of your room!");

        System.out.println("What is the length?");
        String length = sc.nextLine();

        System.out.println("What is the width?");
        String width = sc.nextLine();

        int lengthInt = Integer.parseInt(length);
        int widthInt = Integer.parseInt(width);
        int roomArea = lengthInt * widthInt;
        int roomPerimeter = (2 * lengthInt) + (2 * widthInt);

        // Area output
        System.out.println("The area is: " + roomArea);
        // Perimeter output
        System.out.println("The perimeter is: " + roomPerimeter);
    }
}
