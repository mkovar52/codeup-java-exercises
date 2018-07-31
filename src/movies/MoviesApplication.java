package movies;
import java.util.Scanner;

public class MoviesApplication {

    public static void main(String[] args) {

        Movie[] movieArrTest = MoviesArray.findAll();

//     can refactor this using Input util class (below) & import the via "import util.Input" (above) instead of Scanner
        Scanner sc = new Scanner(System.in);

//      (here)  Input input = new Input();
//        int userInput = input.getInt(0, 5);

//   while loop variable, broken when user enters 0
        int x = 1;

        while (x == 1){
            System.out.println("What would you like to do... ");
            System.out.println("0 - exit \n" +
                    "1 - view all movies\n" +
                    "2 - view movies in animated category\n" +
                    "3 - view movies in drama category\n" +
                    "4 - view movies in horror\n" +
                    "5 - view movies in scifi category\n\n" +
                    "Enter your choice:  ");

            String userInput = sc.nextLine();

            if (userInput.equals("0")) {
                System.out.print("this is exit");
                x+= 1;

            } else if (userInput.equals("1")) {
                for (int i = 0; i < movieArrTest.length; i++) {
                    System.out.println("\nMovie Title: " + movieArrTest[i].getName() + "\n" +
                            "Category: " + movieArrTest[i].getCategory());
                }

            } else if (userInput.equals("2")) {
                for (int i = 0; i < movieArrTest.length; i++) {
                    if (movieArrTest[i].getCategory().equalsIgnoreCase("animated")) {
                        System.out.println(movieArrTest[i].getName());
                    }
                }

            } else if (userInput.equals("3")) {
                for (int i = 0; i < movieArrTest.length; i++) {
                    if (movieArrTest[i].getCategory().equalsIgnoreCase("drama")) {
                        System.out.println(movieArrTest[i].getName());
                    }
                }

            } else if (userInput.equals("4")) {
                for (int i = 0; i < movieArrTest.length; i++) {
                    if (movieArrTest[i].getCategory().equalsIgnoreCase("horror")) {
                        System.out.println(movieArrTest[i].getName());
                    }
                }

            } else if (userInput.equals("5")) {
                for (int i = 0; i < movieArrTest.length; i++) {
                    if (movieArrTest[i].getCategory().equalsIgnoreCase("scifi")) {
                        System.out.println(movieArrTest[i].getName());
                    }
                }

            } else {
                System.out.println("not valid input, please enter again: ");
            }
        }
// ======================== Main Method End  ======================== \\
    }
// ======================== Class End  ======================== \\
}
