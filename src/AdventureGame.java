import java.util.Scanner;

public class AdventureGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n\n\n\nMorpheus: What if I told you... that we live in a world now controlled by machines.. " +
                "You have the choice I never had. \nIf you would like to go back to sleep and pretend all of this was a bad dream, take the (RED) pill, \n" +
                "or would you like to see how deep the rabbit hole goes, take the (BLUE) pill...");

        String userInputPill = sc.nextLine();

        if (userInputPill.equalsIgnoreCase("red pill")) {
            System.out.println("You have made a mistake. //GAMEOVER\\\\");

        }

        if (userInputPill.equalsIgnoreCase("blue pill")) {
            System.out.println("Morpheus: Wise choice. Now lets get out of here. Would you like to exit the building through the (BASEMENT) (BACK) or (FRONT)?");
        }
        // ======= exit plan variable ======= \\
        String userExitPlan = sc.nextLine();

        if (userExitPlan.equalsIgnoreCase("back")) {
            System.out.println("--The phone starts to ring in the living room. Do you want to go pick it up? (y/n)");
            gunShots();
        }

    }

    public static void gunShots() {
        System.out.println("BOOM, BOOM, BOOM!");
    }

}
