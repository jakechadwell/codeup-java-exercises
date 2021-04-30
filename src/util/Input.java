package util;
import java.util.Scanner;
public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString(String prompt){
        System.out.println(prompt);
        return this.scanner.next();
    }
}
