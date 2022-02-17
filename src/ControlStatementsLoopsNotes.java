import java.util.Scanner;

public class ControlStatementsLoopsNotes {
    public static void main(String[] args) {

        // CONTROL STATEMENTS
        // allows us to control the flow of the code
        // operators  --> tools need to control the flow
            // ==, !=, >, <, <=, >= // logical operators

        // boolean expression
            // java statement that results in either true or false
//        int myFavNum = 18; // statement
//        boolean yorn = myFavNum > 0; // boolean expression --> result in boolean
//        System.out.println(yorn);



        // logical operators
        // &&, ||, &, |, !

        // if statements
//        int age = 31;
//        int bmi = 20;
//        String hair = "curly";
//        if(hair == "curly"){
//            System.out.println("ahh fun times!!");
//        } else {
//            System.out.println("other");
//        }

        // STRING COMPARISON
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Continue? [y/N] ");
//        String userInput = sc.next();

// Don't do this!
//        boolean confirmation = userInput == "y";
//        if(userInput.equals("y")) {
//            System.out.println("yes continue");
//        } else {
//            System.out.println("dont continue");
//        }
//        String myName = "Laura";
//        String yourName = "Laura";
//
//        boolean nameMatching = myName.equals(yourName);
//        System.out.println(nameMatching); // false
//        boolean nameNoCase = myName.equalsIgnoreCase(yourName);
//        System.out.println(nameNoCase); // true
//
//
//        boolean bothNames = myName == yourName;
//        System.out.println(bothNames);

        // LOOPS
        // iterating through index, array

        // for
//        int i = 0;
//        for (int i = 0; i < 10; ++i) {
//            System.out.println("i is currently at: " + i);
//        }

        // while --> not sure how many times it will loop, check condition before it starts looping
//        int i = 0;
//        while(i < 10) {
//            System.out.println("i is: " +  i);
//            i++;
//        }

        // do while --> executes code once before checking
//        int i = 0;
//        do {
//            System.out.println("i: " + i);
//            i++;
//        } while(i < 10);

        // break and continue

        //<------BREAK------>
//        int i = 0;
//        while(i < 10) {
//            System.out.println("i is: " +  i);
//            if (i == 4) {
//                break;
//            }
//            i++;
//        }

        //<------CONTINUE------>
//        int counter = 0;
//        int i = 0;
//        while(i < 10) {
//            i++;
//            System.out.println("WHILE i is: " +  i);
//            if (i % 2 ==0) {
//                counter += 2;
//                continue;
//            }
//            System.out.println("counter: " + counter);
//        }



    }
}
