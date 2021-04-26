import java.util.Scanner;
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

        int h = 1;
        while (h<100){
            h++;
            if (h%3==0&&h%5==0){
                System.out.println("FizzBuzz");
            }else if(h%5==0){
                System.out.println("Buzz");
            }else if(h%3==0){
                System.out.println("Fizz");
            }else{
                System.out.println(h);
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        int userInt = scanner.nextInt();

        System.out.println("Here is your table!\n");
    }
}
