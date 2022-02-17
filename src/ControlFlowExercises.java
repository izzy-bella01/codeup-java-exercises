import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//  -------------WHILE--------------------
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }

//  --------------DO WHILE-------------------

//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while(i <= 100);

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while(i >= -10);

//        long i = 2; // int does not work
//        do {
//            System.out.println("squared: " + i);
//            i *= i;
//        } while(i <= 1000000);

//  --------------FOR-------------------
//        for(int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }

//        for(int i = 0; i <= 100; i+= 2) {
//            System.out.println(i);
//        }

//        for(int i = 100; i >= -10; i-= 5) {
//            System.out.println(i);
//        }

//        for(long i = 2; i <= 1000000; i *= i) {
//            System.out.println(i);
//        }

//  --------------FIZZBUZZ-------------------
//        for(int i = 0; i <= 100; i++) {
//            if (i % 5 == 0 && i % 3 == 0) {
//                System.out.println("FizzBuzz: " + i);
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz at: " + i);
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz at: " + i);
//            }
//        }

//  --------------TABLE OF POWERS-------------------

        Scanner powers = new Scanner(System.in);

        System.out.print("What number would you like to go up to? ");
        int num = powers.nextInt();

        System.out.println("Here is your table!");
        System.out.println(" Number | Squared | Cubed");
        for (int i = 1; i <= num; i++) {
            int squared = (int) Math.pow(i, 2);
            int cubed = (int) Math.pow(i, 3);

            System.out.printf("| %s     | %s      | %s%n", i, squared, cubed);

            if (num == i) {
                Scanner continueTable = new Scanner(System.in);
                System.out.print("Would you like to continue?  [y/N] ");
                String userInput = continueTable.next();

                if(userInput.equals("y")) {
                    System.out.print("What number? ");
                    num = powers.nextInt();
                } else {
                    System.out.println("Have a good day! Bye");
                    break;
                }
            }
        }

//  --------------GRADES-------------------


    }
}
