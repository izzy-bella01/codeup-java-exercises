import java.io.PrintStream;
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
        factorialClass();

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
    public static void factorialClass() {
        Scanner enterFact = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");

        int userInput = enterFact.nextInt();
        long factorial = 1;


        String print = "";
        if (userInput >= 1 && userInput <= 10) {
            for (int i = 1; i <= userInput; i++) {
                factorial *= i;
                print += " x " + i;
                System.out.printf("%s! = %s = %s%n", i, print, factorial);
            }
//            System.out.println(print);

        }
        //1! = 1               = 1
        //2! = 1 x 2           = 2
        //3! = 1 x 2 x 3       = 6
        //4! = 1 x 2 x 3 x 4   = 24

    }


}
