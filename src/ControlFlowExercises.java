import java.util.Scanner;
import java.lang.Math;
public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i<=15){
//            System.out.print(i);
//            i++;
//        }

//        int j = 100;
//        do {
//            System.out.println(j);
//            j-=5;
//        }while(j>=-10);

//        long k = 2;
//        do {
//            System.out.println(k);
//            k*=k;
//        } while (k<1000000);

//        for(long j=2; j<1000000; j*=j){
//            System.out.println(j);
//        }
//
//        for(int k=100; k>=-10; k-=5){
//            System.out.println(k);
//        }

//        int h = 1;
//        while (h<100){
//            h++;
//            if (h%3==0&&h%5==0){
//                System.out.println("FizzBuzz");
//            }else if(h%5==0){
//                System.out.println("Buzz");
//            }else if(h%3==0){
//                System.out.println("Fizz");
//            }else{
//                System.out.println(h);
//            }
//        }
//
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an Integer: ");
//        int userInt = Integer.parseInt(scanner.next());
//
//        System.out.println("Here is your table!");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//        for(int i=1 ; i<= userInt ; i++ ){
//            double square = (Math.pow(i,2));
//            double cube = (Math.pow(i,3));
//            System.out.println(i + "      | " + square + "     | " + cube);
//        }
    String prompt;
        do {
            System.out.println("Enter a number grade: ");
            int userGrade = Integer.parseInt(scanner.next());
            if (userGrade >= 99) {
                System.out.println("Letter Grade: A+");
            } else if (userGrade > 94) {
                System.out.println("Letter Grade: A");
            } else if (userGrade > 87) {
                System.out.println("Letter Grade: A-");
            } else if (userGrade > 85) {
                System.out.println("Letter grade: B+");
            } else if (userGrade > 83) {
                System.out.println("Letter grade: B");
            } else if (userGrade > 79) {
                System.out.println("Letter grade: B-");
            } else if (userGrade > 76) {
                System.out.println("Letter grade: C+");
            } else if (userGrade > 72) {
                System.out.println("Letter grade: C");
            } else if (userGrade > 66) {
                System.out.println("Letter grade: C-");
            } else if (userGrade > 59) {
                System.out.println("Letter grade: D");
            } else {
                System.out.println("Letter grade: F");
            }
            System.out.println("Continue? (Yes or No)");
            prompt = scanner.next();
        }while(prompt.equals("Yes")||prompt.equals("yes"));
    }
}
