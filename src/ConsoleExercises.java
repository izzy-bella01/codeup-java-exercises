import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        //--------Problem 1--------

        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f%n", pi );

        // USING SCANNER
        //--------Problem 1--------

        Scanner intScanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userInt = intScanner.nextInt();

        System.out.println("Your int entered was: " + userInt);

        //--------Problem 2--------
        Scanner wordScanner = new Scanner(System.in);

        System.out.print("Enter three words: ");
        String wordOne = wordScanner.next();
        String wordTwo = wordScanner.next();
        String wordThree = wordScanner.next();

//        System.out.printf("Your words are :" + "%n" + wordOne + "%n" + wordTwo + "%n" + wordThree);
        System.out.printf("Your words are : %n%s %n%s %n%s %n", wordOne, wordTwo, wordThree); //--> more correct


        //--------Problem 3 & 4--------
        Scanner sentenceScanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sentenceScanner.nextLine();

        System.out.println("Your sentence is: " + sentence);


        //CALCULATE AREA AND PERIMETER
        Scanner lengthScanner = new Scanner(System.in);

        System.out.print("Enter length of room in feet: ");
        String length = lengthScanner.nextLine();
        int lengthInt= Integer.parseInt(length);
//        System.out.println(lengthInt);


        Scanner widthScanner = new Scanner(System.in);

        System.out.print("Enter width of room feet: ");
        String width = widthScanner.nextLine();
        int widthInt= Integer.parseInt(width);
//        System.out.println(widthInt);

        int area = lengthInt * widthInt;
        System.out.printf("Area: %s%n", area);

        int perimeter = (lengthInt * 2) + (widthInt * 2);
        System.out.printf("Perimeter: %s", perimeter);



    }
}
