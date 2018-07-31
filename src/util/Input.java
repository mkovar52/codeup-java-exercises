package util;
import java.util.Scanner;

public class Input {

  private Scanner sc = new Scanner(System.in);

  public String getString(String prompt){
//      prompt = (prompt.isEmpty()) ? "Type: " : prompt;
//      System.out.println("Give me a string, please");
      return this.sc.nextLine().trim().toLowerCase();
  }
//  method overloading
  public String getString(){
      return this.getString("Type: ");
  }

  public boolean yesNo(){
//      System.out.println("Y/N: ");
//    String input = sc.nextLine();
      String result = this.getString("Type yes or no (Y/N)");

//      if (result.equals("y") || result."Yes")) {
//          return true;
//      } else {
//          return false;
//      }

      return (result.equals("y") || result.equals("yes"));
  }


  public int getInt(int min, int max) {
      System.out.println("Please enter an integer between " + min + " and " + max + " :");
      int userInput;
      int i = 1;

      while (i == 1) {
          userInput = sc.nextInt();
          if (userInput >= min & userInput <= max) {
              i++;
          } else {
              System.out.println("Please enter a valid number: ");
          }
      }
        return i;
  }


  public int getInt(){
      System.out.println("Enter an integer: ");
      return this.sc.nextInt();
  }


  public double getDouble(double min, double max){
      System.out.println("Please enter a double number between: " + min + " and " + max + ":");
      double userInput;
      int i = 1;

      while (i == 1) {
          userInput = sc.nextDouble();
          if (userInput >= min & userInput <= max) {
              i++;
          } else {
              System.out.println("Please enter a valid number: ");
          }
      }
      return i;
  }

  public double getDouble(){
      System.out.println("Enter a double number: ");
      return this.sc.nextDouble();
  }

}