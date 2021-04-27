import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println("One plus one is: " + addition(1, 1));
        System.out.println("Two minus one is: " + subtraction(2, 1));
        System.out.println("Two times two is: " + multiplication(2, 2));
        System.out.println("Six divided by three is: " + division(6, 3));
        System.out.println("Two divided by two has a remainder of: " + modulus(2, 2));
//        System.out.println("Enter a number between 1 and 10: ");
        getFactorial();
    }

    //Number 1:

    public static double addition(double one, double two) {
        return one+two;
    }
    public static double subtraction(double one, double two) {
        return one-two;
    }
    public static double multiplication(double one, double two) {
        return one*two;
    }
    public static double division(double one, double two) {
        return one/two;
    }
    public static double modulus(double one, double two) {
        return one%two;
    }

    //Number 2:

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        if (min<=userInput && userInput<=max){
            return userInput;
        }else{
            System.out.println("Sorry, that number is not in the specified range, try again: ");
            return getInteger(min, max);
        }
    }

    //Number 3:

    public static void getFactorial(){
        System.out.println("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        long factorial = 1;
        for(int i = 1; i<userInput; i++){
            factorial*=i;
            System.out.println(userInput + "! = " + factorial);
        }
    }
}
