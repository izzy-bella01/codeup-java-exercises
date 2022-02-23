
import java.sql.SQLOutput;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
// 1. BASIC ARITHMETIC
//        System.out.println("addition: " + addition(15, 5));
//        System.out.println("subtraction: " + subtraction(34, 12));
//        System.out.println("multiplication: " + multiplication(3,9));
//        System.out.println("division: " + division(50,5));
//        System.out.println("remainder: " + modulus(50,5));

// 2. CREATE A METHOD THAT VALIDATES THAT USER INPUT IS IN A CERTAIN RANGE
//        getInteger(1, 16);

// 3. CALCULATE THE FACTORIAL OF A NUMBER
//        factorialClass();

// 4. CREATE AN APPLICATION THAT SIMULATES DICE ROLLING
//        diceRoll();


    }
// 1. BASIC ARITHMETIC
//    public static int addition(int add1, int add2) {
//        return add1 + add2;
//    }
//
//    public static int subtraction(int sub1, int sub2) {
//        return sub1 - sub2;
//    }
//
//    public static int multiplication(int multi1, int multi2) {
//        return multi1 * multi2;
//    }
//
//    public static int division(int div1, int div2) {
//        return div1 / div2;
//    }
//
//    public static int modulus(int mod1, int mod2) {
//        return mod1 % mod2;
//    }

// 2. CREATE A METHOD THAT VALIDATES THAT USER INPUT IS IN A CERTAIN RANGE
//    public static void getInteger(int min, int max) {
//        Scanner validate = new Scanner(System.in);
//        System.out.print("Enter a number between " + min + " and " + max +": ");
//        int userInput = validate.nextInt();
//
//        if(userInput >= min && userInput <= max) {
//            System.out.println("success");
//        } else {
//            System.out.println("no success");
//            getInteger(min,max);
//        }
//    }

// 3. CALCULATE THE FACTORIAL OF A NUMBER
//    public static void factorialClass() {
//        Scanner enterFact = new Scanner(System.in);
//        System.out.print("Enter a number between 1 and 10: ");
//
//        int userInput = enterFact.nextInt();
//        long factorial = 1;
//
//
//        String print = "";
//        if (userInput >= 1 && userInput <= 10) {
//            for (int i = 1; i <= userInput; i++) {
//                factorial *= i;
//                print += " x " + i;
//                System.out.printf("%s! = %s = %s%n", i, print, factorial);
//            }
//            System.out.println("continue? y/n");
//            Scanner continueFact = new Scanner(System.in);
//            String answer = continueFact.nextLine();
//            if (answer.equals("y")) {
//                factorialClass();
//            } else {
//                System.out.println("Goodbye");
//            }
//        }
//    }


// 4. CREATE AN APPLICATION THAT SIMULATES DICE ROLLING
//    public static void diceRoll() {
//        System.out.print("Enter number of sides of dice: ");
//        Scanner diceSide = new Scanner(System.in);
//        int sides = diceSide.nextInt();
//
//        System.out.print("Type 'roll' to roll the dice: ");
//        Scanner rollDice = new Scanner(System.in);
//        String roll = rollDice.nextLine();
//
//        if (roll.equals("roll")) {
//            int diceOne = (int)(Math.random()*sides);
//            int diceTwo = (int)(Math.random()*sides);
//            System.out.println("diceOne = " + diceOne);
//            System.out.println("diceTwo = " + diceTwo);
//
//            System.out.println("continue? y/n");
//            Scanner continueFact = new Scanner(System.in);
//            String answer = continueFact.nextLine();
//            if (answer.equals("y")) {
//                diceRoll();
//            } else {
//                System.out.println("Goodbye");
//            }
//        }
//    }


}
