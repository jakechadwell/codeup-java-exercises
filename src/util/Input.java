package util;
import java.util.Scanner;
public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString(String prompt){
        System.out.println(prompt);
        return this.scanner.nextLine();
    }
    public boolean yesNo(String prompt){
        System.out.println(prompt);
        String input = scanner.next();
        return input.equalsIgnoreCase("y")||input.equalsIgnoreCase("yes");
    }
    public int getInt(int min, int max, String prompt){
        String userInput = this.getString(prompt);
        int userInteger;
        try {
            userInteger = Integer.valueOf(userInput);
        }catch (NumberFormatException e) {
            System.err.println("Not an integer within range.");
            return getInt(min, max, prompt);
        }
        if (min <= userInteger && userInteger <= max) {
            return userInteger;
        } else {
            System.out.println("Sorry, that number is not in the specified range, try again: ");
            return getInt(min, max, prompt);
        }
    }
    public int getInt(String prompt){
        try {
            String userInput = this.getString(prompt);
            return Integer.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.err.println("That is not an integer");
            return getInt(prompt);
        }
    }
    public double getDouble(double min, double max, String prompt){
        String userInput = this.getString(prompt);
        double userDouble;
        try{
            userDouble = Double.valueOf(userInput);
        }catch(NumberFormatException e){
            System.err.println("Not in valid range.");
            return getDouble(min, max, prompt);
        }
        if (min <= userDouble && userDouble <= max) {
            return userDouble;
        } else {
            System.out.println("Sorry, that double is not in the specified range, try again: ");
            return getDouble(min, max, prompt);
        }
    }
    public double getDouble(String prompt){
        try{
            String userInput = this.getString(prompt);
            return Double.valueOf(userInput);
        }catch(NumberFormatException e){
            System.err.println("Not a double.");
            return getDouble(prompt);
        }
    }
}
