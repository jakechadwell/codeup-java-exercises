import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
//
//      First Section:
//
//        Number 1:
//
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %s.\n", pi);
//
//      Second Section:
//
//        Number 1:

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an integer: ");
//        int userInput = scanner.nextInt();
//        System.out.printf("You entered: %d%n", userInput);
//
//        Number 2:

//        System.out.println("Enter three words: ");
//        String first = scanner.next();
//        String second = scanner.next();
//        String third = scanner.next();
//        System.out.printf("First word is: %s%n", first);
//        System.out.printf("Second word is: %s%n", second);
//        System.out.printf("Third word is: %s%n", third);

//        Number 3/4:

//        System.out.println("Enter a sentence: ");
//        String userSentence = scanner.nextLine();
//        System.out.printf("Your sentence: %s%n", userSentence);

//        Bonus:

        System.out.println("Enter classroom dimensions (L,W): ");
        float length = scanner.nextFloat();
        float width = scanner.nextFloat();
        float area = length*width;
        float perimeter = (2*length) + (2*width);
        System.out.printf("Area of room: %f sq ft%n", area);
        System.out.printf("Perimeter of room: %f ft%n", perimeter);
    }
}
