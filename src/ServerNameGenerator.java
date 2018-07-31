import java.util.Random;

public class ServerNameGenerator {

    private static String[] adj = {
           "dedicated",
           "sleepy",
           "strong",
           "observant",
           "committed",
           "bald",
           "shapely",
           "unsightly",
           "fancy",
           "beautiful"
   };

   private static String[] nouns = {
           "USA",
           "Albert",
           "Russia",
           "cups",
           "StarWars",
           "iPhone",
           "iPad",
           "Deadpool",
           "Luke Skywalker",
           "Darth Vader"
   };

// method to gen random number
    private static int randomNumber(int max){
        Random r = new Random();
        return r.nextInt(max);
    }

// method that applies the random num gen to a string, and returns that array element
    private static String getRandomElement(String[] strings) {
        return strings[randomNumber(strings.length -1)];
    }


    public static void main(String[] args) {
        System.out.printf("Here is your server name: %s-%s", getRandomElement(adj), getRandomElement(nouns));
        System.out.println();
    }
}
















