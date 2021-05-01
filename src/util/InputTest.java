package util;

public class InputTest {
    public static void main(String[] args) {
        Input newScanner = new Input();
        System.out.println(newScanner.getString("Enter a string: "));
        System.out.println(newScanner.yesNo());
        System.out.println(newScanner.getInt(1, 10));
        System.out.println(newScanner.getInt());
        System.out.println(newScanner.getDouble(1.5, 2.0));
        System.out.println(newScanner.getDouble());
    }
}
