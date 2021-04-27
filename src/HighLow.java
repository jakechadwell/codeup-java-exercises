import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        highLowGame();
    }

    public static int random(int min, int max) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }

    public static void highLowGame(){
        int randomNumber = random(1, 100);
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        while(!(guess==randomNumber)){
            System.out.println("Guess a number between 1 and 100: ");
            guess = scanner.nextInt();
            if(guess<randomNumber){
                System.out.println("HIGHER.");
            }else if(guess>randomNumber){
                System.out.println("LOWER.");
            }else{
                System.out.println("GOOD GUESS!");
            }
        }
    }
}
