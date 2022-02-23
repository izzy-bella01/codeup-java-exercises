import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        GuessTheRandomNum();
    }

    public static void GuessTheRandomNum() {
        int randomNum = (int)(Math.random() * 100);

        int trials = 5;
        int i;

        for(i = 0; i < trials; i++) {
            System.out.print("Enter a random number between 1 - 100: ");
            Scanner guess = new Scanner(System.in);
            int userGuess = guess.nextInt();

            if (userGuess == randomNum) {
                System.out.println("GOOD GUESS!");
                break;

            } else if(userGuess > randomNum && i != trials - 1) {
                System.out.println("LOWER!");

            } else if(userGuess < randomNum && i != trials - 1) {
                System.out.println("HIGHER!");

            }
        }

        if (i == trials) {
            System.out.println("You have ran out of tries");
            System.out.println("The number was " + randomNum);
        }
    }

}