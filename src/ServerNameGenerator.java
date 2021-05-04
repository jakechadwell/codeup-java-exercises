import java.util.Random;
public class ServerNameGenerator {
    public static String randomPhrase(String[] adjectives, String[] nouns){
        Random rand = new Random(); //instance of random class
        int upperbound = 11;
        int int_random = rand.nextInt(upperbound-1);

        return adjectives[int_random] + "-" + nouns[int_random];
    }

    public static void main(String[] args) {
        String[] adjectives = {"fat", "big", "small", "colossal", "nice", "happy", "angry", "scary", "eager", "fancy"};
        String[] nouns = {"people", "way", "art", "map", "food", "lab", "bag", "bird", "area", "oven"};
        System.out.println("Here is your server name: \n" + randomPhrase(adjectives, nouns));
    }
}
