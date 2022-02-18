public class MethodsExercises {
    public static void main(String[] args) {
// 1. BASIC ARITHMETIC
        System.out.println("addition: " + addition(15, 5));
        System.out.println("subtraction: " + subtraction(34, 12));
        System.out.println("multiplication: " + multiplication(3,9));
        System.out.println("division: " + division(50,5));
        System.out.println("remainder: " + modulus(50,5));

    }
// 1. BASIC ARITHMETIC

    public static int addition(int add1, int add2) {
        return add1 + add2;
    }

    public static int subtraction(int sub1, int sub2) {
        return sub1 - sub2;
    }

    public static int multiplication(int multi1, int multi2) {
        return multi1 * multi2;
    }

    public static int division(int div1, int div2) {
        return div1 / div2;
    }

    public static int modulus(int mod1, int mod2) {
        return mod1 % mod2;
    }
}
