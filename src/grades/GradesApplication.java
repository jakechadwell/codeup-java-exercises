package grades;

import java.util.HashMap;
import java.util.Scanner;
public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String userInput;
        Student kelvon = new Student();
        kelvon.Student("Kelvon");
        kelvon.addGrade(90);
        kelvon.addGrade(86);
        kelvon.addGrade(99);
        Student sergio = new Student();
        sergio.Student("Sergio");
        sergio.addGrade(93);
        sergio.addGrade(84);
        sergio.addGrade(95);
        Student andrew = new Student();
        andrew.Student("Andrew");
        andrew.addGrade(100);
        andrew.addGrade(89);
        andrew.addGrade(95);
        Student brandon = new Student();
        brandon.Student("Brandon");
        brandon.addGrade(80);
        brandon.addGrade(86);
        brandon.addGrade(85);
        students.put("kelz-dev", kelvon);
        students.put("serg-davila", sergio);
        students.put("drew-walsh", andrew);
        students.put("shovel-dude77", brandon);

        Boolean cont = true;

        do {
            System.out.println("Welcome!");
            System.out.println();
            System.out.println("Here are the GitHub usernames of our students: ");
            System.out.println();
            System.out.println("|kelz-dev| |serg-davila| |drew-walsh| |shovel-dude77|");
            System.out.println();
            System.out.println("What student would you like to see more information on?");
            userInput = scanner.nextLine();
            if (userInput.equals("kelz-dev")) {
                System.out.println("Name: " + kelvon.getName() + " - " + "GitHub Username: kelz-dev\n");
                System.out.println("Current Average: " + kelvon.getGradeAverage());
            } else if (userInput.equals("serg-davila")) {
                System.out.println("Name: " + sergio.getName() + " - " + "GitHub Username: serg-davila\n");
                System.out.println("Current Average: " + sergio.getGradeAverage());
            } else if (userInput.equals("drew-walsh")) {
                System.out.println("Name: " + andrew.getName() + " - " + "GitHub Username: drew-walsh\n");
                System.out.println("Current Average: " + andrew.getGradeAverage());
            } else if (userInput.equals("shovel-dude77")) {
                System.out.println("Name: " + brandon.getName() + " - " + "GitHub Username: shovel-dude77\n");
                System.out.println("Current Average: " + brandon.getGradeAverage());
            } else {
                System.out.println("Sorry, no student found with that username!");
            }
            System.out.println("Would you like to see information about another student?");
            Scanner scanner1 = new Scanner(System.in);
            userInput = scanner1.next();
            if (userInput.equalsIgnoreCase("yes")) {
                continue;
            } else if (userInput.equalsIgnoreCase("no")) {
                System.out.println("Goodbye, have a wonderful day!");
                break;
            }
        } while (userInput.equalsIgnoreCase("yes"));
    }
}
