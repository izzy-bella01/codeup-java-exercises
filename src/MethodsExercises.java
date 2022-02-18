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
//        getInteger();
//        System.out.print("Enter a number between 1 and 10: ");
        getInteger(1, 10);


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
    public static void getInteger(int min, int max) {
        Scanner validate = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = validate.nextInt();

        if(userInput >= min || userInput <= max) {
            System.out.println("success");
            return;
        } else {

        }
            getInteger(min,max);
    }

//        public static void count(int n) { // 5
//        if (n <= 0) {
//            System.out.println("All done!");
//            return; // exits
//        }
//        System.out.println(n); // 5
//        count(n - 1); // calling this method inside itself AND decrementing
//    }
}
