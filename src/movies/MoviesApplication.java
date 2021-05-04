package movies;
import util.Input;
public class MoviesApplication {
    public static void main(String[] args) {
        Movie[] movies = MoviesArray.findAll();
        System.out.println("Welcome!");
        while(true) {
            options();
            Input userInput = new Input();
            int userChoice = userInput.getInt(0, 5, "What would you like to do?: ");
            if (userChoice == 0){
                break;
            } else if (userChoice == 1){
                returnListOfAllMovies(movies);
            } else if (userChoice == 2){
                returnListOfSpecifiedMovies(movies, "animated");
            } else if (userChoice == 3){
                returnListOfSpecifiedMovies(movies, "drama");
            } else if (userChoice == 4){
                returnListOfSpecifiedMovies(movies, "horror");
            } else if (userChoice == 5){
                returnListOfSpecifiedMovies(movies, "scifi");
            }
        }
        System.out.println("See ya!");
    }
        public static void options(){
            System.out.println("What would you like to do?");
            System.out.println();
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the sci-fi category");
    }
    public static void returnMovie(Movie movie){
        System.out.println(movie.getName() + " -- " + movie.getCategory());
        System.out.println("=========================");
    }
    public static void returnListOfAllMovies(Movie[] main){
        System.out.println();
        System.out.println("=========================");
        for (Movie movie : main){
            returnMovie(movie);
        }
        System.out.println();
    }
    public static void returnListOfSpecifiedMovies(Movie[] main, String category){
        System.out.println();
        System.out.println("=========================");
        for (Movie movie : main){
            if (movie.getCategory().equalsIgnoreCase(category)){
                returnMovie(movie);
            }
        }
        System.out.println();
    }
}
