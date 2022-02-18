package notes;

import java.util.Scanner;

public class MethodsNotes {
    // METHODS LIVE OUTSIDE OF MAIN BUT ARE CALLED INSIDE OF MAIN
    public static void main(String[] args) {
//        sayHi();
//        System.out.println(sayHello1("there"));
//        System.out.println(addNums(5,3));
//        System.out.println(helloUser());
//        System.out.println(addUserNums());
//        sayHello(5);
//        sayHello("Bella");
//        sayHello();
//        sayHello("hi","timothy");

        // METHOD OVERLOADING
//        multiply(2,5);
//        multiply(5);

//        System.out.println(addNums(2,4));
//        System.out.println(addNums());

        // RECURSION
//        count(8);
    }

//    public static void sayHi() {
//        System.out.println("hi");
//    }

//    public static String sayHello1(String name) {
//        return "Hello " + name;
//    }

//    public static int addNums(int num1, int num2) {
//        int solution = num1 + num2;
//        return solution;
//    }

    // 1. write a method that accepts username from input and returns "hello, userInput"

//    public static String helloUser() {
//        Scanner hello = new Scanner(System.in);
//        System.out.print("What is your name? ");
//        String userInput = hello.nextLine();
//
//        return "Hello, " + userInput + "!";
//    }

//    public static String addUserNums() {
//        Scanner nums = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int numOne = nums.nextInt();
//
//        System.out.print("Enter a second number: ");
//        int numTwo = nums.nextInt();
//
//        int numsToAdd = numOne + numTwo;
//
//        return "Your numbers added are: " + numsToAdd;
//    }


    // - sayHi - the name of our method
    // - public - the specific method can be accessed by other packages and classes
    // - static - not declaring specific primitive type
    // - void/String/int - return type


    // METHOD OVERLOADING

//    // version 1
//    public static void sayHello(int times) {
//        for (int i = 0; i < times; i += 1) {
//            sayHello();
//        }
//    }
//    // version 2
//    public static void sayHello() {
//        sayHello("Hello", "World");
//    }
//    // version 3
//    public static void sayHello(String name) {
//        sayHello("Hello", name);
//    }
//    // version 4
//    public static void sayHello(String greeting, String name) {
//        System.out.println(greeting + ", " + name + "!");
//    }

//    // method signature is what's living before the parenthesis
//    public static void multiply(int num1, int num2) {
//        System.out.println(num1 * num2);
//    }
//
////    public static void multiply(float float1, float float2) {
////        System.out.println(float1 * float2);
////    }
//
//    public static void multiply(int num1) {
//        System.out.println(num1 * num1);
//    }

//    public static int addNums(int num1, int num2) {
//        int solution = num1 + num2;
//        return solution;
//    }
//
//    public static String addNums() {
//        Scanner nums = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int numOne = nums.nextInt();
//
//        System.out.print("Enter a second number: ");
//        int numTwo = nums.nextInt();
//
//        int numsToAdd = numOne + numTwo;
//
//        return "Your numbers added are: " + numsToAdd;
//    }

    // RECURSION
    // often have infinite loops UNLESS break/stopping point
        //    public static void sayHello() {
        //        sayHello();
        //    }

//    public static void count(int n) { // 5
//        if (n <= 0) {
//            System.out.println("All done!");
//            return; // exits
//        }
//        System.out.println(n); // 5
//        count(n - 1); // calling this method inside itself AND decrementing
//    }
}
