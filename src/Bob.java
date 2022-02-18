import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userInput;

        do {
            Scanner bobConvo = new Scanner(System.in);
            System.out.print("Hi. I'm Bob. Talk to me. *Note: be sure to have proper punctuation* ");
            String talk = bobConvo.nextLine();

            if(talk.endsWith("?")) {
                System.out.println("Sure.");
            } else if (talk.endsWith("!")) {
                System.out.println("Woah, chill out!");
            } else if (talk.equals("") || talk.equals(" ")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }
            System.out.print("Would you like to continue?  [y/n] ");
            userInput = scanner.nextLine();
        } while (userInput.equals("y"));
    }
}
