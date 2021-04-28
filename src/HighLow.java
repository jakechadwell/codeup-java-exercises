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
        int guessCount = 0;
        int maxGuess = 10;
        while(!(guess==randomNumber)){
            System.out.println("Guess a number between 1 and 100: ");
            guess = scanner.nextInt();
            guessCount++;
            if(guess<randomNumber){
                System.out.println("HIGHER.");
                System.out.println("You have guessed: " + guessCount + " times.");
                System.out.println("You have " + (maxGuess-guessCount) + " guesses left.");
            }else if(guess>randomNumber){
                System.out.println("LOWER.");
                System.out.println("You have guessed: " + guessCount + " times.");
                System.out.println("You have " + (maxGuess-guessCount) + " guesses left.");
            }else{
                System.out.println("GOOD GUESS!");
                System.out.println("You guessed in " + guessCount + " guesses!");
            }
        }
    }
}
