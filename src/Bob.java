import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        String question = "Sure";
        String exclamation = "Woah, chill out!";
        String ignore = "Fine. Be that way!";
        String defaultResponse = "Whatever";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Say hello to Bob!");

        do {

            String userResponse = scanner.nextLine();
            if(userResponse.endsWith("?")){
                System.out.println("Bob: " + question);
            }else if(userResponse.endsWith("!")){
                System.out.println("Bob: " + exclamation);
            }else if(userResponse.length()==0){
                System.out.println("Bob: " + ignore);
            }else{
                System.out.println("Bob: " + defaultResponse);
            }
            System.out.println("Continue? [y/n]");
            String continuePrompt = scanner.nextLine();
            if(!continuePrompt.equalsIgnoreCase("y")){
                System.out.println("Bob: See ya.");
                break;
            }
        }while(true);
    }
}
