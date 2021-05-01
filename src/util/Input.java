package util;
import java.util.Scanner;
public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString(String prompt){
        System.out.println(prompt);
        return this.scanner.nextLine();
    }
    public boolean yesNo(){
        System.out.println("yes or no?: ");
        String input = scanner.next();
        return input.equalsIgnoreCase("y")||input.equalsIgnoreCase("yes");
    }
    public int getInt(int min, int max){
        System.out.printf("Enter an integer between %d and %d: ", min, max);
        int userInput = scanner.nextInt();
        if (min <= userInput && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Sorry, that number is not in the specified range, try again: ");
            return getInt(min, max);
        }
    }
    public int getInt(){
        System.out.println("Enter a number: ");
        return this.scanner.nextInt();
    }
    public double getDouble(double min, double max){
        System.out.printf("Enter a double between %s and %s: ", min, max);
        double userInput = scanner.nextDouble();
        if (min <= userInput && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Sorry, that double is not in the specified range, try again: ");
            return getDouble(min, max);
        }
    }
    public double getDouble(){
        System.out.println("Enter a double: ");
        return this.scanner.nextDouble();
    }

}
