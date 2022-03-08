package util;

import java.util.Scanner;

public class Input {
    public static Scanner scanner = new Scanner(System.in);

    public static String getString() {
        System.out.println("Type a sentence: ");
        String sentence = scanner.nextLine();
        return sentence;
    }

    public static boolean yesNo() {
        System.out.println("Do you like doggos?");
        String answer = scanner.nextLine();

        if(answer.equals("y") || answer.equals("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public static int getInt(int min, int max) {
        System.out.print("Enter a number between " + min + " and " + max +": ");
        int userInput = scanner.nextInt();

        if(userInput >= min && userInput <= max) {
            System.out.println("success");
        } else {
            System.out.println("no success");
            getInt(min,max);
        }
        return userInput;
    }

    public static int getInt() {
        System.out.print("Enter a number: ");
//        int userInput = scanner.nextInt();
        String userInput = getString();

        try {
            Integer.valueOf(userInput);
        } catch (NumberFormatException ex1){
            System.out.println("error occurred");

        }

        return Integer.valueOf(userInput);

    }

    public static double getDouble(double min, double max) {
        System.out.print("Enter a decimal number between " + min + " and " + max +": ");
        double userInput = scanner.nextDouble();

        if(userInput >= min && userInput <= max) {
            System.out.println("success");
        } else {
            System.out.println("no success");
            getDouble(min,max);
        }
        return userInput;
    }

    public static double getDouble() {
        System.out.print("Enter a decimal number: ");
//        double userInput = scanner.nextDouble();
        String userInput = getString();

        try {
            Double.valueOf(userInput);
        } catch (NumberFormatException ex1){
            System.out.println("error occurred");

        }

        return Double.valueOf(userInput);
    }

}

