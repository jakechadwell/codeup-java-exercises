package util;

public class InputTest {
    public static void main(String[] args) {
        Input newScanner = new Input();
//        System.out.println(newScanner.getString("Enter a string: "));
//        System.out.println(newScanner.yesNo("yes or no?: "));
//        System.out.println(newScanner.getInt(1, 10, "Enter a number between 1 and 10: "));
        System.out.println(newScanner.getInt("Enter an integer: "));
//        System.out.println(newScanner.getDouble(1.5, 2.0));
//        System.out.println(newScanner.getDouble("Enter a double: "));
    }
}
