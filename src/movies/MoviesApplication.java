package movies;
import java.util.Arrays;

import static util.Input.scanner;

public class MoviesApplication{
    public static Movie[] movies = MoviesArray.findAll();
    public static void main(String[] args) {
        pickMovie();

    } // end of main method
    public static void pickMovie() {
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the sci-fi category");
        System.out.println("6 - view movies in the musical category");
        System.out.println("7 - view movies in the comedy category");
        System.out.println();
        System.out.println("Enter your choice: ");


        int userChoice = scanner.nextInt();
        for(int i = 0; i < movies.length; i++) {
            if (userChoice == 1) {
                System.out.printf("%s -- %s%n", movies[i].getName(), movies[i].getCategory());
            } else if (userChoice == 2) {
                if(movies[i].getCategory().equals("animated")) {
                    System.out.printf("%s -- %s%n", movies[i].getName(), movies[i].getCategory());
                }
            } else if (userChoice == 3) {
                if(movies[i].getCategory().equals("drama")) {
                    System.out.printf("%s -- %s%n", movies[i].getName(), movies[i].getCategory());
                }
            } else if (userChoice == 4) {
                if(movies[i].getCategory().equals("horror")) {
                    System.out.printf("%s -- %s%n", movies[i].getName(), movies[i].getCategory());
                }
            } else if(userChoice == 5) {
                if(movies[i].getCategory().equals("scifi")) {
                    System.out.printf("%s -- %s%n", movies[i].getName(), movies[i].getCategory());
                }
            } else if(userChoice == 6) {
                if(movies[i].getCategory().equals("musical")) {
                    System.out.printf("%s -- %s%n", movies[i].getName(), movies[i].getCategory());
                }
            } else if(userChoice == 7) {
                if(movies[i].getCategory().equals("comedy")) {
                    System.out.printf("%s -- %s%n", movies[i].getName(), movies[i].getCategory());
                }
            } else {
                System.out.println("Hope you had fun! See ya!");
                return;
            }
        }
        pickMovie();
    }


}

